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
	
	@CssSelector("${pages.ebags.pdpProductPage}")
	public AspireWebElement pdpProductPage();
	
	@CssSelector("${pages.ebags.pdpProductPrice}")
	public AspireWebElement pdpProductPrice();
	
	@CssSelector("${pages.ebags.pdpProductName}")
	public AspireWebElement pdpProductName();
	
	@CssSelector("${pages.ebags.plpImage}")
	public AspireWebElement plpImage();
	
	@CssSelector("${pages.ebags.pdpImage}")
	public AspireWebElement pdpImage();
	
	@CssSelector("${pages.ebags.availableColor}")
	public AspireWebElements availableColor();
	
	@CssSelector("${pages.ebags.ebagsPdpPrice}")
	public AspireWebElement ebagsPdpPrice();
	
	@CssSelector("${pages.ebags.ebagsPdpName}")
	public AspireWebElement ebagsPdpName();
	
	@CssSelector("${pages.ebags.addToCartButton}")
	public AspireWebElement addToCartButton();
	
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
	
	@CssSelector("${pages.ebags.viewCartLink}")
	public AspireWebElement viewCartLink();
	
	@CssSelector("${pages.ebags.cartQuantity}")
	public AspireWebElement cartQuantity();
	 
	@CssSelector("${pages.ebags.ebagsCartPage}")
	public AspireWebElement ebagsCartPage();
	
	@CssSelector("${pages.ebags.updateQuantity}")
	public AspireWebElement updateQuantity();
	
	@CssSelector("${pages.ebags.bagProductOnePrice}")
	public AspireWebElement bagProductOnePrice();
	
	@CssSelector("${pages.ebags.bagProductTwoPrice}")
	public AspireWebElement bagProductTwoPrice();
	
	@CssSelector("${pages.ebags.bagSubTotalPrice}")
	public AspireWebElement bagSubTotalPrice();
	
	@CssSelector("${pages.ebags.continuwCheckout}")
	public AspireWebElement continuwCheckout();
	
	@CssSelector("${pages.ebags.deliveryCheckout}")
	public AspireWebElement deliveryCheckout();
	
	@CssSelector("${pages.ebags.checkoutContinue}")
	public AspireWebElement checkoutContinue();
	
	@CssSelector("${pages.ebags.deliveryEmailAddressError}")
	public AspireWebElement deliveryEmailAddressError();
	
	@CssSelector("${pages.ebags.deliveryFirstNameError}")
	public AspireWebElement deliveryFirstNameError();
	
	@CssSelector("${pages.ebags.deliveryLastNameError}")
	public AspireWebElement deliveryLastNameError();
	
	@CssSelector("${pages.ebags.deliveryAddressError}")
	public AspireWebElement deliveryAddressError();
	
	@CssSelector("${pages.ebags.deliveryCityError}")
	public AspireWebElement deliveryCityError();
	
	@CssSelector("${pages.ebags.deliveryPhoneNumberError}")
	public AspireWebElement deliveryPhoneNumberError();
	
	@CssSelector("${pages.ebags.deliveryFirstName}")
	public AspireWebElement deliveryFirstName();
	
	@CssSelector("${pages.ebags.deliveryLastName}")
	public AspireWebElement deliveryLastName();
	
	@CssSelector("${pages.ebags.deliveryAddress}")
	public AspireWebElement deliveryAddress();
	
	@CssSelector("${pages.ebags.deliveryCity}")
	public AspireWebElement deliveryCity();
	
	@CssSelector("${pages.ebags.deliveryZipCode}")
	public AspireWebElement deliveryZipCode();
	
	@CssSelector("${pages.ebags.deliveryPhoneNumber}")
	public AspireWebElement deliveryPhoneNumber();
	
	@CssSelector("${pages.ebags.deliveryEmailAddress}")
	public AspireWebElement deliveryEmailAddress();
	
	@CssSelector("${pages.ebags.paymentSection}")
	public AspireWebElement paymentSection();
	
	@CssSelector("${pages.ebags.palceOrderButton}")
	public AspireWebElement palceOrderButton();
	
	@CssSelector("${pages.ebags.paymentCardNumberError}")
	public AspireWebElement paymentCardNumberError();
	
	@CssSelector("${pages.ebags.paymentExpirationDateError}")
	public AspireWebElement paymentExpirationDateError();
	
	@CssSelector("${pages.ebags.paymentSecurityCodeError}")
	public AspireWebElement paymentSecurityCodeError();
	
	@CssSelector("${pages.ebags.paymentCardNumber}")
	public AspireWebElement paymentCardNumber();
	
	@CssSelector("${pages.ebags.paymentExpirationDate}")
	public AspireWebElement paymentExpirationDate();
	
	@CssSelector("${pages.ebags.paymentSecurityCode}")
	public AspireWebElement paymentSecurityCode();
	
	@CssSelector("${pages.ebags.submitError}")
	public AspireWebElement submitError();
	
	@CssSelector("${pages.ebags.itemsTotal}")
	public AspireWebElement itemsTotal();
	
	@CssSelector("${pages.ebags.shipping}")
	public AspireWebElement shipping();
	
	@CssSelector("${pages.ebags.dutiesAndTaxes}")
	public AspireWebElement dutiesAndTaxes();
	
	@CssSelector("${pages.ebags.orderTotal}")
	public AspireWebElement orderTotal();
	
	@CssSelector("${pages.ebags.promoCodeSection}")
	public AspireWebElement promoCodeSection();
	
	@CssSelector("${pages.ebags.promoCodeSFiled}")
	public AspireWebElement promoCodeSFiled();
	
	@CssSelector("${pages.ebags.itemCart}")
	public AspireWebElement itemCart();
	
	@CssSelector("${pages.ebags.cartIcon}")
	public AspireWebElement cartIcon();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
