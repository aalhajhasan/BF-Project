Meta:
@ReportName Harrods

Scenario:  TC06_Harrods_Verify_All_Checkout_Test_Cases

Given [1101-1080] harrodsBagPage should be displayed
When [1100-1300] User clicks on the harrodsSecureCheckoutNow
And [1111-1080] harrodsStartCheckoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the harrodsNewCustomerButton
And [1111-1080] harrodsDetailsCheckoutPage should be displayed, Within 120 seconds
!-- And [1101-1184] the user saves harrodsCheckoutItemsSubtotal text in scenario scope under name harrodsItemsSubtotal
!-- And [1101-1184] the user saves harrodsCheckoutExcludingUKTaxes text in scenario scope under name harrodsExcludingUKTaxes
!-- And [1101-1184] the user saves harrodsCheckoutLocalTaxes text in scenario scope under name harrodsLocalTaxes
!-- And [1101-1184] the user saves harrodsCheckoutImportDuties text in scenario scope under name harrodsImportDuties
!-- And [1101-1184] the user saves harrodsCheckoutDeliveryCharge text in scenario scope under name harrodsDeliveryCharge
!-- And [1101-1184] the user saves harrodsCheckoutTotalToPay text in scenario scope under name harrodsTotalToPay
!-- And [8001-0006] `harrodsTotalToPay` value should be equal to the sum of `harrodsItemsSubtotal` , `harrodsExcludingUKTaxes` , `harrodsLocalTaxes` , `harrodsImportDuties` and `harrodsDeliveryCharge`
And [1100-1300] User clicks on the harrodsContinueToDeliveryButton
And [1101-1102] harrodsDetailsTitleError text is equal to Please select a title case sensitive
And [1101-1102] harrodsDetailsFirstNameError text is equal to Please enter a first name case sensitive
And [1101-1102] harrodsDetailsLastNameError text is equal to Please enter a last name case sensitive
And [1101-1102] harrodsDetailsContactNumberError text is equal to A contact number is required case sensitive
And [1101-1102] harrodsDetailsEmailAddressError text is equal to Please enter your email address case sensitive
And [1100-1601] Select harrodsDetailsTitle By Value Mr
And [1100-1340] User fills harrodsDetailsFirstNameSection with `firstName`
And [1100-1340] User fills harrodsDetailsLastNameSection with `lastName`
And [1100-1340] User fills harrodsDetailsContactNumberSection with `contactNumber`
And [1100-1340] User fills harrodsDetailsEmailAddressSection with `emailAddress`
And [1100-1300] User clicks on the harrodsContinueToDeliveryButton
And [1111-1080] harrodsDeliveryCheckoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the harrodsContinueToPaymentButton
And [1101-1102] harrodsDeliveryAddressError text is equal to Please complete address line 1 case sensitive
And [1101-1102] harrodsDeliveryCityError text is equal to Please enter a Town/City case sensitive
And [1100-1340] User fills harrodsDeliveryAddressSection with `deliveryAddress`
And [1100-1340] User fills harrodsDeliveryCitySection with `deliveryCity`
And [1100-1340] User fills harrodsDeliveryStateSection with `deliveryState`
And [1100-1340] User fills harrodsDeliveryZipCodeSection with `deliveryZipCode`
And [1100-1300] User clicks on the harrodsContinueToPaymentButton
And [1111-1080] harrodsPaymentCheckoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the harrodsPaySecurelyNowButton
And [1101-1102] harrodsPaymentCardTypeError text is equal to Please select card type. case sensitive
And [1101-1102] harrodsPaymentNameOnCardError text is equal to Please enter the name on your card. case sensitive
And [1101-1102] harrodsPaymentCardNumberError text is equal to Please enter the card number. case sensitive
And [1101-1102] harrodsPaymentExpireDateError text is equal to Please select the card expiry date. case sensitive
And [1101-1102] harrodsPaymentSecurityCodeError text is equal to Please enter your 3- or 4-digit security code. case sensitive
And [1100-1601] Select harrodsPaymentCardType By Value 2
And [1100-1340] User fills harrodsPaymentCardNumberSection with `paymentCardNumber`
And [1100-1340] User fills harrodsPaymentNameOnCardSection with `paymentNameOnCard`
And [1100-1601] Select harrodsPaymentExpireMonth By Value 1
And [1100-1601] Select harrodsPaymentExpireYear By Value 2037
And [1100-1340] User fills harrodsPaymentSecurityCodeSection with `paymentSecurityCode`
And [8001-0008] sleep after last action for 5000 Milliseconds
And [1100-1300] User clicks on the harrodsPaySecurelyNowButton
Then [1111-1080] harrodsSubmitErrorMessage should be displayed, Within 120 seconds
And [1000-9140] Close the browser

