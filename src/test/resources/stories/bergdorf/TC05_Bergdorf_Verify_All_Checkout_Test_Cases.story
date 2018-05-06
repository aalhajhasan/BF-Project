Meta:
@ReportName Bergdorf Goodman

Scenario:  TC05_Bergdorf_Verify_All_Checkout_Test_Cases

Given [1101-1080] bergdorfBagPage should be displayed
When [1100-1300] User clicks on the bergdorfCheckoutButton
And [8012-0006] sleep after last action for 20000 Milliseconds
And [1000-6010] Focus on Frame envoyId
And [1111-1080] bergdorfCheckoutPage should be displayed, Within 120 seconds
And [1101-1181] the user saves bergdorfItemsTotal text in global scope under name bergdorfItemsTotal
And [1101-1181] the user saves bergdorfShipping text in global scope under name bergdorfShipping
And [1101-1181] the user saves bergdorfDutiesAndTaxes text in global scope under name bergdorfDutiesAndTaxes
And [1101-1181] the user saves bergdorfOrderTotal text in global scope under name bergdorfOrderTotal
And [8012-0007] `bergdorfOrderTotal` price should be matched with the summation of `bergdorfItemsTotal` , `bergdorfShipping` and `bergdorfDutiesAndTaxes`
And [1100-1321] User scroll to the bergdorfCheckoutContinue then click it
And [1101-1102] bergdorfCheckoutEmailError text is equal to Email address is required case sensitive
And [1101-1102] bergdorfCheckoutFirstNameError text is equal to First name is required case sensitive
And [1101-1102] bergdorfCheckoutLastNameError text is equal to Last name is required case sensitive
And [1101-1102] bergdorfCheckoutAddressError text is equal to Address is required case sensitive
And [1101-1102] bergdorfCheckoutCityError text is equal to City is required case sensitive
And [1101-1102] bergdorfCheckoutPhoneError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills bergdorfCheckoutEmail with `checkoutEmailAddress`
And [1100-1340] User fills bergdorfCheckoutFirstName with `firstName`
And [1100-1340] User fills bergdorfCheckoutLastName with `lastName`
And [1100-1340] User fills bergdorfCheckoutAddress with `checkoutEmailAddress`
And [1100-1340] User fills bergdorfCheckoutCity with `checkoutCity`
And [1100-1340] User fills bergdorfCheckoutPhone with `checkoutPhoneNumber`
And [1100-1300] User clicks on the bergdorfCheckoutContinue
And [1100-1321] User scroll to the bergdorfCheckoutPlaceOrder then click it
And [8012-0006] sleep after last action for 5000 Milliseconds
And [1000-6010] Focus on Frame cc-frame
And [1101-1102] bergdorfCheckoutCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] bergdorfCheckoutExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] bergdorfCheckoutSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills bergdorfCheckoutCardNumber with `paymentCardNumber`
And [1100-1340] User fills bergdorfCheckoutExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills bergdorfCheckoutSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1300] User clicks on the bergdorfCheckoutPlaceOrder
Then [1111-1080] bergdorfCheckoutSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser

