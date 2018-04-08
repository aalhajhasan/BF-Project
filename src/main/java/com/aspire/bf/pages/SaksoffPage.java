package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.automation.web.util.annotation.XPathSelector;

@Page(name = "saksoff", url = "${pages.saksoff.saksoffurl}")

public interface SaksoffPage {

	
	@CssSelector("${pages.saksoff.saksoffWelcomeMat}")
	public AspireWebElement saksoffWelcomeMat();
	
	@CssSelector("${pages.saksoff.saksoffWelcomeMatClose}")
	public AspireWebElement saksoffWelcomeMatClose();
	
	@CssSelector("${pages.saksoff.saksoffTopNav}")
	public AspireWebElements saksoffTopNav();
	
	@CssSelector("${pages.saksoff.saksoffProducts}")
	public AspireWebElements saksoffProducts();
	
	@CssSelector("${pages.saksoff.saksoffProductName}")
	public AspireWebElement saksoffProductName();
	
	@CssSelector("${pages.saksoff.saksoffProductPrice}")
	public AspireWebElement saksoffProductPrice();
	
	@CssSelector("${pages.saksoff.saksoffPreviewThisProductIcon}")
	public AspireWebElement saksoffPreviewThisProductIcon();
	
	@CssSelector("${pages.saksoff.saksoffQuickViewDialog}")
	public AspireWebElement saksoffQuickViewDialog();
	
	@CssSelector("${pages.saksoff.saksoffQuickViewProductName}")
	public AspireWebElement saksoffQuickViewProductName();
	
	@CssSelector("${pages.saksoff.saksoffQuickViewProductPrice}")
	public AspireWebElement saksoffQuickViewProductPrice();
	
	@CssSelector("${pages.saksoff.saksoffQuickViewImage}")
	public AspireWebElement saksoffQuickViewImage();
	
	@CssSelector("${pages.saksoff.saksoffViewProductDetail}")
	public AspireWebElement saksoffViewProductDetail();
	
	@CssSelector("${pages.saksoff.saksoffPdpProductPage}")
	public AspireWebElement saksoffPdpProductPage();
	
	@CssSelector("${pages.saksoff.saksoffPdpImage}")
	public AspireWebElement saksoffPdpImage();
	
	@CssSelector("${pages.saksoff.saksoffPdpProductPrice}")
	public AspireWebElement saksoffPdpProductPrice();
	
	@CssSelector("${pages.saksoff.saksoffPdpProductName}")
	public AspireWebElement saksoffPdpProductName();
	
	@CssSelector("${pages.saksoff.saksoffBagProductName}")
	public AspireWebElement saksoffBagProductName();
	
	@CssSelector("${pages.saksoff.saksoffBagCloseButton}")
	public AspireWebElement saksoffBagCloseButton();
	
	@CssSelector("${pages.saksoff.saksoffBagCheckoutButton}")
	public AspireWebElement saksoffBagCheckoutButton();
	
	@CssSelector("${pages.saksoff.saksoffBagProductPrice}")
	public AspireWebElement saksoffBagProductPrice();
	
	@CssSelector("${pages.saksoff.saksoffProductSKUSelection}")
	public AspireWebElements saksoffProductSKUSelection();
	
	@CssSelector("${pages.saksoff.saksoffValidPdp}")
	public AspireWebElements saksoffValidPdp();
	
	@CssSelector("${pages.saksoff.saksoffColor}")
	public AspireWebElements saksoffColor();
	
	@CssSelector("${pages.saksoff.saksoffSku}")
	public AspireWebElements saksoffSku();
	
	@CssSelector("${pages.saksoff.saksoffAddToBagButton}")
	public AspireWebElement saksoffAddToBagButton();
	
	@CssSelector("${pages.saksoff.saksoffShoppingBag}")
	public AspireWebElement saksoffShoppingBag();
	
	@CssSelector("${pages.saksoff.saksoffBagPage}")
	public AspireWebElement saksoffBagPage();
	
	@CssSelector("${pages.saksoff.saksoffBagProductPriceAfter}")
	public AspireWebElement saksoffBagProductPriceAfter();
	
	@CssSelector("${pages.saksoff.saksoffQuantity}")
	public AspireWebElement saksoffQuantity();
	
	@CssSelector("${pages.saksoff.saksoffBagProductOnePrice}")
	public AspireWebElement saksoffBagProductOnePrice();
	
	@CssSelector("${pages.saksoff.saksoffBagProductTwoPrice}")
	public AspireWebElement saksoffBagProductTwoPrice();
	
	@CssSelector("${pages.saksoff.saksoffBagSubTotalPrice}")
	public AspireWebElement saksoffBagSubTotalPrice();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutButton}")
	public AspireWebElement saksoffCheckoutButton();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutDialog}")
	public AspireWebElement saksoffCheckoutDialog();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutAsGuest}")
	public AspireWebElement saksoffCheckoutAsGuest();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutPage}")
	public AspireWebElement saksoffCheckoutPage();
	
	@CssSelector("${pages.saksoff.saksoffContinueCheckoutButton}")
	public AspireWebElement saksoffContinueCheckoutButton();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutFirstNameError}")
	public AspireWebElement saksoffCheckoutFirstNameError();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutLastNameError}")
	public AspireWebElement saksoffCheckoutLastNameError();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutAddressError}")
	public AspireWebElement saksoffCheckoutAddressError();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutCityError}")
	public AspireWebElement saksoffCheckoutCityError();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutEmailAddressError}")
	public AspireWebElement saksoffCheckoutEmailAddressError();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutPhoneNumberError}")
	public AspireWebElement saksoffCheckoutPhoneNumberError();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutFirstName}")
	public AspireWebElement saksoffCheckoutFirstName();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutLastName}")
	public AspireWebElement saksoffCheckoutLastName();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutAddress}")
	public AspireWebElement saksoffCheckoutAddress();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutCity}")
	public AspireWebElement saksoffCheckoutCity();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutEmailAddress}")
	public AspireWebElement saksoffCheckoutEmailAddress();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutPhoneNumber}")
	public AspireWebElement saksoffCheckoutPhoneNumber();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutState}")
	public AspireWebElement saksoffCheckoutState();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutZipCode}")
	public AspireWebElement saksoffCheckoutZipCode();
	
	@CssSelector("${pages.saksoff.saksoffPaymentPage}")
	public AspireWebElement saksoffPaymentPage();
	
	@CssSelector("${pages.saksoff.saksoffPaymentContinueCheckout}")
	public AspireWebElement saksoffPaymentContinueCheckout();
	
	@CssSelector("${pages.saksoff.saksoffPaymentCCNError}")
	public AspireWebElement saksoffPaymentCCNError();
	
	@CssSelector("${pages.saksoff.saksoffPaymentNameOnCardError}")
	public AspireWebElement saksoffPaymentNameOnCardError();
	
	@CssSelector("${pages.saksoff.saksoffPaymentExpirationError}")
	public AspireWebElement saksoffPaymentExpirationError();
	
	@CssSelector("${pages.saksoff.saksoffPaymentSecurityCodeError}")
	public AspireWebElement saksoffPaymentSecurityCodeError();
	
	@CssSelector("${pages.saksoff.saksoffPaymentType}")
	public AspireWebElement saksoffPaymentType();
	
	@CssSelector("${pages.saksoff.saksoffPaymentCCNE}")
	public AspireWebElement saksoffPaymentCCNE();
	
	@CssSelector("${pages.saksoff.saksoffPaymentNameOnCard}")
	public AspireWebElement saksoffPaymentNameOnCard();
	
	@CssSelector("${pages.saksoff.saksoffPaymentExpirationMonth}")
	public AspireWebElement saksoffPaymentExpirationMonth();
	
	@CssSelector("${pages.saksoff.saksoffPaymentExpirationYear}")
	public AspireWebElement saksoffPaymentExpirationYear();
	
	@CssSelector("${pages.saksoff.saksoffPaymentSecurityCode}")
	public AspireWebElement saksoffPaymentSecurityCode();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutOrderSummery}")
	public AspireWebElement saksoffCheckoutOrderSummery();
	
	@CssSelector("${pages.saksoff.saksoffSecurityCode}")
	public AspireWebElement saksoffSecurityCode();
	
	@CssSelector("${pages.saksoff.saksoffPlaceOrderButton}")
	public AspireWebElement saksoffPlaceOrderButton();
	
	@CssSelector("${pages.saksoff.saksoffSubmitErrorMessage}")
	public AspireWebElement saksoffSubmitErrorMessage();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutTitle}")
	public AspireWebElement saksoffCheckoutTitle();
	
	@CssSelector("${pages.saksoff.saksoffItemTotal}")
	public AspireWebElement saksoffItemTotal();
	
	@XPathSelector("${pages.saksoff.saksoffShipping}")
	public AspireWebElement saksoffShipping();
	
	@XPathSelector("${pages.saksoff.saksoffLandedCost}")
	public AspireWebElement saksoffLandedCost();
	
	@CssSelector("${pages.saksoff.saksoffDutiesAndTaxes}")
	public AspireWebElement saksoffDutiesAndTaxes();
	
	@CssSelector("${pages.saksoff.saksoffOrderTotal}")
	public AspireWebElement saksoffOrderTotal();
	
	@XPathSelector("${pages.saksoff.saksoffBagQty}")
	public AspireWebElement saksoffBagQty();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
