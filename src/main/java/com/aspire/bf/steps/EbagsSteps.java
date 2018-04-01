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
			if (element.equals("addToBagButton"))
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
			   Random rand = new Random();
			   int  value1 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("ebagsTopNav").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("ebagsTopNav").index(value1).click();
			   
			   if (element.equals("productSKUSelection") || element.equals("addToBagButton") || element.equals("validPdp"))
			   {
				   int  value3 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("ebagsProducts").size());
				   AspireBrowser.getElementsByPropertyNameGlobaly("ebagsProducts").index(value3).click();
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
	
	
	@When("[8006-0004] user check $element with $value")
	public void checkQTY(String element, String value) throws InterruptedException
	{
		int qty = Integer.parseInt(element.substring(10));
		int checkvalue = Integer.parseInt(value);
		
		if (qty == checkvalue)
		{
			System.out.println("valid quantity");
		}
		else
		{
			   AspireBrowser.getElementByPropertyNameGlobaly("bagCloseButton").click();
			
			   Random rand = new Random();
			   int  value1 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("ebagsTopNav").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("ebagsTopNav").index(value1).click();
			
			search(".product-quantity, .add-to-bag");
			
			Thread.sleep(10000);
			
			Random random = new Random();
			int  randomvalue1 = random.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("availableColor").size());
			AspireBrowser.getElementsByPropertyNameGlobaly("availableColor").index(randomvalue1).click();
			int  randomvalue = random.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("availableSKU").size());
			AspireBrowser.getElementsByPropertyNameGlobaly("availableSKU").index(randomvalue).click();
			AspireBrowser.getElementByPropertyNameGlobaly("addToBagButton").click();
			
			Thread.sleep(10000);
			
			checkQTY(element,value);
		}
	}
	
	
	public double hitNumber;
	@When("[8006-0005] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(data);
		hitNumber = number * Double.parseDouble(value);
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
	public boolean checkoutsummation(String orderTotal, String itemTotal, String shipping, String promotionalSavings, String dutiesAndTaxes)
	{
		double orderTotalvalue = convert(orderTotal);
		double itemTotalvalue = convert(itemTotal);
		double shippingvalue = convert(shipping);
		double promotionalSavingsvalue = convert(promotionalSavings);
		double dutiesAndTaxesvalue = convert(dutiesAndTaxes);
		
		double sum = itemTotalvalue + shippingvalue + promotionalSavingsvalue + dutiesAndTaxesvalue;
		
		if (sum ==  orderTotalvalue)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
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
	
}