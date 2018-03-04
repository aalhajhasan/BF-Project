package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "agencyUserCompany", url = "${pages.agency.usercompany.url}")
public interface AgencyUserCompanyPage extends SiteCommonElements {

	@CssSelector("${pages.agency.usercompany.agencyCompanyFirstOption}")
	public AspireWebElement agencyCompanyFirstOption();

	@CssSelector("${pages.agency.usercompany.agencyTab}")
	public AspireWebElement agencyTab();

}
