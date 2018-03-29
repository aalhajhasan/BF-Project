package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "lordandtaylor", url = "${pages.lordandtaylor.lordandtaylorurl}")
public interface LordandtaylorPage {

	
	@CssSelector("${pages.lordandtaylor.lordandtaylorWelcomeMat}")
	public AspireWebElement lordandtaylorWelcomeMat();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorWelcomeMatContinue}")
	public AspireWebElement lordandtaylorWelcomeMatContinue();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorTopNav}")
	public AspireWebElements lordandtaylorTopNav();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
