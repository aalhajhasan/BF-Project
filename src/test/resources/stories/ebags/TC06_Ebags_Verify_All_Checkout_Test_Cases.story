Meta:
@ReportName ebags

Scenario:  TC06_Ebags_Verify_All_Checkout_Test_Cases

Given [1101-1080] ebagsCartPage should be displayed
When [1100-1300] User clicks on the ebagsContinuoCheckout
And [8006-0010] sleep after last action for 20000 seconds
And [1000-6010] Focus on Frame envoyId
And [1111-1080] ebagsDeliveryCheckout should be displayed, Within 30 seconds
And [1101-1181] the user saves ebagsItemsTotal text in global scope under name ebagsItemsTotal
And [1101-1181] the user saves ebagsShipping text in global scope under name ebagsShipping
And [1101-1181] the user saves ebagsDutiesAndTaxes text in global scope under name ebagsDutiesAndTaxes
And [1101-1181] the user saves ebagsOrderTotal text in global scope under name ebagsOrderTotal
And [8006-0008] `ebagsOrderTotal` price should be matched with the summation of `ebagsItemsTotal` , `ebagsShipping` and `ebagsDutiesAndTaxes`
And [1100-1321] User scroll to the ebagsCheckoutContinue then click it
And [1101-1102] ebagsDeliveryEmailAddressError text is equal to Email address is required case sensitive
And [1101-1102] ebagsDeliveryFirstNameError text is equal to First name is required case sensitive
And [1101-1102] ebagsDeliveryLastNameError text is equal to Last name is required case sensitive
And [1101-1102] ebagsDeliveryAddressError text is equal to Address is required case sensitive
And [1101-1102] ebagsDeliveryCityError text is equal to City is required case sensitive
And [1101-1102] ebagsDeliveryPhoneNumberError text is equal to Primary phone number is required case sensitive
And [1100-1340] User fills ebagsDeliveryEmailAddress with `checkoutEmailAddress`
And [1100-1340] User fills ebagsDeliveryFirstName with `firstName`
And [1100-1340] User fills ebagsDeliveryLastName with `lastName`
And [1100-1340] User fills ebagsDeliveryAddress with `checkoutAddress`
And [1100-1340] User fills ebagsDeliveryCity with `checkoutCity`
And [1100-1340] User fills ebagsDeliveryZipCode with `checkoutZipCode`
And [1100-1340] User fills ebagsDeliveryPhoneNumber with `checkoutPhoneNumber`
And [1100-1400] Execute `click` javascript on ebagsCheckoutContinue
And [1100-1400] Execute `click` javascript on ebagsPalceOrderButton
And [1000-6010] Focus on Frame cc-frame
And [8006-0010] sleep after last action for 5000 seconds
And [1101-1102] ebagsPaymentCardNumberError text is equal to Card number is required case sensitive
And [1101-1102] ebagsPaymentExpirationDateError text is equal to Expiration date is required case sensitive
And [1101-1102] ebagsPaymentSecurityCodeError text is equal to Security code is required case sensitive
And [1100-1340] User fills ebagsPaymentCardNumber with `paymentCardNumber`
And [1100-1340] User fills ebagsPaymentExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills ebagsPaymentSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1400] Execute `click` javascript on ebagsPalceOrderButton
Then [1111-1080] ebagsSubmitError should be displayed, Within 120 seconds


