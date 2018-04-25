package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "bergdorf", url = "${pages.bergdorf.bergdorfurl}")
public interface BergdorfPage {

	
	@CssSelector("${pages.bergdorf.bergdorfWelcomeMat}")
	public AspireWebElement bergdorfWelcomeMat();
	
	@CssSelector("${pages.bergdorf.bergdorfWelcomeMatClose}")
	public AspireWebElement bergdorfWelcomeMatClose();
	
	@CssSelector("${pages.bergdorf.bergdorfTopNav}")
	public AspireWebElements bergdorfTopNav();
	
	@CssSelector("${pages.bergdorf.bergdorfSales}")
	public AspireWebElements bergdorfSales();
	
	@CssSelector("${pages.bergdorf.bergdorfProducts}")
	public AspireWebElements bergdorfProducts();
	
	@CssSelector("${pages.bergdorf.bergdorfValidPdp}")
	public AspireWebElement bergdorfValidPdp();
	
	@CssSelector("${pages.bergdorf.bergdorfSku}")
	public AspireWebElement bergdorfSku();
	
	@CssSelector("${pages.bergdorf.bergdorfAddToshoppingBag}")
	public AspireWebElement bergdorfAddToshoppingBag();
	
	@CssSelector("${pages.bergdorf.bergdorfProductName}")
	public AspireWebElement bergdorfProductName();
	
	@CssSelector("${pages.bergdorf.bergdorfProductPrice}")
	public AspireWebElement bergdorfProductPrice();
	
	@CssSelector("${pages.bergdorf.bergdorfProductPage}")
	public AspireWebElement bergdorfProductPage();
	
	@CssSelector("${pages.bergdorf.bergdorfBagDialog}")
	public AspireWebElement bergdorfBagDialog();
	
	@CssSelector("${pages.bergdorf.bergdorfBagProductName}")
	public AspireWebElement bergdorfBagProductName();
	
	@CssSelector("${pages.bergdorf.bergdorfBagProductPrice}")
	public AspireWebElement bergdorfBagProductPrice();
	
	@CssSelector("${pages.bergdorf.bergdorfBagIcon}")
	public AspireWebElement bergdorfBagIcon();
	
	@CssSelector("${pages.bergdorf.bergdorfBagCheckout}")
	public AspireWebElement bergdorfBagCheckout();
	
	@CssSelector("${pages.bergdorf.bergdorfBagPage}")
	public AspireWebElement bergdorfBagPage();
	
	@CssSelector("${pages.bergdorf.bergdorfBagEditItem}")
	public AspireWebElement bergdorfBagEditItem();
	
	@CssSelector("${pages.bergdorf.bergdorfBagEditContainer}")
	public AspireWebElement bergdorfBagEditContainer();
	
	@CssSelector("${pages.bergdorf.bergdorfBagQuantity}")
	public AspireWebElement bergdorfBagQuantity();
	
	@CssSelector("${pages.bergdorf.bergdorfBagUpdate}")
	public AspireWebElement bergdorfBagUpdate();
	
	@CssSelector("${pages.bergdorf.bergdorfBagTotalPrice}")
	public AspireWebElement bergdorfBagTotalPrice();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutButton}")
	public AspireWebElement bergdorfCheckoutButton();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutPage}")
	public AspireWebElement bergdorfCheckoutPage();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutEmail}")
	public AspireWebElement bergdorfCheckoutEmail();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutFirstName}")
	public AspireWebElement bergdorfCheckoutFirstName();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutContinue}")
	public AspireWebElement bergdorfCheckoutContinue();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutEmailError}")
	public AspireWebElement bergdorfCheckoutEmailError();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutFirstNameError}")
	public AspireWebElement bergdorfCheckoutFirstNameError();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutLastNameError}")
	public AspireWebElement bergdorfCheckoutLastNameError();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutAddressError}")
	public AspireWebElement bergdorfCheckoutAddressError();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutCityError}")
	public AspireWebElement bergdorfCheckoutCityError();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutPhoneError}")
	public AspireWebElement bergdorfCheckoutPhoneError();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutLastName}")
	public AspireWebElement bergdorfCheckoutLastName();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutAddress}")
	public AspireWebElement bergdorfCheckoutAddress();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutCity}")
	public AspireWebElement bergdorfCheckoutCity();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutPhone}")
	public AspireWebElement bergdorfCheckoutPhone();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutPayment}")
	public AspireWebElement bergdorfCheckoutPayment();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutPlaceOrder}")
	public AspireWebElement bergdorfCheckoutPlaceOrder();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutCardNumberError}")
	public AspireWebElement bergdorfCheckoutCardNumberError();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutExpirationDateError}")
	public AspireWebElement bergdorfCheckoutExpirationDateError();
	
	@CssSelector("${pages.bergdorf.bergdorfCheckoutSecurityCodeError}")
	public AspireWebElement bergdorfCheckoutSecurityCodeError();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutCardNumber}")
	public AspireWebElement bergdorfCheckoutCardNumber();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutExpirationDate}")
	public AspireWebElement bergdorfCheckoutExpirationDate();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutSecurityCode}")
	public AspireWebElement bergdorfCheckoutSecurityCode();
	
	@IDSelector("${pages.bergdorf.bergdorfCheckoutSubmitError}")
	public AspireWebElement bergdorfCheckoutSubmitError();
	
	@CssSelector("${pages.bergdorf.bergdorfItemsTotal}")
	public AspireWebElement bergdorfItemsTotal();
	
	@CssSelector("${pages.bergdorf.bergdorfShipping}")
	public AspireWebElement bergdorfShipping();
	
	@CssSelector("${pages.bergdorf.bergdorfDutiesAndTaxes}")
	public AspireWebElement bergdorfDutiesAndTaxes();
	
	@CssSelector("${pages.bergdorf.bergdorfOrderTotal}")
	public AspireWebElement bergdorfOrderTotal();
	
	@CssSelector("${pages.bergdorf.bergdorfPromoCodeSection}")
	public AspireWebElement bergdorfPromoCodeSection();
	
	@CssSelector("${pages.bergdorf.bergdorfPromoCodeSFiled}")
	public AspireWebElement bergdorfPromoCodeSFiled();
	
	@CssSelector("${pages.bergdorf.bergdorfSimilarDialog}")
	public AspireWebElement bergdorfSimilarDialog();
	
	@CssSelector("${pages.bergdorf.bergdorfSimilarDialogNoThanks}")
	public AspireWebElement bergdorfSimilarDialogNoThanks();
	
	@CssSelector("${pages.bergdorf.bergdorfColor}")
	public AspireWebElement bergdorfColor();
	
	
	
	
}
