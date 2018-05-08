Meta:
@ReportName Sephora

Scenario:  TC06_Sephora_Verify_All_Checkout_Test_Cases

Given [1101-1080] sephoraBasketPage should be displayed
When [1100-1400] Execute `click` javascript on sephoraBasketPageCheckout
And [1111-1080] sephoraLoginDialog should be displayed, Within 120 seconds
And [1100-1340] User fills sephoraNewUserEmail with `emailAddress`
And [1100-1340] User fills sephoraNewUserPassword with `password`
And [1100-1400] Execute `click` javascript on sephoraLoginContinue
And [8022-0001] sleep after last action for 10000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraBasketPageCheckout
And [8022-0001] sleep after last action for 10000 Milliseconds
And [1111-1080] sephoraShippingSection should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on sephoraShippingContinue
And [1101-1102] sephoraShippingFirstNameError text is equal to First name required. case sensitive
And [1101-1102] sephoraShippingLastNameError text is equal to Last name required. case sensitive
And [1101-1102] sephoraShippingStreetAddressError text is equal to Address Required. Please enter your street address. case sensitive
And [1101-1102] sephoraShippingPostalCodeError text is equal to ZIP or postal code required. case sensitive
And [1101-1102] sephoraShippingPhoneError text is equal to Phone number required. case sensitive
And [1100-1340] User fills sephoraShippingFirstName with `firstName`
And [1100-1340] User fills sephoraShippingLastName with `lastName`
And [1100-1340] User fills sephoraShippingStreetAddress with `checkoutAddress`
And [1100-1340] User fills sephoraShippingPostalCode with `checkoutZipCode`
And [1100-1340] User fills sephoraShippingPhone with `checkoutPhoneNumber`
And [1100-1400] Execute `click` javascript on sephoraShippingContinue
And [8022-0001] sleep after last action for 10000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraShippingContinue
And [8022-0001] sleep after last action for 10000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraAddNewCreditCard
And [8022-0001] sleep after last action for 5000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraShippingContinue
And [1101-1102] sephoraPaymentCardNumberError text is equal to Credit card number required. case sensitive
And [1101-1102] sephoraPaymentExpirationMonthError text is equal to Expiration month required. case sensitive
And [1101-1102] sephoraPaymentExpirationYearError text is equal to Expiration year required. case sensitive
And [1101-1102] sephoraPaymentCreditCardSecurityError text is equal to Credit card security code required. case sensitive
And [1100-1340] User fills sephoraPaymentCardNumber with `paymentCardNumber`
And [1100-1340] User fills sephoraPaymentExpirationMonth with `PaymentExpirationMonth`
And [1100-1340] User fills sephoraPaymentExpirationYear with `PaymentExpirationYear`
And [1100-1340] User fills sephoraPaymentCreditCardSecurity with `paymentSecurityCode`
And [1100-1400] Execute `click` javascript on sephoraShippingContinue
And [8022-0001] sleep after last action for 5000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraPlaceOrder
Then [1111-1080] sephoraSubmitErrorDialog should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on sephoraSubmitDialog
And [8022-0001] sleep after last action for 5000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraEditShipping
And [8022-0001] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraRemoveShipping
And [1100-1400] Execute `click` javascript on sephoraRemoveShippingAddress
And [8022-0001] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraEditPayment
And [8022-0001] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraRemovePayment
And [1100-1400] Execute `click` javascript on sephoraRemovePaumentCard
And [8022-0001] sleep after last action for 2000 Milliseconds
And [1100-1321] User scroll to the sephoraLogo then click it
And [1100-1371] User moves mouse to sephoraBasketIcon and click on sephoraBasketCheckout
And [1111-1080] sephoraBasketPage should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on sephoraRemoveFirstItem
And [8022-0001] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on sephoraRemoveSecondItem



