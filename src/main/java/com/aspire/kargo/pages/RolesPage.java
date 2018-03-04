package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.ClassNameSelector;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;
import com.aspire.kargo.pages.common.UserCommonElements;

@Page(name = "roles", url = "${pages.roles.url}")
public interface RolesPage extends SiteCommonElements, UserCommonElements {

	@CssSelector("${pages.roles.searchforEngineering}")
	public AspireWebElement searchforEngineering();

	@CssSelector("${pages.roles.roleInformationSection}")
	public AspireWebElement roleInformationSection();

	@CssSelector("${pages.roles.deleteRoleButton}")
	public AspireWebElement deleteRoleButton();

	@CssSelector("${pages.roles.expandIndicator}")
	public AspireWebElement expandIndicator();

	@CssSelector("${pages.roles.editRoleButton}")
	public AspireWebElement editRoleButton();

	@CssSelector("${pages.roles.roleTypeColumn}")
	public AspireWebElements roleTypeColumn();

	@CssSelector("${pages.roles.roleName}")
	public AspireWebElement roleName();

	@CssSelector("${pages.roles.roleType}")
	public AspireWebElement roleType();

	@CssSelector("${pages.roles.kargoType}")
	public AspireWebElement kargoType();

	@CssSelector("${pages.roles.advertiserType}")
	public AspireWebElement advertiserType();

	@CssSelector("${pages.roles.agencyType}")
	public AspireWebElement agencyType();

	@CssSelector("${pages.roles.publisherType}")
	public AspireWebElement publisherType();

	@CssSelector("${pages.roles.specificRole}")
	public AspireWebElement specificRole();

	@CssSelector("${pages.roles.permissionsTab}")
	public AspireWebElement permissionsTab();

	@CssSelector("${pages.roles.usersTab}")
	public AspireWebElement usersTab();

	@CssSelector("${pages.roles.add_RoleButton}")
	public AspireWebElement add_RoleButton();

	@CssSelector("${pages.roles.permissionsBlocks}")
	public AspireWebElement permissionsBlocks();

	@CssSelector("${pages.roles.typelist}")
	public AspireWebElement typelist();
	
	@CssSelector("${pages.roles.typeFilter}")
	public AspireWebElement typeFilter();
	
	
	@CssSelector("${pages.roles.allType}")
	public AspireWebElement allType();

	@CssSelector("${pages.roles.allChevrons}")
	public AspireWebElements allChevrons();
	
	@CssSelector("${pages.roles.allExpandedChevrons}")
	public AspireWebElements allExpandedChevrons();
	
	@CssSelector("${pages.roles.roleText}")
	public AspireWebElements roleText();
	
	@CssSelector("${pages.roles.typeText}")
	public AspireWebElements typeText();



}
