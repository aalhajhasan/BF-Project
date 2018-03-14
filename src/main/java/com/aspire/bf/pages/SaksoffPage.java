package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "saksoff", url = "${pages.saksoff.saksoffurl}")

public interface SaksoffPage {

	
	@CssSelector("${pages.saksoff.saksoffWelcomeMat}")
	public AspireWebElement saksoffWelcomeMat();
	
	@CssSelector("${pages.saksoff.saksoffWelcomeMatClose}")
	public AspireWebElement saksoffWelcomeMatClose();
	
	@CssSelector("${pages.saksoff.saksoffTopNav}")
	public AspireWebElements saksoffTopNav();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
