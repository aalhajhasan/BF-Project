package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "TargetingPositions", url = "")
public interface TargetingPositionsPage extends SiteCommonElements {

	@CssSelector("${pages.datalist.targeting.targetingPositionsLink}")
	public AspireWebElement targetingPositionsLink();

}