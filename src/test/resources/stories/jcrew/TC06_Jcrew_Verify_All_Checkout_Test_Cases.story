
Scenario: TC06_Jcrew_Verify_All_Checkout_Test_Cases

Given [1101-1080] itemsBagPage should be displayed
When [1100-1300] User clicks on the checkoutNow
And [1111-1080] checkoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the checkoutAsGuest
And [1111-1080] checkoutShippingPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the continueButton then click it
And [1101-1102] firstNameError text is equal to Please enter a first name. case sensitive
And [1101-1102] lastNameError text is equal to Please enter a last name. case sensitive
And [1101-1102] streetAddressError text is equal to Please enter a valid street address. case sensitive
And [1101-1102] cityError text is equal to Please enter a valid city. case sensitive
And [1101-1102] postalCodeError text is equal to Please enter a valid postal code. case sensitive
And [1101-1102] phoneNumberError text is equal to Please enter a phone number. case sensitive
And [1100-1340] User fills firstName with `firstName`
And [1100-1340] User fills lastName with `lastName`
And [1100-1340] User fills streetAddress with `streetAddress`
And [1100-1340] User fills city with `city`
And [1100-1340] User fills postalCode with `postalCode`
And [1100-1340] User fills phoneNumber with `phoneNumber`
And [1100-1300] User clicks on the continueButton
And [1111-1080] checkYourAddressDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the useAddressAsEntered
And [1100-1300] User clicks on the shippingContinueButton
And [1111-1080] checkoutBillingPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the billingContinueButton then click it
And [1101-1102] cardNumberError text is equal to Please enter a valid credit card number. case sensitive
And [1101-1102] securityCodeError text is equal to Please enter the 3 digit code located on the back of your card case sensitive
And [1101-1102] expirationDateError text is equal to Please enter a valid expiration date. case sensitive
And [1101-1102] nameOnCardError text is equal to Please provide the name on the card. case sensitive
And [1101-1102] emailAddressError text is equal to Please enter a valid email address. case sensitive
And [1100-1340] User fills cardNumber with `visaCreditCard`
And [1100-1340] User fills securityCode with `securityCardCode`
And [1100-1601] Select expirationMonth By Value 1
And [1100-1601] Select expirationYear By Value 2,028
And [1100-1340] User fills nameOnCard with `firstName`
And [1100-1340] User fills emailAddress with `newUser`
And [1100-1300] User clicks on the billingContinueButton
And [1111-1080] checkoutReviewPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the placeMyOrder
Then [1111-1080] submitError should be displayed, Within 120 seconds


