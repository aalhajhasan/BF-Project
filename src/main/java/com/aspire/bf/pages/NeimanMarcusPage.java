package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "neimanmarcus", url = "${pages.neimanmarcus.neimanmarcusUrl}")
public interface NeimanMarcusPage {

	
	@CssSelector("${pages.neimanmarcus.neimanmarcusWelcomeMat}")
	public AspireWebElement neimanmarcusWelcomeMat();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusWelcomeMatContinue}")
	public AspireWebElement neimanmarcusWelcomeMatContinue();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusTopNav}")
	public AspireWebElements neimanmarcusTopNav();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusSales}")
	public AspireWebElements neimanmarcusSales();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusPlpPage}")
	public AspireWebElements neimanmarcusPlpPage();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProducts}")
	public AspireWebElements neimanmarcusProducts();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProductName}")
	public AspireWebElement neimanmarcusProductName();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProductPrice}")
	public AspireWebElement neimanmarcusProductPrice();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProductImage}")
	public AspireWebElement neimanmarcusProductImage();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProductQuickView}")
	public AspireWebElement neimanmarcusProductQuickView();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusQuickViewDialog}")
	public AspireWebElement neimanmarcusQuickViewDialog();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusQuickViewProductName}")
	public AspireWebElement neimanmarcusQuickViewProductName();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusQuickViewProductPrice}")
	public AspireWebElement neimanmarcusQuickViewProductPrice();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusQuickViewProductImage}")
	public AspireWebElement neimanmarcusQuickViewProductImage();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
