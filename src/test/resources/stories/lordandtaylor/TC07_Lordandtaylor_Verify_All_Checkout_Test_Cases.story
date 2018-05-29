Meta:
@ReportName Lord And Taylor

Scenario:  TC07_Lordandtaylor_Verify_All_Checkout_Test_Cases

Given [1101-1080] lordandtaylorBagPage should be displayed
When [1100-1300] User clicks on the lordandtaylorCheckoutButton
And [1111-1080] lordandtaylorCheckoutDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the lordandtaylorCheckoutAsGuest
And [8009-0007] sleep after last action for 15000 Milliseconds
And [1100-1321] User scroll to the lordandtaylorContinueCheckout then click it
And [1101-1102] lordandtaylorFirstNameError text is equal to Please enter a valid first name. case sensitive
And [1101-1102] lordandtaylorLastNameError text is equal to Please enter a valid last name. case sensitive
And [1101-1102] lordandtaylorAddressError text is equal to Please enter a valid street address for your shipping address. case sensitive
And [1101-1102] lordandtaylorCityError text is equal to Please enter a city. case sensitive
And [1101-1102] lordandtaylorEmailError text is equal to Please enter a valid email address. case sensitive
And [1101-1102] lordandtaylorPhoneError text is equal to Please enter a valid phone number. case sensitive
And [1100-1340] User fills lordandtaylorFirstName with `firstName`
And [1100-1340] User fills lordandtaylorLastName with `lastName`
And [1100-1340] User fills lordandtaylorAddress with `address`
And [1100-1340] User fills lordandtaylorCity with `city`
And [1100-1340] User fills lordandtaylorEmail with `emailAddress`
And [1100-1340] User fills lordandtaylorPhone with `contactNumber`
And [1100-1300] User clicks on the lordandtaylorContinueCheckout
And [8009-0007] sleep after last action for 10000 Milliseconds
And [1100-1321] User scroll to the lordandtaylorPaymentContinueCheckout then click it
And [1101-1102] lordandtaylorCreditCardError text is equal to Please supply a valid credit card number. case sensitive
And [1101-1102] lordandtaylorNameOnCardError text is equal to Please supply the name displayed on the credit card. case sensitive
And [1101-1102] lordandtaylorExpirationError text is equal to Please supply a valid expiration date. case sensitive
And [1101-1102] lordandtaylorSecurityCodeError text is equal to Please supply the security code for your credit card. case sensitive
And [1100-1340] User fills lordandtaylorCreditCard with `cardNumber`
And [1100-1340] User fills lordandtaylorNameOnCard with `firstName`
And [1100-1601] Select lordandtaylorExpirationMonth By Value 1
And [1100-1601] Select lordandtaylorExpirationYear By Value 2030
And [1100-1340] User fills lordandtaylorSecurityCode with `paymentSecurityCode`
And [1100-1300] User clicks on the lordandtaylorPaymentContinueCheckout
And [8009-0007] sleep after last action for 10000 Milliseconds
And [1100-1340] User fills lordandtaylorSecurityNumber with `paymentSecurityCode`
And [1100-1300] User clicks on the lordandtaylorPlaceOrder
And [8009-0007] sleep after last action for 10000 Milliseconds
Then [1111-1080] lordandtaylorSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser














































