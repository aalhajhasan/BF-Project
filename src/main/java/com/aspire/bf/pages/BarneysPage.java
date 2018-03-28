package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "barneys", url = "${pages.barneys.barneysurl}")
public interface BarneysPage {

	
	@CssSelector("${pages.barneys.barneysTopNavStore}")
	public AspireWebElements barneysTopNavStore();
	
	@CssSelector("${pages.barneys.salesPage}")
	public AspireWebElement salesPage();
	
	@CssSelector("${pages.barneys.barneysSales}")
	public AspireWebElements barneysSales();
	
	@CssSelector("${pages.barneys.barneysPlp}")
	public AspireWebElement barneysPlp();
	
	@CssSelector("${pages.barneys.barneysPlpProduct}")
	public AspireWebElements barneysPlpProduct();
	
	@CssSelector("${pages.barneys.productName}")
	public AspireWebElement productName();
	
	@CssSelector("${pages.barneys.productPrice}")
	public AspireWebElement productPrice();
	
	@CssSelector("${pages.barneys.barneysPdp}")
	public AspireWebElement barneysPdp();
	
	@CssSelector("${pages.barneys.pdpName}")
	public AspireWebElement pdpName();
	
	@CssSelector("${pages.barneys.pdpPrice}")
	public AspireWebElement pdpPrice();
	
	@CssSelector("${pages.barneys.productImage}")
	public AspireWebElement productImage();
	
	@CssSelector("${pages.barneys.pdpImage}")
	public AspireWebElement pdpImage();
	
	@CssSelector("${pages.barneys.availableSize}")
	public AspireWebElements availableSize();
	
	@CssSelector("${pages.barneys.addToBagButton}")
	public AspireWebElement addToBagButton();
	
	@CssSelector("${pages.barneys.myBagDialog}")
	public AspireWebElement myBagDialog();
	
	@CssSelector("${pages.barneys.bagName}")
	public AspireWebElement bagName();
	
	@CssSelector("${pages.barneys.bagPrice}")
	public AspireWebElement bagPrice();
	
	@CssSelector("${pages.barneys.bagImage}")
	public AspireWebElement bagImage();
	
	@CssSelector("${pages.barneys.myBagCloseButton}")
	public AspireWebElement myBagCloseButton();
	
	@CssSelector("${pages.barneys.bagTotalPrice}")
	public AspireWebElement bagTotalPrice();
	
	@CssSelector("${pages.barneys.checkoutButton}")
	public AspireWebElement checkoutButton();
	
	@CssSelector("${pages.barneys.bagPage}")
	public AspireWebElement bagPage();
	
	@CssSelector("${pages.barneys.proceedToCheckout}")
	public AspireWebElement proceedToCheckout();
	
	@CssSelector("${pages.barneys.bagQuantity}")
	public AspireWebElements bagQuantity();
	
	@CssSelector("${pages.barneys.continueButton}")
	public AspireWebElements continueButton();
	
	@CssSelector("${pages.barneys.shippingFirstNameError}")
	public AspireWebElement shippingFirstNameError();
	
	@CssSelector("${pages.barneys.shippingLastNameError}")
	public AspireWebElement shippingLastNameError();
	
	@CssSelector("${pages.barneys.shippingAddressError}")
	public AspireWebElement shippingAddressError();
	
	@CssSelector("${pages.barneys.shippingCityError}")
	public AspireWebElement shippingCityError();
	
	@CssSelector("${pages.barneys.shippingProvinceError}")
	public AspireWebElement shippingProvinceError();
	
	@CssSelector("${pages.barneys.shippingPostalCodeError}")
	public AspireWebElement shippingPostalCodeError();
	
	@CssSelector("${pages.barneys.shippingTelephoneError}")
	public AspireWebElement shippingTelephoneError();
	
	@CssSelector("${pages.barneys.shippingFirstName}")
	public AspireWebElement shippingFirstName();
	
	@CssSelector("${pages.barneys.shippingLastName}")
	public AspireWebElement shippingLastName();
	
	@CssSelector("${pages.barneys.shippingAddress}")
	public AspireWebElement shippingAddress();
	
	@CssSelector("${pages.barneys.shippingCity}")
	public AspireWebElement shippingCity();
	
	@CssSelector("${pages.barneys.shippingProvince}")
	public AspireWebElement shippingProvince();
	
	@CssSelector("${pages.barneys.shippingPostalCode}")
	public AspireWebElement shippingPostalCode();
	
	@CssSelector("${pages.barneys.shippingTelephone}")
	public AspireWebElement shippingTelephone();
	
	@CssSelector("${pages.barneys.paymentPage}")
	public AspireWebElement paymentPage();
	
	@CssSelector("${pages.barneys.continuePaymentButton}")
	public AspireWebElement continuePaymentButton();
	
	@CssSelector("${pages.barneys.paymentNameOnCardError}")
	public AspireWebElement paymentNameOnCardError();
	
	@CssSelector("${pages.barneys.paymentTypeError}")
	public AspireWebElement paymentTypeError();
	
	@CssSelector("${pages.barneys.paymentCardNumberError}")
	public AspireWebElement paymentCardNumberError();
	
	@CssSelector("${pages.barneys.paymentExpirationMonthError}")
	public AspireWebElement paymentExpirationMonthError();
	
	@CssSelector("${pages.barneys.paymentExpirationYearError}")
	public AspireWebElement paymentExpirationYearError();
	
	@CssSelector("${pages.barneys.paymentSecurityCodeError}")
	public AspireWebElement paymentSecurityCodeError();
	
	@CssSelector("${pages.barneys.paymentNameOnCard}")
	public AspireWebElement paymentNameOnCard();
	
	@CssSelector("${pages.barneys.paymentCardNumber}")
	public AspireWebElement paymentCardNumber();
	
	@CssSelector("${pages.barneys.paymentSecurityCode}")
	public AspireWebElement paymentSecurityCode();
	
	@CssSelector("${pages.barneys.paymentType}")
	public AspireWebElement paymentType();
	
	@CssSelector("${pages.barneys.paymentExpirationYear}")
	public AspireWebElement paymentExpirationYear();
	
	@CssSelector("${pages.barneys.paymentExpirationMonth}")
	public AspireWebElement paymentExpirationMonth();
	
	@CssSelector("${pages.barneys.sameAsShipping}")
	public AspireWebElement sameAsShipping();
	
	@CssSelector("${pages.barneys.billingEmail}")
	public AspireWebElement billingEmail();
	
	@CssSelector("${pages.barneys.errorMessage}")
	public AspireWebElement errorMessage();
	
	
	
	
}
