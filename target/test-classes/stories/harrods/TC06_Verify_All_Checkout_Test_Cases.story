
@DependOn |itemTwo|0|


Scenario:  TC06_Verify_All_Checkout_Test_Cases


Given [1101-1080] bagPage should be displayed
When [1100-1300] User clicks on the secureCheckoutNow
And [1111-1080] startCheckout should be displayed, Within 120 seconds
And [1100-1300] User clicks on the newCustomerButton
And [1111-1080] checkoutDetailsPage should be displayed, Within 120 seconds
And [1101-1080] harrodsLogo should be displayed
And [1100-1321] User scroll to the continueToDeliveryButton then click it
And [1101-1102] detailsTitleError text is equal to Please select a title case sensitive
And [1101-1102] detailsFirstNameError text is equal to Please enter a first name case sensitive
And [1101-1102] detailsLastNameError text is equal to Please enter a last name case sensitive
And [1101-1102] detailsContactNumberError text is equal to A contact number is required case sensitive
And [1101-1102] detailsEmailAddressError text is equal to Please enter your email address case sensitive
And [1100-1601] Select detailsTitle By Value Mr
And [1100-1340] User fills detailsFirstName with `detailsFirstName`
And [1100-1340] User fills detailsLastName with `detailsLastName`
And [1100-1340] User fills detailsContactNumber with `detailsContactNumber`
And [1100-1340] User fills detailsEmailAddress with `detailsEmailAddress`
And [1100-1300] User clicks on the continueToDeliveryButton
Then [1111-1080] checkoutDeliveryPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the continueToPaymentButton then click it
And [1101-1102] deliveryAddressError text is equal to Please complete address line 1 case sensitive
And [1101-1102] deliveryCityError text is equal to Please enter a Town/City case sensitive
And [1100-1340] User fills deliveryAddress with `deliveryAddress`
And [1100-1340] User fills deliveryCity with `deliveryCity`
And [1100-1340] User fills deliveryState with `deliveryState`
And [1100-1340] User fills deliveryZipCode with `deliveryZipCode`
And [1100-1300] User clicks on the continueToPaymentButton
Then [1111-1080] checkoutPaymentPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the paySecurelyNowButton then click it
And [1101-1102] paymentCardTypeError text is equal to Please select card type. case sensitive
And [1101-1102] paymentCardNumberError text is equal to Please enter the card number. case sensitive
And [1101-1102] paymentNameOnCardError text is equal to Please enter the name on your card. case sensitive
And [1101-1102] paymentExpiryDateError text is equal to Please select the card expiry date. case sensitive
And [1101-1102] paymentSecurityCodeError text is equal to Please enter your 3- or 4-digit security code. case sensitive
And [1100-1601] Select paymentCardType By Value 2
And [1100-1340] User fills paymentCardNumber with `paymentCardNumber`
And [1100-1340] User fills paymentNameOnCard with `paymentNameOnCard`
And [1100-1601] Select paymentMonth By Value 7
And [1100-1601] Select paymentYear By Value 2037
And [1100-1340] User fills paymentSecurityCode with `paymentSecurityCode`
And [1100-1300] User clicks on the paySecurelyNowButton
And [1111-1080] paymentSubmitError should be displayed, Within 120 seconds
Then [1101-1102] paymentSubmitError text is equal to `paymentSubmitError` case sensitive

