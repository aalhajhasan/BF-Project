package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "underarmour", url = "${pages.underarmour.underarmoururl}")

public interface UnderarmourPage {

	@CssSelector("${pages.underarmour.underarmourWelcomeMat}")
	public AspireWebElement underarmourWelcomeMat();
	
	@CssSelector("${pages.underarmour.underarmourWelcomeMatClose}")
	public AspireWebElement underarmourWelcomeMatClose();
	
	@CssSelector("${pages.underarmour.underarmourTopNav}")
	public AspireWebElements underarmourTopNav();
	
	@CssSelector("${pages.underarmour.underarmourCountryDialog}")
	public AspireWebElement underarmourCountryDialog();
	
	@CssSelector("${pages.underarmour.underarmourCountryClose}")
	public AspireWebElement underarmourCountryClose();
	
	@CssSelector("${pages.underarmour.newArrivalsSection}")
	public AspireWebElement newArrivalsSection();
	
	@CssSelector("${pages.underarmour.newArrivalsCategory}")
	public AspireWebElements newArrivalsCategory();
	
	@CssSelector("${pages.underarmour.underarmourPlp}")
	public AspireWebElement underarmourPlp();
	
	@CssSelector("${pages.underarmour.plpItems}")
	public AspireWebElements plpItems();
	
	@CssSelector("${pages.underarmour.plpItemName}")
	public AspireWebElement plpItemName();
	
	@CssSelector("${pages.underarmour.plpItemPrice}")
	public AspireWebElement plpItemPrice();
	
	@CssSelector("${pages.underarmour.plpItemImage}")
	public AspireWebElement plpItemImage();
	
	@CssSelector("${pages.underarmour.plpItemQuickView}")
	public AspireWebElement plpItemQuickView();
	
	@CssSelector("${pages.underarmour.pdpItemPage}")
	public AspireWebElement pdpItemPage();
	
	@CssSelector("${pages.underarmour.pdpItemName}")
	public AspireWebElement pdpItemName();
	
	@CssSelector("${pages.underarmour.pdpItemPrice}")
	public AspireWebElement pdpItemPrice();
	
	@CssSelector("${pages.underarmour.pdpItemImage}")
	public AspireWebElement pdpItemImage();
	
	@CssSelector("${pages.underarmour.itemColors}")
	public AspireWebElements itemColors();
	
	@CssSelector("${pages.underarmour.itemSizes}")
	public AspireWebElements itemSizes();
	
	@CssSelector("${pages.underarmour.addToBag}")
	public AspireWebElement addToBag();
	
	@CssSelector("${pages.underarmour.bagDialog}")
	public AspireWebElement bagDialog();
	
	@CssSelector("${pages.underarmour.bagItemName}")
	public AspireWebElement bagItemName();
	
	@CssSelector("${pages.underarmour.bagItemPrice}")
	public AspireWebElement bagItemPrice();
	
	@CssSelector("${pages.underarmour.bagAndCheckout}")
	public AspireWebElement bagAndCheckout();
	
	@CssSelector("${pages.underarmour.bagPage}")
	public AspireWebElement bagPage();
	
	@CssSelector("${pages.underarmour.quantity}")
	public AspireWebElement quantity();
	
	@CssSelector("${pages.underarmour.bagItemPriceAfter}")
	public AspireWebElement bagItemPriceAfter();
	
	@CssSelector("${pages.underarmour.bagItemOnePrice}")
	public AspireWebElement bagItemOnePrice();
	
	@CssSelector("${pages.underarmour.bagItemTwoPrice}")
	public AspireWebElement bagItemTwoPrice();
	
	@CssSelector("${pages.underarmour.bagItemsTotalPrice}")
	public AspireWebElement bagItemsTotalPrice();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
