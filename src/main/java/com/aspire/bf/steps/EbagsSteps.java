package com.aspire.bf.steps;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.bf.pages.EbagsPage;


@Steps
@Component

public class EbagsSteps {

	@Browser("ebags")
	AspireBrowser<EbagsPage> ebagsPage;
	
	
	@When("[8006-0001] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		if (element.equals(".product-quantity, .add-to-bag"))
		{
			element = "validPdp";
		}
		try
		{
			if (element.equals("ebagsAddToCartButton"))
			{
				if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			    {
				   System.out.println("valid PLP");
			    }
			}
			else if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0 )
			   {
			    
				System.out.println("valid PLP");
			    
			   }
	        else 
	        {
	        	randomclick("ebagsTopNav");
			   
			   if (element.equals("ebagsAddToCartButton"))
			   {
				   randomclick("ebagsProducts");
				   
			   }
			   
			   search(element);
	        }
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	@Then("[8006-0002] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
	public boolean compare(String valueOne, String valueTwo)
	{
		double price1 = convert(valueOne);
		double price2 = convert(valueTwo);
		
		if (price1 == price2)
		{
			return true;
		}
		else
		{
		    return false;
		}
		
	}
	
	
	@Then("[8006-0003] user compare between $elementOne and $elementTwo")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String pdp , String plp)
	{
		
		String pdpImage = pdp.substring(pdp.indexOf(".net") + 5, pdp.indexOf("/", pdp.indexOf(".net") +5 ));
		String plpImage = plp.substring(plp.indexOf(".net") + 5, plp.indexOf("/", plp.indexOf(".net") +5 ));
		
		System.out.println("pdp image = " + pdpImage);
		System.out.println("plp image = " + plpImage);
		
		boolean status = false;
		if (pdpImage.equals(plpImage))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
		
	}
	
	
	
	public double hitNumber;
	@When("[8006-0005] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8006-0006] User compare between $valueOne and $valueTwo")  //Custom step
	public boolean comparetwoprice(String valueOne, String valueTwo)
	{
		double priceB = convert(valueOne);
		double priceA = convert(valueTwo);
		
		if ((priceB == hitNumber) && (priceA/priceB != 1))
		{
			return true;
		}
		else
		{
		    return false;
		}
		
	}
	
	
	@Then("[8006-0007] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step to check the summation of two value with result
	public boolean summation(String valueOne, String valueTwo, String total)
	{
		double priceOne = convert(valueOne);
		double priceTwo = convert(valueTwo);
		double sum = convert(total);
		double sumPrice = priceOne + priceTwo;
		
		if (sum == sumPrice)
		{
			return true;
		}
		else
		{
		    return false;
		}
	}
	
	
	@When("[8006-0008] $orderTotal price should be matched with the summation of $itemTotal , $shipping and $dutiesAndTaxes")
	public boolean checkoutsummation(String orderTotal, String itemTotal, String shipping, String dutiesAndTaxes)
	{
		double orderTotalvalue = convert(orderTotal);
		double itemTotalvalue = convert(itemTotal);
		double shippingvalue = convert(shipping);
		double dutiesAndTaxesvalue = convert(dutiesAndTaxes);
		
		double sum = itemTotalvalue + shippingvalue + dutiesAndTaxesvalue;
		
		if (sum ==  orderTotalvalue)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	@When("[8006-0009] user randomly select an available $element")
	public void randomselect(String element)
	{
		try
		{
			if(AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			{
				randomclick(element);
			}
			else
			{
				System.out.println("Items Not Found");
			}
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	@When("[8006-0010] sleep after last action for $element Milliseconds")
	public void sleep (String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	
	
	
	
	
	public double convert(String element)   //Isolate numbers from text
	{   
		double result = 0;
		String value = element.replace(",", "");
		Pattern pattern = Pattern.compile("(\\d+.\\d+)");
        Matcher matcher = pattern.matcher(value);

        if (matcher.find())
        {
        	result = Double.parseDouble(matcher.group(1));
            System.out.println("result = " + result);
        }
        else 
        {
            System.out.println("NO_NUMBER");
        }
		return result;
	}
	
	
	
	public void randomclick(String element)
	{
		Random rand = new Random();
		int  random = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly(element).size());
		AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).js("arguments[0].click();", null);
	}
}
