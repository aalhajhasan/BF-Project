package com.aspire.bf.steps;

import java.util.Map;
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
            	 if (AspireBrowser.getElementByPropertyNameGlobaly("loveRuelal").isDisplayed())
                   {
            		 AspireBrowser.getElementByPropertyNameGlobaly("loveRuelalaClose").click();
            		 dialogstatus = true;
                   }
            }
           
            aspireBrowserState.setLastAccessedElement(lastelement);
        }
}


