package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;
import com.aspire.kargo.pages.common.UserCommonElements;

@Page(name = "advertiserUser", url = "${pages.advertiser.user.url}")
public interface AdvertiserUserPage extends SiteCommonElements, UserCommonElements {

	@CssSelector("${pages.advertiser.user.advertiserTab}")
	public AspireWebElement advertiserTab();

	@CssSelector("${pages.advertiser.user.theAdvertiserTab}")
	public AspireWebElement theAdvertiserTab();

	@CssSelector("${pages.advertiser.user.userCompaniesOption}")
	public AspireWebElement userCompaniesOption();

	@CssSelector("${pages.advertiser.user.addAdvertiserUserButton}")
	public AspireWebElement addAdvertiserUserButton();

}
