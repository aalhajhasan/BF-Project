package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "bergdorf", url = "${pages.bergdorf.bergdorfurl}")
public interface BergdorfPage {

	
	@CssSelector("${pages.bergdorf.bergdorfWelcomeMat}")
	public AspireWebElement bergdorfWelcomeMat();
	
	@CssSelector("${pages.bergdorf.bergdorfWelcomeMatClose}")
	public AspireWebElement bergdorfWelcomeMatClose();
	
	@CssSelector("${pages.bergdorf.bergdorfTopNav}")
	public AspireWebElements bergdorfTopNav();
	
	@CssSelector("${pages.bergdorf.bergdorfSales}")
	public AspireWebElements bergdorfSales();
	
	@CssSelector("${pages.bergdorf.bergdorfProducts}")
	public AspireWebElements bergdorfProducts();
	
	@CssSelector("${pages.bergdorf.bergdorfValidPdp}")
	public AspireWebElement bergdorfValidPdp();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
