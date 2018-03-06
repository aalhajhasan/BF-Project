package com.aspire.sci.steps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
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
	@When("[8001-0001] User hits $value with $data")
	public void hit(String value,String data)
	{
		double number = convert(data);
		hitNumber = number * Double.parseDouble(value);
	}
	
	
	@Then("[8001-0002] User compare between $valueOne and $valueTwo")
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
	
	
	@Then("[8001-0003] the user check the sum of $valueOne and $valueTwo with $total")
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
	
	
	
	@Then("[8001-0004] $totalValue price should be matched with the summation of $subTotalValue and $vatValue and $shippingValue")
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
	
	
	
	
	
	public double convert(String element)
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
