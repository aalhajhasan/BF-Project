package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "gilt", url = "${pages.gilt.gilturl}")
public interface GiltPage {

	@CssSelector("${pages.gilt.giltRegisterLink}")
	public AspireWebElement giltRegisterLink();
	
	@CssSelector("${pages.gilt.giltLoginDialog}")
	public AspireWebElement giltLoginDialog();
	
	@CssSelector("${pages.gilt.giltRegisterDialog}")
	public AspireWebElement giltRegisterDialog();
	
	@CssSelector("${pages.gilt.giltRegisterEmailSection}")
	public AspireWebElement giltRegisterEmailSection();
	
	@CssSelector("${pages.gilt.giltShopNowButton}")
	public AspireWebElement giltShopNowButton();
	
	@CssSelector("${pages.gilt.giltRegisterPasswordSection}")
	public AspireWebElement giltRegisterPasswordSection();
	
	@CssSelector("${pages.gilt.giltGenderMale}")
	public AspireWebElement giltGenderMale();
	
	@CssSelector("${pages.gilt.giltSubmitButton}")
	public AspireWebElement giltSubmitButton();
	
	@CssSelector("${pages.gilt.giltWelcomeDialog}")
	public AspireWebElement giltWelcomeDialog();
	
	@CssSelector("${pages.gilt.giltStartShopping}")
	public AspireWebElement giltStartShopping();
	
	@CssSelector("${pages.gilt.giltAccountIcon}")
	public AspireWebElement giltAccountIcon();
	
	@CssSelector("${pages.gilt.giltSignOutLink}")
	public AspireWebElement giltSignOutLink();
	
	@CssSelector("${pages.gilt.giltSignInLink}")
	public AspireWebElement giltSignInLink();
	
	@CssSelector("${pages.gilt.giltLoginEmailSection}")
	public AspireWebElement giltLoginEmailSection();
	
	@CssSelector("${pages.gilt.giltLoginPasswordSection}")
	public AspireWebElement giltLoginPasswordSection();
	
	@CssSelector("${pages.gilt.giltLoginSubmitButton}")
	public AspireWebElement giltLoginSubmitButton();
	
	@CssSelector("${pages.gilt.giltTopNavStore}")
	public AspireWebElements giltTopNavStore();
	
	@CssSelector("${pages.gilt.giltSales}")
	public AspireWebElements giltSales();
	
	@CssSelector("${pages.gilt.giltProducts}")
	public AspireWebElements giltProducts();
	
	@CssSelector("${pages.gilt.giltProductName}")
	public AspireWebElement giltProductName();
	
	@CssSelector("${pages.gilt.giltProductPrice}")
	public AspireWebElement giltProductPrice();
	
	@CssSelector("${pages.gilt.giltQuickView}")
	public AspireWebElement giltQuickView();
	
	@CssSelector("${pages.gilt.giltQuickViewDialog}")
	public AspireWebElement giltQuickViewDialog();
	
	@CssSelector("${pages.gilt.giltQuickViewProductName}")
	public AspireWebElement giltQuickViewProductName();
	
	@CssSelector("${pages.gilt.giltQuickViewProductPrice}")
	public AspireWebElement giltQuickViewProductPrice();
	
	@CssSelector("${pages.gilt.giltViewMoreDetails}")
	public AspireWebElement giltViewMoreDetails();
	
	@CssSelector("${pages.gilt.giltPdpPage}")
	public AspireWebElement giltPdpPage();
	
	@CssSelector("${pages.gilt.giltPdpProductPrice}")
	public AspireWebElement giltPdpProductPrice();
	
	@CssSelector("${pages.gilt.giltPdpProductName}")
	public AspireWebElement giltPdpProductName();
	
	@CssSelector("${pages.gilt.giltSku}")
	public AspireWebElements giltSku();
	
	@CssSelector("${pages.gilt.giltAddToCartButton}")
	public AspireWebElement giltAddToCartButton();
	
	@CssSelector("${pages.gilt.giltCartDialog}")
	public AspireWebElement giltCartDialog();
	
	@CssSelector("${pages.gilt.giltCartProductPrice}")
	public AspireWebElement giltCartProductPrice();
	
	@CssSelector("${pages.gilt.giltCartProductName}")
	public AspireWebElement giltCartProductName();
	
	@CssSelector("${pages.gilt.giltCartQTY}")
	public AspireWebElement giltCartQTY();
	
	@CssSelector("${pages.gilt.giltCartCloseButton}")
	public AspireWebElement giltCartCloseButton();
	
	@CssSelector("${pages.gilt.giltCartProductOnePrice}")
	public AspireWebElement giltCartProductOnePrice();
	
	@CssSelector("${pages.gilt.giltCartProductTwoPrice}")
	public AspireWebElement giltCartProductTwoPrice();
	
	@CssSelector("${pages.gilt.giltCartSubTotalPrice}")
	public AspireWebElement giltCartSubTotalPrice();
	
	@CssSelector("${pages.gilt.giltCheckoutNowButton}")
	public AspireWebElement giltCheckoutNowButton();
	
	@CssSelector("${pages.gilt.giltCheckoutHeader}")
	public AspireWebElement giltCheckoutHeader();
	
	@CssSelector("${pages.gilt.giltLogo}")
	public AspireWebElement giltLogo();
	
	@CssSelector("${pages.gilt.giltPromoSection}")
	public AspireWebElement giltPromoSection();
	
	@CssSelector("${pages.gilt.giltPromoCodeField}")
	public AspireWebElement giltPromoCodeField();
	
	@CssSelector("${pages.gilt.shippingCharge}")
	public AspireWebElement shippingCharge();
	
	@CssSelector("${pages.gilt.dutiesCharg}")
	public AspireWebElement dutiesCharg();
	
	@CssSelector("${pages.gilt.giltRemoveDiscount}")
	public AspireWebElement giltRemoveDiscount();
	
	@CssSelector("${pages.gilt.giltSubTotal}")
	public AspireWebElement giltSubTotal();
	
	@CssSelector("${pages.gilt.giltVat}")
	public AspireWebElement giltVat();
	
	@CssSelector("${pages.gilt.giltShipping}")
	public AspireWebElement giltShipping();
	
	@CssSelector("${pages.gilt.giltTotal}")
	public AspireWebElement giltTotal();
	
	@CssSelector("${pages.gilt.giltChangeShippingAdress}")
	public AspireWebElement giltChangeShippingAdress();
	
	@CssSelector("${pages.gilt.giltAddNewAddress}")
	public AspireWebElement giltAddNewAddress();
	
	@CssSelector("${pages.gilt.giltSaveAndContinueButton}")
	public AspireWebElement giltSaveAndContinueButton();
	
	@CssSelector("${pages.gilt.giltFirstNameError}")
	public AspireWebElement giltFirstNameError();
	
	@CssSelector("${pages.gilt.giltLastNameError}")
	public AspireWebElement giltLastNameError();
	
	@CssSelector("${pages.gilt.giltStreetAddressError}")
	public AspireWebElement giltStreetAddressError();
	
	@CssSelector("${pages.gilt.giltCityError}")
	public AspireWebElement giltCityError();
	
	@CssSelector("${pages.gilt.giltZipCodeError}")
	public AspireWebElement giltZipCodeError();
	
	@CssSelector("${pages.gilt.giltPhoneError}")
	public AspireWebElement giltPhoneError();
	
	@CssSelector("${pages.gilt.giltFirstNameSection}")
	public AspireWebElement giltFirstNameSection();
	
	@CssSelector("${pages.gilt.giltLastNameSection}")
	public AspireWebElement giltLastNameSection();
	
	@CssSelector("${pages.gilt.giltStreetAddressSection}")
	public AspireWebElement giltStreetAddressSection();
	
	@CssSelector("${pages.gilt.giltCitySection}")
	public AspireWebElement giltCitySection();
	
	@CssSelector("${pages.gilt.giltZipCodeSection}")
	public AspireWebElement giltZipCodeSection();
	
	@CssSelector("${pages.gilt.giltPhoneSection}")
	public AspireWebElement giltPhoneSection();
	
	@CssSelector("${pages.gilt.giltChangePaymentMethod}")
	public AspireWebElement giltChangePaymentMethod();
	
	@CssSelector("${pages.gilt.giltAddNewPaymentMethod}")
	public AspireWebElement giltAddNewPaymentMethod();
	
	@CssSelector("${pages.gilt.giltAddPymentMethodButton}")
	public AspireWebElement giltAddPymentMethodButton();
	
	@CssSelector("${pages.gilt.giltCardNumberError}")
	public AspireWebElement giltCardNumberError();
	
	@CssSelector("${pages.gilt.giltExpirationDateError}")
	public AspireWebElement giltExpirationDateError();
	
	@CssSelector("${pages.gilt.giltSecurityCodeError}")
	public AspireWebElement giltSecurityCodeError();
	
	@CssSelector("${pages.gilt.giltCardSection}")
	public AspireWebElement giltCardSection();
	
	@CssSelector("${pages.gilt.giltMonth}")
	public AspireWebElement giltMonth();
	
	@CssSelector("${pages.gilt.giltYear}")
	public AspireWebElement giltYear();
	
	@CssSelector("${pages.gilt.giltSecuritySection}")
	public AspireWebElement giltSecuritySection();
	
	@CssSelector("${pages.gilt.giltSecurityCodeSection}")
	public AspireWebElement giltSecurityCodeSection();
	
	@CssSelector("${pages.gilt.giltSubmitYourOrderButton}")
	public AspireWebElement giltSubmitYourOrderButton();
	
	@CssSelector("${pages.gilt.giltSubmitError}")
	public AspireWebElement giltSubmitError();
	
	@CssSelector("${pages.gilt.giltContinueShoppingLink}")
	public AspireWebElement giltContinueShoppingLink();
	
	@CssSelector("${pages.gilt.giltCartIcon}")
	public AspireWebElement giltCartIcon();
	
	@CssSelector("${pages.gilt.giltCartRemoveProduct}")
	public AspireWebElements giltCartRemoveProduct();
	
	@CssSelector("${pages.gilt.giltCartContinueShoppingButton}")
	public AspireWebElement giltCartContinueShoppingButton();
	
	@CssSelector("${pages.gilt.giltAvailableSize}")
	public AspireWebElements giltAvailableSize();
	
	@CssSelector("${pages.gilt.giltPdpImage}")
	public AspireWebElement giltPdpImage();
	
	@CssSelector("${pages.gilt.giltQuickViewProductImage}")
	public AspireWebElement giltQuickViewProductImage();
	
	@CssSelector("${pages.gilt.giltCartImage}")
	public AspireWebElement giltCartImage();
	
	@CssSelector("${pages.gilt.giltSurveyDialog}")
	public AspireWebElement giltSurveyDialog();
	
	@CssSelector("${pages.gilt.giltCloseSurveyDialog}")
	public AspireWebElement giltCloseSurveyDialog();
	
	@CssSelector("${pages.gilt.giltPlpImage}")
	public AspireWebElement giltPlpImage();
	
	@CssSelector("${pages.gilt.giltCartItemOneRemove}")
	public AspireWebElement giltCartItemOneRemove();
	
	@CssSelector("${pages.gilt.giltCartItemTwoRemove}")
	public AspireWebElement giltCartItemTwoRemove();
}