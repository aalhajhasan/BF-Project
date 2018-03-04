package com.aspire.kargo.steps;

import org.apache.el.stream.Stream;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.kargo.pages.RolesPage;

@Component
@Steps
public class RolesSteps/* extends SiteCommonSteps */ {

	@Browser("roles")

	AspireBrowser<RolesPage> RolesPage;

	@Then("[8002-0001] verify type filter is working fine with $option option")

	public void typeFilterFunctionality(@Named("Option") String Option) {
		System.out.println("Option is: " + Option);
		RolesPage.elements().addusersButton().within(5).toBeClickable().click().within(2).toBeEnabled().click();
		String[] numberOfResults = RolesPage.elements().paginationModule().within(50).toBeVisible().text().get()
				.split("entries");
		RolesPage.elements().dataAtUserGroup().index(0).doubleClick().clear();
		//RolesPage.getElementByPropertyNameGlobaly(webElementName);

		numberOfResults = numberOfResults[0].split("of");
		int numberOfResults3 = Integer.parseInt(numberOfResults[1].replace(" ", ""));
		if (numberOfResults3 != 0) {
			// if(Option.equals("All")) {
			// typeFilterFunctionality("Kargo");
			// typeFilterFunctionality("Agency");
			// typeFilterFunctionality("Advertiser");
			// typeFilterFunctionality("Publisher");
			// return;
			// }
			//
			// System.out.println("Roles Elements:
			// "+RolesPage.elements().roleTypeColumn().last().text().toString());
			// RolesPage.elements().roleTypeColumn().within(50).atLeastOne(
			// (aspireWebElement)->
			// { return aspireWebElement.text().get().equalsIgnoreCase(Option) == true; }
			// , "One row does not contains "+Option);
			//
			/*
			 * RolesPage.elements().roleTypeColumn().within(50).atLeastOne((aspireWebElement
			 * )->aspireWebElement.text().get().equalsIgnoreCase("Kargo"),"").
			 * within(50).atLeastOne((aspireWebElement)->aspireWebElement.text().get().
			 * equalsIgnoreCase("publisher"),"").
			 * within(50).atLeastOne(null,"").atLeastOne().
			 * within(50).atLeastOne(null,"").atLeastOne();
			 */
			if (!Option.equalsIgnoreCase("All")) {
				RolesPage.elements().roleTypeColumn().within(50).atMost(0, (aspireWebElement) -> {
					return aspireWebElement.text().get().equalsIgnoreCase(Option) == false;
				}, "One row does not contains " + Option);
			}
		} else {
			RolesPage.elements().roleTypeColumn().within(50).atMost(0, (aspireWebElement) -> {
				return (aspireWebElement.text().get().equalsIgnoreCase("kargo") 
						|| aspireWebElement.text().get().equalsIgnoreCase("Advertiser") 
						|| aspireWebElement.text().get().equalsIgnoreCase("Agency") 
						|| aspireWebElement.text().get().equalsIgnoreCase("Publisher") 
						)== false;
			}, "One row does not contains one of the roles type");
		}

	}

}
