package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "saks", url = "${pages.saks.saksurl}")

public interface SaksPage {

	@CssSelector("${pages.saks.saksWelcomeMat}")
	public AspireWebElement saksWelcomeMat();
	
	@CssSelector("${pages.saks.saksWelcomeMatClose}")
	public AspireWebElement saksWelcomeMatClose();
	
	@CssSelector("${pages.saks.saksTopNav}")
	public AspireWebElements saksTopNav();
	
	@CssSelector("${pages.saks.saksSales}")
	public AspireWebElements saksSales();
	
	@CssSelector("${pages.saks.saksProducts}")
	public AspireWebElements saksProducts();
	
	@CssSelector("${pages.saks.saksProductName}")
	public AspireWebElement saksProductName();
	
	@CssSelector("${pages.saks.saksProductPrice}")
	public AspireWebElement saksProductPrice();
	
	@CssSelector("${pages.saks.previewThisProductIcon}")
	public AspireWebElement previewThisProductIcon();
	
	@CssSelector("${pages.saks.quickViewDialog}")
	public AspireWebElement quickViewDialog();
	
	@CssSelector("${pages.saks.quickViewProductName}")
	public AspireWebElement quickViewProductName();
	
	@CssSelector("${pages.saks.quickViewProductPrice}")
	public AspireWebElement quickViewProductPrice();
	
	@CssSelector("${pages.saks.quickViewImage}")
	public AspireWebElement quickViewImage();
	
	@CssSelector("${pages.saks.viewProductDetail}")
	public AspireWebElement viewProductDetail();
	
	@CssSelector("${pages.saks.pdpProductPage}")
	public AspireWebElement pdpProductPage();
	
	@CssSelector("${pages.saks.pdpProductPrice}")
	public AspireWebElement pdpProductPrice();
	
	@CssSelector("${pages.saks.pdpProductName}")
	public AspireWebElement pdpProductName();
	
	@CssSelector("${pages.saks.pdpImage}")
	public AspireWebElement pdpImage();
	
	@CssSelector("${pages.saks.addToBagButton}")
	public AspireWebElement addToBagButton();
	
	@CssSelector("${pages.saks.shoppingBag}")
	public AspireWebElement shoppingBag();
	
	@CssSelector("${pages.saks.bagProductPrice}")
	public AspireWebElement bagProductPrice();
	
	@CssSelector("${pages.saks.bagProductName}")
	public AspireWebElement bagProductName();
	
	
	
	
	
	
	
	
	
	
	
	
}
