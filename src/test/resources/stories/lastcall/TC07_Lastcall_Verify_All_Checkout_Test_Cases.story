Meta:
@ReportName Last Call

Scenario:  TC07_Lastcall_Verify_All_Checkout_Test_Cases

Given [1101-1080] lastcallBagPage should be displayed
When [1100-1300] User clicks on the lastcallCheckoutButton
And [8014-0004] sleep after last action for 10000 Milliseconds
And [1000-6010] Focus on Frame envoyId
And [1111-1080] lastcallCheckoutPage should be displayed, Within 120 seconds
And [1101-1181] the user saves lastcallItemsTotal text in global scope under name lastcallItemsTotal
And [1101-1181] the user saves lastcallShipping text in global scope under name lastcallShipping
And [1101-1181] the user saves lastcallDutiesAndTaxes text in global scope under name lastcallDutiesAndTaxes
And [1101-1181] the user saves lastcallOrderTotal text in global scope under name lastcallOrderTotal
And [8014-0007] `lastcallOrderTotal` price should be matched with the summation of `lastcallItemsTotal` , `lastcallShipping` and `lastcallDutiesAndTaxes`
And [1100-1321] User scroll to the lastcallCheckoutContinue then click it
And [1101-1102] lastcallCheckoutEmailError text is equal to Email address is required case sensitive
And [1101-1102] lastcallCheckoutFirstNameError text is equal to First name is required case sensitive
And [1101-1102] lastcallCheckoutLastNameError text is equal to Last name is required case sensitive
And [1101-1102] lastcallCheckoutAddressError text is equal to Address is required case sensitive
And [1101-1102] lastcallCheckoutCityError text is equal to City is required case sensitive
And [1101-1102] lastcallCheckoutPhoneError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills lastcallCheckoutEmail with `checkoutEmailAddress`
And [1100-1340] User fills lastcallCheckoutFirstName with `firstName`
And [1100-1340] User fills lastcallCheckoutLastName with `lastName`
And [1100-1340] User fills lastcallCheckoutAddress with `checkoutEmailAddress`
And [1100-1340] User fills lastcallCheckoutCity with `checkoutCity`
And [1100-1340] User fills lastcallCheckoutPhone with `checkoutPhoneNumber`
And [1100-1300] User clicks on the lastcallCheckoutContinue
And [1100-1321] User scroll to the lastcallCheckoutPlaceOrder then click it
And [8014-0004] sleep after last action for 10000 Milliseconds
And [1000-6010] Focus on Frame cc-frame
And [1101-1102] lastcallCheckoutCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] lastcallCheckoutExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] lastcallCheckoutSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills lastcallCheckoutCardNumber with `paymentCardNumber`
And [1100-1340] User fills lastcallCheckoutExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills lastcallCheckoutSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1300] User clicks on the lastcallCheckoutPlaceOrder
Then [1111-1080] lastcallCheckoutSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser


