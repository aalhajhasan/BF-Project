package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "pacsun", url = "${pages.pacsun.pacsunUrl}")
public interface PacsunPage {

	
	@CssSelector("${pages.pacsun.pacsunWelcomeMat}")
	public AspireWebElement pacsunWelcomeMat();
	
	@CssSelector("${pages.pacsun.pacsunWelcomeMatContinue}")
	public AspireWebElement pacsunWelcomeMatContinue();
	
	@CssSelector("${pages.pacsun.pacsunTopNav}")
	public AspireWebElements pacsunTopNav();
	
	@CssSelector("${pages.pacsun.pacsunProducts}")
	public AspireWebElements pacsunProducts();
	
	@CssSelector("${pages.pacsun.pacsunProductName}")
	public AspireWebElement pacsunProductName();
	
	@CssSelector("${pages.pacsun.pacsunProductPrice}")
	public AspireWebElement pacsunProductPrice();
	
	@CssSelector("${pages.pacsun.pacsunProductImage}")
	public AspireWebElement pacsunProductImage();
	
	@CssSelector("${pages.pacsun.pacsunProductQuickView}")
	public AspireWebElement pacsunProductQuickView();
	
	@CssSelector("${pages.pacsun.pacsunQuickViewDialog}")
	public AspireWebElement pacsunQuickViewDialog();
	
	@CssSelector("${pages.pacsun.pacsunQuickViewProductName}")
	public AspireWebElement pacsunQuickViewProductName();
	
	@CssSelector("${pages.pacsun.pacsunQuickViewProductPrice}")
	public AspireWebElement pacsunQuickViewProductPrice();
	
	@CssSelector("${pages.pacsun.pacsunCountryFlag}")
	public AspireWebElement pacsunCountryFlag();
	
	@CssSelector("${pages.pacsun.pacsunCountryUpdate}")
	public AspireWebElement pacsunCountryUpdate();
	
	@CssSelector("${pages.pacsun.pacsunCountry}")
	public AspireWebElement pacsunCountry();
	
	@CssSelector("${pages.pacsun.pacsunQuickViewProductImage}")
	public AspireWebElement pacsunQuickViewProductImage();
	
	@CssSelector("${pages.pacsun.pacsunViewFullDetails}")
	public AspireWebElement pacsunViewFullDetails();
	
	@CssSelector("${pages.pacsun.pacsunPdp}")
	public AspireWebElement pacsunPdp();
	
	@CssSelector("${pages.pacsun.pacsunPdpName}")
	public AspireWebElement pacsunPdpName();
	
	@CssSelector("${pages.pacsun.pacsunPdpPrice}")
	public AspireWebElement pacsunPdpPrice();
	
	@CssSelector("${pages.pacsun.pacsunPdpImage}")
	public AspireWebElement pacsunPdpImage();
	
	@CssSelector("${pages.pacsun.pacsunSize}")
	public AspireWebElements pacsunSize();
	
	@CssSelector("${pages.pacsun.pacsunSizeIcon}")
	public AspireWebElement pacsunSizeIcon();
	
	@CssSelector("${pages.pacsun.pacsunAddToCart}")
	public AspireWebElement pacsunAddToCart();
	
	@CssSelector("${pages.pacsun.pacsunCartDialog}")
	public AspireWebElement pacsunCartDialog();
	
	@CssSelector("${pages.pacsun.pacsunCartName}")
	public AspireWebElement pacsunCartName();
	
	@CssSelector("${pages.pacsun.pacsunCartPrice}")
	public AspireWebElement pacsunCartPrice();
	
	@CssSelector("${pages.pacsun.pacsunCartIcon}")
	public AspireWebElement pacsunCartIcon();
	
	@CssSelector("${pages.pacsun.pacsunCartPage}")
	public AspireWebElement pacsunCartPage();
	
	@CssSelector("${pages.pacsun.pacsunEditLink}")
	public AspireWebElement pacsunEditLink();
	
	@CssSelector("${pages.pacsun.pacsunCartEditDialog}")
	public AspireWebElement pacsunCartEditDialog();
	
	@CssSelector("${pages.pacsun.pacsunIncreaseQuantity}")
	public AspireWebElement pacsunIncreaseQuantity();
	
	@CssSelector("${pages.pacsun.pacsunUpdate}")
	public AspireWebElement pacsunUpdate();
	
	@CssSelector("${pages.pacsun.pacsunCartPagePrice}")
	public AspireWebElement pacsunCartPagePrice();
	
	@CssSelector("${pages.pacsun.pacsunCartPriceOne}")
	public AspireWebElement pacsunCartPriceOne();
	
	@CssSelector("${pages.pacsun.pacsunCartPriceTwo}")
	public AspireWebElement pacsunCartPriceTwo();
	
	@CssSelector("${pages.pacsun.pacsunCartPriceTotal}")
	public AspireWebElement pacsunCartPriceTotal();
	
	@CssSelector("${pages.pacsun.pacsunCheckout}")
	public AspireWebElement pacsunCheckout();
	
	@IDSelector("${pages.pacsun.pacsunDeliveryContinue}")
	public AspireWebElement pacsunDeliveryContinue();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutEmailError}")
	public AspireWebElement pacsunCheckoutEmailError();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutFirstNameError}")
	public AspireWebElement pacsunCheckoutFirstNameError();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutLastNameError}")
	public AspireWebElement pacsunCheckoutLastNameError();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutAddressError}")
	public AspireWebElement pacsunCheckoutAddressError();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutCityError}")
	public AspireWebElement pacsunCheckoutCityError();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutPhoneError}")
	public AspireWebElement pacsunCheckoutPhoneError();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutPostalCodeError}")
	public AspireWebElement pacsunCheckoutPostalCodeError();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutEmail}")
	public AspireWebElement pacsunCheckoutEmail();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutFirstName}")
	public AspireWebElement pacsunCheckoutFirstName();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutLastName}")
	public AspireWebElement pacsunCheckoutLastName();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutAddress}")
	public AspireWebElement pacsunCheckoutAddress();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutCity}")
	public AspireWebElement pacsunCheckoutCity();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutPhone}")
	public AspireWebElement pacsunCheckoutPhone();
	
	@CssSelector("${pages.pacsun.pacsunCheckoutPostalCode}")
	public AspireWebElement pacsunCheckoutPostalCode();
	
	@CssSelector("${pages.pacsun.pacsunItemsTotal}")
	public AspireWebElement pacsunItemsTotal();
	
	@CssSelector("${pages.pacsun.pacsunShipping}")
	public AspireWebElement pacsunShipping();
	
	@CssSelector("${pages.pacsun.pacsunDutiesAndTaxes}")
	public AspireWebElement pacsunDutiesAndTaxes();
	
	@CssSelector("${pages.pacsun.pacsunOrderTotal}")
	public AspireWebElement pacsunOrderTotal();
	
	@IDSelector("${pages.pacsun.pacsunPlaceOrder}")
	public AspireWebElement pacsunPlaceOrder();
	
	@IDSelector("${pages.pacsun.pacsunCheckoutCardNumber}")
	public AspireWebElement pacsunCheckoutCardNumber();
	
	@IDSelector("${pages.pacsun.pacsunCheckoutExpirationDate}")
	public AspireWebElement pacsunCheckoutExpirationDate();
	
	@IDSelector("${pages.pacsun.pacsunCheckoutSecurityCode}")
	public AspireWebElement pacsunCheckoutSecurityCode();
	
	@IDSelector("${pages.pacsun.pacsunCheckoutSubmitError}")
	public AspireWebElement pacsunCheckoutSubmitError();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
