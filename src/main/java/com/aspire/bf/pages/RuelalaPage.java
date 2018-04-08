package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "ruelala", url = "${pages.ruelala.ruelalaurl}")

public interface RuelalaPage {

	@CssSelector("${pages.ruelala.ruelalaNewMemberDialog}")
	public AspireWebElement ruelalaNewMemberDialog();
	
	@CssSelector("${pages.ruelala.ruelalaMemberEmail}")
	public AspireWebElement ruelalaMemberEmail();
	
	@CssSelector("${pages.ruelala.ruelalaContinueButton}")
	public AspireWebElement ruelalaContinueButton();
	
	@CssSelector("${pages.ruelala.ruelalaMemberPassword}")
	public AspireWebElement ruelalaMemberPassword();
	
	@CssSelector("${pages.ruelala.ruelalaStartShopping}")
	public AspireWebElement ruelalaStartShopping();
	
	@CssSelector("${pages.ruelala.ruelalaWelcomeMate}")
	public AspireWebElement ruelalaWelcomeMate();
	
	@CssSelector("${pages.ruelala.ruelalaShopNowButton}")
	public AspireWebElement ruelalaShopNowButton();
	
	@CssSelector("${pages.ruelala.ruelalaTopNav}")
	public AspireWebElements ruelalaTopNav();
	
	@CssSelector("${pages.ruelala.ruelalaPLP}")
	public AspireWebElements ruelalaPLP();
	
	@CssSelector("${pages.ruelala.loveRuelal}")
	public AspireWebElement loveRuelal();
	
	@CssSelector("${pages.ruelala.loveRuelalaClose}")
	public AspireWebElement loveRuelalaClose();
	
	@CssSelector("${pages.ruelala.ruelalaProductPrice}")
	public AspireWebElement ruelalaProductPrice();
	
	@CssSelector("${pages.ruelala.ruelalaProductName}")
	public AspireWebElement ruelalaProductName();
	
	@CssSelector("${pages.ruelala.ruelalaPdp}")
	public AspireWebElement ruelalaPdp();
	
	@CssSelector("${pages.ruelala.ruelalaPdpName}")
	public AspireWebElement ruelalaPdpName();
	
	@CssSelector("${pages.ruelala.ruelalaPdpPrice}")
	public AspireWebElement ruelalaPdpPrice();
	
	@CssSelector("${pages.ruelala.ruelalaSales}")
	public AspireWebElements ruelalaSales();
	
	@CssSelector("${pages.ruelala.ruelalaSalesTwo}")
	public AspireWebElements ruelalaSalesTwo();
	
	@CssSelector("${pages.ruelala.ruelalaSizes}")
	public AspireWebElements ruelalaSizes();
	
	@CssSelector("${pages.ruelala.ruelalaAddToBagButton}")
	public AspireWebElement ruelalaAddToBagButton();
	
	@CssSelector("${pages.ruelala.ruelalaValidPdp}")
	public AspireWebElement ruelalaValidPdp();
	
	@CssSelector("${pages.ruelala.ruelalaBagProductName}")
	public AspireWebElement ruelalaBagProductName();
	
	@CssSelector("${pages.ruelala.ruelalaBagProductPrice}")
	public AspireWebElement ruelalaBagProductPrice();
	
	@CssSelector("${pages.ruelala.ruelalaBagQty}")
	public AspireWebElement ruelalaBagQty();
	
	@CssSelector("${pages.ruelala.ruelalaBagProductTotalPrice}")
	public AspireWebElement ruelalaBagProductTotalPrice();
	
	@CssSelector("${pages.ruelala.ruelalaBagProductOnePrice}")
	public AspireWebElement ruelalaBagProductOnePrice();
	
	@CssSelector("${pages.ruelala.ruelalaBagProductTwoPrice}")
	public AspireWebElement ruelalaBagProductTwoPrice();
	
	@CssSelector("${pages.ruelala.ruelalaProceedToCheckout}")
	public AspireWebElement ruelalaProceedToCheckout();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutPage}")
	public AspireWebElement ruelalaCheckoutPage();
	
	@CssSelector("${pages.ruelala.ruelalaPlaceOrder}")
	public AspireWebElement ruelalaPlaceOrder();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutFirstName}")
	public AspireWebElement ruelalaCheckoutFirstName();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutLastName}")
	public AspireWebElement ruelalaCheckoutLastName();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutAddress}")
	public AspireWebElement ruelalaCheckoutAddress();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutcity}")
	public AspireWebElement ruelalaCheckoutcity();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutZipCode}")
	public AspireWebElement ruelalaCheckoutZipCode();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutPhoneNumber}")
	public AspireWebElement ruelalaCheckoutPhoneNumber();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutState}")
	public AspireWebElement ruelalaCheckoutState();
	
	@CssSelector("${pages.ruelala.ruelalaCheckoutNameOnCard}")
	public AspireWebElement ruelalaCheckoutNameOnCard();
	
	@CssSelector("${pages.ruelala.ruelalaPaymentCardNumber}")
	public AspireWebElement ruelalaPaymentCardNumber();
	
	@CssSelector("${pages.ruelala.ruelalaPaymentCardExpirationMonth}")
	public AspireWebElement ruelalaPaymentCardExpirationMonth();
	
	@CssSelector("${pages.ruelala.ruelalaPaymentCardExpirationYear}")
	public AspireWebElement ruelalaPaymentCardExpirationYear();
	
	@CssSelector("${pages.ruelala.ruelalaPaymentSecurityCode}")
	public AspireWebElement ruelalaPaymentSecurityCode();
	
	@CssSelector("${pages.ruelala.ruelalaSubmitError}")
	public AspireWebElement ruelalaSubmitError();
	
	@CssSelector("${pages.ruelala.ruelalaBagPage}")
	public AspireWebElement ruelalaBagPage();
	
	
	
	
}
