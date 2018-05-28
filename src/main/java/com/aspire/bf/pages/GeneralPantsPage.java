package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "generalPants", url = "${pages.generalPants.generalPantsUrl}")

public interface GeneralPantsPage {

	@CssSelector("${pages.generalPants.generalPantsWelcomeMat}")
	public AspireWebElement generalPantsWelcomeMat();
	
	@CssSelector("${pages.generalPants.generalPantsWelcomeMatContinue}")
	public AspireWebElement generalPantsWelcomeMatContinue();
	
	@CssSelector("${pages.generalPants.generalPantsTopNav}")
	public AspireWebElements generalPantsTopNav();
	
	@CssSelector("${pages.generalPants.generalPantsSales}")
	public AspireWebElements generalPantsSales();
	
	@CssSelector("${pages.generalPants.generalPantsProducts}")
	public AspireWebElements generalPantsProducts();
	
	@CssSelector("${pages.generalPants.generalPantsProductName}")
	public AspireWebElement generalPantsProductName();
	
	@CssSelector("${pages.generalPants.generalPantsProductPrice}")
	public AspireWebElement generalPantsProductPrice();
	
	@CssSelector("${pages.generalPants.generalPantsPdp}")
	public AspireWebElement generalPantsPdp();
	
	@CssSelector("${pages.generalPants.generalPantsPdpName}")
	public AspireWebElement generalPantsPdpName();
	
	@CssSelector("${pages.generalPants.generalPantsPdpPrice}")
	public AspireWebElement generalPantsPdpPrice();
	
	@CssSelector("${pages.generalPants.generalPantsSizes}")
	public AspireWebElements generalPantsSizes();
	
	@CssSelector("${pages.generalPants.generalPantsCartCheckout")
	public AspireWebElement generalPantsCartCheckout();
	
	@CssSelector("${pages.generalPants.generalPantsAddToBag")
	public AspireWebElement generalPantsAddToBag();
	
	@CssSelector("${pages.generalPants.generalPantsCartPage")
	public AspireWebElement generalPantsCartPage();
	
	@CssSelector("${pages.generalPants.generalPantsCartName")
	public AspireWebElement generalPantsCartName();
	
	@CssSelector("${pages.generalPants.generalPantsCartPrice")
	public AspireWebElement generalPantsCartPrice();
	
	@CssSelector("${pages.generalPants.generalPantsQuantity")
	public AspireWebElement generalPantsQuantity();
	
	@CssSelector("${pages.generalPants.generalPantsCartPriceOne")
	public AspireWebElement generalPantsCartPriceOne();
	
	@CssSelector("${pages.generalPants.generalPantsCartsPage")
	public AspireWebElements generalPantsCartsPage();
	
	@CssSelector("${pages.generalPants.generalPantsCartPriceTwo")
	public AspireWebElements generalPantsCartPriceTwo();
	
	@CssSelector("${pages.generalPants.generalPantsCartTotalPrice")
	public AspireWebElements generalPantsCartTotalPrice();
	
	@CssSelector("${pages.generalPants.generalPantsValidPdp")
	public AspireWebElement generalPantsValidPdp();
	
	@CssSelector("${pages.generalPants.generalPantsCheckout")
	public AspireWebElement generalPantsCheckout();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
