Meta:
@ReportName Party City Canada

Scenario:  TC06_Partycitycanada_Verify_All_Checkout_Test_Cases

Given [1101-1080] partycityCartPage should be displayed
When [1100-1400] Execute `click` javascript on partycityCartCheckout
And [8019-0001] sleep after last action for 15000 Milliseconds
And [1000-6010] Focus on Frame envoyId
!-- And [1101-1181] the user saves partycityItemsTotal text in global scope under name partycityItemsTotal
!-- And [1101-1181] the user saves partycityShipping text in global scope under name partycityShipping
!-- And [1101-1181] the user saves partycityDutiesAndTaxes text in global scope under name partycityDutiesAndTaxes
!-- And [1101-1181] the user saves partycityOrderTotal text in global scope under name partycityOrderTotal
!-- And [8019-0008] `partycityOrderTotal` price should be matched with the summation of `partycityItemsTotal` , `partycityShipping` and `partycityDutiesAndTaxes`
And [1100-1321] User scroll to the partycityCheckoutContinue then click it
And [1101-1102] partycityDeliveryEmailAddressError text is equal to Email address is required case sensitive
And [1101-1102] partycityDeliveryFirstNameError text is equal to First name is required case sensitive
And [1101-1102] partycityDeliveryLastNameError text is equal to Last name is required case sensitive
And [1101-1102] partycityDeliveryAddressError text is equal to Address is required case sensitive
And [1101-1102] partycityDeliveryCityError text is equal to City is required case sensitive
And [1101-1102] partycityDeliveryPhoneNumberError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills partycityDeliveryEmailAddress with `checkoutEmailAddress`
And [1100-1340] User fills partycityDeliveryFirstName with `firstName`
And [1100-1340] User fills partycityDeliveryLastName with `lastName`
And [1100-1340] User fills partycityDeliveryAddress with `checkoutAddress`
And [1100-1340] User fills partycityDeliveryCity with `checkoutCity`
And [1100-1340] User fills partycityDeliveryZipCode with `checkoutZipCode`
And [1100-1340] User fills partycityDeliveryPhoneNumber with `checkoutPhoneNumber`
And [1100-1400] Execute `click` javascript on partycityCheckoutContinue
And [8006-0010] sleep after last action for 3000 Milliseconds
And [1100-1400] Execute `click` javascript on partycityPalceOrderButton
And [1000-6010] Focus on Frame cc-frame
And [8006-0010] sleep after last action for 2000 Milliseconds
And [1101-1102] partycityPaymentCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] partycityPaymentExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] partycityPaymentSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills partycityPaymentCardNumber with `paymentCardNumber`
And [1100-1340] User fills partycityPaymentExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills partycityPaymentSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1400] Execute `click` javascript on partycityPalceOrderButton
Then [1111-1080] partycitySubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser

