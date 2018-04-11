
Scenario:  TC05_Bergdorf_Verify_All_Checkout_Test_Cases

Given [1101-1080] bergdorfBagPage should be displayed
When [1100-1300] User clicks on the bergdorfCheckoutButton
!-- And [1111-1080] BergdorfCheckoutPage should be displayed, Within 30 seconds
!-- And [1100-1340] User fills BergdorfCheckoutFirstName with `firstName`
!-- And [1100-1340] User fills BergdorfCheckoutLastName with `lastName`
!-- And [1100-1340] User fills BergdorfCheckoutAddress with `checkoutAddress`
!-- And [1100-1340] User fills BergdorfCheckoutcity with `checkoutCity`
!-- And [1100-1340] User fills BergdorfCheckoutState with `checkoutState`
!-- And [1100-1340] User fills BergdorfCheckoutEmail with `checkoutEmailAddress`
!-- And [1100-1340] User fills BergdorfCheckoutZipCode with `checkoutZipCode`
!-- And [1100-1340] User fills BergdorfCheckoutPhoneNumber with `checkoutPhoneNumber`
!-- And [1100-1340] User fills BergdorfPaymentCardNumber with `paymentCardNumber`
!-- And [1100-1601] Select BergdorfPaymentCardExpirationMonth By Value number:1
!-- And [1100-1601] Select BergdorfPaymentCardExpirationYear By Value number:2032
!-- And [1100-1340] User fills BergdorfPaymentSecurityCode with `paymentSecurityCode`
!-- And [1100-1300] User clicks on the BergdorfPlaceOrder
!-- Then [1111-1080] BergdorfSubmitError should be displayed, Within 120 seconds