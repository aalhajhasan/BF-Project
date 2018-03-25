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
	
	@CssSelector("${pages.ruelala.validPDP}")
	public AspireWebElement validPDP();
	
	@CssSelector("${pages.ruelala.bagProductName}")
	public AspireWebElement bagProductName();
	
	@CssSelector("${pages.ruelala.bagProductPrice}")
	public AspireWebElement bagProductPrice();
	
	@CssSelector("${pages.ruelala.bagQty}")
	public AspireWebElement bagQty();
	
	@CssSelector("${pages.ruelala.bagProductTotalPrice}")
	public AspireWebElement bagProductTotalPrice();
	
	@CssSelector("${pages.ruelala.bagProductOnePrice}")
	public AspireWebElement bagProductOnePrice();
	
	@CssSelector("${pages.ruelala.bagProductTwoPrice}")
	public AspireWebElement bagProductTwoPrice();
	
	@CssSelector("${pages.ruelala.proceedToCheckout}")
	public AspireWebElement proceedToCheckout();
	
	@CssSelector("${pages.ruelala.checkoutPage}")
	public AspireWebElement checkoutPage();
	
	@CssSelector("${pages.ruelala.placeOrder}")
	public AspireWebElement placeOrder();
	
	@CssSelector("${pages.ruelala.checkoutFirstName}")
	public AspireWebElement checkoutFirstName();
	
	@CssSelector("${pages.ruelala.checkoutLastName}")
	public AspireWebElement checkoutLastName();
	
	@CssSelector("${pages.ruelala.checkoutAddress}")
	public AspireWebElement checkoutAddress();
	
	@CssSelector("${pages.ruelala.checkoutcity}")
	public AspireWebElement checkoutcity();
	
	@CssSelector("${pages.ruelala.checkoutZipCode}")
	public AspireWebElement checkoutZipCode();
	
	@CssSelector("${pages.ruelala.checkoutPhoneNumber}")
	public AspireWebElement checkoutPhoneNumber();
	
	@CssSelector("${pages.ruelala.checkoutState}")
	public AspireWebElement checkoutState();
	
	@CssSelector("${pages.ruelala.checkoutNameOnCard}")
	public AspireWebElement checkoutNameOnCard();
	
	@CssSelector("${pages.ruelala.paymentCardNumber}")
	public AspireWebElement paymentCardNumber();
	
	@CssSelector("${pages.ruelala.paymentCardExpirationMonth}")
	public AspireWebElement paymentCardExpirationMonth();
	
	@CssSelector("${pages.ruelala.paymentCardExpirationYear}")
	public AspireWebElement paymentCardExpirationYear();
	
	@CssSelector("${pages.ruelala.paymentSecurityCode}")
	public AspireWebElement paymentSecurityCode();
	
	@CssSelector("${pages.ruelala.submitError}")
	public AspireWebElement submitError();
	
	@CssSelector("${pages.ruelala.ruelalaBagPage}")
	public AspireWebElement ruelalaBagPage();
	
	
	
	
}
