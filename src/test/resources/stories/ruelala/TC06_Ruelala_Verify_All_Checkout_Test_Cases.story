Meta:
@ReportName Rue La La

Scenario:  TC06_Ruelala_Verify_All_Checkout_Test_Cases

Given [1101-1080] ruelalaBagPage should be displayed
When [1100-1300] User clicks on the ruelalaProceedToCheckout
And [8007-0007] sleep after last action for 20000 Milliseconds
And [1000-6010] Focus on Frame envoyId
And [1111-1080] ruelalaCheckoutPage should be displayed, Within 120 seconds
And [1100-1340] User fills ruelalaCheckoutFirstName with `firstName`
And [1100-1340] User fills ruelalaCheckoutLastName with `lastName`
And [1100-1340] User fills ruelalaCheckoutAddress with `checkoutAddress`
And [1100-1340] User fills ruelalaCheckoutcity with `checkoutCity`
And [1100-1340] User fills ruelalaCheckoutState with `checkoutState`
And [1100-1340] User fills ruelalaCheckoutEmail with `checkoutEmailAddress`
And [1100-1340] User fills ruelalaCheckoutZipCode with `checkoutZipCode`
And [1100-1340] User fills ruelalaCheckoutPhoneNumber with `checkoutPhoneNumber`
And [1000-6010] Focus on Frame cc-frame
And [8007-0007] sleep after last action for 5000 Milliseconds
And [1100-1340] User fills ruelalaPaymentCardNumber with `paymentCardNumber`
And [1100-1601] Select ruelalaPaymentCardExpirationMonth By Value number:1
And [1100-1601] Select ruelalaPaymentCardExpirationYear By Value number:2032
And [1100-1340] User fills ruelalaPaymentSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1300] User clicks on the ruelalaPlaceOrder
Then [1111-1080] ruelalaSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser