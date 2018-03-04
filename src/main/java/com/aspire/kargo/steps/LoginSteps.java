package com.aspire.kargo.steps;

import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.LoginPage;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Component
@Steps
public class LoginSteps {

	@Browser("login")
	AspireBrowser<LoginPage> loginPage;

//	@Given("User navigate to Login page")
//	public void navigateTo() {
//		loginPage.open();	
//	}

//	@When("User fill user name $val")
//	public void fillEle(@Named("val") String val) {
//		loginPage.elements().userName().setValue(val);
//	}
//
//	@When("User fill password with $val")
//	public void fillPW(@Named("val") String val) {
//		loginPage.elements().password().setValue(val);
//	}
//
//	@When("User click on login button")
//	public void clkOnBtn() {
//		loginPage.elements().loginButton().click();
//	}
//
//	@Then("User verify user is at dashboard")
//	public void verifyURL() {
//		loginPage.within(20).forURLToContain("dashboard");
//	}
}
