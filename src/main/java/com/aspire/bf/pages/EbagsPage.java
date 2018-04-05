package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "ebags", url = "${pages.ebags.ebagsurl}")
public interface EbagsPage {

	@CssSelector("${pages.ebags.ebagsWelcomeMat}")
	public AspireWebElement ebagsWelcomeMat();
	
	@CssSelector("${pages.ebags.ebagsWelcomeMatContinue}")
	public AspireWebElement ebagsWelcomeMatContinue();
	
	@CssSelector("${pages.ebags.ebagsTopNav}")
	public AspireWebElements ebagsTopNav();
	
	@CssSelector("${pages.ebags.ebagsProducts}")
	public AspireWebElements ebagsProducts();
	
	@CssSelector("${pages.ebags.ebagsProductName}")
	public AspireWebElement ebagsProductName();
	
	@CssSelector("${pages.ebags.ebagsProductPrice}")
	public AspireWebElement ebagsProductPrice();
	
	@CssSelector("${pages.ebags.ebagsPdpProductPage}")
	public AspireWebElement ebagsPdpProductPage();
	
	@CssSelector("${pages.ebags.ebagsPdpProductPrice}")
	public AspireWebElement ebagsPdpProductPrice();
	
	@CssSelector("${pages.ebags.ebagsPdpProductName}")
	public AspireWebElement ebagsPdpProductName();
	
	@CssSelector("${pages.ebags.ebagsPlpImage}")
	public AspireWebElement ebagsPlpImage();
	
	@CssSelector("${pages.ebags.ebagsPdpImage}")
	public AspireWebElement ebagsPdpImage();
	
	@CssSelector("${pages.ebags.ebagsColor}")
	public AspireWebElements ebagsColor();
	
	@CssSelector("${pages.ebags.ebagsPdpPrice}")
	public AspireWebElement ebagsPdpPrice();
	
	@CssSelector("${pages.ebags.ebagsPdpName}")
	public AspireWebElement ebagsPdpName();
	
	@CssSelector("${pages.ebags.ebagsAddToCartButton}")
	public AspireWebElement ebagsAddToCartButton();
	
	@CssSelector("${pages.ebags.ebagsQuickView}")
	public AspireWebElement ebagsQuickView();
	
	@CssSelector("${pages.ebags.ebagsQVPrice}")
	public AspireWebElement ebagsQVPrice();
	
	@CssSelector("${pages.ebags.ebagsQVName}")
	public AspireWebElement ebagsQVName();
	
	@CssSelector("${pages.ebags.ebagsQvClose}")
	public AspireWebElement ebagsQvClose();
	
	@CssSelector("${pages.ebags.ebagsQVTotlatPrice}")
	public AspireWebElement ebagsQVTotlatPrice();
	
	@CssSelector("${pages.ebags.ebagsViewCartLink}")
	public AspireWebElement ebagsViewCartLink();
	
	@CssSelector("${pages.ebags.ebagsCartQuantity}")
	public AspireWebElement ebagsCartQuantity();
	 
	@CssSelector("${pages.ebags.ebagsCartPage}")
	public AspireWebElement ebagsCartPage();
	
	@CssSelector("${pages.ebags.ebagsUpdateQuantity}")
	public AspireWebElement ebagsUpdateQuantity();
	
	@CssSelector("${pages.ebags.ebagsBagProductOnePrice}")
	public AspireWebElement ebagsBagProductOnePrice();
	
	@CssSelector("${pages.ebags.ebagsBagProductTwoPrice}")
	public AspireWebElement ebagsBagProductTwoPrice();
	
	@CssSelector("${pages.ebags.ebagsBagSubTotalPrice}")
	public AspireWebElement ebagsBagSubTotalPrice();
	
	@CssSelector("${pages.ebags.ebagsContinuwCheckout}")
	public AspireWebElement ebagsContinuwCheckout();
	
	@CssSelector("${pages.ebags.ebagsDeliveryCheckout}")
	public AspireWebElement ebagsDeliveryCheckout();
	
	@CssSelector("${pages.ebags.ebagsCheckoutContinue}")
	public AspireWebElement ebagsCheckoutContinue();
	
	@CssSelector("${pages.ebags.ebagsDeliveryEmailAddressError}")
	public AspireWebElement ebagsDeliveryEmailAddressError();
	
	@CssSelector("${pages.ebags.ebagsDeliveryFirstNameError}")
	public AspireWebElement ebagsDeliveryFirstNameError();
	
	@CssSelector("${pages.ebags.ebagsDeliveryLastNameError}")
	public AspireWebElement ebagsDeliveryLastNameError();
	
	@CssSelector("${pages.ebags.ebagsDeliveryAddressError}")
	public AspireWebElement ebagsDeliveryAddressError();
	
	@CssSelector("${pages.ebags.ebagsDeliveryCityError}")
	public AspireWebElement ebagsDeliveryCityError();
	
	@CssSelector("${pages.ebags.ebagsDeliveryPhoneNumberError}")
	public AspireWebElement ebagsDeliveryPhoneNumberError();
	
	@CssSelector("${pages.ebags.ebagsDeliveryFirstName}")
	public AspireWebElement ebagsDeliveryFirstName();
	
	@CssSelector("${pages.ebags.ebagsDeliveryLastName}")
	public AspireWebElement ebagsDeliveryLastName();
	
	@CssSelector("${pages.ebags.ebagsDeliveryAddress}")
	public AspireWebElement ebagsDeliveryAddress();
	
	@CssSelector("${pages.ebags.ebagsDeliveryCity}")
	public AspireWebElement ebagsDeliveryCity();
	
	@CssSelector("${pages.ebags.ebagsDeliveryZipCode}")
	public AspireWebElement ebagsDeliveryZipCode();
	
	@CssSelector("${pages.ebags.ebagsDeliveryPhoneNumber}")
	public AspireWebElement ebagsDeliveryPhoneNumber();
	
	@CssSelector("${pages.ebags.ebagsDeliveryEmailAddress}")
	public AspireWebElement ebagsDeliveryEmailAddress();
	
	@CssSelector("${pages.ebags.ebagsPaymentSection}")
	public AspireWebElement ebagsPaymentSection();
	
	@CssSelector("${pages.ebags.ebagsPalceOrderButton}")
	public AspireWebElement ebagsPalceOrderButton();
	
	@CssSelector("${pages.ebags.ebagsPaymentCardNumberError}")
	public AspireWebElement ebagsPaymentCardNumberError();
	
	@CssSelector("${pages.ebags.ebagsPaymentExpirationDateError}")
	public AspireWebElement ebagsPaymentExpirationDateError();
	
	@CssSelector("${pages.ebags.ebagsPaymentSecurityCodeError}")
	public AspireWebElement ebagsPaymentSecurityCodeError();
	
	@CssSelector("${pages.ebags.ebagsPaymentCardNumber}")
	public AspireWebElement ebagsPaymentCardNumber();
	
	@CssSelector("${pages.ebags.ebagsPaymentExpirationDate}")
	public AspireWebElement ebagsPaymentExpirationDate();
	
	@CssSelector("${pages.ebags.ebagsPaymentSecurityCode}")
	public AspireWebElement ebagsPaymentSecurityCode();
	
	@CssSelector("${pages.ebags.ebagsSubmitError}")
	public AspireWebElement ebagsSubmitError();
	
	@CssSelector("${pages.ebags.ebagsItemsTotal}")
	public AspireWebElement ebagsItemsTotal();
	
	@CssSelector("${pages.ebags.ebagsShipping}")
	public AspireWebElement ebagsShipping();
	
	@CssSelector("${pages.ebags.ebagsDutiesAndTaxes}")
	public AspireWebElement ebagsDutiesAndTaxes();
	
	@CssSelector("${pages.ebags.ebagsOrderTotal}")
	public AspireWebElement ebagsOrderTotal();
	
	@CssSelector("${pages.ebags.ebagsPromoCodeSection}")
	public AspireWebElement ebagsPromoCodeSection();
	
	@CssSelector("${pages.ebags.ebagsPromoCodeSFiled}")
	public AspireWebElement ebagsPromoCodeSFiled();
	
	@CssSelector("${pages.ebags.ebagsItemCart}")
	public AspireWebElement ebagsItemCart();
	
	@CssSelector("${pages.ebags.ebagsCartIcon}")
	public AspireWebElement ebagsCartIcon();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
