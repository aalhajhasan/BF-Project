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
import com.aspire.bf.pages.PartyCityCanadaPage;


@Steps
@Component

public class PartyCityCanadaSteps {

	@Browser("partycity")
	AspireBrowser<PartyCityCanadaPage>  partycityPage;
	
	
	@Then("[8019-0001] sleep after last action for $element Milliseconds")
	@When("[8019-0001] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	@When("[8019-0002] user search for $element")
	public void search(String element) throws InterruptedException
	{
		try
		{  sleep("3000");
			if (partycityPage.elements().partycityPlp().size() <= 0)
			{
				while(partycityPage.elements().partycitySubCat().size() >= 0)
				{
					randomclick("partycitySubCat");
				}
				
				search(element);
			}
			
		}
		catch(NoSuchElementException e)
		{
			
		}
	}
	
	
	@Then("[8019-0003] verify that number $numberOne and number $numberTwo are equals")
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
	
	
	
	@When("[8019-0004] user randomly select an available $element")
	public void randomselect(String element) throws InterruptedException
	{
		try
		{   sleep("3000");
			if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
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
