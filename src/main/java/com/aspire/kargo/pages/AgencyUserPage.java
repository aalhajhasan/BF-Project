package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;
import com.aspire.kargo.pages.common.UserCommonElements;

@Page(name = "agencyUser", url = "${pages.agency.user.url}")
public interface AgencyUserPage extends SiteCommonElements, UserCommonElements {

	@CssSelector("${pages.agency.user.agencyTab}")
	public AspireWebElement agencyTab();

}
