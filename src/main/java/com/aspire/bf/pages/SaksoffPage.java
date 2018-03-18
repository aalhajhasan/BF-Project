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
	
	@CssSelector("${pages.saksoff.viewProductDetail}")
	public AspireWebElement viewProductDetail();
	
	@CssSelector("${pages.saksoff.pdpProductPage}")
	public AspireWebElement pdpProductPage();
	
	@CssSelector("${pages.saksoff.pdpImage}")
	public AspireWebElement pdpImage();
	
	@CssSelector("${pages.saksoff.pdpProductPrice}")
	public AspireWebElement pdpProductPrice();
	
	@CssSelector("${pages.saksoff.pdpProductName}")
	public AspireWebElement pdpProductName();
	
	@CssSelector("${pages.saksoff.bagProductName}")
	public AspireWebElement bagProductName();
	
	@CssSelector("${pages.saksoff.bagCloseButton}")
	public AspireWebElement bagCloseButton();
	
	@CssSelector("${pages.saksoff.bagCheckoutButton}")
	public AspireWebElement bagCheckoutButton();
	
	@CssSelector("${pages.saksoff.bagProductPrice}")
	public AspireWebElement bagProductPrice();
	
	@CssSelector("${pages.saksoff.productSKUSelection}")
	public AspireWebElements productSKUSelection();
	
	@CssSelector("${pages.saksoff.validPdp}")
	public AspireWebElements validPdp();
	
	@CssSelector("${pages.saksoff.availableColor}")
	public AspireWebElements availableColor();
	
	@CssSelector("${pages.saksoff.availableSKU}")
	public AspireWebElements availableSKU();
	
	@CssSelector("${pages.saksoff.addToBagButton}")
	public AspireWebElement addToBagButton();
	
	@CssSelector("${pages.saksoff.shoppingBag}")
	public AspireWebElement shoppingBag();
	
	@CssSelector("${pages.saksoff.saksoffBagPage}")
	public AspireWebElement saksoffBagPage();
	
	@CssSelector("${pages.saksoff.bagProductPriceAfter}")
	public AspireWebElement bagProductPriceAfter();
	
	@CssSelector("${pages.saksoff.quantity}")
	public AspireWebElement quantity();
	
	@CssSelector("${pages.saksoff.bagProductOnePrice}")
	public AspireWebElement bagProductOnePrice();
	
	@CssSelector("${pages.saksoff.bagProductTwoPrice}")
	public AspireWebElement bagProductTwoPrice();
	
	@CssSelector("${pages.saksoff.bagSubTotalPrice}")
	public AspireWebElement bagSubTotalPrice();
	
	@CssSelector("${pages.saksoff.saksoffCheckoutButton}")
	public AspireWebElement saksoffCheckoutButton();
	
	@CssSelector("${pages.saksoff.checkoutDialog}")
	public AspireWebElement checkoutDialog();
	
	@CssSelector("${pages.saksoff.checkoutAsGuest}")
	public AspireWebElement checkoutAsGuest();
	
	@CssSelector("${pages.saksoff.checkoutPage}")
	public AspireWebElement checkoutPage();
	
	@CssSelector("${pages.saksoff.continueCheckoutButton}")
	public AspireWebElement continueCheckoutButton();
	
	@CssSelector("${pages.saksoff.checkoutFirstNameError}")
	public AspireWebElement checkoutFirstNameError();
	
	@CssSelector("${pages.saksoff.checkoutLastNameError}")
	public AspireWebElement checkoutLastNameError();
	
	@CssSelector("${pages.saksoff.checkoutAddressError}")
	public AspireWebElement checkoutAddressError();
	
	@CssSelector("${pages.saksoff.checkoutCityError}")
	public AspireWebElement checkoutCityError();
	
	@CssSelector("${pages.saksoff.checkoutEmailAddressError}")
	public AspireWebElement checkoutEmailAddressError();
	
	@CssSelector("${pages.saksoff.checkoutPhoneNumberError}")
	public AspireWebElement checkoutPhoneNumberError();
	
	@CssSelector("${pages.saksoff.checkoutFirstName}")
	public AspireWebElement checkoutFirstName();
	
	@CssSelector("${pages.saksoff.checkoutLastName}")
	public AspireWebElement checkoutLastName();
	
	@CssSelector("${pages.saksoff.checkoutAddress}")
	public AspireWebElement checkoutAddress();
	
	@CssSelector("${pages.saksoff.checkoutCity}")
	public AspireWebElement checkoutCity();
	
	@CssSelector("${pages.saksoff.checkoutEmailAddress}")
	public AspireWebElement checkoutEmailAddress();
	
	@CssSelector("${pages.saksoff.checkoutPhoneNumber}")
	public AspireWebElement checkoutPhoneNumber();
	
	@CssSelector("${pages.saksoff.checkoutState}")
	public AspireWebElement checkoutState();
	
	@CssSelector("${pages.saksoff.checkoutZipCode}")
	public AspireWebElement checkoutZipCode();
	
	@CssSelector("${pages.saksoff.paymentPage}")
	public AspireWebElement paymentPage();
	
	@CssSelector("${pages.saksoff.paymentContinueCheckout}")
	public AspireWebElement paymentContinueCheckout();
	
	@CssSelector("${pages.saksoff.paymentCCNError}")
	public AspireWebElement paymentCCNError();
	
	@CssSelector("${pages.saksoff.paymentNameOnCardError}")
	public AspireWebElement paymentNameOnCardError();
	
	@CssSelector("${pages.saksoff.paymentExpirationError}")
	public AspireWebElement paymentExpirationError();
	
	@CssSelector("${pages.saksoff.paymentSecurityCodeError}")
	public AspireWebElement paymentSecurityCodeError();
	
	@CssSelector("${pages.saksoff.paymentType}")
	public AspireWebElement paymentType();
	
	@CssSelector("${pages.saksoff.paymentCCNE}")
	public AspireWebElement paymentCCNE();
	
	@CssSelector("${pages.saksoff.paymentNameOnCard}")
	public AspireWebElement paymentNameOnCard();
	
	@CssSelector("${pages.saksoff.paymentExpirationMonth}")
	public AspireWebElement paymentExpirationMonth();
	
	@CssSelector("${pages.saksoff.paymentExpirationYear}")
	public AspireWebElement paymentExpirationYear();
	
	@CssSelector("${pages.saksoff.paymentSecurityCode}")
	public AspireWebElement paymentSecurityCode();
	
	@CssSelector("${pages.saksoff.checkoutOrderSummery}")
	public AspireWebElement checkoutOrderSummery();
	
	@CssSelector("${pages.saksoff.securityCode}")
	public AspireWebElement securityCode();
	
	@CssSelector("${pages.saksoff.placeOrderButton}")
	public AspireWebElement placeOrderButton();
	
	@CssSelector("${pages.saksoff.submitErrorMessage}")
	public AspireWebElement submitErrorMessage();
	
	@CssSelector("${pages.saksoff.checkoutTitle}")
	public AspireWebElement checkoutTitle();
	
	@CssSelector("${pages.saksoff.itemTotal}")
	public AspireWebElement itemTotal();
	
	@XPathSelector("${pages.saksoff.shipping}")
	public AspireWebElement shipping();
	
	@XPathSelector("${pages.saksoff.landedCost}")
	public AspireWebElement landedCost();
	
	@CssSelector("${pages.saksoff.dutiesAndTaxes}")
	public AspireWebElement dutiesAndTaxes();
	
	@CssSelector("${pages.saksoff.orderTotal}")
	public AspireWebElement orderTotal();
	
	@XPathSelector("${pages.saksoff.bagQty}")
	public AspireWebElement bagQty();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
