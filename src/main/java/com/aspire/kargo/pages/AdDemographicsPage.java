package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "adDemographics", url = "")
public interface AdDemographicsPage extends SiteCommonElements {

	@CssSelector("${pages.datalist.adDemographics.adDemographicsLink}")
	public AspireWebElement adDemographicsLink();

	@CssSelector("${pages.datalist.adDemographics.dataListsOption}")
	public AspireWebElement dataListsOption();

	@CssSelector("${pages.datalist.adDemographics.dataLists}")
	public AspireWebElement dataLists();

	@CssSelector("${pages.datalist.adDemographics.secondCellInTheTable}")
	public AspireWebElement secondCellInTheTable();

}