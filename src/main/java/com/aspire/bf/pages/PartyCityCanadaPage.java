package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "partycity", url = "${pages.partycity.partycityUrl}")
public interface PartyCityCanadaPage {

	
	@CssSelector("${pages.partycity.partycityTopNavCat}")
	public AspireWebElements partycityTopNavCat();
	
	@CssSelector("${pages.partycity.partycityTopNavSubCat}")
	public AspireWebElements partycityTopNavSubCat();
	
	@CssSelector("${pages.partycity.partycityCategory}")
	public AspireWebElements partycityCategory();
	
	@CssSelector("${pages.partycity.partycityPlp}")
	public AspireWebElements partycityPlp();
	
	@CssSelector("${pages.partycity.partycitySubCat}")
	public AspireWebElements partycitySubCat();
	
	@CssSelector("${pages.partycity.partycityProducts}")
	public AspireWebElements partycityProducts();
	
	@CssSelector("${pages.partycity.partycityProductName}")
	public AspireWebElement partycityProductName();
	
	@CssSelector("${pages.partycity.partycityProductPrice}")
	public AspireWebElement partycityProductPrice();
	
	@CssSelector("${pages.partycity.partycityProductImage}")
	public AspireWebElement partycityProductImage();
	
	@CssSelector("${pages.partycity.partycityQuickShop}")
	public AspireWebElement partycityQuickShop();
	
	@CssSelector("${pages.partycity.partycityQuickShopDialog}")
	public AspireWebElement partycityQuickShopDialog();
	
	@CssSelector("${pages.partycity.partycityQuickShopName}")
	public AspireWebElement partycityQuickShopName();
	
	@CssSelector("${pages.partycity.partycityQuickShopPrice}")
	public AspireWebElement partycityQuickShopPrice();
	
	@CssSelector("${pages.partycity.partycityViewPriductDetails}")
	public AspireWebElement partycityViewPriductDetails();
	
	@CssSelector("${pages.partycity.partycityPdp}")
	public AspireWebElement partycityPdp();
	
	@CssSelector("${pages.partycity.partycityPdpName}")
	public AspireWebElement partycityPdpName();
	
	@CssSelector("${pages.partycity.partycityPdpPrice}")
	public AspireWebElement partycityPdpPrice();
	
	@CssSelector("${pages.partycity.partycityColors}")
	public AspireWebElements partycityColors();
	
	@CssSelector("${pages.partycity.partycityAddToBasket}")
	public AspireWebElement partycityAddToBasket();
	
	@CssSelector("${pages.partycity.partycityCartDialog}")
	public AspireWebElement partycityCartDialog();
	
	@CssSelector("${pages.partycity.partycityCartName}")
	public AspireWebElement partycityCartName();
	
	@CssSelector("${pages.partycity.partycityCartPrice}")
	public AspireWebElement partycityCartPrice();
	
	@CssSelector("${pages.partycity.partycityCart}")
	public AspireWebElement partycityCart();
	
	@CssSelector("${pages.partycity.partycityViewBasket}")
	public AspireWebElement partycityViewBasket();
	
	@CssSelector("${pages.partycity.partycityCartPage}")
	public AspireWebElement partycityCartPage();
	
	@CssSelector("${pages.partycity.partycityCartPriceB}")
	public AspireWebElement partycityCartPriceB();
	
	@CssSelector("${pages.partycity.partycityCartUpdate}")
	public AspireWebElement partycityCartUpdate();
	
	@CssSelector("${pages.partycity.partycityCartQuantity}")
	public AspireWebElement partycityCartQuantity();
	
	@CssSelector("${pages.partycity.partycityCartPriceA}")
	public AspireWebElement partycityCartPriceA();
	
	@CssSelector("${pages.partycity.partycityCartPriceOne}")
	public AspireWebElement partycityCartPriceOne();
	
	@CssSelector("${pages.partycity.partycityCartPriceTwo}")
	public AspireWebElement partycityCartPriceTwo();
	
	@CssSelector("${pages.partycity.partycityCartPriceTotal}")
	public AspireWebElement partycityCartPriceTotal();
	
	@CssSelector("${pages.partycity.partycityCartCheckout}")
	public AspireWebElement partycityCartCheckout();
	
	@IDSelector("${pages.partycity.partycityCheckoutContinue}")
	public AspireWebElement partycityCheckoutContinue();
	
	@CssSelector("${pages.partycity.partycityDeliveryEmailAddressError}")
	public AspireWebElement partycityDeliveryEmailAddressError();
	
	@CssSelector("${pages.partycity.partycityDeliveryFirstNameError}")
	public AspireWebElement partycityDeliveryFirstNameError();
	
	@CssSelector("${pages.partycity.partycityDeliveryLastNameError}")
	public AspireWebElement partycityDeliveryLastNameError();
	
	@CssSelector("${pages.partycity.partycityDeliveryAddressError}")
	public AspireWebElement partycityDeliveryAddressError();
	
	@CssSelector("${pages.partycity.partycityDeliveryCityError}")
	public AspireWebElement partycityDeliveryCityError();
	
	@CssSelector("${pages.partycity.partycityDeliveryPhoneNumberError}")
	public AspireWebElement partycityDeliveryPhoneNumberError();
	
	@IDSelector("${pages.partycity.partycityDeliveryFirstName}")
	public AspireWebElement partycityDeliveryFirstName();
	
	@IDSelector("${pages.partycity.partycityDeliveryLastName}")
	public AspireWebElement partycityDeliveryLastName();
	
	@IDSelector("${pages.partycity.partycityDeliveryAddress}")
	public AspireWebElement partycityDeliveryAddress();
	
	@IDSelector("${pages.partycity.partycityDeliveryCity}")
	public AspireWebElement partycityDeliveryCity();
	
	@IDSelector("${pages.partycity.partycityDeliveryZipCode}")
	public AspireWebElement partycityDeliveryZipCode();
	
	@IDSelector("${pages.partycity.partycityDeliveryPhoneNumber}")
	public AspireWebElement partycityDeliveryPhoneNumber();
	
	@IDSelector("${pages.partycity.partycityDeliveryEmailAddress}")
	public AspireWebElement partycityDeliveryEmailAddress();
	
	@IDSelector("${pages.partycity.partycityPaymentSection}")
	public AspireWebElement partycityPaymentSection();
	
	@IDSelector("${pages.partycity.partycityPalceOrderButton}")
	public AspireWebElement partycityPalceOrderButton();
	
	@CssSelector("${pages.partycity.partycityPaymentCardNumberError}")
	public AspireWebElement partycityPaymentCardNumberError();
	
	@CssSelector("${pages.partycity.partycityPaymentExpirationDateError}")
	public AspireWebElement partycityPaymentExpirationDateError();
	
	@CssSelector("${pages.partycity.partycityPaymentSecurityCodeError}")
	public AspireWebElement partycityPaymentSecurityCodeError();
	
	@IDSelector("${pages.partycity.partycityPaymentCardNumber}")
	public AspireWebElement partycityPaymentCardNumber();
	
	@IDSelector("${pages.partycity.partycityPaymentExpirationDate}")
	public AspireWebElement partycityPaymentExpirationDate();
	
	@IDSelector("${pages.partycity.partycityPaymentSecurityCode}")
	public AspireWebElement partycityPaymentSecurityCode();
	
	@CssSelector("${pages.partycity.partycitySubmitError}")
	public AspireWebElement partycitySubmitError();
	
	@CssSelector("${pages.partycity.partycityItemsTotal}")
	public AspireWebElement partycityItemsTotal();
	
	@CssSelector("${pages.partycity.partycityShipping}")
	public AspireWebElement partycityShipping();
	
	@CssSelector("${pages.partycity.partycityDutiesAndTaxes}")
	public AspireWebElement partycityDutiesAndTaxes();
	
	@CssSelector("${pages.partycity.partycityOrderTotal}")
	public AspireWebElement partycityOrderTotal();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
