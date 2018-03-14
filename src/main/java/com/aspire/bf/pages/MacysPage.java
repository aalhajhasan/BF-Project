package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "macys", url = "${pages.macys.macysurl}")


public interface MacysPage {

	@CssSelector("${pages.macys.macysWelcomeMat}")
	public AspireWebElement macysWelcomeMat();
	
	@CssSelector("${pages.macys.macysWelcomeMatClose}")
	public AspireWebElement macysWelcomeMatClose();
	
	@CssSelector("${pages.macys.macysTopNav}")
	public AspireWebElements macysTopNav();

	@CssSelector("${pages.macys.shippingTo}")
	public AspireWebElement shippingTo();
	
	@CssSelector("${pages.macys.shippingElement}")
	public AspireWebElement shippingElement();
	

}
