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
import com.aspire.bf.pages.RuelalaPage;


@Steps
@Component

public class RuelalaSteps {

	@Browser("ruelala")
	AspireBrowser<RuelalaPage> ruelalaPage;

	@Then("[8007-0001] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
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
	
	
	@When("[8007-0002] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		
		try
		{
			if (element.equals("ruelalaPLP"))
			{
				if (AspireBrowser.getElementsByPropertyNameGlobaly(element).allIsDisplayed())
			    {
				   System.out.println("Valid PLP");
			    }
			}
	        else 
	        {
	        	Random rand = new Random();
	           if(AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaSalesTwo").allIsDisplayed())	
	           {
	        	   int  sale2 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaSalesTwo").size());
				   AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaSalesTwo").index(sale2).click();
				   search(element);
	           }
	           else
	           {
	        	   int  topnav = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaTopNav").size());
			      AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaTopNav").index(topnav).click();
			
			      int  sale1 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaSales").size());
			      AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaSales").index(sale1).click();
	           }
			   
			   
               //Thread.sleep(10000);
			   /*
			   if (element.equals("productSKUSelection") || element.equals("addToBagButton") || element.equals("validPdp"))
			   {
				   int  value3 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("saksProducts").size());
				   AspireBrowser.getElementsByPropertyNameGlobaly("saksProducts").index(value3).click();
			   }*/
			   
			   search(element);
	        }
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
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
