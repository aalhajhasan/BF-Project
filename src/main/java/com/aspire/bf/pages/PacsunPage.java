package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "pacsun", url = "${pages.pacsun.pacsunUrl}")
public interface PacsunPage {

	
	@CssSelector("${pages.pacsun.pacsunWelcomeMat}")
	public AspireWebElement pacsunWelcomeMat();
	
	@CssSelector("${pages.pacsun.pacsunWelcomeMatContinue}")
	public AspireWebElement pacsunWelcomeMatContinue();
	
	@CssSelector("${pages.pacsun.pacsunTopNav}")
	public AspireWebElements pacsunTopNav();
	
	@CssSelector("${pages.pacsun.pacsunProducts}")
	public AspireWebElements pacsunProducts();
	
	@CssSelector("${pages.pacsun.pacsunProductName}")
	public AspireWebElement pacsunProductName();
	
	@CssSelector("${pages.pacsun.pacsunProductPrice}")
	public AspireWebElement pacsunProductPrice();
	
	@CssSelector("${pages.pacsun.pacsunProductImage}")
	public AspireWebElement pacsunProductImage();
	
	@CssSelector("${pages.pacsun.pacsunProductQuickView}")
	public AspireWebElement pacsunProductQuickView();
	
	@CssSelector("${pages.pacsun.pacsunQuickViewDialog}")
	public AspireWebElement pacsunQuickViewDialog();
	
	@CssSelector("${pages.pacsun.pacsunQuickViewProductName}")
	public AspireWebElement pacsunQuickViewProductName();
	
	@CssSelector("${pages.pacsun.pacsunQuickViewProductPrice}")
	public AspireWebElement pacsunQuickViewProductPrice();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
