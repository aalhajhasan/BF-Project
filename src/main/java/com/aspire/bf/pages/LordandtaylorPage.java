package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "lordandtaylor", url = "${pages.lordandtaylor.lordandtaylorurl}")
public interface LordandtaylorPage {

	
	@CssSelector("${pages.lordandtaylor.lordandtaylorWelcomeMat}")
	public AspireWebElement lordandtaylorWelcomeMat();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorWelcomeMatContinue}")
	public AspireWebElement lordandtaylorWelcomeMatContinue();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorTopNav}")
	public AspireWebElements lordandtaylorTopNav();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProducts}")
	public AspireWebElements lordandtaylorProducts();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductName}")
	public AspireWebElement lordandtaylorProductName();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductPrice}")
	public AspireWebElement lordandtaylorProductPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPreviewThisProductIcon}")
	public AspireWebElement lordandtaylorPreviewThisProductIcon();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuickViewDialog}")
	public AspireWebElement lordandtaylorQuickViewDialog();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuickViewProductName}")
	public AspireWebElement lordandtaylorQuickViewProductName();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuickViewProductPrice}")
	public AspireWebElement lordandtaylorQuickViewProductPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuickViewImage}")
	public AspireWebElement lordandtaylorQuickViewImage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductImage}")
	public AspireWebElement lordandtaylorProductImage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorViewProductDetail}")
	public AspireWebElement lordandtaylorViewProductDetail();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpProductPage}")
	public AspireWebElement lordandtaylorPdpProductPage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpImage}")
	public AspireWebElement lordandtaylorPdpImage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpProductPrice}")
	public AspireWebElement lordandtaylorPdpProductPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpProductName}")
	public AspireWebElement lordandtaylorPdpProductName();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorColor}")
	public AspireWebElements lordandtaylorColor();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorSku}")
	public AspireWebElements lordandtaylorSku();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorAddToBagButton}")
	public AspireWebElement lordandtaylorAddToBagButton();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorShoppingBag}")
	public AspireWebElement lordandtaylorShoppingBag();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorBagProductPrice}")
	public AspireWebElement lordandtaylorBagProductPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorViewMyBag}")
	public AspireWebElement lordandtaylorViewMyBag();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorBagPage}")
	public AspireWebElement lordandtaylorBagPage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorEditLink}")
	public AspireWebElement lordandtaylorEditLink();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorEditDialog}")
	public AspireWebElement lordandtaylorEditDialog();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuantity}")
	public AspireWebElement lordandtaylorQuantity();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorApplyButton}")
	public AspireWebElement lordandtaylorApplyButton();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductOnePrice}")
	public AspireWebElement lordandtaylorProductOnePrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductTwoPrice}")
	public AspireWebElement lordandtaylorProductTwoPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductTotalPrice}")
	public AspireWebElement lordandtaylorProductTotalPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCheckoutButton}")
	public AspireWebElement lordandtaylorCheckoutButton();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCheckoutDialog}")
	public AspireWebElement lordandtaylorCheckoutDialog();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCheckoutAsGuest}")
	public AspireWebElement lordandtaylorCheckoutAsGuest();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
