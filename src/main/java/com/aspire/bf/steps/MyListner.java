package com.aspire.bf.steps;

import java.util.Map;
import org.springframework.stereotype.Component;
import com.aspire.automation.configurations.TestEventListener;
import com.aspire.automation.web.util.AspireBrowser;

import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j


public class MyListner implements TestEventListener {

    	@Override
        public void beforeStep(String storyName, String scenarioName, Map<String, String> exampleData,
                String stepName) {
            
            /*boolean dialogstatus = false;
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
            }*/
           
            
        }
}