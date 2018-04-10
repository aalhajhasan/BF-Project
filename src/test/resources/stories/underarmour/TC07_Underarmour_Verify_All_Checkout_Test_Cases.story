Meta:
@ReportName Underarmour

Scenario:  TC07_Underarmour_Verify_All_Checkout_Test_Cases

Given [1101-1080] underarmourBagPage should be displayed
When [1100-1300] User clicks on the underarmourProceedToCheckout
!-- And [1111-1080] underarmourCheckoutPage should be displayed, Within 30 seconds
!-- And [1100-1340] User fills underarmourCheckoutFirstName with `firstName`
!-- And [1100-1340] User fills underarmourCheckoutLastName with `lastName`
!-- And [1100-1340] User fills underarmourCheckoutAddress with `checkoutAddress`
!-- And [1100-1340] User fills underarmourCheckoutcity with `checkoutCity`
!-- And [1100-1340] User fills underarmourCheckoutState with `checkoutState`
!-- And [1100-1340] User fills underarmourCheckoutEmail with `checkoutEmailAddress`
!-- And [1100-1340] User fills underarmourCheckoutZipCode with `checkoutZipCode`
!-- And [1100-1340] User fills underarmourCheckoutPhoneNumber with `checkoutPhoneNumber`
!-- And [1100-1340] User fills underarmourPaymentCardNumber with `paymentCardNumber`
!-- And [1100-1601] Select underarmourPaymentCardExpirationMonth By Value number:1
!-- And [1100-1601] Select underarmourPaymentCardExpirationYear By Value number:2032
!-- And [1100-1340] User fills underarmourPaymentSecurityCode with `paymentSecurityCode`
!-- And [1100-1300] User clicks on the underarmourPlaceOrder
!-- Then [1111-1080] underarmourSubmitError should be displayed, Within 120 seconds