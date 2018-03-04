package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "publisherUserCompany", url = "${pages.publisher.usercompany.url}")
public interface PublisherUserCompanyPage extends SiteCommonElements {

	@CssSelector("${pages.publisher.usercompany.publisherTab}")
	public AspireWebElement publisherTab();

}
