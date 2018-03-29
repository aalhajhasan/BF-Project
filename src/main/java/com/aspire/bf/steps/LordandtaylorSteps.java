package com.aspire.bf.steps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
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
	public void imagecompare(String plp, String qv , String pdp)
	{
		/*String plpImage = plp.substring(beginIndex, endIndex);
		String qvImage = qv.substring(qv.indexOf("uploads") + 5, qv.indexOf("_"));
		String pdpImage = pdp.substring(pdp.indexOf("saks") + 5);*/
		
		System.out.println("plp image = " + plp);
		System.out.println("qv image = " + qv);
		System.out.println("pdp image = " + pdp);
		
		/*boolean status = false;
		if (qvImage.equals(pdpImage))
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		return status;*/
		
	}
	
	
	
	public double hitNumber;
	@When("[8009-0003] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(data);
		hitNumber = number * Double.parseDouble(value);
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
