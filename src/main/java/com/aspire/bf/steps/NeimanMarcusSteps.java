package com.aspire.bf.steps;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jbehave.core.annotations.When;
import org.openqa.selenium.NoSuchElementException;
import org.springframework.stereotype.Component;
import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.bf.pages.NeimanMarcusPage;


@Steps
@Component


public class NeimanMarcusSteps {
	@Browser("neimanmarcus")
	AspireBrowser<NeimanMarcusPage> neimanmarcusPage;
	
	
	@When("[8015-0001] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		if(element.equals("neimanmarcusPlpPage"))
		{
		try
		{
			if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			    {
				   System.out.println("Valid PLP");
			    }
			
	        
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
			try
			{
				if(AspireBrowser.getElementsByPropertyNameGlobaly("neimanmarcusSales").size() > 0)
				{
					randomclick("neimanmarcusSales");
					search(element);
				}
			
			}
			catch (NoSuchElementException e1)
			{
				randomclick("neimanmarcusTopNav");
	        	randomclick("neimanmarcusSales");
			}

		   search(element);
		}
	}
		else if(element.equals("neimanmarcusValidPdp"))
		{
			try
			{
					if (AspireBrowser.getElementByPropertyNameGlobaly(element).isDisplayed())
				    {
					   System.out.println("valid PDP");
				    }
		        
			}
			catch (NoSuchElementException e)
			{
				System.out.println("Catch");
				randomclick("neimanmarcusTopNav");
	        	randomclick("neimanmarcusSales");
	        	search("neimanmarcusPlpPage");
	        	randomclick("neimanmarcusProducts");
	        	
			   search(element);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void randomclick(String element)
	{
		Random rand = new Random();
		int  random = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly(element).size());
		AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).js("arguments[0].click();", null);
		
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
