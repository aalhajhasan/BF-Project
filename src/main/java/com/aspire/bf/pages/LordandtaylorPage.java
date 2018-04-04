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
	
	@CssSelector("${pages.lordandtaylor.previewThisProductIcon}")
	public AspireWebElement previewThisProductIcon();
	
	@CssSelector("${pages.lordandtaylor.quickViewDialog}")
	public AspireWebElement quickViewDialog();
	
	@CssSelector("${pages.lordandtaylor.quickViewProductName}")
	public AspireWebElement quickViewProductName();
	
	@CssSelector("${pages.lordandtaylor.quickViewProductPrice}")
	public AspireWebElement quickViewProductPrice();
	
	@CssSelector("${pages.lordandtaylor.quickViewImage}")
	public AspireWebElement quickViewImage();
	
	@CssSelector("${pages.lordandtaylor.productImage}")
	public AspireWebElement productImage();
	
	@CssSelector("${pages.lordandtaylor.viewProductDetail}")
	public AspireWebElement viewProductDetail();
	
	@CssSelector("${pages.lordandtaylor.pdpProductPage}")
	public AspireWebElement pdpProductPage();
	
	@CssSelector("${pages.lordandtaylor.pdpImage}")
	public AspireWebElement pdpImage();
	
	@CssSelector("${pages.lordandtaylor.pdpProductPrice}")
	public AspireWebElement pdpProductPrice();
	
	@CssSelector("${pages.lordandtaylor.pdpProductName}")
	public AspireWebElement pdpProductName();
	
	@CssSelector("${pages.lordandtaylor.color}")
	public AspireWebElements color();
	
	@CssSelector("${pages.lordandtaylor.sku}")
	public AspireWebElements sku();
	
	@CssSelector("${pages.lordandtaylor.addToBagButton}")
	public AspireWebElement addToBagButton();
	
	@CssSelector("${pages.lordandtaylor.shoppingBag}")
	public AspireWebElement shoppingBag();
	
	@CssSelector("${pages.lordandtaylor.bagProductPrice}")
	public AspireWebElement bagProductPrice();
	
	@CssSelector("${pages.lordandtaylor.viewMyBag}")
	public AspireWebElement viewMyBag();
	
	@CssSelector("${pages.lordandtaylor.bagPage}")
	public AspireWebElement bagPage();
	
	@CssSelector("${pages.lordandtaylor.editLink}")
	public AspireWebElement editLink();
	
	@CssSelector("${pages.lordandtaylor.editDialog}")
	public AspireWebElement editDialog();
	
	@CssSelector("${pages.lordandtaylor.quantity}")
	public AspireWebElement quantity();
	
	@CssSelector("${pages.lordandtaylor.applyButton}")
	public AspireWebElement applyButton();
	
	@CssSelector("${pages.lordandtaylor.productOnePrice}")
	public AspireWebElement productOnePrice();
	
	@CssSelector("${pages.lordandtaylor.productTwoPrice}")
	public AspireWebElement productTwoPrice();
	
	@CssSelector("${pages.lordandtaylor.productTotalPrice}")
	public AspireWebElement productTotalPrice();
	
	@CssSelector("${pages.lordandtaylor.checkoutButton}")
	public AspireWebElement checkoutButton();
	
	@CssSelector("${pages.lordandtaylor.checkoutDialog}")
	public AspireWebElement checkoutDialog();
	
	@CssSelector("${pages.lordandtaylor.checkoutAsGuest}")
	public AspireWebElement checkoutAsGuest();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
