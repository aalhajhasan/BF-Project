package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;



@Page(name = "jcrew", url = "${pages.jcrew.jcrewurl}")

public interface JcrewPage {

	
	@CssSelector("${pages.jcrew.jcrewWelcomeMat}")
	public AspireWebElement jcrewWelcomeMat();
	
	@CssSelector("${pages.jcrew.jcrewWelcomeMatContinue}")
	public AspireWebElement jcrewWelcomeMatContinue();
	
	@CssSelector("${pages.jcrew.jcrewTopNav}")
	public AspireWebElements jcrewTopNav();
	
	@CssSelector("${pages.jcrew.xButton}")
	public AspireWebElement xButton();
	
	@CssSelector("${pages.jcrew.jcrewSales}")
	public AspireWebElements jcrewSales();
	
	@CssSelector("${pages.jcrew.jcrewProducts}")
	public AspireWebElements jcrewProducts();
	
	@CssSelector("${pages.jcrew.plpItemName}")
	public AspireWebElement plpItemName();
	
	@CssSelector("${pages.jcrew.plpItemPrice}")
	public AspireWebElement plpItemPrice();
	
	@CssSelector("${pages.jcrew.plpItemImage}")
	public AspireWebElement plpItemImage();
	
	@CssSelector("${pages.jcrew.quickShop}")
	public AspireWebElement quickShop();
	
	@CssSelector("${pages.jcrew.quickShopDialog}")
	public AspireWebElement quickShopDialog();
	
	@CssSelector("${pages.jcrew.quickShopItemName}")
	public AspireWebElement quickShopItemName();
	
	@CssSelector("${pages.jcrew.quickShopItemPrice}")
	public AspireWebElement quickShopItemPrice();
	
	@CssSelector("${pages.jcrew.quickShopItemImage}")
	public AspireWebElement quickShopItemImage();
	
	@CssSelector("${pages.jcrew.bagDialog}")
	public AspireWebElement bagDialog();
	
	@CssSelector("${pages.jcrew.quickShopViewFullDetails}")
	public AspireWebElement quickShopViewFullDetails();
	
	@CssSelector("${pages.jcrew.itemDetailsPage}")
	public AspireWebElement itemDetailsPage();
	
	@CssSelector("${pages.jcrew.itemName}")
	public AspireWebElement itemName();
	
	@CssSelector("${pages.jcrew.itemPrice}")
	public AspireWebElement itemPrice();
	
	@CssSelector("${pages.jcrew.itemImage}")
	public AspireWebElement itemImage();
	
	@CssSelector("${pages.jcrew.itemColors}")
	public AspireWebElements itemColors();
	
	@CssSelector("${pages.jcrew.itemSizes}")
	public AspireWebElements itemSizes();
	
	@CssSelector("${pages.jcrew.itemAddToBag}")
	public AspireWebElement itemAddToBag();
	
	@CssSelector("${pages.jcrew.bagItemName}")
	public AspireWebElement bagItemName();
	
	@CssSelector("${pages.jcrew.bagItemPrice}")
	public AspireWebElement bagItemPrice();
	
	@CssSelector("${pages.jcrew.bagChceckout}")
	public AspireWebElement bagChceckout();
	
	@CssSelector("${pages.jcrew.bagItemOnePrice}")
	public AspireWebElement bagItemOnePrice();
	
	@CssSelector("${pages.jcrew.bagItemTwoPrice}")
	public AspireWebElement bagItemTwoPrice();
	
	@CssSelector("${pages.jcrew.bagItemsTotalPrice}")
	public AspireWebElement bagItemsTotalPrice();
	
	@CssSelector("${pages.jcrew.itemsBagPage}")
	public AspireWebElement itemsBagPage();
	
	@CssSelector("${pages.jcrew.checkoutNow}")
	public AspireWebElement checkoutNow();
	
	@CssSelector("${pages.jcrew.checkoutPage}")
	public AspireWebElement checkoutPage();
	
	@CssSelector("${pages.jcrew.checkoutAsGuest}")
	public AspireWebElement checkoutAsGuest();
	
	@CssSelector("${pages.jcrew.checkoutShippingPage}")
	public AspireWebElement checkoutShippingPage();
	
	@CssSelector("${pages.jcrew.continueButton}")
	public AspireWebElement continueButton();
	
	@CssSelector("${pages.jcrew.firstNameError}")
	public AspireWebElement firstNameError();
	
	@CssSelector("${pages.jcrew.lastNameError}")
	public AspireWebElement lastNameError();
	
	@CssSelector("${pages.jcrew.streetAddressError}")
	public AspireWebElement streetAddressError();
	
	@CssSelector("${pages.jcrew.cityError}")
	public AspireWebElement cityError();
	
	@CssSelector("${pages.jcrew.postalCodeError}")
	public AspireWebElement postalCodeError();
	
	@CssSelector("${pages.jcrew.phoneNumberError}")
	public AspireWebElement phoneNumberError();
			
	@CssSelector("${pages.jcrew.firstName}")
	public AspireWebElement firstName();		
			
	@CssSelector("${pages.jcrew.lastName}")
	public AspireWebElement lastName();		
			
	@CssSelector("${pages.jcrew.streetAddress}")
	public AspireWebElement streetAddress();	
	
	@CssSelector("${pages.jcrew.city}")
	public AspireWebElement city();
	
	@CssSelector("${pages.jcrew.postalCode}")
	public AspireWebElement postalCode();
	
	@CssSelector("${pages.jcrew.phoneNumber}")
	public AspireWebElement phoneNumber();
	
	@CssSelector("${pages.jcrew.checkYourAddressDialog}")
	public AspireWebElement checkYourAddressDialog();
	
	@CssSelector("${pages.jcrew.useAddressAsEntered}")
	public AspireWebElement useAddressAsEntered();
	
	@CssSelector("${pages.jcrew.shippingContinueButton}")
	public AspireWebElement shippingContinueButton();
	
	@CssSelector("${pages.jcrew.checkoutBillingPage}")
	public AspireWebElement checkoutBillingPage();
	
	@CssSelector("${pages.jcrew.billingContinueButton}")
	public AspireWebElement billingContinueButton();
	
	@CssSelector("${pages.jcrew.cardNumberError}")
	public AspireWebElement cardNumberError();
	
	@CssSelector("${pages.jcrew.securityCodeError}")
	public AspireWebElement securityCodeError();
	
	@CssSelector("${pages.jcrew.expirationDateError}")
	public AspireWebElement expirationDateError();
	
	@CssSelector("${pages.jcrew.nameOnCardError}")
	public AspireWebElement nameOnCardError();
	
	@CssSelector("${pages.jcrew.emailAddressError}")
	public AspireWebElement emailAddressError();
	
	@CssSelector("${pages.jcrew.cardNumber}")
	public AspireWebElement cardNumber();
	
	@CssSelector("${pages.jcrew.securityCode}")
	public AspireWebElement securityCode();
	
	@CssSelector("${pages.jcrew.expirationMonth}")
	public AspireWebElement expirationMonth();
	
	@CssSelector("${pages.jcrew.expirationYear}")
	public AspireWebElement expirationYear();
	
	@CssSelector("${pages.jcrew.nameOnCard}")
	public AspireWebElement nameOnCard();
	
	@CssSelector("${pages.jcrew.emailAddress}")
	public AspireWebElement emailAddress();
	
	@CssSelector("${pages.jcrew.checkoutReviewPage}")
	public AspireWebElement checkoutReviewPage();
	
	@CssSelector("${pages.jcrew.placeMyOrder}")
	public AspireWebElement placeMyOrder();
	
	@CssSelector("${pages.jcrew.submitError}")
	public AspireWebElement submitError();
	
	
	
	
	
}
