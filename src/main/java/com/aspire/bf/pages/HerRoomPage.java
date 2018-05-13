package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "herroom", url = "${pages.herroom.herroomUrl}")
public interface HerRoomPage {

	@CssSelector("${pages.herroom.herroomWelcomeMat}")
	public AspireWebElement herroomWelcomeMat();
	
	@CssSelector("${pages.herroom.herroomWelcomeMatContinue}")
	public AspireWebElement herroomWelcomeMatContinue();
	
	@CssSelector("${pages.herroom.herroomTopNav}")
	public AspireWebElements herroomTopNav();
	
	@CssSelector("${pages.herroom.herroomProducts}")
	public AspireWebElements herroomProducts();
	
	@CssSelector("${pages.herroom.herroomProductName}")
	public AspireWebElement herroomProductName();
	
	@CssSelector("${pages.herroom.herroomProductPrice}")
	public AspireWebElement herroomProductPrice();
	
	@CssSelector("${pages.herroom.herroomProductImage}")
	public AspireWebElement herroomProductImage();
	
	@CssSelector("${pages.herroom.herroomPdp}")
	public AspireWebElement herroomPdp();
	
	@CssSelector("${pages.herroom.herroomPdpName}")
	public AspireWebElement herroomPdpName();
	
	@CssSelector("${pages.herroom.herroomPdpPrice}")
	public AspireWebElement herroomPdpPrice();
	
	@CssSelector("${pages.herroom.herroomPdpImage}")
	public AspireWebElement herroomPdpImage();
	
	@CssSelector("${pages.herroom.herroomFeed}")
	public AspireWebElement herroomFeed();
	
	@CssSelector("${pages.herroom.herroomFeedClose}")
	public AspireWebElement herroomFeedClose();
	
	@CssSelector("${pages.herroom.herroomSize}")
	public AspireWebElement herroomSize();
	
	@CssSelector("${pages.herroom.herroomColor}")
	public AspireWebElements herroomColor();
	
	@CssSelector("${pages.herroom.herroomAddToShoppingBag}")
	public AspireWebElement herroomAddToShoppingBag();
	
	@CssSelector("${pages.herroom.herroomCartCheckout}")
	public AspireWebElement herroomCartCheckout();
	
	@CssSelector("${pages.herroom.herroomSizeCloseDialog}")
	public AspireWebElement herroomSizeCloseDialog();
	
	@CssSelector("${pages.herroom.herroomCartPage}")
	public AspireWebElement herroomCartPage();
	
	@CssSelector("${pages.herroom.herroomCartPrice}")
	public AspireWebElement herroomCartPrice();
	
	@CssSelector("${pages.herroom.herroomCartName}")
	public AspireWebElement herroomCartName();
	
	@CssSelector("${pages.herroom.herroomPdpNetPrice}")
	public AspireWebElement herroomPdpNetPrice();
	
	@CssSelector("${pages.herroom.herroomCartQuantity}")
	public AspireWebElement herroomCartQuantity();
	
	@CssSelector("${pages.herroom.herroomCartItemOnePrice}")
	public AspireWebElement herroomCartItemOnePrice();
	
	@CssSelector("${pages.herroom.herroomCartItemTwoPrice}")
	public AspireWebElement herroomCartItemTwoPrice();
	
	@CssSelector("${pages.herroom.herroomCartItemsTotalPrice}")
	public AspireWebElement herroomCartItemsTotalPrice();
	
	@CssSelector("${pages.herroom.herroomInternationalCheckout}")
	public AspireWebElement herroomInternationalCheckout();
	
	@CssSelector("${pages.herroom.herroomItemsPrice}")
	public AspireWebElement herroomItemsPrice();
	
	@CssSelector("${pages.herroom.herroomShippingPrice}")
	public AspireWebElement herroomShippingPrice();
	
	@CssSelector("${pages.herroom.herroomDutiesPrice}")
	public AspireWebElement herroomDutiesPrice();
	
	@CssSelector("${pages.herroom.herroomTotalPrice}")
	public AspireWebElement herroomTotalPrice();
	
	@CssSelector("${pages.herroom.herroomCheckoutContinue}")
	public AspireWebElement herroomCheckoutContinue();
	
	@IDSelector("${pages.herroom.herroomCheckoutEmail}")
	public AspireWebElement herroomCheckoutEmail();
	
	@IDSelector("${pages.herroom.herroomCheckoutFirstName}")
	public AspireWebElement herroomCheckoutFirstName();
	
	@CssSelector("${pages.herroom.herroomCheckoutEmailError}")
	public AspireWebElement herroomCheckoutEmailError();
	
	@CssSelector("${pages.herroom.herroomCheckoutFirstNameError}")
	public AspireWebElement herroomCheckoutFirstNameError();
	
	@CssSelector("${pages.herroom.herroomCheckoutLastNameError}")
	public AspireWebElement herroomCheckoutLastNameError();
	
	@CssSelector("${pages.herroom.herroomCheckoutAddressError}")
	public AspireWebElement herroomCheckoutAddressError();
	
	@CssSelector("${pages.herroom.herroomCheckoutCityError}")
	public AspireWebElement herroomCheckoutCityError();
	
	@CssSelector("${pages.herroom.herroomCheckoutPhoneError}")
	public AspireWebElement herroomCheckoutPhoneError();
	
	@IDSelector("${pages.herroom.herroomCheckoutLastName}")
	public AspireWebElement herroomCheckoutLastName();
	
	@IDSelector("${pages.herroom.herroomCheckoutAddress}")
	public AspireWebElement herroomCheckoutAddress();
	
	@IDSelector("${pages.herroom.herroomCheckoutCity}")
	public AspireWebElement herroomCheckoutCity();
	
	@IDSelector("${pages.herroom.herroomCheckoutPhone}")
	public AspireWebElement herroomCheckoutPhone();
	
	@IDSelector("${pages.herroom.herroomCheckoutPayment}")
	public AspireWebElement herroomCheckoutPayment();
	
	@IDSelector("${pages.herroom.herroomCheckoutPlaceOrder}")
	public AspireWebElement herroomCheckoutPlaceOrder();
	
	@CssSelector("${pages.herroom.herroomCheckoutCardNumberError}")
	public AspireWebElement herroomCheckoutCardNumberError();
	
	@CssSelector("${pages.herroom.herroomCheckoutExpirationDateError}")
	public AspireWebElement herroomCheckoutExpirationDateError();
	
	@CssSelector("${pages.herroom.herroomCheckoutSecurityCodeError}")
	public AspireWebElement herroomCheckoutSecurityCodeError();
	
	@IDSelector("${pages.herroom.herroomCheckoutCardNumber}")
	public AspireWebElement herroomCheckoutCardNumber();
	
	@IDSelector("${pages.herroom.herroomCheckoutExpirationDate}")
	public AspireWebElement herroomCheckoutExpirationDate();
	
	@IDSelector("${pages.herroom.herroomCheckoutSecurityCode}")
	public AspireWebElement herroomCheckoutSecurityCode();
	
	@IDSelector("${pages.herroom.herroomCheckoutSubmitError}")
	public AspireWebElement herroomCheckoutSubmitError();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
