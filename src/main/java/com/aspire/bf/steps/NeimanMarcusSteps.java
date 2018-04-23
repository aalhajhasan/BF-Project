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
import com.aspire.bf.pages.NeimanMarcusPage;


@Steps
@Component


public class NeimanMarcusSteps {
	@Browser("neimanmarcus")
	AspireBrowser<NeimanMarcusPage> neimanmarcusPage;
	
	
	@When("[8015-0001] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		if(element.equals("neimanmarcusPlpPage"))
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
				if(AspireBrowser.getElementsByPropertyNameGlobaly("neimanmarcusSales").size() > 0)
				{
					randomclick("neimanmarcusSales");
					search(element);
				}
			
			}
			catch (NoSuchElementException e1)
			{
				randomclick("neimanmarcusTopNav");
	        	randomclick("neimanmarcusSales");
			}

		   search(element);
		}
	}
		else if(element.equals("neimanmarcusValidPdp"))
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
				randomclick("neimanmarcusTopNav");
	        	randomclick("neimanmarcusSales");
	        	search("neimanmarcusPlpPage");
	        	randomclick("neimanmarcusProducts");
	        	
			   search(element);
			}
		}
	}
	
	
	@When("[8015-0002] user randomly select an available $element")
	public void randomselect(String element) throws InterruptedException
	{
		try
		{   sleep("3000");
			if (AspireBrowser.getElementsByPropertyNameGlobaly(element).allIsDisplayed())
			{
				 randomclick(element);
			}
		   
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	@Then("[8015-0003] sleep after last action for $element seconds")
	@When("[8015-0003] sleep after last action for $element seconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	public double hitNumber;
	@When("[8015-0004] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8015-0005] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	@When("[8015-0006] $valueOne and $valueTwo should be equal")
	@Then("[8015-0006] $valueOne and $valueTwo should be equal")
	public boolean equal(String valueOne , String valueTwo)
	{
		double value1 = convert(valueOne);
		double value2 = convert(valueTwo);
		boolean status = false;
		if (value1 == value2)
		{
			status = true;
		}
		else 
		{
			status = false;
		}
		
		return status;
	}
	
	
	@When("[8015-0007] $orderTotal price should be matched with the summation of $itemTotal , $shipping , $duties and $Tax")
	public boolean checkoutsummation(String orderTotal, String itemTotal, String shipping, String duties , String Taxe)
	{
		double orderTotalvalue = convert(orderTotal);
		double itemTotalvalue = convert(itemTotal);
		double shippingvalue = convert(shipping);
		double dutiesAndTaxesvalue = convert(duties);
		double Taxevalue = convert(Taxe);
		double sum = itemTotalvalue + shippingvalue + dutiesAndTaxesvalue + Taxevalue;
		
		if (sum ==  orderTotalvalue)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void randomclick(String element)
	{
		Random rand = new Random();
		if(AspireBrowser.getElementsByPropertyNameGlobaly(element).size() == 0)
		{
			//AspireBrowser.getElementsByPropertyNameGlobaly(element).index(0).js("arguments[0].click();", null);
		}
		else
		{
			int  random = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly(element).size());
			AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).js("arguments[0].click();", null);
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
