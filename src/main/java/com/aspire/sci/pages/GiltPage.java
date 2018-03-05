package com.aspire.sci.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "gilt", url = "${pages.gilt.url}")
public interface GiltPage {

	@CssSelector("${pages.gilt.registerLink}")
	public AspireWebElement registerLink();

	@CssSelector("${pages.gilt.registerEmailSection}")
	public AspireWebElement registerEmailSection();
	
	@CssSelector("${pages.gilt.shopNowButton}")
	public AspireWebElement shopNowButton();
	
	@CssSelector("${pages.gilt.registerPasswordSection}")
	public AspireWebElement registerPasswordSection();
	
	@CssSelector("${pages.gilt.genderMale}")
	public AspireWebElement genderMale();
	
	@CssSelector("${pages.gilt.submitButton}")
	public AspireWebElement submitButton();
	
	@CssSelector("${pages.gilt.welcomeDialog}")
	public AspireWebElement welcomeDialog();
	
	@CssSelector("${pages.gilt.startShopping}")
	public AspireWebElement startShopping();
	
	@CssSelector("${pages.gilt.accountIcon}")
	public AspireWebElement accountIcon();
	
	@CssSelector("${pages.gilt.signOutLink}")
	public AspireWebElement signOutLink();
	
	@CssSelector("${pages.gilt.signInLink}")
	public AspireWebElement signInLink();
	
	@CssSelector("${pages.gilt.loginEmailSection}")
	public AspireWebElement loginEmailSection();
	
	@CssSelector("${pages.gilt.loginPasswordSection}")
	public AspireWebElement loginPasswordSection();
	
	@CssSelector("${pages.gilt.loginSubmitButton}")
	public AspireWebElement loginSubmitButton();
	
	@CssSelector("${pages.gilt.topNavStore}")
	public AspireWebElements topNavStore();
	
	@CssSelector("${pages.gilt.sales}")
	public AspireWebElements sales();
	
	@CssSelector("${pages.gilt.products}")
	public AspireWebElements products();
	
	@CssSelector("${pages.gilt.productNametext}")
	public AspireWebElement productNametext();
	
	@CssSelector("${pages.gilt.productPrice}")
	public AspireWebElement productPrice();
	
	@CssSelector("${pages.gilt.quickView}")
	public AspireWebElement quickView();
	
	@CssSelector("${pages.gilt.quickViewDialog}")
	public AspireWebElement quickViewDialog();
	
	@CssSelector("${pages.gilt.quickViewProductName}")
	public AspireWebElement quickViewProductName();
	
	@CssSelector("${pages.gilt.quickViewProductPric}")
	public AspireWebElement quickViewProductPric();
	
	@CssSelector("${pages.gilt.viewMoreDetails}")
	public AspireWebElement viewMoreDetails();
	
	@CssSelector("${pages.gilt.pdpPage}")
	public AspireWebElement pdpPage();
	
	@CssSelector("${pages.gilt.pdpProductPrice}")
	public AspireWebElement pdpProductPrice();
	
	@CssSelector("${pages.gilt.pdpProductName}")
	public AspireWebElement pdpProductName();
	
	@CssSelector("${pages.gilt.availableSKU}")
	public AspireWebElements availableSKU();
	
	@CssSelector("${pages.gilt.addToCartButton}")
	public AspireWebElement addToCartButton();
	
	@CssSelector("${pages.gilt.cartDialog}")
	public AspireWebElement cartDialog();
	
	@CssSelector("${pages.gilt.cartProductPrice}")
	public AspireWebElement cartProductPrice();
	
	@CssSelector("${pages.gilt.cartProductName}")
	public AspireWebElement cartProductName();
	
	@CssSelector("${pages.gilt.cartQTY}")
	public AspireWebElement cartQTY();
	
	@CssSelector("${pages.gilt.cartCloseButton}")
	public AspireWebElement cartCloseButton();
	
	@CssSelector("${pages.gilt.cartProductOnePrice}")
	public AspireWebElement cartProductOnePrice();
	
	@CssSelector("${pages.gilt.cartProductTwoPrice}")
	public AspireWebElement cartProductTwoPrice();
	
	@CssSelector("${pages.gilt.cartSubTotalPrice}")
	public AspireWebElement cartSubTotalPrice();
	
	@CssSelector("${pages.gilt.checkoutNowButton}")
	public AspireWebElement checkoutNowButton();
	
	@CssSelector("${pages.gilt.checkoutHeader}")
	public AspireWebElement checkoutHeader();
	
	@CssSelector("${pages.gilt.giltLogo}")
	public AspireWebElement giltLogo();
	
	@CssSelector("${pages.gilt.promoSection}")
	public AspireWebElement promoSection();
	
	@CssSelector("${pages.gilt.promoCodeField}")
	public AspireWebElement promoCodeField();
	
	@CssSelector("${pages.gilt.shippingCharge}")
	public AspireWebElement shippingCharge();
	
	@CssSelector("${pages.gilt.dutiesCharg}")
	public AspireWebElement dutiesCharg();
	
	@CssSelector("${pages.gilt.removeDiscount}")
	public AspireWebElement removeDiscount();
	
	@CssSelector("${pages.gilt.subTotal}")
	public AspireWebElement subTotal();
	
	@CssSelector("${pages.gilt.vat}")
	public AspireWebElement vat();
	
	@CssSelector("${pages.gilt.shipping}")
	public AspireWebElement shipping();
	
	@CssSelector("${pages.gilt.total}")
	public AspireWebElement total();
	
	@CssSelector("${pages.gilt.changeShippingAdress}")
	public AspireWebElement changeShippingAdress();
	
	@CssSelector("${pages.gilt.addNewAddress}")
	public AspireWebElement addNewAddress();
	
	@CssSelector("${pages.gilt.saveAndContinueButton}")
	public AspireWebElement saveAndContinueButton();
	
	@CssSelector("${pages.gilt.firstNameError}")
	public AspireWebElement firstNameError();
	
	@CssSelector("${pages.gilt.secondNameError}")
	public AspireWebElement secondNameError();
	
	@CssSelector("${pages.gilt.streetAddressError}")
	public AspireWebElement streetAddressError();
	
	@CssSelector("${pages.gilt.cityError}")
	public AspireWebElement cityError();
	
	@CssSelector("${pages.gilt.zipCodeError}")
	public AspireWebElement zipCodeError();
	
	@CssSelector("${pages.gilt.phoneError}")
	public AspireWebElement phoneError();
	
	@CssSelector("${pages.gilt.firstNameSection}")
	public AspireWebElement firstNameSection();
	
	@CssSelector("${pages.gilt.lastNameSection}")
	public AspireWebElement lastNameSection();
	
	@CssSelector("${pages.gilt.streetAddressSection}")
	public AspireWebElement streetAddressSection();
	
	@CssSelector("${pages.gilt.citySection}")
	public AspireWebElement citySection();
	
	@CssSelector("${pages.gilt.zipCodeSection}")
	public AspireWebElement zipCodeSection();
	
	@CssSelector("${pages.gilt.phoneSection}")
	public AspireWebElement phoneSection();
	
	@CssSelector("${pages.gilt.changePaymentMethod}")
	public AspireWebElement changePaymentMethod();
	
	@CssSelector("${pages.gilt.addNewPaymentMethod}")
	public AspireWebElement addNewPaymentMethod();
	
	@CssSelector("${pages.gilt.addPymentMethodButton}")
	public AspireWebElement addPymentMethodButton();
	
	@CssSelector("${pages.gilt.cardNumberError}")
	public AspireWebElement cardNumberError();
	
	@CssSelector("${pages.gilt.expirationDateError}")
	public AspireWebElement expirationDateError();
	
	@CssSelector("${pages.gilt.securityCodeError}")
	public AspireWebElement securityCodeError();
	
	@CssSelector("${pages.gilt.cardSection}")
	public AspireWebElement cardSection();
	
	@CssSelector("${pages.gilt.month}")
	public AspireWebElement month();
	
	@CssSelector("${pages.gilt.year}")
	public AspireWebElement year();
	
	@CssSelector("${pages.gilt.securitySection}")
	public AspireWebElement securitySection();
	
	@CssSelector("${pages.gilt.securityCodeSection}")
	public AspireWebElement securityCodeSection();
	
	@CssSelector("${pages.gilt.submitYourOrderButton}")
	public AspireWebElement submitYourOrderButton();
	
	@CssSelector("${pages.gilt.submitError}")
	public AspireWebElement submitError();
	
	@CssSelector("${pages.gilt.continueShoppingLink}")
	public AspireWebElement continueShoppingLink();
	
	@CssSelector("${pages.gilt.cartIcon}")
	public AspireWebElement cartIcon();
	
	@CssSelector("${pages.gilt.cartRemoveProduct}")
	public AspireWebElements cartRemoveProduct();
	
	@CssSelector("${pages.gilt.cartContinueShoppingButton}")
	public AspireWebElement cartContinueShoppingButton();
	
	
	

}