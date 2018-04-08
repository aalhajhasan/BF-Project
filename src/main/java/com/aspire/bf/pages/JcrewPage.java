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
	
	@CssSelector("${pages.jcrew.jcrewXButton}")
	public AspireWebElement jcrewXButton();
	
	@CssSelector("${pages.jcrew.jcrewSales}")
	public AspireWebElements jcrewSales();
	
	@CssSelector("${pages.jcrew.jcrewProducts}")
	public AspireWebElements jcrewProducts();
	
	@CssSelector("${pages.jcrew.jcrewPlpItemName}")
	public AspireWebElement jcrewPlpItemName();
	
	@CssSelector("${pages.jcrew.jcrewPlpItemPrice}")
	public AspireWebElement jcrewPlpItemPrice();
	
	@CssSelector("${pages.jcrew.jcrewPlpItemImage}")
	public AspireWebElement jcrewPlpItemImage();
	
	@CssSelector("${pages.jcrew.jcrewQuickShop}")
	public AspireWebElement jcrewQuickShop();
	
	@CssSelector("${pages.jcrew.jcrewQuickShopDialog}")
	public AspireWebElement jcrewQuickShopDialog();
	
	@CssSelector("${pages.jcrew.jcrewQuickShopItemName}")
	public AspireWebElement jcrewQuickShopItemName();
	
	@CssSelector("${pages.jcrew.jcrewQuickShopItemPrice}")
	public AspireWebElement jcrewQuickShopItemPrice();
	
	@CssSelector("${pages.jcrew.jcrewQuickShopItemImage}")
	public AspireWebElement jcrewQuickShopItemImage();
	
	@CssSelector("${pages.jcrew.jcrewBagDialog}")
	public AspireWebElement jcrewBagDialog();
	
	@CssSelector("${pages.jcrew.jcrewQuickShopViewFullDetails}")
	public AspireWebElement jcrewQuickShopViewFullDetails();
	
	@CssSelector("${pages.jcrew.jcrewItemDetailsPage}")
	public AspireWebElement jcrewItemDetailsPage();
	
	@CssSelector("${pages.jcrew.jcrewItemName}")
	public AspireWebElement jcrewItemName();
	
	@CssSelector("${pages.jcrew.jcrewItemPrice}")
	public AspireWebElement jcrewItemPrice();
	
	@CssSelector("${pages.jcrew.jcrewItemImage}")
	public AspireWebElement jcrewItemImage();
	
	@CssSelector("${pages.jcrew.jcrewItemColors}")
	public AspireWebElements jcrewItemColors();
	
	@CssSelector("${pages.jcrew.jcrewItemSizes}")
	public AspireWebElements jcrewItemSizes();
	
	@CssSelector("${pages.jcrew.jcrewItemAddToBag}")
	public AspireWebElement jcrewItemAddToBag();
	
	@CssSelector("${pages.jcrew.jcrewBagItemName}")
	public AspireWebElement jcrewBagItemName();
	
	@CssSelector("${pages.jcrew.jcrewBagItemPrice}")
	public AspireWebElement jcrewBagItemPrice();
	
	@CssSelector("${pages.jcrew.jcrewBagChceckout}")
	public AspireWebElement jcrewBagChceckout();
	
	@CssSelector("${pages.jcrew.jcrewBagItemOnePrice}")
	public AspireWebElement jcrewBagItemOnePrice();
	
	@CssSelector("${pages.jcrew.jcrewBagItemTwoPrice}")
	public AspireWebElement jcrewBagItemTwoPrice();
	
	@CssSelector("${pages.jcrew.jcrewBagItemsTotalPrice}")
	public AspireWebElement jcrewBagItemsTotalPrice();
	
	@CssSelector("${pages.jcrew.jcrewItemsBagPage}")
	public AspireWebElement jcrewItemsBagPage();
	
	@CssSelector("${pages.jcrew.jcrewCheckoutNow}")
	public AspireWebElement jcrewCheckoutNow();
	
	@CssSelector("${pages.jcrew.jcrewCheckoutPage}")
	public AspireWebElement jcrewCheckoutPage();
	
	@CssSelector("${pages.jcrew.jcrewCheckoutAsGuest}")
	public AspireWebElement jcrewCheckoutAsGuest();
	
	@CssSelector("${pages.jcrew.jcrewCheckoutShippingPage}")
	public AspireWebElement jcrewCheckoutShippingPage();
	
	@CssSelector("${pages.jcrew.jcrewContinueButton}")
	public AspireWebElement jcrewContinueButton();
	
	@CssSelector("${pages.jcrew.jcrewFirstNameError}")
	public AspireWebElement jcrewFirstNameError();
	
	@CssSelector("${pages.jcrew.jcrewLastNameError}")
	public AspireWebElement jcrewLastNameError();
	
	@CssSelector("${pages.jcrew.jcrewStreetAddressError}")
	public AspireWebElement jcrewStreetAddressError();
	
	@CssSelector("${pages.jcrew.jcrewCityError}")
	public AspireWebElement jcrewCityError();
	
	@CssSelector("${pages.jcrew.jcrewPostalCodeError}")
	public AspireWebElement jcrewPostalCodeError();
	
	@CssSelector("${pages.jcrew.jcrewPhoneNumberError}")
	public AspireWebElement jcrewPhoneNumberError();
			
	@CssSelector("${pages.jcrew.jcrewFirstName}")
	public AspireWebElement jcrewFirstName();		
			
	@CssSelector("${pages.jcrew.jcrewLastName}")
	public AspireWebElement jcrewLastName();		
			
	@CssSelector("${pages.jcrew.jcrewStreetAddress}")
	public AspireWebElement jcrewStreetAddress();	
	
	@CssSelector("${pages.jcrew.jcrewCity}")
	public AspireWebElement jcrewCity();
	
	@CssSelector("${pages.jcrew.jcrewPostalCode}")
	public AspireWebElement jcrewPostalCode();
	
	@CssSelector("${pages.jcrew.jcrewPhoneNumber}")
	public AspireWebElement jcrewPhoneNumber();
	
	@CssSelector("${pages.jcrew.jcrewCheckYourAddressDialog}")
	public AspireWebElement jcrewCheckYourAddressDialog();
	
	@CssSelector("${pages.jcrew.jcrewUseAddressAsEntered}")
	public AspireWebElement jcrewUseAddressAsEntered();
	
	@CssSelector("${pages.jcrew.jcrewShippingContinueButton}")
	public AspireWebElement jcrewShippingContinueButton();
	
	@CssSelector("${pages.jcrew.jcrewCheckoutBillingPage}")
	public AspireWebElement jcrewCheckoutBillingPage();
	
	@CssSelector("${pages.jcrew.jcrewBillingContinueButton}")
	public AspireWebElement jcrewBillingContinueButton();
	
	@CssSelector("${pages.jcrew.jcrewCardNumberError}")
	public AspireWebElement jcrewCardNumberError();
	
	@CssSelector("${pages.jcrew.jcrewSecurityCodeError}")
	public AspireWebElement jcrewSecurityCodeError();
	
	@CssSelector("${pages.jcrew.jcrewExpirationDateError}")
	public AspireWebElement jcrewExpirationDateError();
	
	@CssSelector("${pages.jcrew.jcrewNameOnCardError}")
	public AspireWebElement jcrewNameOnCardError();
	
	@CssSelector("${pages.jcrew.jcrewEmailAddressError}")
	public AspireWebElement jcrewEmailAddressError();
	
	@CssSelector("${pages.jcrew.jcrewCardNumber}")
	public AspireWebElement jcrewCardNumber();
	
	@CssSelector("${pages.jcrew.jcrewSecurityCode}")
	public AspireWebElement jcrewSecurityCode();
	
	@CssSelector("${pages.jcrew.jcrewExpirationMonth}")
	public AspireWebElement jcrewExpirationMonth();
	
	@CssSelector("${pages.jcrew.jcrewExpirationYear}")
	public AspireWebElement jcrewExpirationYear();
	
	@CssSelector("${pages.jcrew.jcrewNameOnCard}")
	public AspireWebElement jcrewNameOnCard();
	
	@CssSelector("${pages.jcrew.jcrewEmailAddress}")
	public AspireWebElement jcrewEmailAddress();
	
	@CssSelector("${pages.jcrew.jcrewCheckoutReviewPage}")
	public AspireWebElement jcrewCheckoutReviewPage();
	
	@CssSelector("${pages.jcrew.jcrewPlaceMyOrder}")
	public AspireWebElement jcrewPlaceMyOrder();
	
	@CssSelector("${pages.jcrew.jcrewSubmitError}")
	public AspireWebElement jcrewSubmitError();
	
	
	
	
	
}
