package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;
import com.aspire.automation.web.util.annotation.XPathSelector;

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
	
	@CssSelector("${pages.saks.saksPreviewThisProductIcon}")
	public AspireWebElement saksPreviewThisProductIcon();
	
	@CssSelector("${pages.saks.saksQuickViewDialog}")
	public AspireWebElement saksQuickViewDialog();
	
	@CssSelector("${pages.saks.saksQuickViewProductName}")
	public AspireWebElement saksQuickViewProductName();
	
	@CssSelector("${pages.saks.saksQuickViewProductPrice}")
	public AspireWebElement saksQuickViewProductPrice();
	
	@CssSelector("${pages.saks.saksQuickViewImage}")
	public AspireWebElement saksQuickViewImage();
	
	@CssSelector("${pages.saks.saksViewProductDetail}")
	public AspireWebElement saksViewProductDetail();
	
	@CssSelector("${pages.saks.saksPdpProductPage}")
	public AspireWebElement saksPdpProductPage();
	
	@CssSelector("${pages.saks.saksPdpProductPrice}")
	public AspireWebElement saksPdpProductPrice();
	
	@CssSelector("${pages.saks.saksPdpProductName}")
	public AspireWebElement saksPdpProductName();
	
	@CssSelector("${pages.saks.saksPdpImage}")
	public AspireWebElement saksPdpImage();
	
	@CssSelector("${pages.saks.saksAddToBagButton}")
	public AspireWebElement saksAddToBagButton();
	
	@CssSelector("${pages.saks.saksShoppingBag}")
	public AspireWebElement saksShoppingBag();
	
	@CssSelector("${pages.saks.saksBagProductPrice}")
	public AspireWebElement saksBagProductPrice();
	
	@CssSelector("${pages.saks.saksBagProductName}")
	public AspireWebElement saksBagProductName();
	
	@CssSelector("${pages.saks.saksBagQTY}")
	public AspireWebElement saksBagQTY();
	
	@CssSelector("${pages.saks.saksProductSKUSelection}")
	public AspireWebElements saksProductSKUSelection();
	
	@CssSelector("${pages.saks.saksSku}")
	public AspireWebElements saksSku();
	
	@CssSelector("${pages.saks.saksBagCloseButton}")
	public AspireWebElement saksBagCloseButton();
	
	
	@CssSelector("${pages.saks.saksBagCheckoutButton}")
	public AspireWebElement saksBagCheckoutButton();
	
	@CssSelector("${pages.saks.saksBagProductPriceAfter}")
	public AspireWebElement saksBagProductPriceAfter();
	
	@CssSelector("${pages.saks.saksQuantity}")
	public AspireWebElement saksQuantity();
	
	@CssSelector("${pages.saks.saksBagPage}")
	public AspireWebElement saksBagPage();
	
	@CssSelector("${pages.saks.saksColor}")
	public AspireWebElements saksColor();
	
	@CssSelector("${pages.saks.saksBagProductOnePrice}")
	public AspireWebElement saksBagProductOnePrice();
	
	@CssSelector("${pages.saks.saksBagProductTwoPrice}")
	public AspireWebElement saksBagProductTwoPrice();
	
	@CssSelector("${pages.saks.saksBagSubTotalPrice}")
	public AspireWebElement saksBagSubTotalPrice();
	
	@CssSelector("${pages.saks.saksCheckoutButton}")
	public AspireWebElement saksCheckoutButton();
	
	@CssSelector("${pages.saks.saksCheckoutDialog}")
	public AspireWebElement saksCheckoutDialog();
	
	@CssSelector("${pages.saks.saksCheckoutAsGuest}")
	public AspireWebElement saksCheckoutAsGuest();
	
	@CssSelector("${pages.saks.saksCheckoutPage}")
	public AspireWebElement saksCheckoutPage();
	
	@CssSelector("${pages.saks.saksContinueCheckoutButton}")
	public AspireWebElement saksContinueCheckoutButton();
	
	@CssSelector("${pages.saks.saksCheckoutFirstNameError}")
	public AspireWebElement saksCheckoutFirstNameError();
	
	@CssSelector("${pages.saks.saksCheckoutLastNameError}")
	public AspireWebElement saksCheckoutLastNameError();
	
	@CssSelector("${pages.saks.saksCheckoutAddressError}")
	public AspireWebElement saksCheckoutAddressError();
	
	@CssSelector("${pages.saks.saksCheckoutCityError}")
	public AspireWebElement saksCheckoutCityError();
	
	@CssSelector("${pages.saks.saksCheckoutEmailAddressError}")
	public AspireWebElement saksCheckoutEmailAddressError();
	
	@CssSelector("${pages.saks.saksCheckoutPhoneNumberError}")
	public AspireWebElement saksCheckoutPhoneNumberError();
	
	@CssSelector("${pages.saks.saksCheckoutFirstName}")
	public AspireWebElement saksCheckoutFirstName();
	
	@CssSelector("${pages.saks.saksCheckoutLastName}")
	public AspireWebElement saksCheckoutLastName();
	
	@CssSelector("${pages.saks.saksCheckoutAddress}")
	public AspireWebElement saksCheckoutAddress();
	
	@CssSelector("${pages.saks.saksCheckoutCity}")
	public AspireWebElement saksCheckoutCity();
	
	@CssSelector("${pages.saks.saksCheckoutEmailAddress}")
	public AspireWebElement saksCheckoutEmailAddress();
	
	@CssSelector("${pages.saks.saksCheckoutPhoneNumber}")
	public AspireWebElement saksCheckoutPhoneNumber();
	
	@CssSelector("${pages.saks.saksCheckoutState}")
	public AspireWebElement saksCheckoutState();
	
	@CssSelector("${pages.saks.saksCheckoutZipCode}")
	public AspireWebElement saksCheckoutZipCode();
	
	@CssSelector("${pages.saks.saksPaymentPage}")
	public AspireWebElement saksPaymentPage();
	
	@CssSelector("${pages.saks.saksPaymentContinueCheckout}")
	public AspireWebElement saksPaymentContinueCheckout();
	
	@CssSelector("${pages.saks.saksPaymentCCNError}")
	public AspireWebElement saksPaymentCCNError();
	
	@CssSelector("${pages.saks.saksPaymentNameOnCardError}")
	public AspireWebElement saksPaymentNameOnCardError();
	
	@CssSelector("${pages.saks.saksPaymentExpirationError}")
	public AspireWebElement saksPaymentExpirationError();
	
	@CssSelector("${pages.saks.saksPaymentSecurityCodeError}")
	public AspireWebElement saksPaymentSecurityCodeError();
	
	@CssSelector("${pages.saks.saksPaymentType}")
	public AspireWebElement saksPaymentType();
	
	@CssSelector("${pages.saks.saksPaymentCCNE}")
	public AspireWebElement saksPaymentCCNE();
	
	@CssSelector("${pages.saks.saksPaymentNameOnCard}")
	public AspireWebElement saksPaymentNameOnCard();
	
	@CssSelector("${pages.saks.saksPaymentExpirationMonth}")
	public AspireWebElement saksPaymentExpirationMonth();
	
	@CssSelector("${pages.saks.saksPaymentExpirationYear}")
	public AspireWebElement saksPaymentExpirationYear();
	
	@CssSelector("${pages.saks.saksPaymentSecurityCode}")
	public AspireWebElement saksPaymentSecurityCode();
	
	@CssSelector("${pages.saks.saksCheckoutOrderSummery}")
	public AspireWebElement saksCheckoutOrderSummery();
	
	@CssSelector("${pages.saks.saksSecurityCode}")
	public AspireWebElement saksSecurityCode();
	
	@CssSelector("${pages.saks.saksPlaceOrderButton}")
	public AspireWebElement saksPlaceOrderButton();
	
	@CssSelector("${pages.saks.saksSubmitErrorMessage}")
	public AspireWebElement saksSubmitErrorMessage();
	
	@CssSelector("${pages.saks.saksValidPdp}")
	public AspireWebElements saksValidPdp();
	
	@CssSelector("${pages.saks.saksCheckoutTitle}")
	public AspireWebElement saksCheckoutTitle();
	
	@CssSelector("${pages.saks.saksItemTotal}")
	public AspireWebElement saksItemTotal();
	
	@XPathSelector("${pages.saks.saksShipping}")
	public AspireWebElement saksShipping();
	
	@CssSelector("${pages.saks.saksPromotionalSavings}")
	public AspireWebElement saksPromotionalSavings();
	
	@XPathSelector("${pages.saks.saksLandedCost}")
	public AspireWebElement saksLandedCost();
	
	@CssSelector("${pages.saks.saksDutiesAndTaxes}")
	public AspireWebElement saksDutiesAndTaxes();
	
	@CssSelector("${pages.saks.saksOrderTotal}")
	public AspireWebElement saksOrderTotal();
	
	
	
}
