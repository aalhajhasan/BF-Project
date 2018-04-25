package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "sephora", url = "${pages.sephora.sephoraUrl}")
public interface SephoraPage {

	@CssSelector("${pages.barneys.barneysTopNavStore}")
	public AspireWebElements barneysTopNavStore();
	
}
