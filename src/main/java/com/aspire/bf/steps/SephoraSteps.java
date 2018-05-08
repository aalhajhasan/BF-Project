package com.aspire.bf.steps;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.springframework.stereotype.Component;
import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.bf.pages.SephoraPage;


@Steps
@Component

public class SephoraSteps {

	@Browser("sephora")
	AspireBrowser<SephoraPage> sephoraPage;
	
	
	@Then("[8022-0001] sleep after last action for $element Milliseconds")
	@When("[8022-0001] sleep after last action for $element Milliseconds")
	public void sleep (String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	@Then("[8022-0002] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
	public boolean compareTwoValue(String valueOne, String valueTwo)
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
	
	
	@Then("[8022-0003] user compare between $elementOne , $elementTwo and $elementThree")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String plp , String qv ,String pdp)
	{
		
		String plpImage = plp.substring(plp.indexOf("sku") + 4 , plp.indexOf("-"));
		String qvImage = qv.substring(qv.indexOf("sku") + 4 , qv.indexOf("-"));
        String pdpImage = pdp.substring(pdp.indexOf("sku") + 4 , pdp.indexOf("-"));
        
		System.out.println("plp image = " + plpImage);
		System.out.println("qv image = " + qvImage);
		System.out.println("pdp image = " + pdpImage);
		
		boolean status = false;
		if (plpImage.equals(pdpImage))
		{
			if(pdpImage.equals(qvImage))
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
	@When("[8022-0004] User hits $value with $data")
	public void hit(String value,String data) throws InterruptedException
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
		
		sleep("5000");
	}
	
	@Then("[8022-0005] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	
	
	@Then("[8022-0006] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step
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
	
	
	
	public void randomclick(String element)
	{
		Random rand = new Random();
		int  random = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly(element).size());
		AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).js("arguments[0].click();", null);
	}
	
	
	
	
	
	
	
	
	
	
}
