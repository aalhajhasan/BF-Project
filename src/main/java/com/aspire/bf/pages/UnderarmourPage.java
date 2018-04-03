package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "underarmour", url = "${pages.underarmour.underarmoururl}")

public interface UnderarmourPage {

	@CssSelector("${pages.underarmour.saksWelcomeMat}")
	public AspireWebElement saksWelcomeMat();
	
	
}
