package com.aspire.bf.steps;

import java.util.Map;

import org.openqa.selenium.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.aspire.automation.configurations.TestEventListener;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.helper.AspireBrowserState;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j


public class Mylistener implements TestEventListener {

    	
    	@Autowired
    	AspireBrowserState aspireBrowserState;
    	public boolean dialogstatus;
    	@Override
        public void beforeStep(String storyName, String scenarioName, Map<String, String> exampleData,
                String stepName) {
            
    		
    		AspireWebElement lastelement = aspireBrowserState.getLastAccessedElement();
    		

            	System.out.println("dialog status = " + dialogstatus);
            	try
            	{
            		if (AspireBrowser.getElementByPropertyNameGlobaly("loveRuelal").isDisplayed())
                    {
             		 AspireBrowser.getElementByPropertyNameGlobaly("loveRuelalaClose").click();
             		 dialogstatus = true;
                    }
             	  
            	}
            	catch (NoSuchElementException e)
        		{
        			System.out.println("Catch Ruelal");
        			try
        			{
                		if(AspireBrowser.getElementByPropertyNameGlobaly("giltSurveyDialog").isDisplayed()) 
                 	    {
                 		 AspireBrowser.getElementByPropertyNameGlobaly("giltCloseSurveyDialog").click();
                 		 dialogstatus = true;
                 	     }
        			}
        			catch (NoSuchElementException e1)
        			{
        				System.out.println("Catch Gilt");
        				try
        				{
        					if (AspireBrowser.getElementByPropertyNameGlobaly("barneysFeedbackDialog").isDisplayed())
                     	    {
                     		 AspireBrowser.getElementByPropertyNameGlobaly("barneysFeedbackClose").click();
                     		 dialogstatus = true;
                     	     }
        				}
        				catch (NoSuchElementException e2)
        				{
        					System.out.println("Catch Barneys");
        					try
        					{
        						if (AspireBrowser.getElementByPropertyNameGlobaly("underarmourFeedBackDialog").isDisplayed())
                         	    {
                         		 AspireBrowser.getElementByPropertyNameGlobaly("underarmourFeedBackDialogCloseButton").click();
                         		 dialogstatus = true;
                         	     }
        					}
        					catch (NoSuchElementException e3)
        					{
        						System.out.println("Catch Underarmour");
        						try
            					{
            						if (AspireBrowser.getElementByPropertyNameGlobaly("bergdorfSimilarDialog").isDisplayed())
                             	    {
                             		 AspireBrowser.getElementByPropertyNameGlobaly("bergdorfSimilarDialogNoThanks").scrollToElement().click();
                             		 dialogstatus = true;
                             	     }
            					}
            					catch (NoSuchElementException e4)
            					{
            						System.out.println("Catch Bergdorf");
            						try
                					{
                						if (AspireBrowser.getElementByPropertyNameGlobaly("llbeanShipToDialog").isDisplayed())
                                 	    {
                                 		 AspireBrowser.getElementByPropertyNameGlobaly("llbeanShipToDialogClose").scrollToElement().click();
                                 		 dialogstatus = true;
                                 	     }
                					}
                					catch (NoSuchElementException e5)
                					{
                						System.out.println("Catch L.LBean");
                					}
            					}
        					}
        				}
        			}
        		}
            
           
            
            
            
            aspireBrowserState.setLastAccessedElement(lastelement);
        }
}


