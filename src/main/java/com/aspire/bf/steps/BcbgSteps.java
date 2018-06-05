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
import com.aspire.bf.pages.BcbgPage;


@Steps
@Component

public class BcbgSteps {

	
	@Browser("bcbg")
	AspireBrowser<BcbgPage> bcbgPage;
	
	
	@Then("[8028-0001] sleep after last action for $element Milliseconds")
	@When("[8028-0001] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	@Then("[8028-0002] user compare between $elementOne , $elementTwo and $elementThree")
	public boolean imagecompare(String plp , String qv , String pdp)
	{
		    String plpImage = plp.substring(plp.indexOf("-") + 2 , plp.indexOf(".jpg"));
			String qvImage = qv.substring(qv.indexOf("-") + 2 , qv.indexOf(".jpg"));
			String pdpImage = pdp.substring(pdp.indexOf("-") + 2, pdp.indexOf(".jpg"));
			
			
			System.out.println("plp Image = " + plpImage);
			System.out.println("qv Image = " + qvImage);
			System.out.println("pdp Image = " + pdpImage);		
		
		boolean status = false;
		if (plpImage.equals(qvImage))
		{
			if (qvImage.equals(pdpImage))
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
	
	
	@Then("[8028-0003] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
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
	
	
	@When("[8028-0004] user randomly select an available $element")
	public void randomselect(String element) throws InterruptedException
	{
		try
		{   
			sleep("5000");
			randomclick(element);  
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	
	public double hitNumber;
	@When("[8028-0005] User hits $value with $data")
	public void hit(String value,String data) throws InterruptedException
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
		
		sleep("5000");
	}
	
	@Then("[8028-0006] User compare between $valueOne and $valueTwo")  //Custom step
	public boolean comparee(String valueOne, String valueTwo)
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
	
	
	@Then("[8028-0007] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step
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
