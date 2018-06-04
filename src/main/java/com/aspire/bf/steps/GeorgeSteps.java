package com.aspire.bf.steps;

import java.util.Random;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.bf.pages.GeorgePage;


@Steps
@Component
public class GeorgeSteps {

	
	@Browser("george")
	AspireBrowser<GeorgePage> georgePage;
	
	
	@Then("[8032-0001] sleep after last action for $element Milliseconds")
	@When("[8032-0001] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException 
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}

	
	@Then("[8032-0002] user compare between $elementOne and $elementTwo")
	public void ImageCompare(String elementOne , String elementTwo)
	{
		String plp = elementOne;
		String pdp = elementTwo;
		System.out.println("plp = " + plp);
		System.out.println("pdp = " + pdp);
	      
	   
	}
	
	@When("[8032-0003] user search for $element")  //Custom step for searching on specific element
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
				randomclick("georgeTopNav");
				randomclick("georgeProducts");
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
		if(element.equals("georgeProducts"))
		{
			AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).click();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
