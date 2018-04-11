package com.aspire.bf.pages;

import org.openqa.selenium.WebElement;
import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "bergdorf", url = "${pages.bergdorf.bergdorfurl}")
public interface BergdorfPage {

	
	@CssSelector("${pages.bergdorf.bergdorfWelcomeMat}")
	public AspireWebElement bergdorfWelcomeMat();
	
	@CssSelector("${pages.bergdorf.bergdorfWelcomeMatClose}")
	public AspireWebElement bergdorfWelcomeMatClose();
	
	@CssSelector("${pages.bergdorf.bergdorfTopNav}")
	public AspireWebElements bergdorfTopNav();
	
	@CssSelector("${pages.bergdorf.bergdorfSales}")
	public AspireWebElements bergdorfSales();
	
	@CssSelector("${pages.bergdorf.bergdorfProducts}")
	public AspireWebElements bergdorfProducts();
	
	@CssSelector("${pages.bergdorf.bergdorfValidPdp}")
	public AspireWebElement bergdorfValidPdp();
	
	@CssSelector("${pages.bergdorf.bergdorfSku}")
	public AspireWebElement bergdorfSku();
	
	@CssSelector("${pages.bergdorf.bergdorfAddToshoppingBag}")
	public AspireWebElement bergdorfAddToshoppingBag();
	
	@CssSelector("${pages.bergdorf.bergdorfProductName}")
	public AspireWebElement bergdorfProductName();
	
	@CssSelector("${pages.bergdorf.bergdorfProductPrice}")
	public AspireWebElement bergdorfProductPrice();
	
	@CssSelector("${pages.bergdorf.bergdorfProductPage}")
	public AspireWebElement bergdorfProductPage();
	
	@CssSelector("${pages.bergdorf.bergdorfBagDialog}")
	public AspireWebElement bergdorfBagDialog();
	
	@CssSelector("${pages.bergdorf.bergdorfBagProductName}")
	public AspireWebElement bergdorfBagProductName();
	
	@CssSelector("${pages.bergdorf.bergdorfBagProductPrice}")
	public AspireWebElement bergdorfBagProductPrice();
	
	@CssSelector("${pages.bergdorf.bergdorfBagIcon}")
	public AspireWebElement bergdorfBagIcon();
	
	@CssSelector("${pages.bergdorf.bergdorfBagCheckout}")
	public AspireWebElement bergdorfBagCheckout();
	
	@CssSelector("${pages.bergdorf.bergdorfBagPage}")
	public AspireWebElement bergdorfBagPage();
	
	@CssSelector("${pages.bergdorf.bergdorfBagEditItem}")
	public AspireWebElement bergdorfBagEditItem();
	
	@CssSelector("${pages.bergdorf.bergdorfBagEditContainer}")
	public AspireWebElement bergdorfBagEditContainer();
	
	@CssSelector("${pages.bergdorf.bergdorfBagQuantity}")
	public AspireWebElement bergdorfBagQuantity();
	
	@CssSelector("${pages.bergdorf.bergdorfBagUpdate}")
	public AspireWebElement bergdorfBagUpdate();
	
	@CssSelector("${pages.bergdorf.bergdorfBagTotalPrice}")
	public AspireWebElement bergdorfBagTotalPrice();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutButton}")
	public AspireWebElement bergdorfCheckoutButton();
	
	
	
	
	
	
	
}
