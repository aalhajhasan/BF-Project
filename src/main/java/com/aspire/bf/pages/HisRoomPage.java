package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "hisroom", url = "${pages.hisroom.hisroomUrl}")
public interface HisRoomPage {

	
	@CssSelector("${pages.hisroom.hisroomWelcomeMat}")
	public AspireWebElement hisroomWelcomeMat();
	
	@CssSelector("${pages.hisroom.hisroomWelcomeMatContinue}")
	public AspireWebElement hisroomWelcomeMatContinue();
	
	@CssSelector("${pages.hisroom.hisroomTopNav}")
	public AspireWebElements hisroomTopNav();
	
	@CssSelector("${pages.hisroom.hisroomProducts}")
	public AspireWebElements hisroomProducts();
	
	@CssSelector("${pages.hisroom.hisroomProductName}")
	public AspireWebElement hisroomProductName();
	
	@CssSelector("${pages.hisroom.hisroomProductPrice}")
	public AspireWebElement hisroomProductPrice();
	
	@CssSelector("${pages.hisroom.hisroomProductImage}")
	public AspireWebElement hisroomProductImage();
	
	@CssSelector("${pages.hisroom.hisroomPdp}")
	public AspireWebElement hisroomPdp();
	
	@CssSelector("${pages.hisroom.hisroomPdpName}")
	public AspireWebElement hisroomPdpName();
	
	@CssSelector("${pages.hisroom.hisroomPdpPrice}")
	public AspireWebElement hisroomPdpPrice();
	
	@CssSelector("${pages.hisroom.hisroomPdpImage}")
	public AspireWebElement hisroomPdpImage();
	
	@CssSelector("${pages.hisroom.hisroomFeed}")
	public AspireWebElement hisroomFeed();
	
	@CssSelector("${pages.hisroom.hisroomFeedClose}")
	public AspireWebElement hisroomFeedClose();
	
	@CssSelector("${pages.hisroom.hisroomSize}")
	public AspireWebElement hisroomSize();
	
	@CssSelector("${pages.hisroom.hisroomColor}")
	public AspireWebElements hisroomColor();
	
	@CssSelector("${pages.hisroom.hisroomAddToShoppingBag}")
	public AspireWebElement hisroomAddToShoppingBag();
	
	@CssSelector("${pages.hisroom.hisroomCartCheckout}")
	public AspireWebElement hisroomCartCheckout();
	
	@CssSelector("${pages.hisroom.hisroomSizeCloseDialog}")
	public AspireWebElement hisroomSizeCloseDialog();
	
	@CssSelector("${pages.hisroom.hisroomCartPage}")
	public AspireWebElement hisroomCartPage();
	
	@CssSelector("${pages.hisroom.hisroomCartPrice}")
	public AspireWebElement hisroomCartPrice();
	
	@CssSelector("${pages.hisroom.hisroomCartName}")
	public AspireWebElement hisroomCartName();
	
	@CssSelector("${pages.hisroom.hisroomPdpNetPrice}")
	public AspireWebElement hisroomPdpNetPrice();
	
	@CssSelector("${pages.hisroom.hisroomCartQuantity}")
	public AspireWebElement hisroomCartQuantity();
	
	@CssSelector("${pages.hisroom.hisroomCartItemOnePrice}")
	public AspireWebElement hisroomCartItemOnePrice();
	
	@CssSelector("${pages.hisroom.hisroomCartItemTwoPrice}")
	public AspireWebElement hisroomCartItemTwoPrice();
	
	@CssSelector("${pages.hisroom.hisroomCartItemsTotalPrice}")
	public AspireWebElement hisroomCartItemsTotalPrice();
	
	@CssSelector("${pages.hisroom.hisroomInternationalCheckout}")
	public AspireWebElement hisroomInternationalCheckout();
	
	@CssSelector("${pages.hisroom.hisroomItemsPrice}")
	public AspireWebElement hisroomItemsPrice();
	
	@CssSelector("${pages.hisroom.hisroomShippingPrice}")
	public AspireWebElement hisroomShippingPrice();
	
	@CssSelector("${pages.hisroom.hisroomDutiesPrice}")
	public AspireWebElement hisroomDutiesPrice();
	
	@CssSelector("${pages.hisroom.hisroomTotalPrice}")
	public AspireWebElement hisroomTotalPrice();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutContinue}")
	public AspireWebElement hisroomCheckoutContinue();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutEmail}")
	public AspireWebElement hisroomCheckoutEmail();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutFirstName}")
	public AspireWebElement hisroomCheckoutFirstName();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutEmailError}")
	public AspireWebElement hisroomCheckoutEmailError();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutFirstNameError}")
	public AspireWebElement hisroomCheckoutFirstNameError();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutLastNameError}")
	public AspireWebElement hisroomCheckoutLastNameError();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutAddressError}")
	public AspireWebElement hisroomCheckoutAddressError();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutCityError}")
	public AspireWebElement hisroomCheckoutCityError();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutPhoneError}")
	public AspireWebElement hisroomCheckoutPhoneError();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutLastName}")
	public AspireWebElement hisroomCheckoutLastName();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutAddress}")
	public AspireWebElement hisroomCheckoutAddress();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutCity}")
	public AspireWebElement hisroomCheckoutCity();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutPhone}")
	public AspireWebElement hisroomCheckoutPhone();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutPayment}")
	public AspireWebElement hisroomCheckoutPayment();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutPlaceOrder}")
	public AspireWebElement hisroomCheckoutPlaceOrder();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutCardNumberError}")
	public AspireWebElement hisroomCheckoutCardNumberError();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutExpirationDateError}")
	public AspireWebElement hisroomCheckoutExpirationDateError();
	
	@CssSelector("${pages.hisroom.hisroomCheckoutSecurityCodeError}")
	public AspireWebElement hisroomCheckoutSecurityCodeError();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutCardNumber}")
	public AspireWebElement hisroomCheckoutCardNumber();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutExpirationDate}")
	public AspireWebElement hisroomCheckoutExpirationDate();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutSecurityCode}")
	public AspireWebElement hisroomCheckoutSecurityCode();
	
	@IDSelector("${pages.hisroom.hisroomCheckoutSubmitError}")
	public AspireWebElement hisroomCheckoutSubmitError();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
