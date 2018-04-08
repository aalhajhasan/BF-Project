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
import com.aspire.bf.pages.JcrewPage;


@Steps
@Component

public class JcrewSteps {

	
	@Browser("jcrew")
	AspireBrowser<JcrewPage> jcrewPage;
	
	@When("[8010-0001] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		
		try
		{
			
		   if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 1)
			 {
				 System.out.println("valid PLP");
			 }
	       else 
	        {
	        	randomclick("jcrewTopNav");
	        	randomclick("jcrewSales");
			    search(element);
	        }
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	@Then("[8010-0002] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
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
	
	
	
	@Then("[8010-0003] user compare between $elementOne , $elementTwo and $elementThree")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String plp , String qv , String pdp)
	{
		    String plpImage = plp.substring(plp.indexOf("com") + 4, plp.indexOf("?"));
			String qvImage = qv.substring(qv.indexOf("com") + 4, qv.indexOf("?"));
			String pdpImage = pdp.substring(pdp.indexOf("com") + 4, pdp.indexOf("?"));
			System.out.println("plp image = " + plp);
			System.out.println("qv image = " + qv);
			System.out.println("pdp image = " + pdp);
			System.out.println("plp image = " + plpImage);
			System.out.println("qv image = " + qvImage);
			System.out.println("pdp image = " + pdpImage);
		
		
		boolean status = false;
		if (plpImage.contains(qvImage))
		{
			if(qvImage.contains(pdpImage))
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
	@When("[8010-0004] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(data);
		hitNumber = number * Double.parseDouble(value);
	}
	
	
	@Then("[8010-0005] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	
	
	@Then("[8010-0006] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step to check the summation of two value with result
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
	
	
	
	@When("[8010-0007] user randomly select an available $element")
	public void randomselect(String element)
	{
		try
		{
			if(AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			{
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
