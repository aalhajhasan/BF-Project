Meta:
@ReportName Neiman Marcus

Scenario:  TC07_NeimanMarcus_Verify_All_Checkout_Test_Cases

Given [1101-1080] neimanmarcusBagPage should be displayed
When [1100-1300] User clicks on the neimanmarcusCheckoutButton
And [8014-0004] sleep after last action for 10000 seconds
And [1000-6010] Focus on Frame envoyId
And [1111-1080] neimanmarcusCheckoutPage should be displayed, Within 120 seconds
And [1101-1181] the user saves neimanmarcusItemsTotal text in global scope under name neimanmarcusItemsTotal
And [1101-1181] the user saves neimanmarcusShipping text in global scope under name neimanmarcusShipping
And [1101-1181] the user saves neimanmarcusDutiesAndTaxes text in global scope under name neimanmarcusDutiesAndTaxes
And [1101-1181] the user saves neimanmarcusOrderTotal text in global scope under name neimanmarcusOrderTotal
And [8014-0007] `neimanmarcusOrderTotal` price should be matched with the summation of `neimanmarcusItemsTotal` , `neimanmarcusShipping` and `neimanmarcusDutiesAndTaxes`
And [1100-1321] User scroll to the neimanmarcusCheckoutContinue then click it
And [1101-1102] neimanmarcusCheckoutEmailError text is equal to Email address is required case sensitive
And [1101-1102] neimanmarcusCheckoutFirstNameError text is equal to First name is required case sensitive
And [1101-1102] neimanmarcusCheckoutLastNameError text is equal to Last name is required case sensitive
And [1101-1102] neimanmarcusCheckoutAddressError text is equal to Address is required case sensitive
And [1101-1102] neimanmarcusCheckoutCityError text is equal to City is required case sensitive
And [1101-1102] neimanmarcusCheckoutPhoneError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills neimanmarcusCheckoutEmail with `checkoutEmailAddress`
And [1100-1340] User fills neimanmarcusCheckoutFirstName with `firstName`
And [1100-1340] User fills neimanmarcusCheckoutLastName with `lastName`
And [1100-1340] User fills neimanmarcusCheckoutAddress with `checkoutEmailAddress`
And [1100-1340] User fills neimanmarcusCheckoutCity with `checkoutCity`
And [1100-1340] User fills neimanmarcusCheckoutPhone with `checkoutPhoneNumber`
And [1100-1300] User clicks on the neimanmarcusCheckoutContinue
And [1100-1321] User scroll to the neimanmarcusCheckoutPlaceOrder then click it
And [8014-0004] sleep after last action for 10000 seconds
And [1000-6010] Focus on Frame cc-frame
And [1101-1102] neimanmarcusCheckoutCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] neimanmarcusCheckoutExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] neimanmarcusCheckoutSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills neimanmarcusCheckoutCardNumber with `paymentCardNumber`
And [1100-1340] User fills neimanmarcusCheckoutExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills neimanmarcusCheckoutSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1300] User clicks on the neimanmarcusCheckoutPlaceOrder
Then [1111-1080] neimanmarcusCheckoutSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser


