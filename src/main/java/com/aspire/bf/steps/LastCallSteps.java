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
import com.aspire.bf.pages.LastCallPage;

@Steps
@Component

public class LastCallSteps {

	
	@Browser("lastcall")
	AspireBrowser<LastCallPage>  lastcallPage;
	
	@When("[8014-0001] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		if(element.equals("lastcallPlpPage"))
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
				if(AspireBrowser.getElementsByPropertyNameGlobaly("lastcallSales").size() > 0)
				{
					randomclick("lastcallSales");
					search(element);
				}
			
			}
			catch (NoSuchElementException e1)
			{
				randomclick("lastcallTopNav");
	        	randomclick("lastcallSales");
			}

		   search(element);
		}
	}
		else if(element.equals("lastcallValidPdp"))
		{
			try
			{
					if (AspireBrowser.getElementByPropertyNameGlobaly(element).isDisplayed())
				    {
					   System.out.println("valid PDP");
				    }
		        
			}
			catch (NoSuchElementException e)
			{
				System.out.println("Catch");
				randomclick("lastcallTopNav");
	        	randomclick("lastcallSales");
	        	search("lastcallPlpPage");
	        	randomclick("lastcallProducts");
	        	
			   search(element);
			}
		}
	}
	
	
	@Then("[8014-0002] user compare between $elementOne and $elementTwo")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String plp , String qv)
	{
		  System.out.println("plp image = " + plp);
		  System.out.println("qv image = " + qv);
		 
		boolean status = false;
		if (plp.equals(qv))
		{
		     status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
		
	}
	
	
	
	@When("[8014-0003] user randomly select an available $element")
	public void randomselect(String element) throws InterruptedException
	{
		try
		{   sleep("5000");
			if (AspireBrowser.getElementByPropertyNameGlobaly(element).isDisplayed())
			{
				 Random rand = new Random();
				 int  random = rand.nextInt(AspireBrowser.getElementByPropertyNameGlobaly(element).asSelect().getOptions().size());
				 AspireBrowser.getElementByPropertyNameGlobaly(element).asSelect().selectByIndex(random);
			}
		   
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	
	@Then("[8014-0004] sleep after last action for $element Milliseconds")
	@When("[8014-0004] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	
	public double hitNumber;
	@When("[8014-0005] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8014-0006] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	
	
	@When("[8014-0007] $orderTotal price should be matched with the summation of $itemTotal , $shipping and $dutiesAndTaxes")
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
