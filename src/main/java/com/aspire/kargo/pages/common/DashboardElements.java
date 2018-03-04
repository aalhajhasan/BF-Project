package com.aspire.kargo.pages.common;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "dashboard", url = "")
public interface DashboardElements extends SiteCommonElements{

	@CssSelector("${pages.dashboard.rolesOption}")
	public AspireWebElement rolesOption();

	@CssSelector("${pages.dashboard.adminOption}")
	public AspireWebElement adminOption();

	@CssSelector("${pages.dashboard.usersOption}")
	public AspireWebElement usersOption();
	
	@CssSelector("${pages.dashboard.userCompanies}")
	public AspireWebElement userCompanies();
	
	

}
