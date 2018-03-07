package com.aspire.sci.steps;

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
import com.aspire.sci.pages.HarrodsPage;;


@Steps
@Component

public class HarrodsSteps {

	@Browser("harrods")
	AspireBrowser<HarrodsPage> harrodsPage;
	
	public double hitNumber;
	@When("[8001-0001] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(data);
		hitNumber = number * Double.parseDouble(value);
	}
	
	
	@Then("[8001-0002] User compare between $valueOne and $valueTwo")  //Custom step
	public boolean compare(String valueOne, String valueTwo)
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
	
	
	@Then("[8001-0003] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step
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
	
	
	
	@Then("[8001-0004] $totalValue price should be matched with the summation of $subTotalValue and $vatValue and $shippingValue")  //Custom step
	public boolean totalPrice(String totalValue, String subTotalValue, String vatValue, String shippingValue)
	{
		double total = convert(totalValue);
		double subtotal = convert(subTotalValue);
		double vat = convert(vatValue);
		double shipping = convert(shippingValue);
		double totalprice = subtotal + vat + shipping;
		
		if (totalprice == total)
		{
			return true;
		}
		else
		{
		    return false;
		}
		
	}
	
	@Then("[8001-0005] user search for $element")
	@When("[8001-0005] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		
		try
		{
			if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0 )
			{
				System.out.println("valid PLP");
			}
		
	        else 
	        {
			   Random rand = new Random();
			   int  value1 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("topNavStore").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("topNavStore").index(value1).js("arguments[0].click();", null);
			
			   int  value2 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("sales").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("sales").index(value2).js("arguments[0].click();", null);
			   
			   Thread.sleep(10000);
			   
			   if (element.equals("moreThanOneQTY"))
			   {
				   int  value3 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("products").size());
				   AspireBrowser.getElementsByPropertyNameGlobaly("products").index(value3).js("arguments[0].click();", null);
			   }
			   
			   search(element);
	        }
		}
		catch (NoSuchElementException e)
		{
			Random rand = new Random();
			   int  value1 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("topNavStore").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("topNavStore").index(value1).js("arguments[0].click();", null);
			
			   int  value2 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("sales").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("sales").index(value2).js("arguments[0].click();", null);
			   
			   search(element);
		}
	}
	
	
	public double convert(String element)  //Isolate numbers from text
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
	
}
