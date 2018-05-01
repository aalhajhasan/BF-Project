package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "lordandtaylor", url = "${pages.lordandtaylor.lordandtaylorurl}")
public interface LordandtaylorPage {

	
	@CssSelector("${pages.lordandtaylor.lordandtaylorWelcomeMat}")
	public AspireWebElement lordandtaylorWelcomeMat();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorWelcomeMatContinue}")
	public AspireWebElement lordandtaylorWelcomeMatContinue();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorTopNav}")
	public AspireWebElements lordandtaylorTopNav();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProducts}")
	public AspireWebElements lordandtaylorProducts();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductName}")
	public AspireWebElement lordandtaylorProductName();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductPrice}")
	public AspireWebElement lordandtaylorProductPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPreviewThisProductIcon}")
	public AspireWebElement lordandtaylorPreviewThisProductIcon();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuickViewDialog}")
	public AspireWebElement lordandtaylorQuickViewDialog();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpPrice}")
	public AspireWebElement lordandtaylorPdpPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuickViewProductName}")
	public AspireWebElement lordandtaylorQuickViewProductName();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuickViewProductPrice}")
	public AspireWebElement lordandtaylorQuickViewProductPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuickViewImage}")
	public AspireWebElement lordandtaylorQuickViewImage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductImage}")
	public AspireWebElement lordandtaylorProductImage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorViewProductDetail}")
	public AspireWebElement lordandtaylorViewProductDetail();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpProductPage}")
	public AspireWebElement lordandtaylorPdpProductPage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpImage}")
	public AspireWebElement lordandtaylorPdpImage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpProductPrice}")
	public AspireWebElement lordandtaylorPdpProductPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPdpProductName}")
	public AspireWebElement lordandtaylorPdpProductName();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorColor}")
	public AspireWebElements lordandtaylorColor();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorSku}")
	public AspireWebElements lordandtaylorSku();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorAddToBagButton}")
	public AspireWebElement lordandtaylorAddToBagButton();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorShoppingBag}")
	public AspireWebElement lordandtaylorShoppingBag();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorBagProductPrice}")
	public AspireWebElement lordandtaylorBagProductPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorViewMyBag}")
	public AspireWebElement lordandtaylorViewMyBag();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorBagPage}")
	public AspireWebElement lordandtaylorBagPage();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorEditLink}")
	public AspireWebElement lordandtaylorEditLink();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorEditDialog}")
	public AspireWebElement lordandtaylorEditDialog();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorQuantity}")
	public AspireWebElement lordandtaylorQuantity();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorApplyButton}")
	public AspireWebElement lordandtaylorApplyButton();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductOnePrice}")
	public AspireWebElement lordandtaylorProductOnePrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductTwoPrice}")
	public AspireWebElement lordandtaylorProductTwoPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorProductTotalPrice}")
	public AspireWebElement lordandtaylorProductTotalPrice();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCheckoutButton}")
	public AspireWebElement lordandtaylorCheckoutButton();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCheckoutDialog}")
	public AspireWebElement lordandtaylorCheckoutDialog();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCheckoutAsGuest}")
	public AspireWebElement lordandtaylorCheckoutAsGuest();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorBagPageError}")
	public AspireWebElement lordandtaylorBagPageError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorRemoveLink}")
	public AspireWebElements lordandtaylorRemoveLink();
	 
	@CssSelector("${pages.lordandtaylor.lordandtaylorRemoveLinkConfirm}")
	public AspireWebElement lordandtaylorRemoveLinkConfirm();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorItems}")
	public AspireWebElement lordandtaylorItems();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorValidPdp}")
	public AspireWebElements lordandtaylorValidPdp();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorContinueCheckout}")
	public AspireWebElement lordandtaylorContinueCheckout();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorFirstNameError}")
	public AspireWebElement lordandtaylorFirstNameError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorLastNameError}")
	public AspireWebElement lordandtaylorLastNameError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorAddressError}")
	public AspireWebElement lordandtaylorAddressError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCityError}")
	public AspireWebElement lordandtaylorCityError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorEmailError}")
	public AspireWebElement lordandtaylorEmailError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPhoneError}")
	public AspireWebElement lordandtaylorPhoneError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorFirstName}")
	public AspireWebElement lordandtaylorFirstName();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorLastName}")
	public AspireWebElement lordandtaylorLastName();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorAddress}")
	public AspireWebElement lordandtaylorAddress();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCity}")
	public AspireWebElement lordandtaylorCity();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorEmail}")
	public AspireWebElement lordandtaylorEmail();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPhone}")
	public AspireWebElement lordandtaylorPhone();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPaymentContinueCheckout}")
	public AspireWebElement lordandtaylorPaymentContinueCheckout();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCreditCardError}")
	public AspireWebElement lordandtaylorCreditCardError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorNameOnCardError}")
	public AspireWebElement lordandtaylorNameOnCardError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorExpirationError}")
	public AspireWebElement lordandtaylorExpirationError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorSecurityCodeError}")
	public AspireWebElement lordandtaylorSecurityCodeError();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorCreditCard}")
	public AspireWebElement lordandtaylorCreditCard();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorNameOnCard}")
	public AspireWebElement lordandtaylorNameOnCard();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorSecurityCode}")
	public AspireWebElement lordandtaylorSecurityCode();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorExpirationMonth}")
	public AspireWebElement lordandtaylorExpirationMonth();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorExpirationYear}")
	public AspireWebElement lordandtaylorExpirationYear();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorSecurityNumber}")
	public AspireWebElement lordandtaylorSecurityNumber();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorPlaceOrder}")
	public AspireWebElement lordandtaylorPlaceOrder();
	
	@CssSelector("${pages.lordandtaylor.lordandtaylorSubmitError}")
	public AspireWebElement lordandtaylorSubmitError();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
