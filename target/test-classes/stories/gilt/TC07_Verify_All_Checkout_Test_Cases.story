Meta:
@DependOn |pdp4|0|


@namedItAs checkout

Scenario:  TC07_Verify_All_Checkout_Test_Cases

Given [1101-1080] cartDialog should be displayed
When [1100-1300] User clicks on the checkoutNowButton
And [1012-1000] page is loaded, within 120 seconds
And [1101-1184] the user saves checkoutHeader text in scenario scope under name checkout
Then [1111-1100] checkoutHeader text should equal to `checkout`, Within 120 seconds
And [1101-1080] merchantLogo should be displayed
And [1100-1321] User scroll to the promoSection then click it
Then [1101-1080] promoCodeField should be displayed
And [1100-1320] User scroll to the shipmentItemsSection
And [1100-1320] User scroll to the checkoutHeader
And [1101-1080] shippingCharge should be displayed
And [1101-1080] dutiesCharge should be displayed
And [1100-1300-S] User clicks on the removeDiscount
And [1101-1184] the user saves subTotal text in scenario scope under name subTotalValue
And [1101-1184] the user saves vat text in scenario scope under name vatValue
And [1101-1184] the user saves shipping text in scenario scope under name shippingValue
And [1101-1184] the user saves total text in scenario scope under name totalValue
And [8000-0004] `totalValue` price should be matched with the summation of `subTotalValue` and `vatValue` and `shippingValue`
And [1100-1300] User clicks on the changeShippingAdress
And [1100-1321] User scroll to the addNewAddress then click it
And [1100-1300] User clicks on the saveAndContinueButton
And [1101-1102] firstNameError text is equal to First Name is required. case sensitive
And [1101-1102] secondNameError text is equal to Last Name is required. case sensitive
And [1101-1102] streetAddressError text is equal to Street Address is required. case sensitive
And [1101-1102] cityError text is equal to City is required. case sensitive
And [1101-1102] zipCodeError text is equal to Zip Code is required. case sensitive
And [1101-1102] phoneError text is equal to Phone is required. case sensitive
And [1100-1340] User fills firstNameSection with `firstName`
And [1100-1340] User fills lastNameSection with `lastName`
And [1100-1340] User fills streetAddressSection with `streetAddress`
And [1100-1340] User fills citySection with `city`
And [1100-1340] User fills zipCodeSection with `zipCode`
And [1100-1340] User fills phoneSection with `phoneNumber`
And [1100-1300] User clicks on the saveAndContinueButton
And [1100-1300] User clicks on the changePaymentMethod
And [1100-1321] User scroll to the addNewPaymentMethod then click it
And [1100-1300] User clicks on the addPymentMethodButton
And [1101-1102] cardNumberError text is equal to Card Number is required. case sensitive
And [1101-1102] expirationDateError text is equal to Please enter a valid expiration date. case sensitive
And [1101-1102] securityCodeError text is equal to Security Code is required. case sensitive
And [1100-1340] User fills cardSection with `visaCreditCard`
And [1100-1601] Select month By Value 07
And [1100-1601] Select year By Value 2032
And [1100-1340] User fills securitySection with `securityCardCode`
And [1100-1300] User clicks on the addPymentMethodButton
And [1111-1080] checkoutHeader should be displayed, Within 120 seconds
And [1100-1320] User scroll to the securityCodeSection
And [1111-0080] It should be displayed, Within 120 seconds
And [1100-1340-S] User fills securityCodeSection with `securityCardCode`
And [1100-1340-S] User fills creditCard with `visaCreditCard`
And [1100-1320] User scroll to the checkoutHeader
Then [1111-1000] submitYourOrderButton should be clickable, Within 120 seconds
