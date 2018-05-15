package com.aspire.bf.pages;

import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;

@Page(name = "bcbg", url = "${pages.bcbg.bcbgUrl}")
public interface BcbgPage {

	@CssSelector("${pages.bcbg.bcbgTopNavStore}")
	public AspireWebElements bcbgTopNavStore();
	
	@CssSelector("${pages.bcbg.bcbgEmailDialog}")
	public AspireWebElement bcbgEmailDialog();
	
	@CssSelector("${pages.bcbg.bcbgEmailDialogClose}")
	public AspireWebElement bcbgEmailDialogClose();
	
	@CssSelector("${pages.bcbg.bcbgProducts}")
	public AspireWebElements bcbgProducts();
	
	@CssSelector("${pages.bcbg.bcbgProductName}")
	public AspireWebElement bcbgProductName();
	
	@CssSelector("${pages.bcbg.bcbgProductPrice}")
	public AspireWebElement bcbgProductPrice();
	
	@CssSelector("${pages.bcbg.bcbgProductImage}")
	public AspireWebElement bcbgProductImage();
	
	@CssSelector("${pages.bcbg.bcbgQuickView}")
	public AspireWebElement bcbgQuickView();
	
	@CssSelector("${pages.bcbg.bcbgQuickViewDialog}")
	public AspireWebElement bcbgQuickViewDialog();
	
	@CssSelector("${pages.bcbg.bcbgQuickViewName}")
	public AspireWebElement bcbgQuickViewName();
	
	@CssSelector("${pages.bcbg.bcbgQuickViewPrice}")
	public AspireWebElement bcbgQuickViewPrice();
	
	@CssSelector("${pages.bcbg.bcbgQuickViewImage}")
	public AspireWebElement bcbgQuickViewImage();
	
	@CssSelector("${pages.bcbg.bcbgViewFullDetails}")
	public AspireWebElement bcbgViewFullDetails();
	
	@CssSelector("${pages.bcbg.bcbgPdp}")
	public AspireWebElement bcbgPdp();
	
	@CssSelector("${pages.bcbg.bcbgPdpName}")
	public AspireWebElement bcbgPdpName();
	
	@CssSelector("${pages.bcbg.bcbgPdpPrice}")
	public AspireWebElement bcbgPdpPrice();
	
	@CssSelector("${pages.bcbg.bcbgPdpImage}")
	public AspireWebElement bcbgPdpImage();
	
	@CssSelector("${pages.bcbg.bcbgColor}")
	public AspireWebElements bcbgColor();
	
	@CssSelector("${pages.bcbg.bcbgSizes}")
	public AspireWebElement bcbgSizes();
	
	@CssSelector("${pages.bcbg.bcbgAddToBag}")
	public AspireWebElement bcbgAddToBag();
	
	@CssSelector("${pages.bcbg.bcbgCartDialog}")
	public AspireWebElement bcbgCartDialog();
	
	@CssSelector("${pages.bcbg.bcbgCartName}")
	public AspireWebElement bcbgCartName();
	
	@CssSelector("${pages.bcbg.bcbgCartPrice}")
	public AspireWebElement bcbgCartPrice();
	
	@CssSelector("${pages.bcbg.bcbgCartClose}")
	public AspireWebElement bcbgCartClose();
	
	@CssSelector("${pages.bcbg.bcbgViewShoppingBag}")
	public AspireWebElement bcbgViewShoppingBag();
	
	@CssSelector("${pages.bcbg.bcbgCartPage}")
	public AspireWebElement bcbgCartPage();
	
	@CssSelector("${pages.bcbg.bcbgQty}")
	public AspireWebElement bcbgQty();
	
	@CssSelector("${pages.bcbg.bcbgCartItemOnePrice}")
	public AspireWebElement bcbgCartItemOnePrice();
	
	@CssSelector("${pages.bcbg.bcbgCartItemTwoPrice}")
	public AspireWebElement bcbgCartItemTwoPrice();
	
	@CssSelector("${pages.bcbg.bcbgCartItemTotalPrice}")
	public AspireWebElement bcbgCartItemTotalPrice();
	
	@CssSelector("${pages.bcbg.bcbgProceedToPurchase}")
	public AspireWebElement bcbgProceedToPurchase();
	
	@CssSelector("${pages.bcbg.bcbgGuestCheckout}")
	public AspireWebElement bcbgGuestCheckout();
	
	@CssSelector("${pages.bcbg.bcbgGuestContinue}")
	public AspireWebElement bcbgGuestContinue();
	
	@CssSelector("${pages.bcbg.bcbgCheckoutShipping}")
	public AspireWebElement bcbgCheckoutShipping();
	
	@CssSelector("${pages.bcbg.bcbgShippingContinue}")
	public AspireWebElement bcbgShippingContinue();
	
	@CssSelector("${pages.bcbg.bcbgErrores}")
	public AspireWebElements bcbgErrores();
	
	@CssSelector("${pages.bcbg.bcbgFirstName}")
	public AspireWebElement bcbgFirstName();
	
	@CssSelector("${pages.bcbg.bcbgLastName}")
	public AspireWebElement bcbgLastName();
	
	@CssSelector("${pages.bcbg.bcbgAddress}")
	public AspireWebElement bcbgAddress();
	
	@CssSelector("${pages.bcbg.bcbgCity}")
	public AspireWebElement bcbgCity();
	
	@CssSelector("${pages.bcbg.bcbgPhoneNumber}")
	public AspireWebElement bcbgPhoneNumber();
	
	@CssSelector("${pages.bcbg.bcbgBilling}")
	public AspireWebElement bcbgBilling();
	
	@CssSelector("${pages.bcbg.bcbgBillingContinue}")
	public AspireWebElement bcbgBillingContinue();
	
	@CssSelector("${pages.bcbg.bcbgEmail}")
	public AspireWebElement bcbgEmail();
	
	@CssSelector("${pages.bcbg.bcbgNameOnCard}")
	public AspireWebElement bcbgNameOnCard();
	
	@CssSelector("${pages.bcbg.bcbgCardType}")
	public AspireWebElement bcbgCardType();
	
	@CssSelector("${pages.bcbg.bcbgCardNumber}")
	public AspireWebElement bcbgCardNumber();
	
	@CssSelector("${pages.bcbg.bcbgMonth}")
	public AspireWebElement bcbgMonth();
	
	@CssSelector("${pages.bcbg.bcbgYear}")
	public AspireWebElement bcbgYear();
	
	@CssSelector("${pages.bcbg.bcbgCardSecurityCode}")
	public AspireWebElement bcbgCardSecurityCode();
	
	@CssSelector("${pages.bcbg.bcbgSummary}")
	public AspireWebElement bcbgSummary();
	
	@CssSelector("${pages.bcbg.bcbgSubmitOrder}")
	public AspireWebElement bcbgSubmitOrder();
	
	@CssSelector("${pages.bcbg.bcbgSubmitError}")
	public AspireWebElement bcbgSubmitError();
	
	
	
	
	
	
}
