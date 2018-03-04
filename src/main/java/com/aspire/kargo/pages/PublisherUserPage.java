package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;
import com.aspire.kargo.pages.common.UserCommonElements;

@Page(name = "publisherUser", url = "${pages.publisher.user.url}")
public interface PublisherUserPage extends SiteCommonElements, UserCommonElements {

	@CssSelector("${pages.publisher.user.publisherTab}")
	public AspireWebElement publisherTab();

}
