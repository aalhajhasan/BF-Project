package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.ClassNameSelector;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "ruelala", url = "${pages.ruelala.ruelalaurl}")

public interface RuelalaPage {

	@CssSelector("${pages.ruelala.ruelalaNewMemberDialog}")
	public AspireWebElement ruelalaNewMemberDialog();
	
	@CssSelector("${pages.ruelala.ruelalaMemberEmail}")
	public AspireWebElement ruelalaMemberEmail();
	
	@CssSelector("${pages.ruelala.ruelalaSoldOutMessage}")
	public AspireWebElement ruelalaSoldOutMessage();
	
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
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutPage}")
	public AspireWebElement ruelalaCheckoutPage();
	
	@IDSelector("${pages.ruelala.ruelalaPlaceOrder}")
	public AspireWebElement ruelalaPlaceOrder();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutFirstName}")
	public AspireWebElement ruelalaCheckoutFirstName();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutLastName}")
	public AspireWebElement ruelalaCheckoutLastName();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutAddress}")
	public AspireWebElement ruelalaCheckoutAddress();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutcity}")
	public AspireWebElement ruelalaCheckoutcity();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutZipCode}")
	public AspireWebElement ruelalaCheckoutZipCode();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutPhoneNumber}")
	public AspireWebElement ruelalaCheckoutPhoneNumber();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutState}")
	public AspireWebElement ruelalaCheckoutState();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutNameOnCard}")
	public AspireWebElement ruelalaCheckoutNameOnCard();
	
	@IDSelector("${pages.ruelala.ruelalaPaymentCardNumber}")
	public AspireWebElement ruelalaPaymentCardNumber();
	
	@IDSelector("${pages.ruelala.ruelalaPaymentCardExpirationMonth}")
	public AspireWebElement ruelalaPaymentCardExpirationMonth();
	
	@IDSelector("${pages.ruelala.ruelalaPaymentCardExpirationYear}")
	public AspireWebElement ruelalaPaymentCardExpirationYear();
	
	@IDSelector("${pages.ruelala.ruelalaPaymentSecurityCode}")
	public AspireWebElement ruelalaPaymentSecurityCode();
	
	@IDSelector("${pages.ruelala.ruelalaSubmitError}")
	public AspireWebElement ruelalaSubmitError();
	
	@CssSelector("${pages.ruelala.ruelalaBagPage}")
	public AspireWebElement ruelalaBagPage();
	
	@IDSelector("${pages.ruelala.ruelalaCheckoutEmail}")
	public AspireWebElement ruelalaCheckoutEmail();
	
	
}
