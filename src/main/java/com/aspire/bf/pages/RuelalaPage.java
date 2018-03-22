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
	
	@CssSelector("${pages.ruelala.ruelalaPLP}")
	public AspireWebElements ruelalaPLP();
	
	@CssSelector("${pages.ruelala.loveRuelal}")
	public AspireWebElement loveRuelal();
	
	@CssSelector("${pages.ruelala.loveRuelalaClose}")
	public AspireWebElement loveRuelalaClose();
	
	@CssSelector("${pages.ruelala.productPrice}")
	public AspireWebElement productPrice();
	
	@CssSelector("${pages.ruelala.productName}")
	public AspireWebElement productName();
	
	@CssSelector("${pages.ruelala.ruelalaPDP}")
	public AspireWebElement ruelalaPDP();
	
	@CssSelector("${pages.ruelala.pdpName}")
	public AspireWebElement pdpName();
	
	@CssSelector("${pages.ruelala.pdpPrice}")
	public AspireWebElement pdpPrice();
	
	@CssSelector("${pages.ruelala.ruelalaSales}")
	public AspireWebElements ruelalaSales();
	
	@CssSelector("${pages.ruelala.ruelalaSalesTwo}")
	public AspireWebElements ruelalaSalesTwo();
	
	@CssSelector("${pages.ruelala.sizes}")
	public AspireWebElements sizes();
	
	@CssSelector("${pages.ruelala.addToBagButton}")
	public AspireWebElement addToBagButton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
