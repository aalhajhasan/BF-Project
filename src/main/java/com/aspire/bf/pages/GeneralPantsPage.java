package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "generalPants", url = "${pages.generalPants.generalPantsUrl}")

public interface GeneralPantsPage {

	@CssSelector("${pages.generalPants.generalPantsWelcomeMat}")
	public AspireWebElement generalPantsWelcomeMat();
	
	@CssSelector("${pages.generalPants.generalPantsWelcomeMatContinue}")
	public AspireWebElement generalPantsWelcomeMatContinue();
	
	@CssSelector("${pages.generalPants.generalPantsTopNav}")
	public AspireWebElements generalPantsTopNav();
	
	@CssSelector("${pages.generalPants.generalPantsSales}")
	public AspireWebElements generalPantsSales();
	
	@CssSelector("${pages.generalPants.generalPantsProducts}")
	public AspireWebElements generalPantsProducts();
	
	@CssSelector("${pages.generalPants.generalPantsProductName}")
	public AspireWebElement generalPantsProductName();
	
	@CssSelector("${pages.generalPants.generalPantsProductPrice}")
	public AspireWebElement generalPantsProductPrice();
	
	@CssSelector("${pages.generalPants.generalPantsPdp}")
	public AspireWebElement generalPantsPdp();
	
	@CssSelector("${pages.generalPants.generalPantsPdpName}")
	public AspireWebElement generalPantsPdpName();
	
	@CssSelector("${pages.generalPants.generalPantsPdpPrice}")
	public AspireWebElement generalPantsPdpPrice();
	
	@CssSelector("${pages.generalPants.generalPantsSizes}")
	public AspireWebElements generalPantsSizes();
	
	@CssSelector("${pages.generalPants.generalPantsCartCheckout")
	public AspireWebElement generalPantsCartCheckout();
	
	@CssSelector("${pages.generalPants.generalPantsAddToBag")
	public AspireWebElement generalPantsAddToBag();
	
	@CssSelector("${pages.generalPants.generalPantsCartPage")
	public AspireWebElement generalPantsCartPage();
	
	@CssSelector("${pages.generalPants.generalPantsCartName")
	public AspireWebElement generalPantsCartName();
	
	@CssSelector("${pages.generalPants.generalPantsCartPrice")
	public AspireWebElement generalPantsCartPrice();
	
	@CssSelector("${pages.generalPants.generalPantsQuantity")
	public AspireWebElement generalPantsQuantity();
	
	@CssSelector("${pages.generalPants.generalPantsCartPriceOne")
	public AspireWebElement generalPantsCartPriceOne();
	
	@CssSelector("${pages.generalPants.generalPantsCartsPage")
	public AspireWebElements generalPantsCartsPage();
	
	@CssSelector("${pages.generalPants.generalPantsCartPriceTwo")
	public AspireWebElements generalPantsCartPriceTwo();
	
	@CssSelector("${pages.generalPants.generalPantsCartTotalPrice")
	public AspireWebElements generalPantsCartTotalPrice();
	
	@CssSelector("${pages.generalPants.generalPantsValidPdp")
	public AspireWebElement generalPantsValidPdp();
	
	@CssSelector("${pages.generalPants.generalPantsCheckout")
	public AspireWebElement generalPantsCheckout();
	
	@IDSelector("${pages.generalPants.generalPantsCheckoutError")
	public AspireWebElements generalPantsCheckoutError();
	
	@IDSelector("${pages.generalPants.generalPantsCheckoutReturn")
	public AspireWebElement generalPantsCheckoutReturn();
	
	@CssSelector("${pages.generalPants.generalPantsCartRemoveOne")
	public AspireWebElement generalPantsCartRemoveOne();
	
	@CssSelector("${pages.generalPants.generalPantsCartRemove")
	public AspireWebElement generalPantsCartRemove();
	
	@CssSelector("${pages.generalPants.generalPantsCartItems")
	public AspireWebElement generalPantsCartItems();
	
	@IDSelector("${pages.generalPants.generalPantsDeliveryContinue}")
	public AspireWebElement generalPantsDeliveryContinue();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutEmailError}")
	public AspireWebElement generalPantsCheckoutEmailError();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutFirstNameError}")
	public AspireWebElement generalPantsCheckoutFirstNameError();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutLastNameError}")
	public AspireWebElement generalPantsCheckoutLastNameError();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutAddressError}")
	public AspireWebElement generalPantsCheckoutAddressError();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutCityError}")
	public AspireWebElement generalPantsCheckoutCityError();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutPhoneError}")
	public AspireWebElement generalPantsCheckoutPhoneError();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutPostalCodeError}")
	public AspireWebElement generalPantsCheckoutPostalCodeError();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutEmail}")
	public AspireWebElement generalPantsCheckoutEmail();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutFirstName}")
	public AspireWebElement generalPantsCheckoutFirstName();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutLastName}")
	public AspireWebElement generalPantsCheckoutLastName();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutAddress}")
	public AspireWebElement generalPantsCheckoutAddress();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutCity}")
	public AspireWebElement generalPantsCheckoutCity();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutPhone}")
	public AspireWebElement generalPantsCheckoutPhone();
	
	@CssSelector("${pages.generalPants.generalPantsCheckoutPostalCode}")
	public AspireWebElement generalPantsCheckoutPostalCode();
	
	@CssSelector("${pages.generalPants.generalPantsItemsTotal}")
	public AspireWebElement generalPantsItemsTotal();
	
	@CssSelector("${pages.generalPants.generalPantsShipping}")
	public AspireWebElement generalPantsShipping();
	
	@CssSelector("${pages.generalPants.generalPantsDutiesAndTaxes}")
	public AspireWebElement generalPantsDutiesAndTaxes();
	
	@CssSelector("${pages.generalPants.generalPantsOrderTotal}")
	public AspireWebElement generalPantsOrderTotal();
	
	@IDSelector("${pages.generalPants.generalPantsPlaceOrder}")
	public AspireWebElement generalPantsPlaceOrder();
	
	@IDSelector("${pages.generalPants.generalPantsCheckoutCardNumber}")
	public AspireWebElement generalPantsCheckoutCardNumber();
	
	@IDSelector("${pages.generalPants.generalPantsCheckoutExpirationDate}")
	public AspireWebElement generalPantsCheckoutExpirationDate();
	
	@IDSelector("${pages.generalPants.generalPantsCheckoutSecurityCode}")
	public AspireWebElement generalPantsCheckoutSecurityCode();
	
	@IDSelector("${pages.generalPants.generalPantsCheckoutSubmitError}")
	public AspireWebElement generalPantsCheckoutSubmitError();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
