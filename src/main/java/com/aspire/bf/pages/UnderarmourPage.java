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
	
	@CssSelector("${pages.underarmour.underarmourNewArrivalsSection}")
	public AspireWebElement underarmourNewArrivalsSection();
	
	@CssSelector("${pages.underarmour.underarmourNewArrivalsCategory}")
	public AspireWebElements underarmourNewArrivalsCategory();
	
	@CssSelector("${pages.underarmour.underarmourPlp}")
	public AspireWebElement underarmourPlp();
	
	@CssSelector("${pages.underarmour.underarmourPlpItems}")
	public AspireWebElements underarmourPlpItems();
	
	@CssSelector("${pages.underarmour.underarmourPlpItemName}")
	public AspireWebElement underarmourPlpItemName();
	
	@CssSelector("${pages.underarmour.underarmourPlpItemPrice}")
	public AspireWebElement underarmourPlpItemPrice();
	
	@CssSelector("${pages.underarmour.underarmourPlpItemImage}")
	public AspireWebElement underarmourPlpItemImage();
	
	@CssSelector("${pages.underarmour.underarmourPlpItemQuickView}")
	public AspireWebElement underarmourPlpItemQuickView();
	
	@CssSelector("${pages.underarmour.underarmourPdpItemPage}")
	public AspireWebElement underarmourPdpItemPage();
	
	@CssSelector("${pages.underarmour.underarmourPdpItemName}")
	public AspireWebElement underarmourPdpItemName();
	
	@CssSelector("${pages.underarmour.underarmourPdpItemPrice}")
	public AspireWebElement underarmourPdpItemPrice();
	
	@CssSelector("${pages.underarmour.underarmourPdpItemImage}")
	public AspireWebElement underarmourPdpItemImage();
	
	@CssSelector("${pages.underarmour.underarmourItemColors}")
	public AspireWebElements underarmourItemColors();
	
	@CssSelector("${pages.underarmour.underarmourItemSizes}")
	public AspireWebElements underarmourItemSizes();
	
	@CssSelector("${pages.underarmour.underarmourAddToBag}")
	public AspireWebElement underarmourAddToBag();
	
	@CssSelector("${pages.underarmour.underarmourBagDialog}")
	public AspireWebElement underarmourBagDialog();
	
	@CssSelector("${pages.underarmour.underarmourBagItemName}")
	public AspireWebElement underarmourBagItemName();
	
	@CssSelector("${pages.underarmour.underarmourBagItemPrice}")
	public AspireWebElement underarmourBagItemPrice();
	
	@CssSelector("${pages.underarmour.underarmourBagAndCheckout}")
	public AspireWebElement underarmourBagAndCheckout();
	
	@CssSelector("${pages.underarmour.underarmourBagPage}")
	public AspireWebElement underarmourBagPage();
	
	@CssSelector("${pages.underarmour.underarmourQuantity}")
	public AspireWebElement underarmourQuantity();
	
	@CssSelector("${pages.underarmour.underarmourBagItemPriceAfter}")
	public AspireWebElement underarmourBagItemPriceAfter();
	
	@CssSelector("${pages.underarmour.underarmourBagItemOnePrice}")
	public AspireWebElement underarmourBagItemOnePrice();
	
	@CssSelector("${pages.underarmour.underarmourBagItemTwoPrice}")
	public AspireWebElement underarmourBagItemTwoPrice();
	
	@CssSelector("${pages.underarmour.underarmourBagItemsTotalPrice}")
	public AspireWebElement underarmourBagItemsTotalPrice();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
