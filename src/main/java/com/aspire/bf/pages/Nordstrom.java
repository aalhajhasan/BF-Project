package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "nordstrom", url = "${pages.nordstrom.nordstromURL}")

public interface Nordstrom {
	
	@CssSelector("${pages.nordstrom.nordstromWelcomeMat}")
	public AspireWebElement nordstromWelcomeMat();

	@CssSelector("${pages.nordstrom.nordstromWelcomeMatClose}")
	public AspireWebElement nordstromWelcomeMatClose();
	
	@CssSelector("${pages.nordstrom.nordstromTopNav}")
	public AspireWebElements nordstromTopNav();
	
	
}
