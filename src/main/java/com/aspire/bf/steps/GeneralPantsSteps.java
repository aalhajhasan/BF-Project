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
import com.aspire.bf.pages.GeneralPantsPage;


@Steps
@Component

public class GeneralPantsSteps {

	@Browser("generalPants")
	AspireBrowser<GeneralPantsPage> generalPantsPage;
	
	
	@Then("[8025-0001] sleep after last action for $element Milliseconds")
	@When("[8025-0001] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	@When("[8025-0002] user search for $element")
	public void search(String element) throws InterruptedException
	{
		try
		{   sleep("2000");
			AspireBrowser.getLastAccessedPage();
			if(AspireBrowser.getElementByPropertyNameGlobaly(element).isDisplayed())
			{ 
				if(AspireBrowser.getElementByPropertyNameGlobaly(element).getElement().getText().equals("Unfortunately, this item is not available for sale internationally"))
				{
					randomclick("generalPantsTopNav");
					sleep("3000");
					randomclick("generalPantsSales");
					sleep("3000");
					randomclick("generalPantsProducts");
					sleep("3000");
					search(element);
				}
			}
		}
		catch (NoSuchElementException e)
		{
			System.out.println("element not found");
		}
		
		
	}
	
	
	@Then("[8025-0003] verify that number $numberOne and number $numberTwo are equals")
	public boolean compareTwoNumber(String element,String elementTwo)
	{
		double numberOne = convert(element);
		double numberTwo = convert(elementTwo);
		
		boolean status = false;
		
		if (numberOne == numberTwo)
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
		
	}
	
	
	@When("[8025-0004] user randomly select an available $element")
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
		
		sleep("3000");
	}
	
	
	public double hitNumber;
	@When("[8025-0005] User hits $value with $data")  //Custom step
	public void hit(String value,String data) throws InterruptedException
	{
		sleep("3000");
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
		sleep("3000");
	}
	
	
	@Then("[8025-0006] User compare between $valueOne and $valueTwo")  //Custom step
	public boolean comparetwoprice(String valueOne, String valueTwo) throws InterruptedException
	{
		sleep("3000");
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
	
	
	@Then("[8025-0007] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step
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
	
	
	
	public int items = 0;
	@When("[8025-0008] check items before navigate to checkout")
	public void check() throws InterruptedException
	{
		try
		{
		    
			if (AspireBrowser.getLastAccessedPage().focusOnFrame("envoyId").getElementsByPropertyName("generalPantsCheckoutError").size() > 0)
			{ 
				AspireBrowser.getLastAccessedPage().focusOnFrame("envoyId").getElementByPropertyName("generalPantsCheckoutReturn").click();
				sleep("3000");
				String itemsN = AspireBrowser.getElementByPropertyNameGlobaly("generalPantsCartItems").text().toString();
				final Pattern pattern = Pattern.compile("\\d");
				final Matcher matcher = pattern.matcher(itemsN);
				if (matcher.find()) 
				{
				    
				    items = Integer.parseInt(matcher.group(0));
				    System.out.println("Items Number: " +  items);
				    
				}
				while(items > 0)
				{
					randomclick("generalPantsCartRemove");
					sleep("3000");
				}
				randomclick("generalPantsTopNav");
				sleep("3000");
				randomclick("generalPantsSales");
				sleep("3000");
				randomclick("generalPantsProducts");
				sleep("3000");
				String element = AspireBrowser.getElementByPropertyNameGlobaly("generalPantsValidPdp").toString();
				search(element);
				String sizes = AspireBrowser.getElementByPropertyNameGlobaly("generalPantsSizes").toString();
				randomselect(sizes);
				AspireBrowser.getElementByPropertyNameGlobaly("generalPantsAddToBag").click();
				AspireBrowser.getElementByPropertyNameGlobaly("generalPantsCartCheckout").click();
				sleep("3000");
				AspireBrowser.getElementByPropertyNameGlobaly("generalPantsCheckout").click();
				sleep("3000");
				check();
			}	
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	@When("[8025-0009] $orderTotal price should be matched with the summation of $itemTotal , $shipping and $dutiesAndTaxes")
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
