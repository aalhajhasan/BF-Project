package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "adSlotTypes", url = "")
public interface AdSlotTypesPage extends SiteCommonElements {

	@CssSelector("${pages.datalist.adSlot.adSlotTypesLink}")
	public AspireWebElement adSlotTypesLink();

	@CssSelector("${pages.datalist.adSlot.addAdSlotTypesButton}")
	public AspireWebElement addAdSlotTypesButton();

	@CssSelector("${pages.datalist.adSlot.addAdSlotTypesForm}")
	public AspireWebElement addAdSlotTypesForm();

	@CssSelector("${pages.datalist.adSlot.adSlotTypeName}")
	public AspireWebElement adSlotTypeName();

	@CssSelector("${pages.datalist.adSlot.editAdSlotTypesOption}")
	public AspireWebElement editAdSlotTypesOption();

	@CssSelector("${pages.datalist.adSlot.editAdSlotTypesForm}")
	public AspireWebElement editAdSlotTypesForm();

}
