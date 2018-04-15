package com.aspire.bf.steps;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Component;
import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.AspireWebDriver;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.AspireBrowserAction;
import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.bf.pages.BergdorfPage;

@Steps
@Component

public class BergdorfSteps {

	AspireWebDriver test = new AspireWebDriver();
	
	
	@Browser("bergdorf")
	AspireBrowser<BergdorfPage> bergdorfPage;
	
	
	@When("[8012-0002] user randomly select an available $element")
	public void randomselect(String element)
	{
		try
		{   
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
	
	
	@When("[8012-0001] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		
		try
		{
			if (element.equals("bergdorfValidPdp"))
			{
				if (AspireBrowser.getElementByPropertyNameGlobaly(element).isDisplayed())
			    {
				   System.out.println("valid PLP");
			    }
			}
	        
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
			randomclick("bergdorfTopNav");
        	randomclick("bergdorfSales");
        	
        	randomclick("bergdorfProducts");
        	
		   search(element);
		}
	}
	
	
	@Then("[8012-0003] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
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
	
	
	
	public double hitNumber;
	@When("[8012-0004] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8012-0005] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	@Then("[8012-0006] sleep after last action for $element seconds")
	@When("[8012-0006] sleep after last action for $element seconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	@When("[8012-0007] $orderTotal price should be matched with the summation of $itemTotal , $shipping and $dutiesAndTaxes")
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void randomclick(String element)
	{
		Random rand = new Random();
		int  random = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly(element).size());
		AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).js("arguments[0].click();", null);
		if (element.equals("bergdorfTopNav"))
		{
			AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).js("arguments[0].click();", null);
		}
		if(element.equals("bergdorfProducts"))
		{
			AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).click();
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
