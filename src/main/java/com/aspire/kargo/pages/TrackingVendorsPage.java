package com.aspire.kargo.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.kargo.pages.common.SiteCommonElements;

@Page(name = "trackingVendors", url = "")
public interface TrackingVendorsPage extends SiteCommonElements {

	@CssSelector("${pages.datalist.tracking.addTrackingVendorsButton}")
	public AspireWebElement addTrackingVendorsButton();

	@CssSelector("${pages.datalist.tracking.editTrackingVendorOption}")
	public AspireWebElement editTrackingVendorOption();
	
	@CssSelector("${pages.datalist.tracking.exportButton}")
	public AspireWebElement exportButton();
	
	
	@CssSelector("${pages.datalist.tracking.trackingVendorsLink}")
	public AspireWebElement trackingVendorsLink();
	
	@CssSelector("${pages.datalist.tracking.nameField}")
	public AspireWebElement nameField();
	
	@CssSelector("${pages.datalist.tracking.deleteVendor}")
	public AspireWebElement deleteVendor();
	

}
