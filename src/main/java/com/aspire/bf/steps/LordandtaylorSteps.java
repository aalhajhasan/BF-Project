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
import com.aspire.bf.pages.LordandtaylorPage;


@Steps
@Component

public class LordandtaylorSteps {

	
	@Browser("lordandtaylor")
	AspireBrowser<LordandtaylorPage> lordandtaylorPage;
	
	
	@Then("[8009-0001] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
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
	
	
	@Then("[8009-0002] user compare between $element , $elementOne and $elementTwo")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String plp, String qv , String pdp)
	{
		    String plpImage = plp.substring(plp.indexOf("LordandTaylor") +14 , plp.indexOf("_"));
			String qvImage = qv.substring(qv.indexOf("LordandTaylor") + 14 , qv.indexOf("_"));
			String pdpImage = pdp.substring(pdp.indexOf("LordandTaylor") + 14); 
		
		   System.out.println("plp image = " + plpImage);
		   System.out.println("qv image = " + qvImage);
		   System.out.println("pdp image = " + pdpImage);
		
		boolean status = false;
		if (plpImage.equals(qvImage))
		{
			if(qvImage.equals(pdpImage))
			{
				status = true;
			}
			else
			{
				status = false;
			}
		}
		else
		{
			status = false;
		}
		
		return status;
		
	}
	
	
	
	public double hitNumber;
	@When("[8009-0003] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8009-0004] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	
	

	@When("[8009-0005] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step
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
	
	
	
	@When("[8009-0006] user randomly select an available $element")
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
	
	
	
	@Then("[8009-0007] sleep after last action for $element Milliseconds")
	@When("[8009-0007] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	public int count = 0;
	public int items = 0;
	@Then("[8009-0008] check items before navigate to checkout")
	public void check() throws InterruptedException
	{
		try
		{
			String itemsN = AspireBrowser.getElementByPropertyNameGlobaly("lordandtaylorItems").text().toString();
			final Pattern pattern = Pattern.compile("\\d");
			final Matcher matcher = pattern.matcher(itemsN);
			if (matcher.find()) 
			{
			    
			    items = Integer.parseInt(matcher.group(0));
			    System.out.println("Items Number: " +  items);
			    
			}
			if (AspireBrowser.getElementByPropertyNameGlobaly("lordandtaylorBagPageError").isDisplayed())
			{ 
				while(count < 1)
				{
					while (items > 0 )
					{
						randomclick("lordandtaylorRemoveLink");
						AspireBrowser.getElementByPropertyNameGlobaly("lordandtaylorRemoveLinkConfirm").click();
						sleep("2000");
						items--;
					}
					randomclick("lordandtaylorTopNav");
					randomclick("lordandtaylorProducts");
					randomselect("lordandtaylorColor");
					randomselect("lordandtaylorSku");
					AspireBrowser.getElementByPropertyNameGlobaly("lordandtaylorAddToBagButton").click();
					sleep("500");
					AspireBrowser.getElementByPropertyNameGlobaly("lordandtaylorViewMyBag").within(120).toBeClickable().click();
					try
					{
						if (AspireBrowser.getElementByPropertyNameGlobaly("lordandtaylorBagPageError").isDisplayed())
						{
							count = 0;
							check();
						}
						else
						{
							count++;
						}
					}
					catch (NoSuchElementException e1)
					{
						count++;
					}
				}
			}
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
		
	@When("[8009-0009] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		try
		{
			if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			{
				System.out.println("Valid PDP");
			}
			else 
			{
				randomclick("lordandtaylorTopNav");
				randomclick("lordandtaylorProducts");
				search(element);
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
		if(element.equals("lordandtaylorProducts"))
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
