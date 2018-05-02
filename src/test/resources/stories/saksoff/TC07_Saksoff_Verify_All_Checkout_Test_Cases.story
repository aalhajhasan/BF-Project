Meta:
@ReportName Saks Fifth Avenue OFF 5TH

Scenario:  TC07_Saksoff_Verify_All_Checkout_Test_Cases

Given [1101-1080] saksoffBagPage should be displayed
When [1100-1321] User scroll to the saksoffCheckoutButton then click it
And [8003-0010] sleep after last action for 5000 Milliseconds
And [1111-1080] saksoffCheckoutDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the saksoffCheckoutAsGuest
And [1111-1080] saksoffCheckoutPage should be displayed, Within 120 seconds
And [1111-1000] saksoffContinueCheckoutButton should be clickable, Within 120 seconds
And [1100-1321] User scroll to the saksoffContinueCheckoutButton then click it
And [1101-1102] saksoffCheckoutFirstNameError text is equal to Please enter a valid first name. case sensitive
And [1101-1102] saksoffCheckoutLastNameError text is equal to Please enter a valid last name. case sensitive
And [1101-1102] saksoffCheckoutAddressError text is equal to Please enter a valid street address for your shipping address. case sensitive
And [1101-1102] saksoffCheckoutCityError text is equal to Please enter a city. case sensitive
And [1101-1102] saksoffCheckoutEmailAddressError text is equal to Please enter a valid email address. case sensitive
And [1101-1102] saksoffCheckoutPhoneNumberError text is equal to Please enter a valid phone number. case sensitive
And [1100-1601] Select saksoffCheckoutTitle By Value 3
And [1100-1340] User fills saksoffCheckoutFirstName with `firstName`
And [1100-1340] User fills saksoffCheckoutLastName with `lastName`
And [1100-1340] User fills saksoffCheckoutAddress with `checkoutAddress`
And [1100-1340] User fills saksoffCheckoutCity with `checkoutCity`
And [1100-1340] User fills saksoffCheckoutState with `checkoutState`
And [1100-1340] User fills saksoffCheckoutZipCode with `checkoutZipCode`
And [1100-1340] User fills saksoffCheckoutEmailAddress with `checkoutEmailAddress`
And [1100-1340] User fills saksoffCheckoutPhoneNumber with `checkoutPhoneNumber`
And [1100-1400] Execute `click` javascript on saksoffContinueCheckoutButton
And [1111-1080] saksoffPaymentPage should be displayed, Within 120 seconds
And [8003-0010] sleep after last action for 5000 Milliseconds
And [1100-1321] User scroll to the saksoffPaymentContinueCheckout then click it
And [1100-0400] Execute `click` javascript on the element
And [8003-0010] sleep after last action for 5000 Milliseconds
And [1101-1102] saksoffPaymentCCNError text is equal to Please supply a valid credit card number. case sensitive
And [1101-1102] saksoffPaymentNameOnCardError text is equal to Please supply the name displayed on the credit card. case sensitive
And [1101-1102] saksoffPaymentExpirationError text is equal to Please supply a valid expiration date. case sensitive
And [1101-1102] saksoffPaymentSecurityCodeError text is equal to Please supply the security code for your credit card. case sensitive
And [1100-1601] Select saksoffPaymentType By Value VISA
And [1100-1340] User fills saksoffPaymentCCNE with `paymentCardNumber`
And [1100-1340] User fills saksoffPaymentNameOnCard with `firstName`
And [1100-1601] Select saksoffPaymentExpirationMonth By Value 1
And [1100-1601] Select saksoffPaymentExpirationYear By Value 2030
And [1100-1340] User fills saksoffPaymentSecurityCode with `paymentSecurityCode`
And [1100-1300] User clicks on the saksoffPaymentContinueCheckout
And [8003-0010] sleep after last action for 10000 Milliseconds
And [1100-1320] User scroll to the saksoffCheckoutOrderSummery
And [1101-1181] the user saves saksoffItemTotal text in global scope under name saksoffItemTotal
And [1101-1181] the user saves saksoffShipping text in global scope under name saksoffShipping
And [1101-1181] the user saves saksoffLandedCost text in global scope under name saksoffLandedCost
And [1101-1181] the user saves saksoffDutiesAndTaxes text in global scope under name saksoffDutiesAndTaxes
And [1101-1181] the user saves saksoffOrderTotal text in global scope under name saksoffOrderTotal
And [8003-0008] `saksoffOrderTotal` price should be matched with the summation of `itemTotal` , `saksoffShipping` , `saksoffLandedCost` and `saksoffDutiesAndTaxes`
And [1100-1340] User fills saksoffSecurityCode with `paymentSecurityCode`
And [1100-1400] Execute `click` javascript on saksoffPlaceOrderButton
Then [1111-1080] saksoffSubmitErrorMessage should be displayed, Within 120 seconds
And [1000-9140] Close the browser

