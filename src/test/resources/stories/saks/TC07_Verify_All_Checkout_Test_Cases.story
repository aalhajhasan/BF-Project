
@DependOn |seconditem|0|


Scenario:  TC07_Verify_All_Checkout_Test_Cases

Given [1101-1080] saksBagPage should be displayed
When [1100-1321] User scroll to the saksCheckoutButton then click it
And [1111-1080] checkoutDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the checkoutAsGuest
And [1111-1080] checkoutPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the continueCheckoutButton then click it
And [1101-1102] checkoutFirstNameError text is equal to Please enter a valid first name. case sensitive
And [1101-1102] checkoutLastNameError text is equal to Please enter a valid last name. case sensitive
And [1101-1102] checkoutAddressError text is equal to Please enter a valid street address for your shipping address. case sensitive
And [1101-1102] checkoutCityError text is equal to Please enter a city. case sensitive
And [1101-1102] checkoutEmailAddressError text is equal to Please enter a valid email address. case sensitive
And [1101-1102] checkoutPhoneNumberError text is equal to Please enter a valid phone number. case sensitive
And [1100-1601] Select checkoutTitle By Value 3
And [1100-1340] User fills checkoutFirstName with `firstName`
And [1100-1340] User fills checkoutLastName with `lastName`
And [1100-1340] User fills checkoutAddress with `checkoutAddress`
And [1100-1340] User fills checkoutCity with `checkoutCity`
And [1100-1340] User fills checkoutState with `checkoutState`
And [1100-1340] User fills checkoutZipCode with `checkoutZipCode`
And [1100-1340] User fills checkoutEmailAddress with `checkoutEmailAddress`
And [1100-1340] User fills checkoutPhoneNumber with `checkoutPhoneNumber`
And [1100-1300] User clicks on the continueCheckoutButton
And [1111-1080] paymentPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the paymentContinueCheckout then click it
And [1101-1102] paymentCCNError text is equal to Please supply a valid credit card number. case sensitive
And [1101-1102] paymentNameOnCardError text is equal to Please supply the name displayed on the credit card. case sensitive
And [1101-1102] paymentExpirationError text is equal to Please supply a valid expiration date. case sensitive
And [1101-1102] paymentSecurityCodeError text is equal to Please supply the security code for your credit card. case sensitive
And [1100-1601] Select paymentType By Value VISA
And [1100-1340] User fills paymentCCNE with `paymentCardNumber`
And [1100-1340] User fills paymentNameOnCard with `firstName`
And [1100-1601] Select paymentExpirationMonth By Value 1
And [1100-1601] Select paymentExpirationYear By Value 2030
And [1100-1340] User fills paymentSecurityCode with `paymentSecurityCode`
And [1100-1300] User clicks on the paymentContinueCheckout
And [1100-1320] User scroll to the checkoutOrderSummery
And [1101-1181] the user saves itemTotal text in global scope under name itemTotal
And [1101-1181] the user saves shipping text in global scope under name shipping
And [1101-1181] the user saves promotionalSavings text in global scope under name promotionalSavings
And [1101-1181] the user saves landedCost text in global scope under name landedCost
And [1101-1181] the user saves dutiesAndTaxes text in global scope under name dutiesAndTaxes
And [1101-1181] the user saves orderTotal text in global scope under name orderTotal
And [8002-0008] `orderTotal` price should be matched with the summation of `itemTotal` , `shipping` , `promotionalSavings` , `landedCost` and `dutiesAndTaxes` 
And [1100-1340] User fills securityCode with `paymentSecurityCode`
And [1100-1300] User clicks on the placeOrderButton
Then [1111-1080] submitErrorMessage should be displayed, Within 120 seconds
And [1101-1102] submitErrorMessage text is equal to `submitErrorMessage` case sensitive
