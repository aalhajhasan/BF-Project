package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "potterybarn", url = "${pages.potterybarn.potterybarnUrl}")
public interface PotterybarnPage {

	@CssSelector("${pages.barneys.barneysTopNavStore}")
	public AspireWebElements barneysTopNavStore();
	
}
