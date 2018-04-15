package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.IDSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "underarmour", url = "${pages.underarmour.underarmoururl}")

public interface UnderarmourPage {

	@CssSelector("${pages.underarmour.underarmourWelcomeMat}")
	public AspireWebElement underarmourWelcomeMat();
	
	@CssSelector("${pages.underarmour.underarmourWelcomeMatClose}")
	public AspireWebElement underarmourWelcomeMatClose();
	
	@CssSelector("${pages.underarmour.underarmourTopNav}")
	public AspireWebElements underarmourTopNav();
	
	@CssSelector("${pages.underarmour.underarmourCountryDialog}")
	public AspireWebElement underarmourCountryDialog();
	
	@CssSelector("${pages.underarmour.underarmourCountryClose}")
	public AspireWebElement underarmourCountryClose();
	
	@CssSelector("${pages.underarmour.underarmourNewArrivalsSection}")
	public AspireWebElement underarmourNewArrivalsSection();
	
	@CssSelector("${pages.underarmour.underarmourNewArrivalsCategory}")
	public AspireWebElements underarmourNewArrivalsCategory();
	
	@CssSelector("${pages.underarmour.underarmourPlp}")
	public AspireWebElement underarmourPlp();
	
	@CssSelector("${pages.underarmour.underarmourPlpItems}")
	public AspireWebElements underarmourPlpItems();
	
	@CssSelector("${pages.underarmour.underarmourPlpItemName}")
	public AspireWebElement underarmourPlpItemName();
	
	@CssSelector("${pages.underarmour.underarmourPlpItemPrice}")
	public AspireWebElement underarmourPlpItemPrice();
	
	@CssSelector("${pages.underarmour.underarmourPlpItemImage}")
	public AspireWebElement underarmourPlpItemImage();
	
	@CssSelector("${pages.underarmour.underarmourPlpItemQuickView}")
	public AspireWebElement underarmourPlpItemQuickView();
	
	@CssSelector("${pages.underarmour.underarmourPdpItemPage}")
	public AspireWebElement underarmourPdpItemPage();
	
	@CssSelector("${pages.underarmour.underarmourPdpItemName}")
	public AspireWebElement underarmourPdpItemName();
	
	@CssSelector("${pages.underarmour.underarmourPdpItemPrice}")
	public AspireWebElement underarmourPdpItemPrice();
	
	@CssSelector("${pages.underarmour.underarmourPdpItemImage}")
	public AspireWebElement underarmourPdpItemImage();
	
	@CssSelector("${pages.underarmour.underarmourItemColors}")
	public AspireWebElements underarmourItemColors();
	
	@CssSelector("${pages.underarmour.underarmourItemSizes}")
	public AspireWebElements underarmourItemSizes();
	
	@CssSelector("${pages.underarmour.underarmourAddToBag}")
	public AspireWebElement underarmourAddToBag();
	
	@CssSelector("${pages.underarmour.underarmourBagDialog}")
	public AspireWebElement underarmourBagDialog();
	
	@CssSelector("${pages.underarmour.underarmourBagItemName}")
	public AspireWebElement underarmourBagItemName();
	
	@CssSelector("${pages.underarmour.underarmourBagItemPrice}")
	public AspireWebElement underarmourBagItemPrice();
	
	@CssSelector("${pages.underarmour.underarmourBagAndCheckout}")
	public AspireWebElement underarmourBagAndCheckout();
	
	@CssSelector("${pages.underarmour.underarmourBagPage}")
	public AspireWebElement underarmourBagPage();
	
	@CssSelector("${pages.underarmour.underarmourQuantity}")
	public AspireWebElement underarmourQuantity();
	
	@CssSelector("${pages.underarmour.underarmourBagItemPriceAfter}")
	public AspireWebElement underarmourBagItemPriceAfter();
	
	@CssSelector("${pages.underarmour.underarmourBagItemOnePrice}")
	public AspireWebElement underarmourBagItemOnePrice();
	
	@CssSelector("${pages.underarmour.underarmourBagItemTwoPrice}")
	public AspireWebElement underarmourBagItemTwoPrice();
	
	@CssSelector("${pages.underarmour.underarmourBagItemsTotalPrice}")
	public AspireWebElement underarmourBagItemsTotalPrice();
	
	@CssSelector("${pages.underarmour.underarmourProceedToCheckout}")
	public AspireWebElement underarmourProceedToCheckout();
	
	@IDSelector("${pages.underarmour.underarmourDeliveryCheckout}")
	public AspireWebElement underarmourDeliveryCheckout();
	
	@IDSelector("${pages.underarmour.underarmourCheckoutContinue}")
	public AspireWebElement underarmourCheckoutContinue();
	
	@CssSelector("${pages.underarmour.underarmourDeliveryEmailAddressError}")
	public AspireWebElement underarmourDeliveryEmailAddressError();
	
	@CssSelector("${pages.underarmour.underarmourDeliveryFirstNameError}")
	public AspireWebElement underarmourDeliveryFirstNameError();
	
	@CssSelector("${pages.underarmour.underarmourDeliveryLastNameError}")
	public AspireWebElement underarmourDeliveryLastNameError();
	
	@CssSelector("${pages.underarmour.underarmourDeliveryAddressError}")
	public AspireWebElement underarmourDeliveryAddressError();
	
	@CssSelector("${pages.underarmour.underarmourDeliveryCityError}")
	public AspireWebElement underarmourDeliveryCityError();
	
	@CssSelector("${pages.underarmour.underarmourDeliveryPhoneNumberError}")
	public AspireWebElement underarmourDeliveryPhoneNumberError();
	
	@IDSelector("${pages.underarmour.underarmourDeliveryFirstName}")
	public AspireWebElement underarmourDeliveryFirstName();
	
	@IDSelector("${pages.underarmour.underarmourDeliveryLastName}")
	public AspireWebElement underarmourDeliveryLastName();
	
	@IDSelector("${pages.underarmour.underarmourDeliveryAddress}")
	public AspireWebElement underarmourDeliveryAddress();
	
	@IDSelector("${pages.underarmour.underarmourDeliveryCity}")
	public AspireWebElement underarmourDeliveryCity();
	
	@IDSelector("${pages.underarmour.underarmourDeliveryZipCode}")
	public AspireWebElement underarmourDeliveryZipCode();
	
	@IDSelector("${pages.underarmour.underarmourDeliveryPhoneNumber}")
	public AspireWebElement underarmourDeliveryPhoneNumber();
	
	@IDSelector("${pages.underarmour.underarmourDeliveryEmailAddress}")
	public AspireWebElement underarmourDeliveryEmailAddress();
	
	@IDSelector("${pages.underarmour.underarmourPaymentSection}")
	public AspireWebElement underarmourPaymentSection();
	
	@IDSelector("${pages.underarmour.underarmourPalceOrderButton}")
	public AspireWebElement underarmourPalceOrderButton();
	
	@CssSelector("${pages.underarmour.underarmourPaymentCardNumberError}")
	public AspireWebElement underarmourPaymentCardNumberError();
	
	@CssSelector("${pages.underarmour.underarmourPaymentExpirationDateError}")
	public AspireWebElement underarmourPaymentExpirationDateError();
	
	@CssSelector("${pages.underarmour.underarmourPaymentSecurityCodeError}")
	public AspireWebElement underarmourPaymentSecurityCodeError();
	
	@IDSelector("${pages.underarmour.underarmourPaymentCardNumber}")
	public AspireWebElement underarmourPaymentCardNumber();
	
	@IDSelector("${pages.underarmour.underarmourPaymentExpirationDate}")
	public AspireWebElement underarmourPaymentExpirationDate();
	
	@IDSelector("${pages.underarmour.underarmourPaymentSecurityCode}")
	public AspireWebElement underarmourPaymentSecurityCode();
	
	@CssSelector("${pages.underarmour.underarmourSubmitError}")
	public AspireWebElement underarmourSubmitError();
	
	@CssSelector("${pages.underarmour.underarmourItemsTotal}")
	public AspireWebElement underarmourItemsTotal();
	
	@CssSelector("${pages.underarmour.underarmourShipping}")
	public AspireWebElement underarmourShipping();
	
	@CssSelector("${pages.underarmour.underarmourDutiesAndTaxes}")
	public AspireWebElement underarmourDutiesAndTaxes();
	
	@CssSelector("${pages.underarmour.underarmourOrderTotal}")
	public AspireWebElement underarmourOrderTotal();
	
	@IDSelector("${pages.underarmour.underarmourFeedBackDialog}")
	public AspireWebElement underarmourFeedBackDialog();
	
	@IDSelector("${pages.underarmour.underarmourFeedBackDialogCloseButton}")
	public AspireWebElement underarmourFeedBackDialogCloseButton();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
