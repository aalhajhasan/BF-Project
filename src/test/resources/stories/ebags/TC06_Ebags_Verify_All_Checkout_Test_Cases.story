Meta:
@ReportName Ebags

Scenario:  TC06_Ebags_Verify_All_Checkout_Test_Cases

Given [1101-1080] ebagsCartPage should be displayed
When [1100-1300] User clicks on the continuwCheckout
And [1111-1080] deliveryCheckout should be displayed, Within 120 seconds
And [1101-1181] the user saves itemsTotal text in global scope under name itemsTotal
And [1101-1181] the user saves shipping text in global scope under name shipping
And [1101-1181] the user saves dutiesAndTaxes text in global scope under name dutiesAndTaxes
And [1101-1181] the user saves orderTotal text in global scope under name orderTotal
And [8006-0008] `orderTotal` price should be matched with the summation of `itemsTotal` , `shipping` and `dutiesAndTaxes`
And [1111-1080] promoCodeSection should be displayed, Within 120 seconds
And [1100-0300] User click on it
And [1111-1080] promoCodeSFiled should be displayed, Within 120 seconds
And [1100-1321] User scroll to the checkoutContinue then click it
And [1101-1102] deliveryEmailAddressError text is equal to Email address is required case sensitive
And [1101-1102] deliveryFirstNameError text is equal to First name is required case sensitive
And [1101-1102] deliveryLastNameError text is equal to Last name is required case sensitive
And [1101-1102] deliveryAddressError text is equal to Address is required case sensitive
And [1101-1102] deliveryCityError text is equal to City is required case sensitive
And [1101-1102] deliveryPhoneNumberError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills deliveryEmailAddress with `checkoutEmailAddress`
And [1100-1340] User fills deliveryFirstName with `firstName`
And [1100-1340] User fills deliveryLastName with `lastName`
And [1100-1340] User fills deliveryAddress with `checkoutAddress`
And [1100-1340] User fills deliveryCity with `checkoutCity`
And [1100-1340] User fills deliveryZipCode with `checkoutZipCode`
And [1100-1340] User fills deliveryPhoneNumber with `checkoutPhoneNumber`
And [1100-1300] User clicks on the continuwCheckout
And [1111-1080] paymentSection should be displayed, Within 120 seconds
And [1100-1300] User clicks on the palceOrderButton
And [1101-1102] paymentCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] paymentExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] paymentSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills paymentCardNumber with `paymentCardNumber`
And [1100-1340] User fills paymentExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills paymentSecurityCode with `paymentSecurityCode`
And [1100-1300] User clicks on the palceOrderButton
Then [1111-1080] submitError should be displayed, Within 120 seconds
And [1101-1102] submitError text is equal to `submitErrorMessage` case sensitive

