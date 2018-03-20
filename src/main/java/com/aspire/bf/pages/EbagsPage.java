package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "ebags", url = "${pages.ebags.ebagsurl}")
public interface EbagsPage {

	@CssSelector("${pages.ebags.ebagsWelcomeMat}")
	public AspireWebElement ebagsWelcomeMat();
	
	@CssSelector("${pages.ebags.ebagsWelcomeMatClos}")
	public AspireWebElement ebagsWelcomeMatClos();
	
	@CssSelector("${pages.ebags.ebagsTopNav}")
	public AspireWebElements ebagsTopNav();
}
