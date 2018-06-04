package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "george", url = "${pages.george.georgeUrl}")

public interface GeorgePage {
	
	@IDSelector("${pages.george.georgeSelectCountry}")
	public AspireWebElements georgeSelectCountry();
	
	@CssSelector("${pages.george.georgeCountry}")
	public AspireWebElement georgeCountry();
	
	@CssSelector("${pages.george.georgeWelcomeMat}")
	public AspireWebElement georgeWelcomeMat();

	@CssSelector("${pages.george.georgeWelcomeMatContinue}")
	public AspireWebElement georgeWelcomeMatContinue();
    
    @CssSelector("${pages.george.georgeCountryUpdate}")
	public AspireWebElement georgeCountryUpdate();
    
    @CssSelector("${pages.george.georgeTopNav}")
	public AspireWebElements georgeTopNav();
    
    @CssSelector("${pages.george.categotries}")
   	public AspireWebElements categotries();
    
    @CssSelector("${pages.george.georgeProducts}")
 	public AspireWebElements georgeProducts();
    
    @CssSelector("${pages.george.georgeProductsName}")
  	public AspireWebElement georgeProductsName();
    
    @CssSelector("${pages.george.georgeProductsPrice}")
  	public AspireWebElement georgeProductsPrice();
    
    @CssSelector("${pages.george.georgeProductsImage}")
  	public AspireWebElement georgeProductsImage();
    
    @CssSelector("${pages.george.georgePDP}")
   	public AspireWebElement georgePDP();
    
    @CssSelector("${pages.george.georgePdpName}")
   	public AspireWebElement georgePdpName();
    
    @CssSelector("${pages.george.georgePdpPrice}")
   	public AspireWebElement georgePdpPrice();
    
    @CssSelector("${pages.george.georgePdpImage}")
   	public AspireWebElement georgePdpImage();
    
    @CssSelector("${pages.george.georgeValidPdp}")
   	public AspireWebElements georgeValidPdp();
    
}
