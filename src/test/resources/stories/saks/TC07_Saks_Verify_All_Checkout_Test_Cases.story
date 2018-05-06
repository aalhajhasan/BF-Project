Meta:
@ReportName Saks

Scenario:  TC07_Saks_Verify_All_Checkout_Test_Cases

Given [1101-1080] saksBagPage should be displayed
When [1100-1321] User scroll to the saksCheckoutButton then click it
And [1111-1080] saksCheckoutDialog should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on saksCheckoutAsGuest
And [8002-0010] sleep after last action for 10000 Milliseconds
And [1111-1080] saksCheckoutPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the saksContinueCheckoutButton then click it
And [1101-1102] saksCheckoutFirstNameError text is equal to Please enter a valid first name. case sensitive
And [1101-1102] saksCheckoutLastNameError text is equal to Please enter a valid last name. case sensitive
And [1101-1102] saksCheckoutAddressError text is equal to Please enter a valid street address for your shipping address. case sensitive
And [1101-1102] saksCheckoutCityError text is equal to Please enter a city. case sensitive
And [1101-1102] saksCheckoutEmailAddressError text is equal to Please enter a valid email address. case sensitive
And [1101-1102] saksCheckoutPhoneNumberError text is equal to Please enter a valid phone number. case sensitive
And [1100-1601] Select saksCheckoutTitle By Value 3
And [1100-1340] User fills saksCheckoutFirstName with `firstName`
And [1100-1340] User fills saksCheckoutLastName with `lastName`
And [1100-1340] User fills saksCheckoutAddress with `checkoutAddress`
And [1100-1340] User fills saksCheckoutCity with `checkoutCity`
And [1100-1340] User fills saksCheckoutState with `checkoutState`
And [1100-1340] User fills saksCheckoutZipCode with `checkoutZipCode`
And [1100-1340] User fills saksCheckoutEmailAddress with `checkoutEmailAddress`
And [1100-1340] User fills saksCheckoutPhoneNumber with `checkoutPhoneNumber`
And [1100-1300] User clicks on the saksContinueCheckoutButton
And [1111-1080] saksPaymentPage should be displayed, Within 120 seconds
And [1100-1320] User scroll to the saksPaymentContinueCheckout
And [1100-0400] Execute `click` javascript on the element
And [8002-0010] sleep after last action for 5000 Milliseconds
And [1101-1102] saksPaymentCCNError text is equal to Please supply a valid credit card number. case sensitive
And [1101-1102] saksPaymentNameOnCardError text is equal to Please supply the name displayed on the credit card. case sensitive
And [1101-1102] saksPaymentExpirationError text is equal to Please supply a valid expiration date. case sensitive
And [1101-1102] saksPaymentSecurityCodeError text is equal to Please supply the security code for your credit card. case sensitive
And [1100-1601] Select saksPaymentType By Value VISA
And [1100-1340] User fills saksPaymentCCNE with `paymentCardNumber`
And [1100-1340] User fills saksPaymentNameOnCard with `firstName`
And [1100-1601] Select saksPaymentExpirationMonth By Value 1
And [1100-1601] Select saksPaymentExpirationYear By Value 2030
And [1100-1340] User fills saksPaymentSecurityCode with `paymentSecurityCode`
And [1100-1300] User clicks on the saksPaymentContinueCheckout
And [1100-1320] User scroll to the saksCheckoutOrderSummery
And [1101-1181] the user saves saksItemTotal text in global scope under name saksItemTotal
And [1101-1181] the user saves saksShipping text in global scope under name saksShipping
And [1101-1181] the user saves saksPromotionalSavings text in global scope under name saksPromotionalSavings
And [1101-1181] the user saves saksLandedCost text in global scope under name saksLandedCost
And [1101-1181] the user saves saksDutiesAndTaxes text in global scope under name saksDutiesAndTaxes
And [1101-1181] the user saves saksOrderTotal text in global scope under name saksOrderTotal
And [8002-0008] `saksOrderTotal` price should be matched with the summation of `saksItemTotal` , `saksShipping` , `saksPromotionalSavings` , `saksLandedCost` and `saksDutiesAndTaxes` 
And [1100-1340] User fills saksSecurityCode with `paymentSecurityCode`
And [1100-1400] Execute `click` javascript on saksPlaceOrderButton
Then [1111-1080] saksSubmitErrorMessage should be displayed, Within 120 seconds
And [1000-9140] Close the browser

