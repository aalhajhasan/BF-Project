Meta:
@ReportName Ruelala

Scenario:  TC06_Ruelala_Verify_All_Checkout_Test_Cases

Given [1101-1080] ruelalaBagPage should be displayed
When [1100-1300] User clicks on the proceedToCheckout
And [1111-1080] checkoutPage should be displayed, Within 120 seconds
And [1100-1340] User fills checkoutFirstName with `firstName`
And [1100-1340] User fills checkoutLastName with `lastName`
And [1100-1340] User fills checkoutAddress with `checkoutAddress`
And [1100-1340] User fills checkoutcity with `checkoutCity`
And [1100-1340] User fills checkoutState with `checkoutState`
And [1100-1601] Select checkoutState By Value AA
And [1100-1340] User fills checkoutZipCode with `checkoutZipCode`
And [1100-1340] User fills checkoutPhoneNumber with `checkoutPhoneNumber`
And [1100-1340] User fills checkoutNameOnCard with `firstName`
And [1100-1340] User fills paymentCardNumber with `paymentCardNumber`
And [1100-1340] User fills paymentCardExpirationMonth with `paymentCardExpirationMonth`
And [1100-1340] User fills paymentCardExpirationYear with `paymentCardExpirationYear`
And [1100-1340] User fills paymentSecurityCode with `paymentSecurityCode`
And [1100-1300] User clicks on the placeOrder
Then [1111-1080] submitError should be displayed, Within 120 seconds