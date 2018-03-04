package com.aspire.kargo.steps;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.AspireElementsChecker;
import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.kargo.pages.KargoUserPage;
import com.aspire.kargo.pages.LoginPage;
import com.aspire.kargo.pages.common.UserCommonElements;
import com.aspire.kargo.pages.common.IntegrationsElements;

import junit.framework.Assert;
import lombok.extern.slf4j.Slf4j;

@Component
@Steps
@Slf4j
public class integrationsSteps {


//page name value
	@Browser("theIntegration")
	//call page elements to create obj
	AspireBrowser<IntegrationsElements> integrationElementsPage;
	
	
	
	
	
	@Then("[8007-0001] filter using $Option from approved for direct list return correct rows")
	
	public void checkfilterfunctionlaity(@Named("Option") String Option)
	{
		
		
		System.out.println("Option is: " + Option);
		String[] numberOfResults = integrationElementsPage.elements().paginationModule().within(50).toBeVisible().text().get()
				.split("entries");
		numberOfResults = numberOfResults[0].split("of");
		int numberOfResults3 = Integer.parseInt(numberOfResults[1].replace(" ", ""));
		if (numberOfResults3 != 0) {
			
			
			if (Option.equalsIgnoreCase("All")) {
				integrationElementsPage.elements().thirdCoulmnropertyTable().within(50).
				atLeast(1, (aspireWebElement) -> {
					return aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
				}, "One row does not contains " + Option)
				.within(50)
				.atLeast(1, (aspireWebElement) -> {
					return !aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
				}, "One row does not contains " + Option);
			}
			
			
			
			else if  (!Option.equalsIgnoreCase("Yes")) {
				integrationElementsPage.elements().thirdCoulmnropertyTable().within(50).
				atLeast(1, (aspireWebElement) -> {
					return aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
				}, "One row does not contains " + Option);
				
				
			
			}
			
			else if 	 (!Option.equalsIgnoreCase("No")) {
				integrationElementsPage.elements().thirdCoulmnropertyTable().within(50).
				atLeast(1, (aspireWebElement) -> {
					return !aspireWebElement.attribute("innerHTML").contains("http://www.w3.org/1999/xlink");
				}, "One row does not contains " + Option);
	
		}
		}
	}

	        @Then("[8007-0002] And check property status and archive/Unarchive moreover check popup msg")
			@When("[8007-0002] And check property status and archive/Unarchive moreover check popup msg")
			public void verifyPropertyStatus() {
				
				
				
				
				
	        String x = integrationElementsPage.elements().propertyStatus().within(50).toBeVisible().text().get();
	        String z=  integrationElementsPage.elements().propertyStatus().within(50).toBeVisible().text().get();
						
				if(x.contains("Unarchive Property"))
				{
			
					integrationElementsPage.elements().propertyStatus().within(50).toBeVisible().click();
					
				if (z.contains("Unarchive Line Item"))
				{
					
				}
					
					
				}
				
				else if (x.contains("Archive Property"))
				{
					integrationElementsPage.elements().propertyStatus().within(50).toBeVisible().click();
					
					if (z.contains("Archive Line Item"))
					{
						
					}

				}
				
			}
				
				@Then("[8007-0003] I verify platform filter is working fine on ad slot")
				
				public void checkfilterfunctionlaityadSlot()
				{
					
					
					
					String[] numberOfResults = integrationElementsPage.elements().paginationModule().within(50).toBeVisible().text().get()
							.split("entries");
					numberOfResults = numberOfResults[0].split("of");
					int numberOfResults3 = Integer.parseInt(numberOfResults[1].replace(" ", ""));
					if (numberOfResults3 != 0) {
						
						
						AspireWebElements allOptions = integrationElementsPage.elements().platformOptions();
						
						for (int i=0;i<allOptions.size();i++) {
							
							
							integrationElementsPage.elements().defaultOptionFromFilter().click();
							allOptions.index(i).click();
							
							checktables(allOptions.index(i).text().get());
							
							
							
						}

					}
						



		}
		
				
				
				private void checktables(String optionValue) {
					
					if (optionValue.equals("All")) {
						integrationElementsPage.elements().forthCoulmnAdSlotTable().within(50).atMost(0, (aspireWebElement) -> {
							return (aspireWebElement.text().get().contains("Tablet Web")
							|| aspireWebElement.text().get().contains("Mobile App")
							|| aspireWebElement.text().get().contains("Mobile Web")
							|| aspireWebElement.text().get().contains("Tablet App")
							|| aspireWebElement.text().get().contains("FIA")
							|| aspireWebElement.text().get().contains("AMP")
							|| aspireWebElement.text().get().contains("ANR")
						     )==false;
							
						}, "One row does not contains " + optionValue);
					}
					
					
					else  {
						
						integrationElementsPage.elements().forthCoulmnAdSlotTable().within(50).atMost(0, (aspireWebElement) -> 
						{ return (aspireWebElement.text().get().equals(optionValue))==false;
							
						}, "One row does not contains " + optionValue);
					}
					
//					
//	                 else if(optionValue.equals("Mobile Web")) {
//						
//						integrationElementsPage.elements().forthCoulmnAdSlotTable().within(50).atMost(0, (aspireWebElement) -> 
//						{ return (aspireWebElement.text().get().contains("Mobile Web"))==false;
//							
//						}, "One row does not contains " + optionValue);
//					}
//					
//					
//	                 else if(optionValue.equals("Tablet Web")) {
//							
//							integrationElementsPage.elements().forthCoulmnAdSlotTable().within(50).atMost(0, (aspireWebElement) -> 
//							{ return (aspireWebElement.text().get().contains("Tablet Web"))==false;
//								
//							}, "One row does not contains " + optionValue);
//						}
//					
//	                 else if(optionValue.equals("Tablet App")) {
//							
//							integrationElementsPage.elements().forthCoulmnAdSlotTable().within(50).atMost(0, (aspireWebElement) -> 
//							{ return (aspireWebElement.text().get().contains("Tablet App"))==false;
//								
//							}, "One row does not contains " + optionValue);
//						}
//					
//					
//	                 else if(optionValue.equals("FIA")) {
//							
//							integrationElementsPage.elements().forthCoulmnAdSlotTable().within(50).atMost(0, (aspireWebElement) -> 
//							{ return (aspireWebElement.text().get().contains("FIA"))==false;
//								
//							}, "One row does not contains " + optionValue);
//						}
//					
//	                 else if(optionValue.equals("AMP")) {
//							
//							integrationElementsPage.elements().forthCoulmnAdSlotTable().within(50).atMost(0, (aspireWebElement) -> 
//							{ return (aspireWebElement.text().get().contains("AMP"))==false;
//								
//							}, "One row does not contains " + optionValue);
//						}
//					
//	                 else if(optionValue.equals("ANR")) {
//							
//							integrationElementsPage.elements().forthCoulmnAdSlotTable().within(50).atMost(0, (aspireWebElement) -> 
//							{ return (aspireWebElement.text().get().contains("ANR"))==false;
//								
//							}, "One row does not contains " + optionValue);
//						}
					
					
				}
}



			
	
	
