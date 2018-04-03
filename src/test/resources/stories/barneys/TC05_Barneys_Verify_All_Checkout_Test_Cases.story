Meta:
@ReportName Barneys

Scenario:  TC05_Barneys_Verify_All_Checkout_Test_Cases

Given [1101-1080] myBagDialog should be displayed
When [1100-1300] User clicks on the checkoutButton
And [1111-1080] bagPage should be displayed, Within 120 seconds
And [1200-1310] Clear all of bagQuantity fields
And [1200-1340] User fill all of the bagQuantity with 1
And [1100-1300] User clicks on the proceedToCheckout
And [1111-1080] shippingPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the continueButton then click it
And [1101-1102] shippingFirstNameError text is equal to Please provide a first name. case sensitive
And [1101-1102] shippingLastNameError text is equal to Please provide a last name. case sensitive
And [1101-1102] shippingAddressError text is equal to Please enter a valid street address. case sensitive
And [1101-1102] shippingCityError text is equal to Please enter a valid city. case sensitive
And [1101-1102] shippingProvinceError text is equal to Please select a State. case sensitive
And [1101-1102] shippingPostalCodeError text is equal to Please enter a valid ZIP or postal code. case sensitive
And [1101-1102] shippingTelephoneError text is equal to Please enter a valid phone number, in case we need to contact you regarding your order. case sensitive
And [1100-1340] User fills shippingFirstName with `firstName`
And [1100-1340] User fills shippingLastName with `lastName`
And [1100-1340] User fills shippingAddress with `checkoutAddress`
And [1100-1340] User fills shippingCity with `checkoutCity`
And [1100-1340] User fills shippingProvince with `checkoutState`
And [1100-1340] User fills shippingPostalCode with `checkoutZipCode`
And [1100-1340] User fills shippingTelephone with `checkoutPhoneNumber`
And [1100-1300] User clicks on the continueButton
And [1111-1080] paymentPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the sameAsShipping
And [1101-1181] the user saves subtotal text in global scope under name subtotal
And [1101-1181] the user saves duties text in global scope under name duties
And [1101-1181] the user saves tax text in global scope under name tax
And [1101-1181] the user saves shipping text in global scope under name shipping
And [1101-1181] the user saves estimatedTotal text in global scope under name estimatedTotal
And [8008-0005] estimatedTotal price should be matched with the summation of shipping , tax , duties and subtotal
And [1100-1321] User scroll to the continuePaymentButton then click it
And [1101-1102] paymentNameOnCardError text is equal to Please enter the name as it appears on your card. case sensitive
And [1101-1102] paymentTypeError text is equal to Please select a Card Type. case sensitive
And [1101-1102] paymentCardNumberError text is equal to Please enter a valid card number. case sensitive
And [1101-1102] paymentExpirationMonthError text is equal to Please select an Expiration Month case sensitive
And [1101-1102] paymentExpirationYearError text is equal to Please select an Expiration Year case sensitive
And [1101-1102] paymentSecurityCodeError text is equal to Please enter the security code that appears on your card. case sensitive
And [1100-1340] User fills paymentNameOnCard with `firstName`
And [1100-1601] Select paymentType By Value visa
And [1100-1340] User fills paymentCardNumber with `paymentCardNumber`
And [1100-1601] Select paymentExpirationMonth By Value 1
And [1100-1601] Select paymentExpirationYear By Value 2033
And [1100-1340] User fills paymentSecurityCode with `paymentSecurityCode`
And [1100-1340] User fills billingEmail with `checkoutEmailAddress`
And [1100-1300] User clicks on the continuePaymentButton
Then [1111-1080] errorMessage should be displayed, Within 120 seconds



