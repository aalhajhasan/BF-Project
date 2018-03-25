package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "barneys", url = "${pages.barneys.barneysurl}")
public interface BarneysPage {

	
	@CssSelector("${pages.barneys.barneysTopNavStore}")
	public AspireWebElements barneysTopNavStore();
	
	@CssSelector("${pages.barneys.salesPage}")
	public AspireWebElement salesPage();
	
	@CssSelector("${pages.barneys.barneysSales}")
	public AspireWebElements barneysSales();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
