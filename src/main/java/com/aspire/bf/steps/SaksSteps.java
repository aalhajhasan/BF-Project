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
import com.aspire.bf.pages.SaksPage;

@Steps
@Component

public class SaksSteps {
	
	
	@Browser("saks")
	AspireBrowser<SaksPage> saksPage;

	
	@When("[8002-0001] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		
		try
		{
			if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0 )
			{
				System.out.println("valid PLP");
			}
		
	        else 
	        {
			   Random rand = new Random();
			   int  value1 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("saksTopNav").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("saksTopNav").index(value1).js("arguments[0].click();", null);
			
			   int  value2 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("saksSales").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("saksSales").index(value2).js("arguments[0].click();", null);
			   
			   search(element);
	        }
		}
		catch (NoSuchElementException e)
		{
			Random rand = new Random();
			   int  value1 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("saksTopNav").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("saksTopNav").index(value1).js("arguments[0].click();", null);
			
			   int  value2 = rand.nextInt(AspireBrowser.getElementsByPropertyNameGlobaly("saksSales").size());
			   AspireBrowser.getElementsByPropertyNameGlobaly("saksSales").index(value2).js("arguments[0].click();", null);
			   
			   search(element);
		}
	}
	
	
	@Then("[8002-0002] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	
	@Then("[8002-0003] user compare between $elementOne and $elementTwo and $elementThree")
	public void imagecompare(String plp , String qv , String pdp)
	{
		/*String plpImage = plp.substring(plp.indexOf("uploads"), plp.indexOf(","));
		String qvImage = qv.substring(qv.indexOf("uploads"), qv.indexOf(".jpg")-3);
		String pdpImage = pdp.substring(pdp.indexOf("uploads"), pdp.indexOf(".jpg")-3);*/
		
		
		System.out.println("plp image = " + plp);
		System.out.println("qv image = " + qv);
		System.out.println("pdp image = " + pdp);
		
		/*boolean status = false;
		if (plpImage.equals(qvImage))
		{
			if (qvImage.equals(pdpImage))
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
}
