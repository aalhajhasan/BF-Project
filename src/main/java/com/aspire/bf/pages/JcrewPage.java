package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;



@Page(name = "jcrew", url = "${pages.jcrew.jcrewurl}")

public interface JcrewPage {

	
	@CssSelector("${pages.jcrew.jcrewWelcomeMat}")
	public AspireWebElement jcrewWelcomeMat();
	
	@CssSelector("${pages.jcrew.jcrewWelcomeMatContinue}")
	public AspireWebElement jcrewWelcomeMatContinue();
	
	@CssSelector("${pages.jcrew.jcrewTopNav}")
	public AspireWebElements jcrewTopNav();
	
	@CssSelector("${pages.jcrew.xButton}")
	public AspireWebElement xButton();
	
	@CssSelector("${pages.jcrew.jcrewSales}")
	public AspireWebElements jcrewSales();
	
	@CssSelector("${pages.jcrew.jcrewProducts}")
	public AspireWebElements jcrewProducts();
	
	@CssSelector("${pages.jcrew.plpItemName}")
	public AspireWebElement plpItemName();
	
	@CssSelector("${pages.jcrew.plpItemPrice}")
	public AspireWebElement plpItemPrice();
	
	@CssSelector("${pages.jcrew.plpItemImage}")
	public AspireWebElement plpItemImage();
	
	@CssSelector("${pages.jcrew.quickShop}")
	public AspireWebElement quickShop();
	
	@CssSelector("${pages.jcrew.quickShopDialog}")
	public AspireWebElement quickShopDialog();
	
	@CssSelector("${pages.jcrew.quickShopItemName}")
	public AspireWebElement quickShopItemName();
	
	@CssSelector("${pages.jcrew.quickShopItemPrice}")
	public AspireWebElement quickShopItemPrice();
	
	@CssSelector("${pages.jcrew.quickShopViewFullDetails}")
	public AspireWebElement quickShopViewFullDetails();
	
	@CssSelector("${pages.jcrew.itemDetailsPage}")
	public AspireWebElement itemDetailsPage();
	
	@CssSelector("${pages.jcrew.itemName}")
	public AspireWebElement itemName();
	
	@CssSelector("${pages.jcrew.itemPrice}")
	public AspireWebElement itemPrice();
	
	@CssSelector("${pages.jcrew.itemImage}")
	public AspireWebElement itemImage();
	
	@CssSelector("${pages.jcrew.itemColors}")
	public AspireWebElements itemColors();
	
	@CssSelector("${pages.jcrew.itemSizes}")
	public AspireWebElements itemSizes();
	
	@CssSelector("${pages.jcrew.itemAddToBag}")
	public AspireWebElements itemAddToBag();
	
	@CssSelector("${pages.jcrew.bagItemName}")
	public AspireWebElement bagItemName();
	
	@CssSelector("${pages.jcrew.bagItemPrice}")
	public AspireWebElement bagItemPrice();
	
	@CssSelector("${pages.jcrew.bagChceckout}")
	public AspireWebElement bagChceckout();
	
	@CssSelector("${pages.jcrew.bagItemOnePrice}")
	public AspireWebElement bagItemOnePrice();
	
	@CssSelector("${pages.jcrew.bagItemTwoPrice}")
	public AspireWebElement bagItemTwoPrice();
	
	@CssSelector("${pages.jcrew.bagItemsTotalPrice}")
	public AspireWebElement bagItemsTotalPrice();
	
	@CssSelector("${pages.jcrew.itemsBagPage}")
	public AspireWebElement itemsBagPage();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
