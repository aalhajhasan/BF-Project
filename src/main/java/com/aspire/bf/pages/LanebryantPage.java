package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "lanebryant", url = "${pages.lanebryant.lanebryantUrl}")
public interface LanebryantPage {

	@CssSelector("${pages.lanebryant.lanebryantWelcomeMat}")
	public AspireWebElement lanebryantWelcomeMat();
	
	@CssSelector("${pages.lanebryant.lanebryantWelcomeMatContinue}")
	public AspireWebElement lanebryantWelcomeMatContinue();
	
	@CssSelector("${pages.lanebryant.lanebryantTopNav}")
	public AspireWebElements lanebryantTopNav();
	
	@CssSelector("${pages.lanebryant.lanebryantProducts}")
	public AspireWebElements lanebryantProducts();
	
	@CssSelector("${pages.lanebryant.lanebryantProductName}")
	public AspireWebElement lanebryantProductName();
	
	@CssSelector("${pages.lanebryant.lanebryantProductPrice}")
	public AspireWebElement lanebryantProductPrice();
	
	@CssSelector("${pages.lanebryant.lanebryantProductImage}")
	public AspireWebElement lanebryantProductImage();
	
	@CssSelector("${pages.lanebryant.lanebryantProductQuickView}")
	public AspireWebElement lanebryantProductQuickView();
	
	@CssSelector("${pages.lanebryant.lanebryantQuickViewDialog}")
	public AspireWebElement lanebryantQuickViewDialog();
	
	@CssSelector("${pages.lanebryant.lanebryantQuickViewProductName}")
	public AspireWebElement lanebryantQuickViewProductName();
	
	@CssSelector("${pages.lanebryant.lanebryantQuickViewProductPrice}")
	public AspireWebElement lanebryantQuickViewProductPrice();
	
	@CssSelector("${pages.lanebryant.lanebryantQuickViewProductImage}")
	public AspireWebElement lanebryantQuickViewProductImage();
	
	@CssSelector("${pages.lanebryant.lanebryantSales}")
	public AspireWebElements lanebryantSales();
	
	@CssSelector("${pages.lanebryant.lanebryantViewFullDetails}")
	public AspireWebElement lanebryantViewFullDetails();
	
	@CssSelector("${pages.lanebryant.lanebryantValidPdp}")
	public AspireWebElement lanebryantValidPdp();
	
	@CssSelector("${pages.lanebryant.lanebryantPdpName}")
	public AspireWebElement lanebryantPdpName();
	
	@CssSelector("${pages.lanebryant.lanebryantPdpPrice}")
	public AspireWebElement lanebryantPdpPrice();
	
	@CssSelector("${pages.lanebryant.lanebryantPdpImage}")
	public AspireWebElement lanebryantPdpImage();
	
	@CssSelector("${pages.lanebryant.lanebryantColor}")
	public AspireWebElements lanebryantColor();
	
	@CssSelector("${pages.lanebryant.lanebryantSize}")
	public AspireWebElements lanebryantSize();
	
	@CssSelector("${pages.lanebryant.lanebryantAddToBag}")
	public AspireWebElement lanebryantAddToBag();
	
	@CssSelector("${pages.lanebryant.lanebryantBagDialog}")
	public AspireWebElement lanebryantBagDialog();
	
	@CssSelector("${pages.lanebryant.lanebryantSizeGroup}")
	public AspireWebElements lanebryantSizeGroup();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
