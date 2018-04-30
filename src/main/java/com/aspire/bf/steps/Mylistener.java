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
    		

            	//System.out.println("dialog status = " + dialogstatus);
            	try
            	{
            		if (AspireBrowser.getElementByPropertyNameGlobaly("loveRuelal").isDisplayed())
                    {
             		 AspireBrowser.getElementByPropertyNameGlobaly("loveRuelalaClose").click();
             		 //dialogstatus = true;
             		System.out.println("Ruelala Dialog closed");
                    }
             	  
            	}
            	catch (NoSuchElementException e)
        		{
        			
        			try
        			{
                		if(AspireBrowser.getElementByPropertyNameGlobaly("giltSurveyDialog").isDisplayed()) 
                 	    {
                 		 AspireBrowser.getElementByPropertyNameGlobaly("giltCloseSurveyDialog").click();
                 		 //dialogstatus = true;
                 		System.out.println("Gilt Dialog closed");
                 	     }
        			}
        			catch (NoSuchElementException e1)
        			{
        				
        				try
        				{
        					if (AspireBrowser.getElementByPropertyNameGlobaly("barneysFeedbackDialog").isDisplayed())
                     	    {
                     		 AspireBrowser.getElementByPropertyNameGlobaly("barneysFeedbackClose").click();
                     		 //dialogstatus = true;
                     		System.out.println("Barneys Dialog closed");
                     	     }
        				}
        				catch (NoSuchElementException e2)
        				{
        					
        					try
        					{
        						if (AspireBrowser.getElementByPropertyNameGlobaly("underarmourFeedBackDialog").isDisplayed())
                         	    {
                         		 AspireBrowser.getElementByPropertyNameGlobaly("underarmourFeedBackDialogCloseButton").click();
                         		 //dialogstatus = true;
                         		System.out.println("Under Armour Dialog closed");
                         	     }
        					}
        					catch (NoSuchElementException e3)
        					{
        						
        						try
            					{
            						if (AspireBrowser.getElementByPropertyNameGlobaly("bergdorfSimilarDialog").isDisplayed())
                             	    {
                             		 AspireBrowser.getElementByPropertyNameGlobaly("bergdorfSimilarDialogNoThanks").scrollToElement().click();
                             		 //dialogstatus = true;
                             		System.out.println("Bergdorf Dialog closed");
                             	     }
            					}
            					catch (NoSuchElementException e4)
            					{
            						
            						try
                					{
                						if (AspireBrowser.getElementByPropertyNameGlobaly("llbeanShipToDialog").isDisplayed())
                                 	    {
                                 		 AspireBrowser.getElementByPropertyNameGlobaly("llbeanShipToDialogClose").scrollToElement().click();
                                 		 //dialogstatus = true;
                                 		System.out.println("L.L.Bean Dialog closed");
                                 	     }
                					}
                					catch (NoSuchElementException e5)
                					{
                						/*try
                    					{
                    						if (AspireBrowser.getElementByPropertyNameGlobaly("neimanmarcusErrorDialog").isDisplayed())
                                     	    {
                                     		 AspireBrowser.getElementByPropertyNameGlobaly("neimanmarcusErrorDialogClose").scrollToElement().click();
                                     		 dialogstatus = true;
                                     		 System.out.println("Neiman Marcus Dialog closed");
                                     	     }
                    					}
                    					catch (NoSuchElementException e6)
                    					{
                    						
                    					}*/
                					}
            					}
        					}
        				}
        			}
        		}
            
           
            
            
            
            aspireBrowserState.setLastAccessedElement(lastelement);
        }
}


