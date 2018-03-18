package com.aspire.bf.steps;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.NoSuchElementException;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.bf.pages.LandsendPage;

public class LandsendSteps {

	@Browser("landsend")
	AspireBrowser<LandsendPage> landsendPage;
	
	@When("[8004-0001] user search for $element")  //Custom step for searching on specific element
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
			   int  value1 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("landsendTopNav").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("landsendTopNav").index(value1).click();
			   
               //Thread.sleep(10000);
			   
			   if (element.equals("productSKUSelection") || element.equals("addToBagButton") || element.equals("validPdp"))
			   {
				   int  value2 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("landsendProducts").size());
				   AspireBrowser.getElementsByPropertyNameGlobaly("landsendProducts").index(value2).click();
			   }
			   
			   search(element);
	        }
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	@When("[8004-0002] User compare between $valueOne and $valueTwo")
	@Then("[8004-0002] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
	public boolean compare(String valueOne, String valueTwo)
	{
		System.out.println("value one = " + valueOne);
		System.out.println("value Two = " + valueTwo);
		
		
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
