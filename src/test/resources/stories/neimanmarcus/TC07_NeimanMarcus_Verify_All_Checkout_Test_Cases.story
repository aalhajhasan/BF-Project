Meta:
@ReportName Neiman Marcus

Scenario:  TC07_NeimanMarcus_Verify_All_Checkout_Test_Cases

Given [1101-1080] neimanmarcusBagPage should be displayed
When [1100-1300] User clicks on the neimanmarcusCheckoutButton
And [8015-0003] sleep after last action for 20000 Milliseconds
And [1111-1080] neimanmarcusCheckoutPage should be displayed, Within 120 seconds
And [1101-1181] the user saves neimanmarcusItemsTotal text in global scope under name neimanmarcusItemsTotal
And [1101-1181] the user saves neimanmarcusShipping text in global scope under name neimanmarcusShipping
And [1101-1181] the user saves neimanmarcusDuties text in global scope under name neimanmarcusDuties
And [1101-1181] the user saves neimanmarcusTax text in global scope under name neimanmarcusTax
And [1101-1181] the user saves neimanmarcusOrderTotal text in global scope under name neimanmarcusOrderTotal
And [8015-0007] `neimanmarcusOrderTotal` price should be matched with the summation of `neimanmarcusItemsTotal` , `neimanmarcusShipping` , `neimanmarcusDuties` and `neimanmarcusTax`
And [1100-1321] User scroll to the neimanmarcusCheckoutContinue then click it
And [8015-0003] sleep after last action for 10000 Milliseconds
And [1101-1102] neimanmarcusCheckoutEmailError text is equal to Please provide an entry for the Email field. case sensitive
And [1101-1102] neimanmarcusCheckoutFirstNameError text is equal to Please provide an entry for the First Name/Given Name field. case sensitive
And [1101-1102] neimanmarcusCheckoutLastNameError text is equal to Please provide an entry for the Last Name/Family Name field. case sensitive
And [1101-1102] neimanmarcusCheckoutAddressError text is equal to Please provide an entry for the Address 1 field. case sensitive
And [1101-1102] neimanmarcusCheckoutCityError text is equal to Please provide an entry for the City field. case sensitive
And [1101-1102] neimanmarcusCheckoutStateError text is equal to Please provide an entry for the Province/State field. case sensitive
And [1101-1102] neimanmarcusCheckoutPhoneError text is equal to Please provide an entry for the Phone Number field. case sensitive
And [1100-1340] User fills neimanmarcusCheckoutFirstName with `firstName`
And [1100-1340] User fills neimanmarcusCheckoutLastName with `lastName`
And [1100-1340] User fills neimanmarcusCheckoutAddress with `Address`
And [1100-1340] User fills neimanmarcusCheckoutCity with `City`
And [1100-1340] User fills neimanmarcusCheckoutState with `State`
And [1100-1340] User fills neimanmarcusCheckoutPhone with `contactNumber`
And [1100-1340] User fills neimanmarcusCheckoutEmail with `emailAddress`
And [1100-1300] User clicks on the neimanmarcusCheckoutContinue
And [8015-0003] sleep after last action for 10000 Milliseconds
And [1111-1080] neimanmarcusPayment should be displayed, Within 120 seconds
And [1100-1601] Select neimanmarcusPaymentType By Value VISA
And [1100-1340] User fills neimanmarcusCheckoutCardNumber with `paymentCardNumber`
And [1100-1340] User fills neimanmarcusCheckoutSecurityCode with `paymentSecurityCode`
And [1100-1601] Select neimanmarcusExpirationMonth By Value 07
And [1100-1601] Select neimanmarcusExpirationYear By Value 2021
And [1100-1300] User clicks on the neimanmarcusCheckoutPlaceOrder
Then [1111-1080] neimanmarcusCheckoutSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser


