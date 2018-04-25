package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "bloomingdales", url = "${pages.bloomingdales.bloomingdalesUrl}")

public interface BloomingdalesPage {
	
	@CssSelector("${pages.barneys.barneysTopNavStore}")
	public AspireWebElements barneysTopNavStore();
	
}
