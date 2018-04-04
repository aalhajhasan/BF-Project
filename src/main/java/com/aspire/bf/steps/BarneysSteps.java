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
import com.aspire.bf.pages.BarneysPage;


@Steps
@Component

public class BarneysSteps {

	
	@Browser("barneys")
	AspireBrowser<BarneysPage> barneysPage;
	
	@Then("[8008-0001] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
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
	
	
	@Then("[8008-0002] user compare between $elementOne and $elementTwo")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String plp , String pdp)
	{
		
		String plpImage = plp.substring(plp.indexOf("Barneys") +8 , plp.indexOf("?"));
		String pdpImage = pdp.substring(pdp.indexOf("Barneys") +8 , pdp.indexOf("?"));
		
		System.out.println("plp image = " + plpImage);
		System.out.println("pdp image = " + pdpImage);
		
		boolean status = false;
		if (plpImage.equals(pdpImage))
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
	@When("[8008-0003] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(data);
		hitNumber = number * Double.parseDouble(value);
	}
	
	
	@Then("[8008-0004] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	
	@When("[8008-0005] $estimatedTotal price should be matched with the summation of $shipping , $tax , $duties and $subtotal")
	public boolean checkoutsummation(String estimatedTotal, String shipping, String tax, String duties, String subtotal)
	{
		double orderTotalvalue = convert(estimatedTotal);
		double shippingvalue = convert(shipping);
		double taxvalue = convert(tax);
		double dutiesvalue = convert(duties);
		double subtotalvalue = convert(subtotal);
		
		
		double sum = taxvalue + shippingvalue + dutiesvalue + subtotalvalue;
		
		if (sum ==  orderTotalvalue)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	@When("[8008-0006] user randomly select an available $element")
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void randomclick(String element)
	{
		Random rand = new Random();
		int  random = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly(element).size());
		AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).js("arguments[0].click();", null);
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
