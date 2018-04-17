package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "llbean", url = "${pages.llbean.llbeanUrl}")

public interface LlbeanPage {

	@CssSelector("${pages.llbean.llbeanWelcomeMat}")
	public AspireWebElement llbeanWelcomeMat();
	
	@CssSelector("${pages.llbean.llbeanWelcomeMatContinue}")
	public AspireWebElement llbeanWelcomeMatContinue();
	
	@CssSelector("${pages.llbean.llbeanTopNav}")
	public AspireWebElements llbeanTopNav();
	
	@CssSelector("${pages.llbean.llbeanSales}")
	public AspireWebElements llbeanSales();
	
	@CssSelector("${pages.llbean.llbeanPlpPage}")
	public AspireWebElements llbeanPlpPage();
	
	@CssSelector("${pages.llbean.llbeanProducts}")
	public AspireWebElements llbeanProducts();
	
	@CssSelector("${pages.llbean.llbeanProductName}")
	public AspireWebElement llbeanProductName();
	
	@CssSelector("${pages.llbean.llbeanProductPrice}")
	public AspireWebElement llbeanProductPrice();
	
	@CssSelector("${pages.llbean.llbeanProductImage}")
	public AspireWebElement llbeanProductImage();
	
	@CssSelector("${pages.llbean.llbeanProductQuickView}")
	public AspireWebElement llbeanProductQuickView();
	
	@CssSelector("${pages.llbean.llbeanQuickViewDialog}")
	public AspireWebElement llbeanQuickViewDialog();
	
	@CssSelector("${pages.llbean.llbeanQuickViewImage}")
	public AspireWebElement llbeanQuickViewImage();
	
	@CssSelector("${pages.llbean.llbeanQuickViewProductName}")
	public AspireWebElement llbeanQuickViewProductName();
	
	@CssSelector("${pages.llbean.llbeanQuickViewProductPrice}")
	public AspireWebElement llbeanQuickViewProductPrice();
	
	@CssSelector("${pages.llbean.llbeanViewFullDetails}")
	public AspireWebElement llbeanViewFullDetails();
	
	@CssSelector("${pages.llbean.llbeanPdp}")
	public AspireWebElement llbeanPdp();
	
	@CssSelector("${pages.llbean.llbeanPdpName}")
	public AspireWebElement llbeanPdpName();
	
	@CssSelector("${pages.llbean.llbeanPdpPrice}")
	public AspireWebElement llbeanPdpPrice();
	
	@CssSelector("${pages.llbean.llbeanPdpImage}")
	public AspireWebElement llbeanPdpImage();
	
	@CssSelector("${pages.llbean.llbeanSizeGroup}")
	public AspireWebElements llbeanSizeGroup();
	
	@CssSelector("${pages.llbean.llbeanSize}")
	public AspireWebElements llbeanSize();
	
	@CssSelector("${pages.llbean.llbeanColor}")
	public AspireWebElements llbeanColor();
	
	@CssSelector("${pages.llbean.llbeanAddToBag}")
	public AspireWebElement llbeanAddToBag();
	
	@CssSelector("${pages.llbean.llbeanBagDialog}")
	public AspireWebElement llbeanBagDialog();
	
	@CssSelector("${pages.llbean.llbeanBagName}")
	public AspireWebElement llbeanBagName();
	
	@CssSelector("${pages.llbean.llbeanBagPrice}")
	public AspireWebElement llbeanBagPrice();
	
	@CssSelector("${pages.llbean.llbeanBagCheckout}")
	public AspireWebElement llbeanBagCheckout();
	
	@CssSelector("${pages.llbean.llbeanBagTotalPrice}")
	public AspireWebElement llbeanBagTotalPrice();
	
	@CssSelector("${pages.llbean.llbeanBagQuantity}")
	public AspireWebElement llbeanBagQuantity();
	
	@CssSelector("${pages.llbean.llbeanBagUpdate}")
	public AspireWebElement llbeanBagUpdate();
	
	@CssSelector("${pages.llbean.llbeanBagPage}")
	public AspireWebElement llbeanBagPage();
	
	@CssSelector("${pages.llbean.llbeanContinueToCheckout}")
	public AspireWebElement llbeanContinueToCheckout();
	
	@CssSelector("${pages.llbean.llbeanCheckoutPage}")
	public AspireWebElement llbeanCheckoutPage();
	
	@CssSelector("${pages.llbean.llbeanNewCustomers}")
	public AspireWebElement llbeanNewCustomers();
	
	@CssSelector("${pages.llbean.llbeanEmail}")
	public AspireWebElement llbeanEmail();
	
	@CssSelector("${pages.llbean.llbeanContinueCheckout}")
	public AspireWebElement llbeanContinueCheckout();
	
	@CssSelector("${pages.llbean.llbeanShippingContinue}")
	public AspireWebElement llbeanShippingContinue();
	
	@CssSelector("${pages.llbean.llbeanCheckoutFirstNameError}")
	public AspireWebElement llbeanCheckoutFirstNameError();
	
	@CssSelector("${pages.llbean.llbeanCheckoutLastNameError}")
	public AspireWebElement llbeanCheckoutLastNameError();
	
	@CssSelector("${pages.llbean.llbeanCheckoutAddressError}")
	public AspireWebElement llbeanCheckoutAddressError();
	
	@CssSelector("${pages.llbean.llbeanCheckoutcityError}")
	public AspireWebElement llbeanCheckoutcityError();
	
	@CssSelector("${pages.llbean.llbeanCheckoutPhoneError}")
	public AspireWebElement llbeanCheckoutPhoneError();
	
	@CssSelector("${pages.llbean.llbeanCheckoutFirstName}")
	public AspireWebElement llbeanCheckoutFirstName();
	
	@CssSelector("${pages.llbean.llbeanCheckoutLastName}")
	public AspireWebElement llbeanCheckoutLastName();
	
	@CssSelector("${pages.llbean.llbeanCheckoutAddress}")
	public AspireWebElement llbeanCheckoutAddress();
	
	@CssSelector("${pages.llbean.llbeanCheckoutcity}")
	public AspireWebElement llbeanCheckoutcity();
	
	@CssSelector("${pages.llbean.llbeanCheckoutPhone}")
	public AspireWebElement llbeanCheckoutPhone();
	
	@CssSelector("${pages.llbean.llbeanBillingContinue}")
	public AspireWebElement llbeanBillingContinue();
	
	@CssSelector("${pages.llbean.llbeanThisIsMyBillingAddress}")
	public AspireWebElement llbeanThisIsMyBillingAddress();
	
	@CssSelector("${pages.llbean.llbeanCheckoutNameError}")
	public AspireWebElement llbeanCheckoutNameError();
	
	@CssSelector("${pages.llbean.llbeanCheckoutCreditCardNumberError}")
	public AspireWebElement llbeanCheckoutCreditCardNumberError();
	
	@CssSelector("${pages.llbean.llbeanCheckoutSecurityCodeError}")
	public AspireWebElement llbeanCheckoutSecurityCodeError();
	
	@CssSelector("${pages.llbean.llbeanCheckoutName}")
	public AspireWebElement llbeanCheckoutName();
	
	@CssSelector("${pages.llbean.llbeanCheckoutCreditCardNumber}")
	public AspireWebElement llbeanCheckoutCreditCardNumber();
	
	@CssSelector("${pages.llbean.llbeanCheckoutSecurityCode}")
	public AspireWebElement llbeanCheckoutSecurityCode();
	
	@CssSelector("${pages.llbean.llbeanCheckoutExpirationMonth}")
	public AspireWebElement llbeanCheckoutExpirationMonth();
	
	@CssSelector("${pages.llbean.llbeanCheckoutExpirationMonthS}")
	public AspireWebElements llbeanCheckoutExpirationMonthS();
	
	@CssSelector("${pages.llbean.llbeanCheckoutExpirationYear}")
	public AspireWebElement llbeanCheckoutExpirationYear();
	
	@CssSelector("${pages.llbean.llbeanCheckoutExpirationYearS}")
	public AspireWebElements llbeanCheckoutExpirationYearS();
	
	@CssSelector("${pages.llbean.llbeanPlaceOrder}")
	public AspireWebElement llbeanPlaceOrder();
	
	@CssSelector("${pages.llbean.llbeanSubmitError}")
	public AspireWebElement llbeanSubmitError();
	
	@CssSelector("${pages.llbean.llbeanShoppingBag}")
	public AspireWebElement llbeanShoppingBag();
	
	@CssSelector("${pages.llbean.llbeanShipToDialog}")
	public AspireWebElement llbeanShipToDialog();
	
	@CssSelector("${pages.llbean.llbeanShipToDialogClose}")
	public AspireWebElement llbeanShipToDialogClose();
	
	
	
	
}
