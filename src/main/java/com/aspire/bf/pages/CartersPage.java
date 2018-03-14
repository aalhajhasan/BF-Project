package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "carters", url = "${pages.carters.cartersUrl}")
public interface CartersPage {
	
	@CssSelector("${pages.carters.countryflag}")
	public AspireWebElement countryflag();
	
	@CssSelector("${pages.carters.countrydialog}")
	public AspireWebElement countrydialog();

	@CssSelector("${pages.carters.countryselect}")
	public AspireWebElement countryselect();
	
	@CssSelector("${pages.carters.updateButton}")
	public AspireWebElement updateButton();
	
	@CssSelector("${pages.carters.signupDialog}")
	public AspireWebElement signupDialog();
	
	@CssSelector("${pages.carters.closePopup}")
	public AspireWebElement closePopup();
	
	@CssSelector("${pages.carters.countrycontinar}")
	public AspireWebElement countrycontinar();
	
	@CssSelector("${pages.carters.topNav}")
	public AspireWebElement topNav();

	@CssSelector("${pages.carters.categories}")
	public AspireWebElement categories();
	
	@CssSelector("${pages.carters.product}")
	public AspireWebElement product();
}
