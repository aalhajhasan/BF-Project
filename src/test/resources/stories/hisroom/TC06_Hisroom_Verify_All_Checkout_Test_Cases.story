Meta:
@ReportName His Room

Scenario:  TC06_Hisroom_Verify_All_Checkout_Test_Cases

Given [1101-1080] hisroomCartPage should be displayed
When [1100-1400] Execute `click` javascript on hisroomInternationalCheckout
And [8024-0003] sleep after last action for 15000 Milliseconds
And [1000-6010] Focus on Frame envoyId
And [1101-1181] the user saves hisroomItemsPrice text in global scope under name hisroomItemsPrice
And [1101-1181] the user saves hisroomShippingPrice text in global scope under name hisroomShippingPrice
And [1101-1181] the user saves hisroomDutiesPrice text in global scope under name hisroomDutiesPrice
And [1101-1181] the user saves hisroomTotalPrice text in global scope under name hisroomTotalPrice
And [8024-0007] `hisroomTotalPrice` price should be matched with the summation of `hisroomItemsPrice` , `hisroomShippingPrice` and `hisroomDutiesPrice`
And [1100-1321] User scroll to the hisroomCheckoutContinue then click it
And [1101-1102] hisroomCheckoutEmailError text is equal to Email address is required case sensitive
And [1101-1102] hisroomCheckoutFirstNameError text is equal to First name is required case sensitive
And [1101-1102] hisroomCheckoutLastNameError text is equal to Last name is required case sensitive
And [1101-1102] hisroomCheckoutAddressError text is equal to Address is required case sensitive
And [1101-1102] hisroomCheckoutCityError text is equal to City is required case sensitive
And [1101-1102] hisroomCheckoutPhoneError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills hisroomCheckoutEmail with `checkoutEmailAddress`
And [1100-1340] User fills hisroomCheckoutFirstName with `firstName`
And [1100-1340] User fills hisroomCheckoutLastName with `lastName`
And [1100-1340] User fills hisroomCheckoutAddress with `checkoutEmailAddress`
And [1100-1340] User fills hisroomCheckoutCity with `checkoutCity`
And [1100-1340] User fills hisroomCheckoutPhone with `checkoutPhoneNumber`
And [1100-1300] User clicks on the hisroomCheckoutContinue
And [1100-1321] User scroll to the hisroomCheckoutPlaceOrder then click it
And [8012-0006] sleep after last action for 5000 Milliseconds
And [1000-6010] Focus on Frame cc-frame
And [1101-1102] hisroomCheckoutCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] hisroomCheckoutExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] hisroomCheckoutSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills hisroomCheckoutCardNumber with `paymentCardNumber`
And [1100-1340] User fills hisroomCheckoutExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills hisroomCheckoutSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1300] User clicks on the hisroomCheckoutPlaceOrder
Then [1111-1080] hisroomCheckoutSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser