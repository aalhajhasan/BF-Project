Meta:
@ReportName Jcrew

Scenario: TC06_Jcrew_Verify_All_Checkout_Test_Cases

Given [1101-1080] jcrewItemsBagPage should be displayed
When [1100-1300] User clicks on the jcrewCheckoutNow
And [1111-1080] jcrewCheckoutPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the jcrewCheckoutAsGuest
And [1111-1080] jcrewCheckoutShippingPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the jcrewContinueButton then click it
And [1101-1102] jcrewFirstNameError text is equal to Please enter a first name. case sensitive
And [1101-1102] jcrewLastNameError text is equal to Please enter a last name. case sensitive
And [1101-1102] jcrewStreetAddressError text is equal to Please enter a valid street address. case sensitive
And [1101-1102] jcrewCityError text is equal to Please enter a valid city. case sensitive
And [1101-1102-S] jcrewPostalCodeError text is equal to Please enter a valid postal code. case sensitive
And [1101-1102] jcrewPhoneNumberError text is equal to Please enter a phone number. case sensitive
And [1100-1340] User fills jcrewFirstName with `firstName`
And [1100-1340] User fills jcrewLastName with `lastName`
And [1100-1340] User fills jcrewStreetAddress with `streetAddress`
And [1100-1340] User fills jcrewCity with `city`
And [1100-1340-S] User fills jcrewPostalCode with `postalCode`
And [1100-1340] User fills jcrewPhoneNumber with `phoneNumber`
And [1100-1300] User clicks on the jcrewContinueButton
And [1111-1080-S] jcrewCheckYourAddressDialog should be displayed, Within 120 seconds
And [1100-1300-S] User clicks on the jcrewUseAddressAsEntered
And [1100-1300] User clicks on the jcrewShippingContinueButton
And [1111-1080] jcrewCheckoutBillingPage should be displayed, Within 120 seconds
And [1100-1321] User scroll to the jcrewBillingContinueButton then click it
And [1101-1102] jcrewCardNumberError text is equal to Please enter a valid credit card number. case sensitive
And [1101-1102] jcrewSecurityCodeError text is equal to Please enter the 3 digit code located on the back of your card case sensitive
And [1101-1102] jcrewExpirationDateError text is equal to Please enter a valid expiration date. case sensitive
And [1101-1102] jcrewNameOnCardError text is equal to Please provide the name on the card. case sensitive
And [1101-1102] jcrewEmailAddressError text is equal to Please enter a valid email address. case sensitive
And [1100-1340] User fills jcrewCardNumber with `visaCreditCard`
And [1100-1340] User fills jcrewSecurityCode with `securityCardCode`
And [1100-1601] Select jcrewExpirationMonth By Value 1
And [1100-1601] Select jcrewExpirationYear By Value 2,028
And [1100-1340] User fills jcrewNameOnCard with `firstName`
And [1100-1340] User fills jcrewEmailAddress with `newUser`
And [1100-1300] User clicks on the jcrewBillingContinueButton
And [1111-1080] jcrewCheckoutReviewPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the jcrewPlaceMyOrder
Then [1111-1080] jcrewSubmitError should be displayed, Within 120 seconds


