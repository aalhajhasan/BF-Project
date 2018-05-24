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
import com.aspire.bf.pages.PacsunPage;



@Steps
@Component

public class PacsunSteps {

	
	@Browser("pacsun")
	AspireBrowser<PacsunPage>  pacsunPage;
	
	
	@Then("[8029-0001] user compare between $elementOne , $elementTwo and $elementThree")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String plp , String qv, String pdp)
	{
		   String plpImage = plp.substring(plp.indexOf("product_images") + 15 , plp.indexOf(".jpg")); 
	       String qvImage = qv.substring(qv.indexOf("product_images") + 15 , qv.indexOf(".jpg")); 
	       String pdpImage = pdp.substring(pdp.indexOf("product_images") + 15 , pdp.indexOf(".jpg")); 
	       
	       System.out.println("plp image = " + plpImage);
	       System.out.println("qv image = " + qvImage);
	       System.out.println("pdp image = " + pdpImage);	
	       
	       
		boolean status = false;
		if (plpImage.equals(qvImage) && qvImage.equals(pdpImage))
		{
		     status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
		
	}
	
	
	
	@When("[8029-0002] user randomly select an available $element")
	public void randomselect(String element) throws InterruptedException
	{
		try
		{   sleep("5000");
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
		
		sleep("5000");
	}
	
	
	
	@Then("[8029-0003] sleep after last action for $element Milliseconds")
	@When("[8029-0003] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	public double hitNumber;
	@When("[8029-0004] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8029-0005] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	@Then("[8029-0006] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step
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
	
	
	@When("[8029-0007] $orderTotal price should be matched with the summation of $itemTotal , $shipping and $dutiesAndTaxes")
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
