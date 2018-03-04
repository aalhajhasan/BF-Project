package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "adNetworks", url = "")
public interface AdNetworksPage extends SiteCommonElements {

	@CssSelector("${pages.datalist.adNetworks.adNetworksLink}")
	public AspireWebElement adNetworksLink();

	@CssSelector("${pages.datalist.adNetworks.editAdNetworksOption}")
	public AspireWebElement editAdNetworksOption();

	@CssSelector("${pages.datalist.adNetworks.addAdNetworkButton}")
	public AspireWebElement addAdNetworkButton();
	
	@CssSelector("${pages.datalist.adNetworks.submitNetwork}")
	public AspireWebElement submitNetwork();
	

}