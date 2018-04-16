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
import com.aspire.bf.pages.LlbeanPage;


@Steps
@Component

public class LlbeanSteps {

	@Browser("llbean")
	AspireBrowser<LlbeanPage> llbeanPage;
	
	
	@When("[8013-0001] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		
		try
		{
			if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			    {
				   System.out.println("Valid PLP");
			    }
			
	        
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
			try
			{
				if(AspireBrowser.getElementsByPropertyNameGlobaly("llbeanSales").size() > 0)
				{
					randomclick("llbeanSales");
					search(element);
				}
			
			}
			catch (NoSuchElementException e1)
			{
				randomclick("llbeanTopNav");
	        	randomclick("llbeanSales");
			}

		   search(element);
		}
	}
	
	
	
	@Then("[8013-0002] user compare between $elementOne and $elementTwo")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String plp , String pdp)
	{
		
		 String plpImage = plp.substring(plp.indexOf("image") + 6 , plp.indexOf("?"));
		  String pdpImage = pdp.substring(pdp.indexOf("image") + 6 , pdp.indexOf("?"));
		  
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
	
	
	@When("[8013-0003] user randomly select an available $element")
	public void randomselect(String element) throws InterruptedException
	{
		try
		{
			if(AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			{
				sleep("5000");
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
	
	
	
	public double hitNumber;
	@When("[8013-0004] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8013-0005] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	
	@Then("[8013-0006] sleep after last action for $element seconds")
	@When("[8013-0006] sleep after last action for $element seconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public double convert(String element)   //Isolate numbers from text
	{   double result = 0;
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
