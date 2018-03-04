package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "userGroups", url = "${pages.userGroups.url}")
public interface UserGroupsPage extends SiteCommonElements {

	@CssSelector("${pages.userGroups.userGroupsOption}")
	public AspireWebElement userGroupsOption();

	@CssSelector("${pages.userGroups.addUserGroupButton}")
	public AspireWebElement addUserGroupButton();

	@CssSelector("${pages.userGroups.deleteUserGroup}")
	public AspireWebElement deleteUserGroup();
	
	
	@CssSelector("${pages.userGroups.userGroupsTap}")
	public AspireWebElement userGroupsTap();
	
	@CssSelector("${pages.userGroups.nameFormField}")
	public AspireWebElement nameFormField();
	

	@CssSelector("${pages.userGroups.continueGroupButton}")
	public AspireWebElement continueGroupButton();
	
}
