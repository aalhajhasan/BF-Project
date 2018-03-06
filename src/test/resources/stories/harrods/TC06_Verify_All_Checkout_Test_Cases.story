Meta:
@DependOn |seconditem|0|

Scenario:  TC06_Verify_All_Checkout_Test_Cases

Given [1101-1080] bagPage should be displayed
When [1100-1300] User clicks on the secureCheckoutNow
And [1111-1080] startCheckoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the newCustomerButton
And [1111-1080] detailsCheckoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the continueToDeliveryButton
And [1101-1102] detailsTitleError text is equal to Please select a title case sensitive
And [1101-1102] detailsFirstNameError text is equal to Please enter a first name case sensitive
And [1101-1102] detailsLastNameError text is equal to Please enter a last name case sensitive
And [1101-1102] detailsContactNumberError text is equal to A contact number is required case sensitive
And [1101-1102] detailsEmailAddressError text is equal to Please enter your email address case sensitive
And [1100-1601] Select detailsTitle By Value Mr
And [1100-1340] User fills detailsFirstNameSection with `firstName`
And [1100-1340] User fills detailsLastNameSection with `lastName`
And [1100-1340] User fills detailsContactNumberSection with `contactNumber`
And [1100-1340] User fills detailsEmailAddressSection with `emailAddress`
And [1100-1300] User clicks on the continueToDeliveryButton
And [1111-1080] deliveryCheckoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the continueToPaymentButton
And [1101-1102] deliveryAddressError text is equal to Please complete address line 1 case sensitive
And [1101-1102] deliveryCityError text is equal to Please enter a Town/City case sensitive
And [1100-1340] User fills deliveryAddressSection with `deliveryAddress`
And [1100-1340] User fills deliveryCitySection with `deliveryCity`
And [1100-1340] User fills deliveryStateSection with `deliveryState`
And [1100-1340] User fills deliveryZipCodeSection with `deliveryZipCode`
And [1100-1300] User clicks on the continueToPaymentButton
And [1111-1080] paymentCheckoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the paySecurelyNowButton
And [1101-1102] paymentCardTypeError text is equal to Please select card type. case sensitive
And [1101-1102] paymentNameOnCardError text is equal to Please enter the name on your card. case sensitive
And [1101-1102] paymentCardNumberError text is equal to Please enter the card number. case sensitive
And [1101-1102] paymentExpireDateError text is equal to Please select the card expiry date. case sensitive
And [1101-1102] paymentSecurityCodeError text is equal to Please enter your 3- or 4-digit security code. case sensitive
And [1100-1601] Select paymentCardType By Value 2
And [1100-1340] User fills paymentCardNumberSection with `paymentCardNumber`
And [1100-1340] User fills paymentNameOnCardSection with `paymentNameOnCard`
And [1100-1601] Select paymentExpireMonth By Value 1
And [1100-1601] Select paymentExpireYear By Value 2037
And [1100-1340] User fills paymentSecurityCodeSection with `paymentSecurityCode`
And [1100-1300] User clicks on the paySecurelyNowButton
And [1111-1080] submitErrorMessage should be displayed, Within 120 seconds
Then [1101-1102] submitErrorMessage text is equal to `submitErrorMessage` case sensitive