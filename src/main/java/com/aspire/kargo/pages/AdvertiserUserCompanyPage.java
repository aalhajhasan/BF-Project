package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "advertiserUserCompany", url = "${pages.advertiser.usercompany.url}")
public interface AdvertiserUserCompanyPage extends SiteCommonElements {

	@CssSelector("${pages.advertiser.usercompany.advertiserCompany1Option}")
	public AspireWebElement advertiserCompany1Option();

	@CssSelector("${pages.advertiser.usercompany.errorAddingCompanyMSG}")
	public AspireWebElement errorAddingCompanyMSG();

	@CssSelector("${pages.advertiser.usercompany.advertiserTabAdmin}")
	public AspireWebElement advertiserTabAdmin();

	@CssSelector("${pages.advertiser.usercompany.companyName}")
	public AspireWebElement companyName();

	@CssSelector("${pages.advertiser.usercompany.addUserCompanyButton}")
	public AspireWebElement addUserCompanyButton();
	
	@CssSelector("${pages.advertiser.usercompany.submitCompanyButton}")
	public AspireWebElement submitCompanyButton();
	
	@CssSelector("${pages.advertiser.usercompany.contCompanyButton}")
	public AspireWebElement contCompanyButton();
	
	@CssSelector("${pages.advertiser.usercompany.canselCompanyButton}")
	public AspireWebElement canselCompanyButton();
	
	@CssSelector("${pages.advertiser.usercompany.actionCompanyButton}")
	public AspireWebElement actionCompanyButton();
	
	@CssSelector("${pages.advertiser.usercompany.deleteCompanyButton}")
	public AspireWebElement deleteCompanyButton();
	
	@CssSelector("${pages.advertiser.usercompany.agencyTab}")
	public AspireWebElement agencyTab();
	
	@CssSelector("${pages.advertiser.usercompany.publisher}")
	public AspireWebElement publisher();
	

}
