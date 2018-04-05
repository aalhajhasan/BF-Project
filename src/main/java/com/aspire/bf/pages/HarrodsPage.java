package com.aspire.bf.pages;


import com.aspire.automation.web.util.AspireWebElement;
import com.aspire.automation.web.util.AspireWebElements;
import com.aspire.automation.web.util.annotation.CssSelector;
import com.aspire.automation.web.util.annotation.Page;


@Page(name = "harrods", url = "${pages.harrods.harrodsurl}")
public interface HarrodsPage {

	@CssSelector("${pages.harrods.harrodsTopNavStore}")
	public AspireWebElements harrodsTopNavStore();
	
	@CssSelector("${pages.harrods.harrodsSales}")
	public AspireWebElements harrodsSales();
	
	@CssSelector("${pages.harrods.harrodsProducts}")
	public AspireWebElements harrodsProducts();
	
	@CssSelector("${pages.harrods.harrodsProductName}")
	public AspireWebElement harrodsProductName();
	
	@CssSelector("${pages.harrods.harrodsProductPrice}")
	public AspireWebElement harrodsProductPrice();
	
	@CssSelector("${pages.harrods.harrodsQuickView}")
	public AspireWebElement harrodsQuickView();
	
	@CssSelector("${pages.harrods.harrodsQuickViewDialog}")
	public AspireWebElement harrodsQuickViewDialog();
	
	@CssSelector("${pages.harrods.harrodsQuickViewProductName}")
	public AspireWebElement harrodsQuickViewProductName();
	
	@CssSelector("${pages.harrods.harrodsQuickViewProductPrice}")
	public AspireWebElement harrodsQuickViewProductPrice();
	
	@CssSelector("${pages.harrods.harrodsFullDetails}")
	public AspireWebElement harrodsFullDetails();
	
	@CssSelector("${pages.harrods.harrodsProductPage}")
	public AspireWebElement harrodsProductPage();
	
	@CssSelector("${pages.harrods.harrodsPdpProductPrice}")
	public AspireWebElement harrodsPdpProductPrice();
	
	@CssSelector("${pages.harrods.harrodsPdpProductName}")
	public AspireWebElement harrodsPdpProductName();
	
	@CssSelector("${pages.harrods.harrodsAddToBagButton}")
	public AspireWebElement harrodsAddToBagButton();
	
	@CssSelector("${pages.harrods.harrodsBagPage}")
	public AspireWebElement harrodsBagPage();
	
	@CssSelector("${pages.harrods.harrodsBagProductPrice}")
	public AspireWebElement harrodsBagProductPrice();
	
	@CssSelector("${pages.harrods.harrodsViewYourBag}")
	public AspireWebElement harrodsViewYourBag();
	
	@CssSelector("${pages.harrods.harrodsBagProductName}")
	public AspireWebElement harrodsBagProductName();
	
	@CssSelector("${pages.harrods.harrodsBagQTY}")
	public AspireWebElement harrodsBagQTY();
	
	@CssSelector("${pages.harrods.harrodsQuickAddToBagButton}")
	public AspireWebElement harrodsQuickAddToBagButton();
	
	@CssSelector("${pages.harrods.harrodsBagIcon}")
	public AspireWebElement harrodsBagIcon();
	
	@CssSelector("${pages.harrods.harrodsBagViewYourBag}")
	public AspireWebElement harrodsBagViewYourBag();
	
	@CssSelector("${pages.harrods.harrodsBagProductOnePrice}")
	public AspireWebElement harrodsBagProductOnePrice();
	
	@CssSelector("${pages.harrods.harrodsBagProductTwoPrice}")
	public AspireWebElement harrodsBagProductTwoPrice();
	
	@CssSelector("${pages.harrods.harrodsBagSubTotalPrice}")
	public AspireWebElement harrodsBagSubTotalPrice();
	
	@CssSelector("${pages.harrods.harrodsSecureCheckoutNow}")
	public AspireWebElement harrodsSecureCheckoutNow();
	
	@CssSelector("${pages.harrods.harrodsStartCheckoutPage}")
	public AspireWebElement harrodsStartCheckoutPage();
	
	@CssSelector("${pages.harrods.harrodsNewCustomerButton}")
	public AspireWebElement harrodsNewCustomerButton();
	
	@CssSelector("${pages.harrods.harrodsDetailsCheckoutPage}")
	public AspireWebElement harrodsDetailsCheckoutPage();
	
	@CssSelector("${pages.harrods.harrodsContinueToDeliveryButton}")
	public AspireWebElement harrodsContinueToDeliveryButton();
	
	@CssSelector("${pages.harrods.harrodsDetailsTitleError}")
	public AspireWebElement harrodsDetailsTitleError();
	
	@CssSelector("${pages.harrods.harrodsDetailsFirstNameError}")
	public AspireWebElement harrodsDetailsFirstNameError();
	
	@CssSelector("${pages.harrods.harrodsDetailsLastNameError}")
	public AspireWebElement harrodsDetailsLastNameError();
	
	@CssSelector("${pages.harrods.harrodsDetailsContactNumberError}")
	public AspireWebElement harrodsDetailsContactNumberError();
	
	@CssSelector("${pages.harrods.harrodsDetailsEmailAddressError}")
	public AspireWebElement harrodsDetailsEmailAddressError();
	
	@CssSelector("${pages.harrods.harrodsDetailsTitle}")
	public AspireWebElement harrodsDetailsTitle();
	
	@CssSelector("${pages.harrods.harrodsDetailsFirstNameSection}")
	public AspireWebElement harrodsDetailsFirstNameSection();
	
	@CssSelector("${pages.harrods.harrodsDetailsLastNameSection}")
	public AspireWebElement harrodsDetailsLastNameSection();
	
	@CssSelector("${pages.harrods.harrodsDetailsContactNumberSection}")
	public AspireWebElement harrodsDetailsContactNumberSection();
	
	@CssSelector("${pages.harrods.harrodsDetailsEmailAddressSection}")
	public AspireWebElement harrodsDetailsEmailAddressSection();
	
	@CssSelector("${pages.harrods.harrodsDeliveryCheckoutPage}")
	public AspireWebElement harrodsDeliveryCheckoutPage();
	
	@CssSelector("${pages.harrods.harrodsContinueToPaymentButton}")
	public AspireWebElement harrodsContinueToPaymentButton();
	
	@CssSelector("${pages.harrods.harrodsDeliveryAddressError}")
	public AspireWebElement harrodsDeliveryAddressError();
	
	@CssSelector("${pages.harrods.harrodsDeliveryCityError}")
	public AspireWebElement harrodsDeliveryCityError();
	
	@CssSelector("${pages.harrods.harrodsDeliveryAddressSection}")
	public AspireWebElement harrodsDeliveryAddressSection();
	
	@CssSelector("${pages.harrods.harrodsDeliveryCitySection}")
	public AspireWebElement harrodsDeliveryCitySection();
	
	@CssSelector("${pages.harrods.harrodsDeliveryStateSection}")
	public AspireWebElement harrodsDeliveryStateSection();
	
	@CssSelector("${pages.harrods.harrodsDeliveryZipCodeSection}")
	public AspireWebElement harrodsDeliveryZipCodeSection();
	
	@CssSelector("${pages.harrods.harrodsPaymentCheckoutPage}")
	public AspireWebElement harrodsPaymentCheckoutPage();
	
	@CssSelector("${pages.harrods.harrodsPaySecurelyNowButton}")
	public AspireWebElement harrodsPaySecurelyNowButton();
	
	@CssSelector("${pages.harrods.harrodsPaymentCardTypeError}")
	public AspireWebElement harrodsPaymentCardTypeError();
	
	@CssSelector("${pages.harrods.harrodsPaymentCardNumberError}")
	public AspireWebElement harrodsPaymentCardNumberError();
	
	@CssSelector("${pages.harrods.harrodsPaymentExpireDateError}")
	public AspireWebElement harrodsPaymentExpireDateError();
	
	@CssSelector("${pages.harrods.harrodsPaymentSecurityCodeError}")
	public AspireWebElement harrodsPaymentSecurityCodeError();
	
	@CssSelector("${pages.harrods.harrodsPaymentCardType}")
	public AspireWebElement harrodsPaymentCardType();
	
	@CssSelector("${pages.harrods.harrodsPaymentCardNumberSection}")
	public AspireWebElement harrodsPaymentCardNumberSection();
	
	@CssSelector("${pages.harrods.harrodsPaymentExpireMonth}")
	public AspireWebElement harrodsPaymentExpireMonth();
	
	@CssSelector("${pages.harrods.harrodsPaymentExpireYear}")
	public AspireWebElement harrodsPaymentExpireYear();
	
	@CssSelector("${pages.harrods.harrodsPaymentSecurityCodeSection}")
	public AspireWebElement harrodsPaymentSecurityCodeSection();
	
	@CssSelector("${pages.harrods.harrodsPaymentNameOnCardError}")
	public AspireWebElement harrodsPaymentNameOnCardError();
	
	@CssSelector("${pages.harrods.harrodsPaymentNameOnCardSection}")
	public AspireWebElement harrodsPaymentNameOnCardSection();
	
	@CssSelector("${pages.harrods.harrodsSubmitErrorMessage}")
	public AspireWebElement harrodsSubmitErrorMessage();
	
	@CssSelector("${pages.harrods.harrodsAddedButton}")
	public AspireWebElement harrodsAddedButton();
	
	@CssSelector("${pages.harrods.harrodsMoreThanOneQTY}")
	public AspireWebElements harrodsMoreThanOneQTY();
	
	@CssSelector("${pages.harrods.harrodsQuickViewImage}")
	public AspireWebElement harrodsQuickViewImage();
	
	@CssSelector("${pages.harrods.harrodsPdpImage}")
	public AspireWebElement harrodsPdpImage();
	
	@CssSelector("${pages.harrods.harrodsCheckoutItemsSubtotal}")
	public AspireWebElement harrodsCheckoutItemsSubtotal();
	
	@CssSelector("${pages.harrods.harrodsCheckoutExcludingUKTaxes}")
	public AspireWebElement harrodsCheckoutExcludingUKTaxes();
	
	@CssSelector("${pages.harrods.harrodsCheckoutLocalTaxes}")
	public AspireWebElement harrodsCheckoutLocalTaxes();
	
	@CssSelector("${pages.harrods.harrodsCheckoutImportDuties}")
	public AspireWebElement harrodsCheckoutImportDuties();
	
	@CssSelector("${pages.harrods.harrodsCheckoutDeliveryCharge}")
	public AspireWebElement harrodsCheckoutDeliveryCharge();
	
	@CssSelector("${pages.harrods.harrodsCheckoutTotalToPay}")
	public AspireWebElement harrodsCheckoutTotalToPay();
	
	
	
	
	
	
}
