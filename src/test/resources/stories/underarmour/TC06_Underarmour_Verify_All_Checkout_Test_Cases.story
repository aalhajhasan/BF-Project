Meta:
@ReportName Under Armour

Scenario:  TC06_Underarmour_Verify_All_Checkout_Test_Cases

Given [1101-1080] underarmourBagPage should be displayed
When [1100-1400] Execute `click` javascript on underarmourProceedToCheckout
And [8011-0007] sleep after last action for 10000 Milliseconds
And [1000-6010] Focus on Frame envoyId
And [1111-1080] underarmourDeliveryCheckout should be displayed, Within 120 seconds
And [1101-1181] the user saves underarmourItemsTotal text in global scope under name underarmourItemsTotal
And [1101-1181] the user saves underarmourShipping text in global scope under name underarmourShipping
And [1101-1181] the user saves underarmourDutiesAndTaxes text in global scope under name underarmourDutiesAndTaxes
And [1101-1181] the user saves underarmourOrderTotal text in global scope under name underarmourOrderTotal
And [8006-0008] `underarmourOrderTotal` price should be matched with the summation of `underarmourItemsTotal` , `underarmourShipping` and `underarmourDutiesAndTaxes`
And [1100-1320] User scroll to the underarmourCheckoutContinue
And [1100-1400] Execute `click` javascript on underarmourCheckoutContinue
And [1101-1102] underarmourDeliveryEmailAddressError text is equal to Email address is required case sensitive
And [1101-1102] underarmourDeliveryFirstNameError text is equal to First name is required case sensitive
And [1101-1102] underarmourDeliveryLastNameError text is equal to Last name is required case sensitive
And [1101-1102] underarmourDeliveryAddressError text is equal to Address is required case sensitive
And [1101-1102] underarmourDeliveryCityError text is equal to City is required case sensitive
And [1101-1102] underarmourDeliveryPhoneNumberError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills underarmourDeliveryEmailAddress with `checkoutEmailAddress`
And [1100-1340] User fills underarmourDeliveryFirstName with `firstName`
And [1100-1340] User fills underarmourDeliveryLastName with `lastName`
And [1100-1340] User fills underarmourDeliveryAddress with `checkoutAddress`
And [1100-1340] User fills underarmourDeliveryCity with `checkoutCity`
And [1100-1340] User fills underarmourDeliveryZipCode with `checkoutZipCode`
And [1100-1340] User fills underarmourDeliveryPhoneNumber with `checkoutPhoneNumber`
And [1100-1400] Execute `click` javascript on underarmourCheckoutContinue
And [8006-0010] sleep after last action for 5000 Milliseconds
And [1100-1400] Execute `click` javascript on underarmourPalceOrderButton
And [1000-6010] Focus on Frame cc-frame
And [1101-1102] underarmourPaymentCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] underarmourPaymentExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] underarmourPaymentSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills underarmourPaymentCardNumber with `paymentCardNumber`
And [1100-1340] User fills underarmourPaymentExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills underarmourPaymentSecurityCode with `paymentSecurityCode`
And [8006-0010] sleep after last action for 5000 Milliseconds
And [1000-6020] Focus on parent Frame
And [1100-1400] Execute `click` javascript on underarmourPalceOrderButton
Then [1111-1080] underarmourSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser

