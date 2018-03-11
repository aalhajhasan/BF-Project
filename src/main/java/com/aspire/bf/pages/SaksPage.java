package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "saks", url = "${pages.saks.saksurl}")

public interface SaksPage {

	@CssSelector("${pages.saks.saksWelcomeMat}")
	public AspireWebElement saksWelcomeMat();
	
	@CssSelector("${pages.saks.saksWelcomeMatClose}")
	public AspireWebElement saksWelcomeMatClose();
	
	@CssSelector("${pages.saks.saksTopNav}")
	public AspireWebElements saksTopNav();
	
}
