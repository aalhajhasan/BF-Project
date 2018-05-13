Meta:
@ReportName Her Room

Scenario:  TC06_herroom_Verify_All_Checkout_Test_Cases

Given [1101-1080] herroomCartPage should be displayed
When [1100-1400] Execute `click` javascript on herroomInternationalCheckout
And [8033-0003] sleep after last action for 15000 Milliseconds
And [1000-6010] Focus on Frame envoyId
And [1101-1181] the user saves herroomItemsPrice text in global scope under name herroomItemsPrice
And [1101-1181] the user saves herroomShippingPrice text in global scope under name herroomShippingPrice
And [1101-1181] the user saves herroomDutiesPrice text in global scope under name herroomDutiesPrice
And [1101-1181] the user saves herroomTotalPrice text in global scope under name herroomTotalPrice
And [8033-0007] `herroomTotalPrice` price should be matched with the summation of `herroomItemsPrice` , `herroomShippingPrice` and `herroomDutiesPrice`
And [1100-1321] User scroll to the herroomCheckoutContinue then click it
And [1101-1102] herroomCheckoutEmailError text is equal to Email address is required case sensitive
And [1101-1102] herroomCheckoutFirstNameError text is equal to First name is required case sensitive
And [1101-1102] herroomCheckoutLastNameError text is equal to Last name is required case sensitive
And [1101-1102] herroomCheckoutAddressError text is equal to Address is required case sensitive
And [1101-1102] herroomCheckoutCityError text is equal to City is required case sensitive
And [1101-1102] herroomCheckoutPhoneError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills herroomCheckoutEmail with `checkoutEmailAddress`
And [1100-1340] User fills herroomCheckoutFirstName with `firstName`
And [1100-1340] User fills herroomCheckoutLastName with `lastName`
And [1100-1340] User fills herroomCheckoutAddress with `checkoutEmailAddress`
And [1100-1340] User fills herroomCheckoutCity with `checkoutCity`
And [1100-1340] User fills herroomCheckoutPhone with `checkoutPhoneNumber`
And [1100-1300] User clicks on the herroomCheckoutContinue
And [1100-1321] User scroll to the herroomCheckoutPlaceOrder then click it
And [8012-0006] sleep after last action for 5000 Milliseconds
And [1000-6010] Focus on Frame cc-frame
And [1101-1102] herroomCheckoutCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] herroomCheckoutExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] herroomCheckoutSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills herroomCheckoutCardNumber with `paymentCardNumber`
And [1100-1340] User fills herroomCheckoutExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills herroomCheckoutSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1300] User clicks on the herroomCheckoutPlaceOrder
Then [1111-1080] herroomCheckoutSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser