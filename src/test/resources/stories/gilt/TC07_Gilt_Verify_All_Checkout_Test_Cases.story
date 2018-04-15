Meta:
@ReportName Gilt

Scenario: TC07_Gilt_Verify_All_Checkout_Test_Cases

Given [1101-1080] giltCartDialog should be displayed
When [1100-1300] User clicks on the giltCheckoutNowButton
And [1012-1000] page is loaded, within 120 seconds
And [1101-1184] the user saves giltCheckoutHeader text in scenario scope under name giltCheckout
Then [1111-1100] giltCheckoutHeader text should equal to `giltCheckout`, Within 120 seconds
And [1101-1080] giltLogo should be displayed
And [1100-1321] User scroll to the giltPromoSection then click it
Then [1101-1080] giltPromoCodeField should be displayed
And [1100-1320] User scroll to the giltCheckoutHeader
!-- And [1100-1300-S] User clicks on the giltRemoveDiscount
!-- And [1101-1184] the user saves giltSubTotal text in scenario scope under name giltSubTotalValue
!-- And [1101-1184-S] the user saves giltVat text in scenario scope under name giltVatValue
!-- And [1101-1184] the user saves giltShipping text in scenario scope under name giltShippingValue
!-- And [1101-1184] the user saves giltTotal text in scenario scope under name giltTotalValue
!-- And [8000-0004] `giltTotalValue` price should be matched with the summation of `giltSubTotalValue` and `giltVatValue` and `giltShippingValue`
And [1100-1300] User clicks on the giltChangeShippingAdress
And [1100-1321] User scroll to the giltAddNewAddress then click it
And [1100-1300] User clicks on the giltSaveAndContinueButton
And [1101-1102] giltFirstNameError text is equal to First Name is required. case sensitive
And [1101-1102] giltLastNameError text is equal to Last Name is required. case sensitive
And [1101-1102] giltStreetAddressError text is equal to Street Address is required. case sensitive
And [1101-1102] giltCityError text is equal to City is required. case sensitive
And [1101-1102] giltZipCodeError text is equal to Zip Code is required. case sensitive
And [1101-1102] giltPhoneError text is equal to Phone is required. case sensitive
And [1100-1340] User fills giltFirstNameSection with `firstName`
And [1100-1340] User fills giltLastNameSection with `lastName`
And [1100-1340] User fills giltStreetAddressSection with `streetAddress`
And [1100-1340] User fills giltCitySection with `city`
And [1100-1340] User fills giltZipCodeSection with `zipCode`
And [1100-1340] User fills giltPhoneSection with `phoneNumber`
And [1100-1300] User clicks on the giltSaveAndContinueButton
And [1100-1300] User clicks on the giltChangePaymentMethod
And [1100-1321] User scroll to the giltAddNewPaymentMethod then click it
And [1100-1300] User clicks on the giltAddPymentMethodButton
And [1101-1102] giltCardNumberError text is equal to Card Number is required. case sensitive
And [1101-1102] giltExpirationDateError text is equal to Please enter a valid expiration date. case sensitive
And [1101-1102] giltSecurityCodeError text is equal to Security Code is required. case sensitive
And [1100-1340] User fills giltCardSection with `visaCreditCard`
And [1100-1601] Select giltMonth By Value 07
And [1100-1601] Select giltYear By Value 2032
And [1100-1340] User fills giltSecuritySection with `securityCardCode`
And [1100-1300] User clicks on the giltAddPymentMethodButton
And [1012-1000] page is loaded, within 120 seconds
And [1111-1080-S] giltSecurityCodeSection should be displayed, Within 120 seconds
And [1100-1340-S] User fills giltSecurityCodeSection with `securityCardCode`
And [1100-1320] User scroll to the giltCheckoutHeader
Then [1111-1000] giltSubmitYourOrderButton should be clickable, Within 120 seconds
