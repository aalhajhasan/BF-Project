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
import com.aspire.bf.pages.RuelalaPage;


@Steps
@Component

public class RuelalaSteps {

	@Browser("ruelala")
	AspireBrowser<RuelalaPage> ruelalaPage;

	@Then("[8007-0001] User compare between $valueOne and $valueTwo")  //Custom step used to compare between two double value
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
	
	public String x="";
	@When("[8007-0002] user search for $element")  //Custom step for searching on specific element
	public void search(String element) throws InterruptedException 
	{
		
		
		try
		{
			if (element.equals("ruelalaPLP"))
			{
				if (AspireBrowser.getElementsByPropertyNameGlobaly(element).size() > 0)
			    {
				   System.out.println("Valid PLP");
				   
			    }
				else 
				{
					try
					{
						if(AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaSalesTwo").size() > 0)	
				           {
							   randomclick("ruelalaSalesTwo");
							   search(element);
				           }
						else
				           {
							  randomclick("ruelalaTopNav");
							  randomclick("ruelalaSales");
							  search(element);
				           }
					}
					catch (NoSuchElementException e1)
					{
						  randomclick("ruelalaTopNav");
						  randomclick("ruelalaSales");
						  search(element);
					}
					
				}

			}
			
	        else 
	        	
	        {
	        	if (element.equals("ruelalaValidPdp"))
	        	{
	        		try
	        		{
	        			sleep("5000");
	        				x = AspireBrowser.getElementByPropertyNameGlobaly("ruelalaSoldOutMessage").text().toString();
	        			if (x.equals("Sorry, this item is completely sold out.")  || x.equals("Ships In U.S. Only"))
		        		{
		        			randomclick("ruelalaTopNav");
		        		    randomclick("ruelalaSales");
		        		    try
							{
								if(AspireBrowser.getElementsByPropertyNameGlobaly("ruelalaSalesTwo").size() > 0)	
						           {
									   randomclick("ruelalaSalesTwo");
									   randomclick("ruelalaPLP");
									   search(element);
						           }
								else
						           {
									
									  randomclick("ruelalaPLP");
									  search(element);
						           }
							}
							catch (NoSuchElementException e1)
							{
								randomclick("ruelalaTopNav");
								  randomclick("ruelalaSales");
								  randomclick("ruelalaPLP");
								  search(element);
							}
		        		}
		        		else 
		        		{   
		        			System.out.println("Valid PDP");
		        		}
                  }
	        		
	        		catch (NoSuchElementException e3)
	        		{
	        			System.out.println("Catch");
	        		}
	        }
		}
		
	}
		catch (NoSuchElementException e)
		{
			System.out.println("Catch");
		}
	}
	
	public double hitNumber;
	@When("[8007-0003] User hits $value with $data")  //Custom step
	public void hit(String value,String data)
	{
		double number = convert(value);
		hitNumber = number * Double.parseDouble(data);
	}
	
	
	@Then("[8007-0004] User compare between $valueOne and $valueTwo")  //Custom step
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
	
	@Then("[8007-0005] the user check the sum of $valueOne and $valueTwo with $total")  //Custom step to check the summation of two value with result
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
	
	
	
	@When("[8007-0006] user randomly select an available $element")
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
	
	
	
	@When("[8007-0007] sleep after last action for $element seconds")
	public void sleep (String element) throws InterruptedException
	{
		int sleep = Integer.parseInt(element);
		Thread.sleep(sleep);
				
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
		if(element.equals("ruelalaTopNav") || element.equals("ruelalaSales") || element.equals("ruelalaPLP"))
		{
			AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).hoverThenClick();
		}
		else
		{
			AspireBrowser.getElementsByPropertyNameGlobaly(element).index(random).js("arguments[0].click();", null);
		}
		
	}
}
