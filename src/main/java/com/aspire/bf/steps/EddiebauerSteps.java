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
import com.aspire.bf.pages.EddiebauerPage;


@Steps
@Component
public class EddiebauerSteps {

	@Browser("eddiebauer")
	AspireBrowser<EddiebauerPage> eddiebauerPage;
	
	
	@Then("[8017-0001] sleep after last action for $element Milliseconds")
	@When("[8017-0001] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	
	@Then("[8017-0002] verify that the value of $valueOne equals to the value of $valueTwo")
	public boolean verify(String valueOne,String valueTwo)
	{   
		boolean status;
		double value1 = convert(valueOne);
		double value2 = convert(valueTwo);
		if (value1 == value2)
		{
			status = true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
	@When("[8017-0003] user randomly select an available $element")
	public void randomselect(String element) throws InterruptedException
	{
		try
		{   sleep("5000");
			if (AspireBrowser.getElementByPropertyNameGlobaly(element).isDisplayed())
			{
				 Random rand = new Random();
				 int  random = 1 + rand.nextInt(AspireBrowser.getElementByPropertyNameGlobaly(element).asSelect().getOptions().size());
				 AspireBrowser.getElementByPropertyNameGlobaly(element).asSelect().selectByIndex(random);
			}
		   
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	
	
	@Then("[8014-0004] user compare between $elementOne , $elementTwo and $elementThree")
	public void imagecompare(String plp , String pdp , String cart)
	{
		/*String plpImage = plp.substring(plp.indexOf("uploads") + 8 , plp.indexOf(".jpg") - 8);
		String qvImage = qv.substring(qv.indexOf("uploads") + 8 , qv.indexOf(".jpg") - 3);
		String pdpImage = pdp.substring(pdp.indexOf("uploads") + 8, pdp.indexOf(".jpg") - 3);
		String cartImage = cart.substring(cart.indexOf("uploads") + 8, cart.indexOf(".jpg") - 7);*/
		
		System.out.println("plp Image = " + plp);
		System.out.println("pdp Image = " + pdp);
		System.out.println("cart Image = " + cart);
		
		
		/*boolean status = false;
		if (plpImage.equals(qvImage))
		{
			if (qvImage.equals(pdpImage))
			{
				if(pdpImage.equals(cartImage))
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
		}
		else
		{
			status = false;
		}
		
		return status;*/
		
	}
	
	
	public double hitNumber;
	@When("[8017-0005] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8017-0006] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	
	@Then("[8017-0007] $total value should be equal to the summation of $valueOne and $valueTwo")
	public boolean summation(String total, String valueOne, String valueTwo)
	{
		double totalvalue = convert(total);
		double firstvalue = convert(valueOne);
		double secoundvalue = convert(valueTwo);
		double sum = firstvalue + secoundvalue;
		
		boolean status;
		
		if(sum == totalvalue)
		{
			status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
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
