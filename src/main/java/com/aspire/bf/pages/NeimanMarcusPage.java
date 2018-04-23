package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "neimanmarcus", url = "${pages.neimanmarcus.neimanmarcusUrl}")
public interface NeimanMarcusPage {

	
	@CssSelector("${pages.neimanmarcus.neimanmarcusWelcomeMat}")
	public AspireWebElement neimanmarcusWelcomeMat();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusWelcomeMatContinue}")
	public AspireWebElement neimanmarcusWelcomeMatContinue();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusTopNav}")
	public AspireWebElements neimanmarcusTopNav();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusSales}")
	public AspireWebElements neimanmarcusSales();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusPlpPage}")
	public AspireWebElements neimanmarcusPlpPage();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProducts}")
	public AspireWebElements neimanmarcusProducts();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProductName}")
	public AspireWebElement neimanmarcusProductName();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProductPrice}")
	public AspireWebElement neimanmarcusProductPrice();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProductImage}")
	public AspireWebElement neimanmarcusProductImage();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusProductQuickView}")
	public AspireWebElement neimanmarcusProductQuickView();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusQuickViewDialog}")
	public AspireWebElement neimanmarcusQuickViewDialog();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusQuickViewProductName}")
	public AspireWebElement neimanmarcusQuickViewProductName();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusQuickViewProductPrice}")
	public AspireWebElement neimanmarcusQuickViewProductPrice();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusQuickViewProductImage}")
	public AspireWebElement neimanmarcusQuickViewProductImage();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusViewFullDetails}")
	public AspireWebElement neimanmarcusViewFullDetails();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusPdp}")
	public AspireWebElement neimanmarcusPdp();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusValidPdp}")
	public AspireWebElement neimanmarcusValidPdp();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusPdpName}")
	public AspireWebElement neimanmarcusPdpName();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusPdpPrice}")
	public AspireWebElement neimanmarcusPdpPrice();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusSize}")
	public AspireWebElements neimanmarcusSize();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusColor}")
	public AspireWebElements neimanmarcusColor();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusAddToBag}")
	public AspireWebElement neimanmarcusAddToBag();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagDialog}")
	public AspireWebElement neimanmarcusBagDialog();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagName}")
	public AspireWebElement neimanmarcusBagName();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagPrice}")
	public AspireWebElement neimanmarcusBagPrice();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagIcon}")
	public AspireWebElement neimanmarcusBagIcon();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagCheckout}")
	public AspireWebElement neimanmarcusBagCheckout();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagPage}")
	public AspireWebElement neimanmarcusBagPage();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagProductPrice}")
	public AspireWebElement neimanmarcusBagProductPrice();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagEditItem}")
	public AspireWebElement neimanmarcusBagEditItem();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagEditContainer}")
	public AspireWebElement neimanmarcusBagEditContainer();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagEditPlus}")
	public AspireWebElement neimanmarcusBagEditPlus();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagUpdate}")
	public AspireWebElement neimanmarcusBagUpdate();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagTotalPrice}")
	public AspireWebElement neimanmarcusBagTotalPrice();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusBagEditMinus}")
	public AspireWebElement neimanmarcusBagEditMinus();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusErrorDialog}")
	public AspireWebElement neimanmarcusErrorDialog();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusErrorDialogClose}")
	public AspireWebElement neimanmarcusErrorDialogClose();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutButton}")
	public AspireWebElement neimanmarcusCheckoutButton();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutPage}")
	public AspireWebElement neimanmarcusCheckoutPage();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusItemsTotal}")
	public AspireWebElement neimanmarcusItemsTotal();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusShipping}")
	public AspireWebElement neimanmarcusShipping();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusDuties}")
	public AspireWebElement neimanmarcusDuties();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusTax}")
	public AspireWebElement neimanmarcusTax();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusOrderTotal}")
	public AspireWebElement neimanmarcusOrderTotal();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutContinue}")
	public AspireWebElement neimanmarcusCheckoutContinue();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutEmailError}")
	public AspireWebElement neimanmarcusCheckoutEmailError();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutFirstNameError}")
	public AspireWebElement neimanmarcusCheckoutFirstNameError();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutLastNameError}")
	public AspireWebElement neimanmarcusCheckoutLastNameError();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutAddressError}")
	public AspireWebElement neimanmarcusCheckoutAddressError();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutCityError}")
	public AspireWebElement neimanmarcusCheckoutCityError();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutStateError}")
	public AspireWebElement neimanmarcusCheckoutStateError();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutPhoneError}")
	public AspireWebElement neimanmarcusCheckoutPhoneError();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutEmail}")
	public AspireWebElement neimanmarcusCheckoutEmail();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutFirstName}")
	public AspireWebElement neimanmarcusCheckoutFirstName();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutLastName}")
	public AspireWebElement neimanmarcusCheckoutLastName();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutAddress}")
	public AspireWebElement neimanmarcusCheckoutAddress();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutCity}")
	public AspireWebElement neimanmarcusCheckoutCity();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutState}")
	public AspireWebElement neimanmarcusCheckoutState();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutPhone}")
	public AspireWebElement neimanmarcusCheckoutPhone();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusPayment}")
	public AspireWebElement neimanmarcusPayment();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutPlaceOrder}")
	public AspireWebElement neimanmarcusCheckoutPlaceOrder();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusPaymentType}")
	public AspireWebElement neimanmarcusPaymentType();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutCardNumber}")
	public AspireWebElement neimanmarcusCheckoutCardNumber();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutSecurityCode}")
	public AspireWebElement neimanmarcusCheckoutSecurityCode();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusExpirationMonth}")
	public AspireWebElement neimanmarcusExpirationMonth();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusExpirationYear}")
	public AspireWebElement neimanmarcusExpirationYear();
	
	@CssSelector("${pages.neimanmarcus.neimanmarcusCheckoutSubmitError}")
	public AspireWebElement neimanmarcusCheckoutSubmitError();
	
	
	
	
	
}
