package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "ruelala", url = "${pages.ruelala.ruelalaurl}")

public interface RuelalaPage {

	@CssSelector("${pages.ruelala.newMemberDialog}")
	public AspireWebElement newMemberDialog();
	
	@CssSelector("${pages.ruelala.memberEmail}")
	public AspireWebElement memberEmail();
	
	@CssSelector("${pages.ruelala.continueButton}")
	public AspireWebElement continueButton();
	
	@CssSelector("${pages.ruelala.memberPassword}")
	public AspireWebElement memberPassword();
	
	@CssSelector("${pages.ruelala.startShopping}")
	public AspireWebElement startShopping();
	
	@CssSelector("${pages.ruelala.welcomeMate}")
	public AspireWebElement welcomeMate();
	
	@CssSelector("${pages.ruelala.shopNowButton}")
	public AspireWebElement shopNowButton();
	
	@CssSelector("${pages.ruelala.ruelalaTopNav}")
	public AspireWebElements ruelalaTopNav();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
