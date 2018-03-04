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
import com.aspire.kargo.pages.common.DashboardElements;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Component
@Steps
public class dashboardSteps {

	@Browser("dashboard")
	AspireBrowser<DashboardElements> dashboardElements;


}
