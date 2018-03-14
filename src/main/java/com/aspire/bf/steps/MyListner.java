package com.aspire.bf.steps;

import java.util.Map;
import org.springframework.stereotype.Component;
import com.aspire.automation.configurations.TestEventListener;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j


public class MyListner implements TestEventListener {

    	@Override
        public void beforeStep(String storyName, String scenarioName, Map<String, String> exampleData,
                String stepName) {
            
            
            //log.error("Custome before Step: "+ stepName );
            
        }
}