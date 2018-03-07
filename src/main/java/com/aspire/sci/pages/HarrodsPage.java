package com.aspire.sci.pages;


import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "harrods", url = "${pages.harrods.harrodsurl}")
public interface HarrodsPage {

	@CssSelector("${pages.harrods.topNavStore}")
	public AspireWebElements topNavStore();
	
	@CssSelector("${pages.harrods.sales}")
	public AspireWebElements sales();
	
	@CssSelector("${pages.harrods.products}")
	public AspireWebElements products();
	
	@CssSelector("${pages.harrods.productName}")
	public AspireWebElement productName();
	
	@CssSelector("${pages.harrods.productPrice}")
	public AspireWebElement productPrice();
	
	@CssSelector("${pages.harrods.quickView}")
	public AspireWebElement quickView();
	
	@CssSelector("${pages.harrods.quickViewDialog}")
	public AspireWebElement quickViewDialog();
	
	@CssSelector("${pages.harrods.quickViewProductName}")
	public AspireWebElement quickViewProductName();
	
	@CssSelector("${pages.harrods.quickViewProductPrice}")
	public AspireWebElement quickViewProductPrice();
	
	@CssSelector("${pages.harrods.fullDetails}")
	public AspireWebElement fullDetails();
	
	@CssSelector("${pages.harrods.productPage}")
	public AspireWebElement productPage();
	
	@CssSelector("${pages.harrods.pdpProductPrice}")
	public AspireWebElement pdpProductPrice();
	
	@CssSelector("${pages.harrods.pdpProductName}")
	public AspireWebElement pdpProductName();
	
	@CssSelector("${pages.harrods.addToBagButton}")
	public AspireWebElement addToBagButton();
	
	@CssSelector("${pages.harrods.bagPage}")
	public AspireWebElement bagPage();
	
	@CssSelector("${pages.harrods.bagProductPrice}")
	public AspireWebElement bagProductPrice();
	
	@CssSelector("${pages.harrods.viewYourBag}")
	public AspireWebElement viewYourBag();
	
	@CssSelector("${pages.harrods.bagProductName}")
	public AspireWebElement bagProductName();
	
	@CssSelector("${pages.harrods.bagQTY}")
	public AspireWebElement bagQTY();
	
	@CssSelector("${pages.harrods.quickAddToBagButton}")
	public AspireWebElement quickAddToBagButton();
	
	@CssSelector("${pages.harrods.bagIcon}")
	public AspireWebElement bagIcon();
	
	@CssSelector("${pages.harrods.bagViewYourBag}")
	public AspireWebElement bagViewYourBag();
	
	@CssSelector("${pages.harrods.bagProductOnePrice}")
	public AspireWebElement bagProductOnePrice();
	
	@CssSelector("${pages.harrods.bagProductTwoPrice}")
	public AspireWebElement bagProductTwoPrice();
	
	@CssSelector("${pages.harrods.bagSubTotalPrice}")
	public AspireWebElement bagSubTotalPrice();
	
	@CssSelector("${pages.harrods.secureCheckoutNow}")
	public AspireWebElement secureCheckoutNow();
	
	@CssSelector("${pages.harrods.startCheckoutPage}")
	public AspireWebElement startCheckoutPage();
	
	@CssSelector("${pages.harrods.newCustomerButton}")
	public AspireWebElement newCustomerButton();
	
	@CssSelector("${pages.harrods.detailsCheckoutPage}")
	public AspireWebElement detailsCheckoutPage();
	
	@CssSelector("${pages.harrods.continueToDeliveryButton}")
	public AspireWebElement continueToDeliveryButton();
	
	@CssSelector("${pages.harrods.detailsTitleError}")
	public AspireWebElement detailsTitleError();
	
	@CssSelector("${pages.harrods.detailsFirstNameError}")
	public AspireWebElement detailsFirstNameError();
	
	@CssSelector("${pages.harrods.detailsLastNameError}")
	public AspireWebElement detailsLastNameError();
	
	@CssSelector("${pages.harrods.detailsContactNumberError}")
	public AspireWebElement detailsContactNumberError();
	
	@CssSelector("${pages.harrods.detailsEmailAddressError}")
	public AspireWebElement detailsEmailAddressError();
	
	@CssSelector("${pages.harrods.detailsTitle}")
	public AspireWebElement detailsTitle();
	
	@CssSelector("${pages.harrods.detailsFirstNameSection}")
	public AspireWebElement detailsFirstNameSection();
	
	@CssSelector("${pages.harrods.detailsLastNameSection}")
	public AspireWebElement detailsLastNameSection();
	
	@CssSelector("${pages.harrods.detailsContactNumberSection}")
	public AspireWebElement detailsContactNumberSection();
	
	@CssSelector("${pages.harrods.detailsEmailAddressSection}")
	public AspireWebElement detailsEmailAddressSection();
	
	@CssSelector("${pages.harrods.deliveryCheckoutPage}")
	public AspireWebElement deliveryCheckoutPage();
	
	@CssSelector("${pages.harrods.continueToPaymentButton}")
	public AspireWebElement continueToPaymentButton();
	
	@CssSelector("${pages.harrods.deliveryAddressError}")
	public AspireWebElement deliveryAddressError();
	
	@CssSelector("${pages.harrods.deliveryCityError}")
	public AspireWebElement deliveryCityError();
	
	@CssSelector("${pages.harrods.deliveryAddressSection}")
	public AspireWebElement deliveryAddressSection();
	
	@CssSelector("${pages.harrods.deliveryCitySection}")
	public AspireWebElement deliveryCitySection();
	
	@CssSelector("${pages.harrods.deliveryStateSection}")
	public AspireWebElement deliveryStateSection();
	
	@CssSelector("${pages.harrods.deliveryZipCodeSection}")
	public AspireWebElement deliveryZipCodeSection();
	
	@CssSelector("${pages.harrods.paymentCheckoutPage}")
	public AspireWebElement paymentCheckoutPage();
	
	@CssSelector("${pages.harrods.paySecurelyNowButton}")
	public AspireWebElement paySecurelyNowButton();
	
	@CssSelector("${pages.harrods.paymentCardTypeError}")
	public AspireWebElement paymentCardTypeError();
	
	@CssSelector("${pages.harrods.paymentCardNumberError}")
	public AspireWebElement paymentCardNumberError();
	
	@CssSelector("${pages.harrods.paymentExpireDateError}")
	public AspireWebElement paymentExpireDateError();
	
	@CssSelector("${pages.harrods.paymentSecurityCodeError}")
	public AspireWebElement paymentSecurityCodeError();
	
	@CssSelector("${pages.harrods.paymentCardType}")
	public AspireWebElement paymentCardType();
	
	@CssSelector("${pages.harrods.paymentCardNumberSection}")
	public AspireWebElement paymentCardNumberSection();
	
	@CssSelector("${pages.harrods.paymentExpireMonth}")
	public AspireWebElement paymentExpireMonth();
	
	@CssSelector("${pages.harrods.paymentExpireYear}")
	public AspireWebElement paymentExpireYear();
	
	@CssSelector("${pages.harrods.paymentSecurityCodeSection}")
	public AspireWebElement paymentSecurityCodeSection();
	
	@CssSelector("${pages.harrods.paymentNameOnCardError}")
	public AspireWebElement paymentNameOnCardError();
	
	@CssSelector("${pages.harrods.paymentNameOnCardSection}")
	public AspireWebElement paymentNameOnCardSection();
	
	@CssSelector("${pages.harrods.submitErrorMessage}")
	public AspireWebElement submitErrorMessage();
	
	@CssSelector("${pages.harrods.addedButton}")
	public AspireWebElement addedButton();
	
	@CssSelector("${pages.harrods.moreThanOneQTY}")
	public AspireWebElement moreThanOneQTY();
	
}
