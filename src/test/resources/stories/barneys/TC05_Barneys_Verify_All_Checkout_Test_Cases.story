Meta:
@ReportName Barneys New York

Scenario:  TC05_Barneys_Verify_All_Checkout_Test_Cases

Given [1101-1080] barneysMyBagDialog should be displayed
When [1100-1300] User clicks on the barneysCheckoutButton
And [1111-1080] barneysBagPage should be displayed, Within 120 seconds
And [1200-1310] Clear all of barneysBagQuantity fields
And [1200-1340] User fill all of the barneysBagQuantity with 1
And [1100-1300] User clicks on the barneysProceedToCheckout
And [1111-1080] barneysShippingPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the barneysContinueButton then click it
And [1101-1102] barneysShippingFirstNameError text is equal to Please provide a first name. case sensitive
And [1101-1102] barneysShippingLastNameError text is equal to Please provide a last name. case sensitive
And [1101-1102] barneysShippingAddressError text is equal to Please enter a valid street address. case sensitive
And [1101-1102] barneysShippingCityError text is equal to Please enter a valid city. case sensitive
And [1101-1102] barneysShippingProvinceError text is equal to Please select a State. case sensitive
And [1101-1102] barneysShippingPostalCodeError text is equal to Please enter a valid ZIP or postal code. case sensitive
And [1101-1102] barneysShippingTelephoneError text is equal to Please enter a valid phone number, in case we need to contact you regarding your order. case sensitive
And [1100-1340] User fills barneysShippingFirstName with `firstName`
And [1100-1340] User fills barneysShippingLastName with `lastName`
And [1100-1340] User fills barneysShippingAddress with `checkoutAddress`
And [1100-1340] User fills barneysShippingCity with `checkoutCity`
And [1100-1340] User fills barneysShippingProvince with `checkoutState`
And [1100-1340] User fills barneysShippingPostalCode with `checkoutZipCode`
And [1100-1340] User fills barneysShippingTelephone with `checkoutPhoneNumber`
And [1100-1300] User clicks on the barneysContinueButton
And [1111-1080] barneysPaymentPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the barneysSameAsShipping
And [1101-1181] the user saves barneysSubtotal text in global scope under name barneysSubtotal
And [1101-1181] the user saves barneysDuties text in global scope under name barneysDuties
And [1101-1181] the user saves barneysTax text in global scope under name barneysTax
And [1101-1181] the user saves barneysShipping text in global scope under name barneysShipping
And [1101-1181] the user saves barneysEstimatedTotal text in global scope under name barneysEstimatedTotal
And [8008-0005] `barneysEstimatedTotal` price should be matched with the summation of `barneysShipping` , `barneysTax` , `barneysDuties` and `barneysSubtotal`
And [1100-1321] User scroll to the barneysContinuePaymentButton then click it
And [1101-1102] barneysPaymentNameOnCardError text is equal to Please enter the name as it appears on your card. case sensitive
And [1101-1102] barneysPaymentTypeError text is equal to Please select a Card Type. case sensitive
And [1101-1102] barneysPaymentCardNumberError text is equal to Please enter a valid card number. case sensitive
And [1101-1102] barneysPaymentExpirationMonthError text is equal to Please select an Expiration Month case sensitive
And [1101-1102] barneysPaymentExpirationYearError text is equal to Please select an Expiration Year case sensitive
And [1101-1102] barneysPaymentSecurityCodeError text is equal to Please enter the security code that appears on your card. case sensitive
And [1100-1340] User fills barneysPaymentNameOnCard with `firstName`
And [1100-1601] Select barneysPaymentType By Value visa
And [1100-1340] User fills barneysPaymentCardNumber with `paymentCardNumber`
And [1100-1601] Select barneysPaymentExpirationMonth By Value 1
And [1100-1601] Select barneysPaymentExpirationYear By Value 2033
And [1100-1340] User fills barneysPaymentSecurityCode with `paymentSecurityCode`
And [1100-1340] User fills barneysBillingEmail with `checkoutEmailAddress`
And [1100-1300] User clicks on the barneysContinuePaymentButton
Then [1111-1080] barneysErrorMessage should be displayed, Within 120 seconds
And [1000-9140] Close the browser


