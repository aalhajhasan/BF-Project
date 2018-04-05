package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "barneys", url = "${pages.barneys.barneysurl}")
public interface BarneysPage {

	
	@CssSelector("${pages.barneys.barneysTopNavStore}")
	public AspireWebElements barneysTopNavStore();
	
	@CssSelector("${pages.barneys.barneysSalesPage}")
	public AspireWebElement barneysSalesPage();
	
	@CssSelector("${pages.barneys.barneysSales}")
	public AspireWebElements barneysSales();
	
	@CssSelector("${pages.barneys.barneysPlp}")
	public AspireWebElement barneysPlp();
	
	@CssSelector("${pages.barneys.barneysPlpProduct}")
	public AspireWebElements barneysPlpProduct();
	
	@CssSelector("${pages.barneys.barneysProductName}")
	public AspireWebElement barneysProductName();
	
	@CssSelector("${pages.barneys.barneysProductPrice}")
	public AspireWebElement barneysProductPrice();
	
	@CssSelector("${pages.barneys.barneysPdp}")
	public AspireWebElement barneysPdp();
	
	@CssSelector("${pages.barneys.barneysPdpName}")
	public AspireWebElement barneysPdpName();
	
	@CssSelector("${pages.barneys.barneysPdpPrice}")
	public AspireWebElement barneysPdpPrice();
	
	@CssSelector("${pages.barneys.barneysProductImage}")
	public AspireWebElement barneysProductImage();
	
	@CssSelector("${pages.barneys.barneysPdpImage}")
	public AspireWebElement barneysPdpImage();
	
	@CssSelector("${pages.barneys.size}")
	public AspireWebElements size();
	
	@CssSelector("${pages.barneys.barneysAddToBagButton}")
	public AspireWebElement barneysAddToBagButton();
	
	@CssSelector("${pages.barneys.barneysMyBagDialog}")
	public AspireWebElement barneysMyBagDialog();
	
	@CssSelector("${pages.barneys.barneysBagName}")
	public AspireWebElement barneysBagName();
	
	@CssSelector("${pages.barneys.barneysBagPrice}")
	public AspireWebElement barneysBagPrice();
	
	@CssSelector("${pages.barneys.barneysBagImage}")
	public AspireWebElement barneysBagImage();
	
	@CssSelector("${pages.barneys.barneysMyBagCloseButton}")
	public AspireWebElement barneysMyBagCloseButton();
	
	@CssSelector("${pages.barneys.barneysBagTotalPrice}")
	public AspireWebElement barneysBagTotalPrice();
	
	@CssSelector("${pages.barneys.barneysCheckoutButton}")
	public AspireWebElement barneysCheckoutButton();
	
	@CssSelector("${pages.barneys.barneysBagPage}")
	public AspireWebElement barneysBagPage();
	
	@CssSelector("${pages.barneys.barneysProceedToCheckout}")
	public AspireWebElement barneysProceedToCheckout();
	
	@CssSelector("${pages.barneys.barneysBagQuantity}")
	public AspireWebElements barneysBagQuantity();
	
	@CssSelector("${pages.barneys.barneysContinueButton}")
	public AspireWebElements barneysContinueButton();
	
	@CssSelector("${pages.barneys.barneysShippingFirstNameError}")
	public AspireWebElement barneysShippingFirstNameError();
	
	@CssSelector("${pages.barneys.barneysShippingLastNameError}")
	public AspireWebElement barneysShippingLastNameError();
	
	@CssSelector("${pages.barneys.barneysShippingAddressError}")
	public AspireWebElement barneysShippingAddressError();
	
	@CssSelector("${pages.barneys.barneysShippingCityError}")
	public AspireWebElement barneysShippingCityError();
	
	@CssSelector("${pages.barneys.barneysShippingProvinceError}")
	public AspireWebElement barneysShippingProvinceError();
	
	@CssSelector("${pages.barneys.barneysShippingPostalCodeError}")
	public AspireWebElement barneysShippingPostalCodeError();
	
	@CssSelector("${pages.barneys.barneysShippingTelephoneError}")
	public AspireWebElement barneysShippingTelephoneError();
	
	@CssSelector("${pages.barneys.barneysShippingFirstName}")
	public AspireWebElement barneysShippingFirstName();
	
	@CssSelector("${pages.barneys.barneysShippingLastName}")
	public AspireWebElement barneysShippingLastName();
	
	@CssSelector("${pages.barneys.barneysShippingAddress}")
	public AspireWebElement barneysShippingAddress();
	
	@CssSelector("${pages.barneys.barneysShippingCity}")
	public AspireWebElement barneysShippingCity();
	
	@CssSelector("${pages.barneys.barneysShippingProvince}")
	public AspireWebElement barneysShippingProvince();
	
	@CssSelector("${pages.barneys.barneysShippingPostalCode}")
	public AspireWebElement barneysShippingPostalCode();
	
	@CssSelector("${pages.barneys.barneysShippingTelephone}")
	public AspireWebElement barneysShippingTelephone();
	
	@CssSelector("${pages.barneys.barneysPaymentPage}")
	public AspireWebElement barneysPaymentPage();
	
	@CssSelector("${pages.barneys.barneysContinuePaymentButton}")
	public AspireWebElement barneysContinuePaymentButton();
	
	@CssSelector("${pages.barneys.barneysPaymentNameOnCardError}")
	public AspireWebElement barneysPaymentNameOnCardError();
	
	@CssSelector("${pages.barneys.barneysPaymentTypeError}")
	public AspireWebElement barneysPaymentTypeError();
	
	@CssSelector("${pages.barneys.barneysPaymentCardNumberError}")
	public AspireWebElement barneysPaymentCardNumberError();
	
	@CssSelector("${pages.barneys.barneysPaymentExpirationMonthError}")
	public AspireWebElement barneysPaymentExpirationMonthError();
	
	@CssSelector("${pages.barneys.barneysPaymentExpirationYearError}")
	public AspireWebElement barneysPaymentExpirationYearError();
	
	@CssSelector("${pages.barneys.barneysPaymentSecurityCodeError}")
	public AspireWebElement barneysPaymentSecurityCodeError();
	
	@CssSelector("${pages.barneys.barneysPaymentNameOnCard}")
	public AspireWebElement barneysPaymentNameOnCard();
	
	@CssSelector("${pages.barneys.barneysPaymentCardNumber}")
	public AspireWebElement barneysPaymentCardNumber();
	
	@CssSelector("${pages.barneys.barneysPaymentSecurityCode}")
	public AspireWebElement barneysPaymentSecurityCode();
	
	@CssSelector("${pages.barneys.barneysPaymentType}")
	public AspireWebElement barneysPaymentType();
	
	@CssSelector("${pages.barneys.barneysPaymentExpirationYear}")
	public AspireWebElement barneysPaymentExpirationYear();
	
	@CssSelector("${pages.barneys.barneysPaymentExpirationMonth}")
	public AspireWebElement barneysPaymentExpirationMonth();
	
	@CssSelector("${pages.barneys.barneysSameAsShipping}")
	public AspireWebElement barneysSameAsShipping();
	
	@CssSelector("${pages.barneys.barneysBillingEmail}")
	public AspireWebElement barneysBillingEmail();
	
	@CssSelector("${pages.barneys.barneysErrorMessage}")
	public AspireWebElement barneysErrorMessage();
	
	@CssSelector("${pages.barneys.barneysShippingPage}")
	public AspireWebElement barneysShippingPage();
	
	@CssSelector("${pages.barneys.barneysFeedbackDialog}")
	public AspireWebElement barneysFeedbackDialog();
	
	@CssSelector("${pages.barneys.barneysFeedbackClose}")
	public AspireWebElement barneysFeedbackClose();
	
	@CssSelector("${pages.barneys.barneysSubtotal}")
	public AspireWebElement barneysSubtotal();
	
	@CssSelector("${pages.barneys.barneysDuties}")
	public AspireWebElement barneysDuties();
	
	@CssSelector("${pages.barneys.barneysTax}")
	public AspireWebElement barneysTax();
	
	@CssSelector("${pages.barneys.barneysShipping}")
	public AspireWebElement barneysShipping();
	
	@CssSelector("${pages.barneys.barneysEstimatedTotal}")
	public AspireWebElement barneysEstimatedTotal();
	
}
