Meta:
@ReportName Pacsun

Scenario:  TC07_Pacsun_Verify_All_Checkout_Test_Cases

Given [1101-1080] pacsunCartPage should be displayed
When [1100-1400] Execute `click` javascript on pacsunCheckout
And [8029-0003] sleep after last action for 15000 Milliseconds
And [1000-6010] Focus on Frame envoyId
And [1100-1321] User scroll to the pacsunDeliveryContinue then click it
And [1101-1102] pacsunCheckoutEmailError text is equal to Email address is required case sensitive
And [1101-1102] pacsunCheckoutFirstNameError text is equal to First name is required case sensitive
And [1101-1102] pacsunCheckoutLastNameError text is equal to Last name is required case sensitive
And [1101-1102] pacsunCheckoutAddressError text is equal to Address is required case sensitive
And [1101-1102] pacsunCheckoutCityError text is equal to City is required case sensitive
And [1101-1102] pacsunCheckoutPhoneError text is equal to Primary phone number is required case sensitive
And [1101-1102] pacsunCheckoutPostalCodeError text is equal to Postal code is required case sensitive
And [1100-1340] User fills pacsunCheckoutEmail with `checkoutEmailAddress`
And [1100-1340] User fills pacsunCheckoutFirstName with `firstName`
And [1100-1340] User fills pacsunCheckoutLastName with `lastName`
And [1100-1340] User fills pacsunCheckoutAddress with `checkoutEmailAddress`
And [1100-1340] User fills pacsunCheckoutCity with `checkoutCity`
And [1100-1340] User fills pacsunCheckoutPhone with `checkoutPhoneNumber`
And [1100-1340] User fills pacsunCheckoutPostalCode with `checkoutPostalCode`
!-- And [1101-1181] the user saves pacsunItemsTotal text in global scope under name pacsunItemsTotal
!-- And [1101-1181] the user saves pacsunShipping text in global scope under name pacsunShipping
!-- And [1101-1181] the user saves pacsunDutiesAndTaxes text in global scope under name pacsunDutiesAndTaxes
!-- And [1101-1181] the user saves pacsunOrderTotal text in global scope under name pacsunOrderTotal
!-- And [8029-0007] `pacsunOrderTotal` price should be matched with the summation of `pacsunItemsTotal` , `pacsunShipping` and `pacsunDutiesAndTaxes`
And [1100-1400] Execute `click` javascript on pacsunDeliveryContinue
And [8029-0003] sleep after last action for 5000 Milliseconds
And [1000-6010] Focus on Frame cc-frame
And [1100-1340] User fills pacsunCheckoutCardNumber with `paymentCardNumber`
And [1100-1340] User fills pacsunCheckoutExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills pacsunCheckoutSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1400] Execute `click` javascript on pacsunPlaceOrder
Then [1111-1080] pacsunCheckoutSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser






