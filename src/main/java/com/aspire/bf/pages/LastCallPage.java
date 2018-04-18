package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "lastcall", url = "${pages.lastcall.lastcallUrl}")


public interface LastCallPage {

	@CssSelector("${pages.lastcall.lastcallWelcomeMat}")
	public AspireWebElement lastcallWelcomeMat();
	
	@CssSelector("${pages.lastcall.lastcallWelcomeMatContinue}")
	public AspireWebElement lastcallWelcomeMatContinue();
	
	@CssSelector("${pages.lastcall.lastcallTopNav}")
	public AspireWebElements lastcallTopNav();
	
	@CssSelector("${pages.lastcall.lastcallSales}")
	public AspireWebElements lastcallSales();
	
	@CssSelector("${pages.lastcall.lastcallPlpPage}")
	public AspireWebElements lastcallPlpPage();
	
	@CssSelector("${pages.lastcall.lastcallProducts}")
	public AspireWebElements lastcallProducts();
	
	@CssSelector("${pages.lastcall.lastcallProductName}")
	public AspireWebElement lastcallProductName();
	
	@CssSelector("${pages.lastcall.lastcallProductPrice}")
	public AspireWebElement lastcallProductPrice();
	
	@CssSelector("${pages.lastcall.lastcallProductImage}")
	public AspireWebElement lastcallProductImage();
	
	@CssSelector("${pages.lastcall.lastcallProductQuickView}")
	public AspireWebElement lastcallProductQuickView();
	
	@CssSelector("${pages.lastcall.lastcallQuickViewDialog}")
	public AspireWebElement lastcallQuickViewDialog();
	
	@CssSelector("${pages.lastcall.lastcallQuickViewProductName}")
	public AspireWebElement lastcallQuickViewProductName();
	
	@CssSelector("${pages.lastcall.lastcallQuickViewProductPrice}")
	public AspireWebElement lastcallQuickViewProductPrice();
	
	@CssSelector("${pages.lastcall.lastcallQuickViewProductImage}")
	public AspireWebElement lastcallQuickViewProductImage();
	
	@CssSelector("${pages.lastcall.lastcallViewFullDetails}")
	public AspireWebElement lastcallViewFullDetails();
	
	@CssSelector("${pages.lastcall.lastcallPdp}")
	public AspireWebElement lastcallPdp();
	
	@CssSelector("${pages.lastcall.lastcallValidPdp}")
	public AspireWebElement lastcallValidPdp();
	
	@CssSelector("${pages.lastcall.lastcallPdpName}")
	public AspireWebElement lastcallPdpName();
	
	@CssSelector("${pages.lastcall.lastcallPdpPrice}")
	public AspireWebElement lastcallPdpPrice();
	
	@CssSelector("${pages.lastcall.lastcallPdpPrice}")
	public AspireWebElement lastcallPdpImage();
	
	@CssSelector("${pages.lastcall.lastcallSize}")
	public AspireWebElement lastcallSize();
	
	@CssSelector("${pages.lastcall.lastcallColor}")
	public AspireWebElement lastcallColor();
	
	@CssSelector("${pages.lastcall.lastcallAddToBag}")
	public AspireWebElement lastcallAddToBag();
	
	@CssSelector("${pages.lastcall.lastcallBagDialog}")
	public AspireWebElement lastcallBagDialog();
	
	@CssSelector("${pages.lastcall.lastcallBagName}")
	public AspireWebElement lastcallBagName();
	
	@CssSelector("${pages.lastcall.lastcallBagPrice}")
	public AspireWebElement lastcallBagPrice();
	
	@CssSelector("${pages.lastcall.lastcallBagIcon}")
	public AspireWebElement lastcallBagIcon();
	
	@CssSelector("${pages.lastcall.lastcallBagCheckout}")
	public AspireWebElement lastcallBagCheckout();
	
	@CssSelector("${pages.lastcall.lastcallBagPage}")
	public AspireWebElement lastcallBagPage();
	
	@CssSelector("${pages.lastcall.lastcallBagEditItem}")
	public AspireWebElement lastcallBagEditItem();
	
	@CssSelector("${pages.lastcall.lastcallBagEditContainer}")
	public AspireWebElement lastcallBagEditContainer();
	
	@CssSelector("${pages.lastcall.lastcallBagQuantity}")
	public AspireWebElement lastcallBagQuantity();
	
	@CssSelector("${pages.lastcall.lastcallBagUpdate}")
	public AspireWebElement lastcallBagUpdate();
	
	@CssSelector("${pages.lastcall.lastcallBagTotalPrice}")
	public AspireWebElement lastcallBagTotalPrice();
	
	@CssSelector("${pages.lastcall.lastcallBagProductPrice}")
	public AspireWebElement lastcallBagProductPrice();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutButton}")
	public AspireWebElement lastcallCheckoutButton();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutPage}")
	public AspireWebElement lastcallCheckoutPage();
	
	@CssSelector("${pages.lastcall.lastcallItemsTotal}")
	public AspireWebElement lastcallItemsTotal();
	
	@CssSelector("${pages.lastcall.lastcallShipping}")
	public AspireWebElement lastcallShipping();
	
	@CssSelector("${pages.lastcall.lastcallDutiesAndTaxes}")
	public AspireWebElement lastcallDutiesAndTaxes();
	
	@CssSelector("${pages.lastcall.lastcallOrderTotal}")
	public AspireWebElement lastcallOrderTotal();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutContinue}")
	public AspireWebElement lastcallCheckoutContinue();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutEmailError}")
	public AspireWebElement lastcallCheckoutEmailError();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutFirstNameError}")
	public AspireWebElement lastcallCheckoutFirstNameError();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutLastNameError}")
	public AspireWebElement lastcallCheckoutLastNameError();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutAddressError}")
	public AspireWebElement lastcallCheckoutAddressError();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutCityError}")
	public AspireWebElement lastcallCheckoutCityError();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutPhoneError}")
	public AspireWebElement lastcallCheckoutPhoneError();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutEmail}")
	public AspireWebElement lastcallCheckoutEmail();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutFirstName}")
	public AspireWebElement lastcallCheckoutFirstName();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutLastName}")
	public AspireWebElement lastcallCheckoutLastName();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutAddress}")
	public AspireWebElement lastcallCheckoutAddress();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutCity}")
	public AspireWebElement lastcallCheckoutCity();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutPhone}")
	public AspireWebElement lastcallCheckoutPhone();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutPlaceOrder}")
	public AspireWebElement lastcallCheckoutPlaceOrder();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutCardNumberError}")
	public AspireWebElement lastcallCheckoutCardNumberError();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutExpirationDateError}")
	public AspireWebElement lastcallCheckoutExpirationDateError();
	
	@CssSelector("${pages.lastcall.lastcallCheckoutSecurityCodeError}")
	public AspireWebElement lastcallCheckoutSecurityCodeError();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutCardNumber}")
	public AspireWebElement lastcallCheckoutCardNumber();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutExpirationDate}")
	public AspireWebElement lastcallCheckoutExpirationDate();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutSecurityCode}")
	public AspireWebElement lastcallCheckoutSecurityCode();
	
	@IDSelector("${pages.lastcall.lastcallCheckoutSubmitError}")
	public AspireWebElement lastcallCheckoutSubmitError();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
