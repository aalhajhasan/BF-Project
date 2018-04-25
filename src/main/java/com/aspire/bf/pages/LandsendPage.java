package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "landsend", url = "${pages.landsend.landsendurl}")

public interface LandsendPage {

	
	@CssSelector("${pages.landsend.landsendWelcomeMat}")
	public AspireWebElement landsendWelcomeMat();
	
	@CssSelector("${pages.landsend.landsendWelcomeMatClose}")
	public AspireWebElement landsendWelcomeMatClose();
	
	@CssSelector("${pages.landsend.landsendTopNav}")
	public AspireWebElements landsendTopNav();
	
	@CssSelector("${pages.landsend.landsendSales}")
	public AspireWebElements landsendSales();
	
	@CssSelector("${pages.landsend.landsendProducts}")
	public AspireWebElements landsendProducts();
	
	@CssSelector("${pages.landsend.landsendProductName}")
	public AspireWebElement landsendProductName();
	
	@CssSelector("${pages.landsend.landsendProductPrice}")
	public AspireWebElement landsendProductPrice();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
