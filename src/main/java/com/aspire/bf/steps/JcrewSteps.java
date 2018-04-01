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
			if (element.equals("jcrewProducts"))
			{
				if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			    {
				   System.out.println("valid PLP");
			    }
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
	public void imagecompare(String plp , String qv , String pdp)
	{
		/*String plpImage = plp.substring(plp.indexOf("uploads") + 5, plp.indexOf("_"));
		String qvImage = qv.substring(qv.indexOf("uploads") + 5, qv.indexOf("_"));
		String pdpImage = pdp.substring(pdp.indexOf("saks") + 5);*/
		
		
		System.out.println("qv image = " + plp);
		System.out.println("qv image = " + qv);
		System.out.println("pdp image = " + pdp);
		
		
		/*boolean status = false;
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
		
		return status;*/
		
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
