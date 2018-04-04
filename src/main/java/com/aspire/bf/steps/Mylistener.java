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
    	
    	@Override
        public void beforeStep(String storyName, String scenarioName, Map<String, String> exampleData,
                String stepName) {
            
    		
    		AspireWebElement lastelement = aspireBrowserState.getLastAccessedElement();
    		
            boolean dialogstatus = false;
            if (dialogstatus)
            {
            	System.out.println("dialog status = " + dialogstatus);
            }
            else 
            {
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
        			System.out.println("Catch");
        			try
        			{
        				if (AspireBrowser.getElementByPropertyNameGlobaly("surveyDialog").isDisplayed()) 
                 	    {
                 		 AspireBrowser.getElementByPropertyNameGlobaly("closeSurveyDialog").click();
                 		 dialogstatus = true;
                 	     }
        			}
        			catch (NoSuchElementException x)
        			{
        				System.out.println("Catch");
        			}
        		}
            }
           
            aspireBrowserState.setLastAccessedElement(lastelement);
        }
}


