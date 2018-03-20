package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "ebags", url = "${pages.ebags.ebagsurl}")
public interface EbagsPage {

	@CssSelector("${pages.ebags.ebagsWelcomeMat}")
	public AspireWebElement ebagsWelcomeMat();
	
	@CssSelector("${pages.ebags.ebagsWelcomeMatContinue}")
	public AspireWebElement ebagsWelcomeMatContinue();
	
	@CssSelector("${pages.ebags.ebagsTopNav}")
	public AspireWebElements ebagsTopNav();
	
	@CssSelector("${pages.ebags.ebagsProducts}")
	public AspireWebElements ebagsProducts();
	
	@CssSelector("${pages.ebags.ebagsProductName}")
	public AspireWebElement ebagsProductName();
	
	@CssSelector("${pages.ebags.ebagsProductPrice}")
	public AspireWebElement ebagsProductPrice();
	
	@CssSelector("${pages.ebags.pdpProductPage}")
	public AspireWebElement pdpProductPage();
	
	@CssSelector("${pages.ebags.pdpProductPrice}")
	public AspireWebElement pdpProductPrice();
	
	@CssSelector("${pages.ebags.pdpProductName}")
	public AspireWebElement pdpProductName();
	
	@CssSelector("${pages.ebags.plpImage}")
	public AspireWebElement plpImage();
	
	@CssSelector("${pages.ebags.pdpImage}")
	public AspireWebElement pdpImage();
	
	@CssSelector("${pages.ebags.availableColor}")
	public AspireWebElements availableColor();
	
	@CssSelector("${pages.ebags.ebagsPdpPrice}")
	public AspireWebElement ebagsPdpPrice();
	
	@CssSelector("${pages.ebags.ebagsPdpName}")
	public AspireWebElement ebagsPdpName();
	
	@CssSelector("${pages.ebags.addToCartButton}")
	public AspireWebElement addToCartButton();
	
	@CssSelector("${pages.ebags.ebagsQuickView}")
	public AspireWebElement ebagsQuickView();
	
	@CssSelector("${pages.ebags.ebagsQVPrice}")
	public AspireWebElement ebagsQVPrice();
	
	@CssSelector("${pages.ebags.ebagsQVName}")
	public AspireWebElement ebagsQVName();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
