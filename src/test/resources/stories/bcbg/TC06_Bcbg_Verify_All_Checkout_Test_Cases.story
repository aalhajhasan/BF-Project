Meta:
@ReportName Bcbg

Scenario: TC06_Bcbg_Verify_All_Checkout_Test_Cases

Given [1101-1080] bcbgCartPage should be displayed
When [1100-1400] Execute `click` javascript on bcbgProceedToPurchase
And [1111-1080] bcbgGuestCheckout should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on bcbgGuestContinue
And [1111-1080] bcbgCheckoutShipping should be displayed, Within 120 seconds
And [8028-0001] sleep after last action for 5000 Milliseconds
And [1100-1321] User scroll to the bcbgShippingContinue then click it
And [1211-1080] bcbgErrores should be all displayed, Within 120 seconds
And [1100-1340] User fills bcbgFirstName with `firstName`
And [1100-1340] User fills bcbgLastName with `lastName`
And [1100-1340] User fills bcbgAddress with `checkoutAddress`
And [1100-1340] User fills bcbgCity with `checkoutCity`
And [1100-1340] User fills bcbgPhoneNumber with `checkoutPhoneNumber`
And [1100-1321] User scroll to the bcbgShippingContinue then click it
And [1111-1080] bcbgBilling should be displayed, Within 120 seconds
And [8028-0001] sleep after last action for 5000 Milliseconds
And [1100-1321] User scroll to the bcbgBillingContinue then click it
And [1211-1080] bcbgErrores should be all displayed, Within 120 seconds
And [1100-1340] User fills bcbgEmail with `checkoutEmailAddress`
And [1100-1340] User fills bcbgNameOnCard with `firstName`
And [1100-1601] Select bcbgCardType By Value VISA
And [1100-1340] User fills bcbgCardNumber with `paymentCardNumber`
And [1100-1340] User fills bcbgCardSecurityCode with `paymentSecurityCode`
And [1100-1601] Select bcbgMonth By Value 1
And [1100-1601] Select bcbgYear By Value 2020
And [1100-1321] User scroll to the bcbgBillingContinue then click it
And [1111-1080] bcbgSummary should be displayed, Within 120 seconds
And [8028-0001] sleep after last action for 5000 Milliseconds
And [1100-1400] Execute `click` javascript on bcbgSubmitOrder
Then [1111-1080] bcbgSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser
