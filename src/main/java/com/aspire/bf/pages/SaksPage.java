package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "saks", url = "${pages.saks.saksurl}")

public interface SaksPage {

	@CssSelector("${pages.saks.saksWelcomeMat}")
	public AspireWebElement saksWelcomeMat();
	
	@CssSelector("${pages.saks.saksWelcomeMatClose}")
	public AspireWebElement saksWelcomeMatClose();
	
	@CssSelector("${pages.saks.saksTopNav}")
	public AspireWebElements saksTopNav();
	
	@CssSelector("${pages.saks.saksSales}")
	public AspireWebElements saksSales();
	
	@CssSelector("${pages.saks.saksProducts}")
	public AspireWebElements saksProducts();
	
	@CssSelector("${pages.saks.saksProductName}")
	public AspireWebElement saksProductName();
	
	@CssSelector("${pages.saks.saksProductPrice}")
	public AspireWebElement saksProductPrice();
	
	@CssSelector("${pages.saks.previewThisProductIcon}")
	public AspireWebElement previewThisProductIcon();
	
	@CssSelector("${pages.saks.quickViewDialog}")
	public AspireWebElement quickViewDialog();
	
	@CssSelector("${pages.saks.quickViewProductName}")
	public AspireWebElement quickViewProductName();
	
	@CssSelector("${pages.saks.quickViewProductPrice}")
	public AspireWebElement quickViewProductPrice();
	
	@CssSelector("${pages.saks.quickViewImage}")
	public AspireWebElement quickViewImage();
	
	@CssSelector("${pages.saks.viewProductDetail}")
	public AspireWebElement viewProductDetail();
	
	@CssSelector("${pages.saks.pdpProductPage}")
	public AspireWebElement pdpProductPage();
	
	@CssSelector("${pages.saks.pdpProductPrice}")
	public AspireWebElement pdpProductPrice();
	
	@CssSelector("${pages.saks.pdpProductName}")
	public AspireWebElement pdpProductName();
	
	@CssSelector("${pages.saks.pdpImage}")
	public AspireWebElement pdpImage();
	
	@CssSelector("${pages.saks.addToBagButton}")
	public AspireWebElement addToBagButton();
	
	@CssSelector("${pages.saks.shoppingBag}")
	public AspireWebElement shoppingBag();
	
	@CssSelector("${pages.saks.bagProductPrice}")
	public AspireWebElement bagProductPrice();
	
	@CssSelector("${pages.saks.bagProductName}")
	public AspireWebElement bagProductName();
	
	@CssSelector("${pages.saks.bagQTY}")
	public AspireWebElement bagQTY();
	
	@CssSelector("${pages.saks.productSKUSelection}")
	public AspireWebElements productSKUSelection();
	
	@CssSelector("${pages.saks.availableSKU}")
	public AspireWebElements availableSKU();
	
	@CssSelector("${pages.saks.bagCloseButton}")
	public AspireWebElement bagCloseButton();
	
	@CssSelector("${pages.saks.quantityIncrementButton}")
	public AspireWebElement quantityIncrementButton();
	
	@CssSelector("${pages.saks.bagCheckoutButton}")
	public AspireWebElement bagCheckoutButton();
	
	@CssSelector("${pages.saks.bagProductPriceAfter}")
	public AspireWebElement bagProductPriceAfter();
	
	@CssSelector("${pages.saks.quantity}")
	public AspireWebElement quantity();
	
	@CssSelector("${pages.saks.saksBagPage}")
	public AspireWebElement saksBagPage();
	
	@CssSelector("${pages.saks.availableColor}")
	public AspireWebElements availableColor();
	
	@CssSelector("${pages.saks.bagProductOnePrice}")
	public AspireWebElement bagProductOnePrice();
	
	@CssSelector("${pages.saks.bagProductTwoPrice}")
	public AspireWebElement bagProductTwoPrice();
	
	@CssSelector("${pages.saks.bagSubTotalPrice}")
	public AspireWebElement bagSubTotalPrice();
	
	@CssSelector("${pages.saks.saksCheckoutButton}")
	public AspireWebElement saksCheckoutButton();
	
	@CssSelector("${pages.saks.checkoutDialog}")
	public AspireWebElement checkoutDialog();
	
	@CssSelector("${pages.saks.checkoutAsGuest}")
	public AspireWebElement checkoutAsGuest();
	
	@CssSelector("${pages.saks.checkoutPage}")
	public AspireWebElement checkoutPage();
	
	@CssSelector("${pages.saks.continueCheckoutButton}")
	public AspireWebElement continueCheckoutButton();
	
	@CssSelector("${pages.saks.checkoutFirstNameError}")
	public AspireWebElement checkoutFirstNameError();
	
	@CssSelector("${pages.saks.checkoutLastNameError}")
	public AspireWebElement checkoutLastNameError();
	
	@CssSelector("${pages.saks.checkoutAddressError}")
	public AspireWebElement checkoutAddressError();
	
	@CssSelector("${pages.saks.checkoutCityError}")
	public AspireWebElement checkoutCityError();
	
	@CssSelector("${pages.saks.checkoutEmailAddressError}")
	public AspireWebElement checkoutEmailAddressError();
	
	@CssSelector("${pages.saks.checkoutPhoneNumberError}")
	public AspireWebElement checkoutPhoneNumberError();
	
	@CssSelector("${pages.saks.checkoutFirstName}")
	public AspireWebElement checkoutFirstName();
	
	@CssSelector("${pages.saks.checkoutLastName}")
	public AspireWebElement checkoutLastName();
	
	@CssSelector("${pages.saks.checkoutAddress}")
	public AspireWebElement checkoutAddress();
	
	@CssSelector("${pages.saks.checkoutCity}")
	public AspireWebElement checkoutCity();
	
	@CssSelector("${pages.saks.checkoutEmailAddress}")
	public AspireWebElement checkoutEmailAddress();
	
	@CssSelector("${pages.saks.checkoutPhoneNumber}")
	public AspireWebElement checkoutPhoneNumber();
	
	@CssSelector("${pages.saks.checkoutState}")
	public AspireWebElement checkoutState();
	
	@CssSelector("${pages.saks.checkoutZipCode}")
	public AspireWebElement checkoutZipCode();
	
	@CssSelector("${pages.saks.paymentPage}")
	public AspireWebElement paymentPage();
	
	@CssSelector("${pages.saks.paymentContinueCheckout}")
	public AspireWebElement paymentContinueCheckout();
	
	@CssSelector("${pages.saks.paymentCCNError}")
	public AspireWebElement paymentCCNError();
	
	@CssSelector("${pages.saks.paymentNameOnCardError}")
	public AspireWebElement paymentNameOnCardError();
	
	@CssSelector("${pages.saks.paymentExpirationError}")
	public AspireWebElement paymentExpirationError();
	
	@CssSelector("${pages.saks.paymentSecurityCodeError}")
	public AspireWebElement paymentSecurityCodeError();
	
	@CssSelector("${pages.saks.paymentType}")
	public AspireWebElement paymentType();
	
	@CssSelector("${pages.saks.paymentCCNE}")
	public AspireWebElement paymentCCNE();
	
	@CssSelector("${pages.saks.paymentNameOnCard}")
	public AspireWebElement paymentNameOnCard();
	
	@CssSelector("${pages.saks.paymentExpirationMonth}")
	public AspireWebElement paymentExpirationMonth();
	
	@CssSelector("${pages.saks.paymentExpirationYear}")
	public AspireWebElement paymentExpirationYear();
	
	@CssSelector("${pages.saks.paymentSecurityCode}")
	public AspireWebElement paymentSecurityCode();
	
	@CssSelector("${pages.saks.checkoutOrderSummery}")
	public AspireWebElement checkoutOrderSummery();
	
	@CssSelector("${pages.saks.securityCode}")
	public AspireWebElement securityCode();
	
	@CssSelector("${pages.saks.placeOrderButton}")
	public AspireWebElement placeOrderButton();
	
	@CssSelector("${pages.saks.submitErrorMessage}")
	public AspireWebElement submitErrorMessage();
	
	
	
	
	
	
	
	
	
	
	
	
}
