package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "bcbg", url = "${pages.bcbg.bcbgUrl}")

public interface BcbgPage {

	@CssSelector("${pages.barneys.barneysTopNavStore}")
	public AspireWebElements barneysTopNavStore();
	
}
