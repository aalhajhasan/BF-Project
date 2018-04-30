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
import com.aspire.bf.pages.LanebryantPage;


@Steps
@Component


public class LanebryantSteps {

	@Browser("lanebryant")
	AspireBrowser<LanebryantPage> lanebryantPage;
	
	
	@Then("[8016-0001] sleep after last action for $element Milliseconds")
	@When("[8016-0001] sleep after last action for $element Milliseconds")
	public void sleep(String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
	}
	
	@Then("[8016-0002] user compare between $elementOne , $elementTwo and $elementThree")  //Custom step used to compare between two image as a string 
	public boolean imagecompare(String plp , String qv, String pdp)
	{
		String plpImage = plp.substring(plp.indexOf("lanebryantProdATG") + 18, plp.indexOf("?"));
        String qvImage = plp.substring(qv.indexOf("lanebryantProdATG") + 18, qv.indexOf("?"));
		String pdpImage = plp.substring(pdp.indexOf("lanebryantProdATG") + 18, pdp.indexOf("?"));
		
         System.out.println("plp image = " + plpImage);
         System.out.println("qv image = " + qvImage);
         System.out.println("pdp image = " + pdpImage);
		 
		boolean status = false;
		if (plpImage.equals(qvImage) && qvImage.equals(pdpImage))
		{
		     status = true;
		}
		else
		{
			status = false;
		}
		
		return status;
		
	}
	
	
	@When("[8016-0003] user randomly select an available $element")
	public void randomselect(String element) throws InterruptedException
	{
		try
		{   sleep("5000");
			if (AspireBrowser.getElementsByPropertyNameGlobaly(element).allIsDisplayed())
			{
				 randomclick(element);
			}
		   
		}
		
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
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
		if(AspireBrowser.getElementsByPropertyNameGlobaly(element).size() == 1)
		{
			AspireBrowser.getElementsByPropertyNameGlobaly(element).index(0).js("arguments[0].click();", null);
		}
		else
		{  try {
			      int  random = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly(element).size());
			      AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).click();
		       }
		    catch (NoSuchElementException e)
		       {
			System.out.println("Catch");
		       }
		}
		
	}
	
}
