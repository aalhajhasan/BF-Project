package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "AdTagReleaseGroups", url = "")
public interface AdTagReleaseGroupsPage extends SiteCommonElements {

	@CssSelector("${pages.datalist.releaseGroups.adTagReleaseGroupsPageLink}")
	public AspireWebElement adTagReleaseGroupsPageLink();

}