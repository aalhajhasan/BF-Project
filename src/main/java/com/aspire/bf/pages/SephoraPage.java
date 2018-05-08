package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "sephora", url = "${pages.sephora.sephoraUrl}")

public interface SephoraPage {

	@CssSelector("${pages.sephora.sephoraTopNav}")
	public AspireWebElement sephoraTopNav();
	
	@CssSelector("${pages.sephora.sephoraProducts}")
	public AspireWebElements sephoraProducts();
	
	@CssSelector("${pages.sephora.sephoraProductName}")
	public AspireWebElement sephoraProductName();
	
	@CssSelector("${pages.sephora.sephoraProductPrice}")
	public AspireWebElement sephoraProductPrice();
	
	@CssSelector("${pages.sephora.sephoraProductImage}")
	public AspireWebElement sephoraProductImage();
	
	@CssSelector("${pages.sephora.sephoraProductQickLook}")
	public AspireWebElement sephoraProductQickLook();
	
	@CssSelector("${pages.sephora.sephoraQickLook}")
	public AspireWebElement sephoraQickLook();
	
	@CssSelector("${pages.sephora.sephoraQickLookPrice}")
	public AspireWebElement sephoraQickLookPrice();
	
	@CssSelector("${pages.sephora.sephoraQickLookName}")
	public AspireWebElement sephoraQickLookName();
	
	@CssSelector("${pages.sephora.sephoraQickLookImage}")
	public AspireWebElement sephoraQickLookImage();
	
	@CssSelector("${pages.sephora.sephoraProductDetails}")
	public AspireWebElement sephoraProductDetails();
	
	@CssSelector("${pages.sephora.sephoraPdp}")
	public AspireWebElement sephoraPdp();
	
	@CssSelector("${pages.sephora.sephoraPdpName}")
	public AspireWebElement sephoraPdpName();
	
	@CssSelector("${pages.sephora.sephoraPdpPrice}")
	public AspireWebElement sephoraPdpPrice();
	
	@CssSelector("${pages.sephora.sephoraPdpImage}")
	public AspireWebElement sephoraPdpImage();
	
	@CssSelector("${pages.sephora.sephoraSales}")
	public AspireWebElements sephoraSales();
	
	@CssSelector("${pages.sephora.sephoraAddToBasket}")
	public AspireWebElement sephoraAddToBasket();
	
	@CssSelector("${pages.sephora.sephoraBasketDialog}")
	public AspireWebElement sephoraBasketDialog();
	
	@CssSelector("${pages.sephora.sephoraBasketName}")
	public AspireWebElement sephoraBasketName();
	
	@CssSelector("${pages.sephora.sephoraBasketPrice}")
	public AspireWebElement sephoraBasketPrice();
	
	@CssSelector("${pages.sephora.sephoraBasketIcon}")
	public AspireWebElement sephoraBasketIcon();
	
	@CssSelector("${pages.sephora.sephoraBasketCheckout}")
	public AspireWebElement sephoraBasketCheckout();
	
	@CssSelector("${pages.sephora.sephoraBasketPage}")
	public AspireWebElement sephoraBasketPage();
	
	@CssSelector("${pages.sephora.sephoraBasketQuantity}")
	public AspireWebElement sephoraBasketQuantity();
	
	@CssSelector("${pages.sephora.sephoraBasketPriceAfter}")
	public AspireWebElement sephoraBasketPriceAfter();
	
	@CssSelector("${pages.sephora.sephoraBasketItemOnePrice}")
	public AspireWebElement sephoraBasketItemOnePrice();
	
	@CssSelector("${pages.sephora.sephoraBasketItemTwoPrice}")
	public AspireWebElement sephoraBasketItemTwoPrice();
	
	@CssSelector("${pages.sephora.sephoraBasketItemsTotalPrice}")
	public AspireWebElement sephoraBasketItemsTotalPrice();
	
	@CssSelector("${pages.sephora.sephoraBasketPageCheckout}")
	public AspireWebElement sephoraBasketPageCheckout();
	
	@CssSelector("${pages.sephora.sephoraLoginDialog}")
	public AspireWebElement sephoraLoginDialog();
	
	@CssSelector("${pages.sephora.sephoraNewUser}")
	public AspireWebElement sephoraNewUser();
	
	@CssSelector("${pages.sephora.sephoraNewUserEmail}")
	public AspireWebElement sephoraNewUserEmail();
	
	@CssSelector("${pages.sephora.sephoraLoginContinue}")
	public AspireWebElement sephoraLoginContinue();
	
	@CssSelector("${pages.sephora.sephoraShippingSection}")
	public AspireWebElement sephoraShippingSection();
	
	@CssSelector("${pages.sephora.sephoraShippingContinue}")
	public AspireWebElement sephoraShippingContinue();
	
	@CssSelector("${pages.sephora.sephoraShippingFirstNameError}")
	public AspireWebElement sephoraShippingFirstNameError();
	
	@CssSelector("${pages.sephora.sephoraShippingLastNameError}")
	public AspireWebElement sephoraShippingLastNameError();
	
	@CssSelector("${pages.sephora.sephoraShippingStreetAddressError}")
	public AspireWebElement sephoraShippingStreetAddressError();
	
	@CssSelector("${pages.sephora.sephoraShippingPostalCodeError}")
	public AspireWebElement sephoraShippingPostalCodeError();
	
	@CssSelector("${pages.sephora.sephoraShippingPhoneError}")
	public AspireWebElement sephoraShippingPhoneError();
	
	@CssSelector("${pages.sephora.sephoraShippingFirstName}")
	public AspireWebElement sephoraShippingFirstName();
	
	@CssSelector("${pages.sephora.sephoraShippingLastName}")
	public AspireWebElement sephoraShippingLastName();
	
	@CssSelector("${pages.sephora.sephoraShippingStreetAddress}")
	public AspireWebElement sephoraShippingStreetAddress();
	
	@CssSelector("${pages.sephora.sephoraShippingPostalCode}")
	public AspireWebElement sephoraShippingPostalCode();
	
	@CssSelector("${pages.sephora.sephoraShippingPhone}")
	public AspireWebElement sephoraShippingPhone();
	
	@CssSelector("${pages.sephora.sephoraPaymentCardNumberError}")
	public AspireWebElement sephoraPaymentCardNumberError();
	
	@CssSelector("${pages.sephora.sephoraPaymentExpirationMonthError}")
	public AspireWebElement sephoraPaymentExpirationMonthError();
	
	@CssSelector("${pages.sephora.sephoraPaymentExpirationYearError}")
	public AspireWebElement sephoraPaymentExpirationYearError();
	
	@CssSelector("${pages.sephora.sephoraPaymentCreditCardSecurityError}")
	public AspireWebElement sephoraPaymentCreditCardSecurityError();
	
	@CssSelector("${pages.sephora.sephoraPaymentCardNumber}")
	public AspireWebElement sephoraPaymentCardNumber();
	
	@CssSelector("${pages.sephora.sephoraPaymentExpirationMonth}")
	public AspireWebElement sephoraPaymentExpirationMonth();
	
	@CssSelector("${pages.sephora.sephoraPaymentExpirationYear}")
	public AspireWebElement sephoraPaymentExpirationYear();
	
	@CssSelector("${pages.sephora.sephoraPaymentCreditCardSecurity}")
	public AspireWebElement sephoraPaymentCreditCardSecurity();
	
	@CssSelector("${pages.sephora.sephoraNewUserPassword}")
	public AspireWebElement sephoraNewUserPassword();
	
	@CssSelector("${pages.sephora.sephoraAddNewCreditCard}")
	public AspireWebElement sephoraAddNewCreditCard();
	
	@CssSelector("${pages.sephora.sephoraPlaceOrder}")
	public AspireWebElement sephoraPlaceOrder();
	 
	@CssSelector("${pages.sephora.sephoraSubmitErrorDialog}")
	public AspireWebElement sephoraSubmitErrorDialog();
	
	@CssSelector("${pages.sephora.sephoraSubmitDialog}")
	public AspireWebElement sephoraSubmitDialog();
	
	@CssSelector("${pages.sephora.sephoraEditShipping}")
	public AspireWebElement sephoraEditShipping();
	
	@CssSelector("${pages.sephora.sephoraRemoveShipping}")
	public AspireWebElement sephoraRemoveShipping();
	
	@CssSelector("${pages.sephora.sephoraRemoveShippingAddress}")
	public AspireWebElement sephoraRemoveShippingAddress();
	
	@CssSelector("${pages.sephora.sephoraRemovePayment}")
	public AspireWebElement sephoraRemovePayment();
	
	@CssSelector("${pages.sephora.sephoraRemovePaumentCard}")
	public AspireWebElement sephoraRemovePaumentCard();
	
	@CssSelector("${pages.sephora.sephoraLogo}")
	public AspireWebElement sephoraLogo();
	
	@CssSelector("${pages.sephora.sephoraRemoveFirstItem}")
	public AspireWebElement sephoraRemoveFirstItem();
	
	@CssSelector("${pages.sephora.sephoraRemoveSecondItem}")
	public AspireWebElement sephoraRemoveSecondItem();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
