Meta:
@ReportName General Pants

Scenario:  TC06_Generalpants_Verify_All_Checkout_Test_Cases

Given [1101-1080] generalPantsCartPage should be displayed
When [1100-1400] Execute `click` javascript on generalPantsCheckout
And [8025-0001] sleep after last action for 10000 Milliseconds
And [8025-0008] check items before navigate to checkout
And [1000-6010] Focus on Frame envoyId
And [1100-1321] User scroll to the generalPantsDeliveryContinue then click it
And [1101-1102] generalPantsCheckoutEmailError text is equal to Email address is required case sensitive
And [1101-1102] generalPantsCheckoutFirstNameError text is equal to First name is required case sensitive
And [1101-1102] generalPantsCheckoutLastNameError text is equal to Last name is required case sensitive
And [1101-1102] generalPantsCheckoutAddressError text is equal to Address is required case sensitive
And [1101-1102] generalPantsCheckoutCityError text is equal to City is required case sensitive
And [1101-1102] generalPantsCheckoutPhoneError text is equal to Primary phone number is required case sensitive
And [1101-1102] generalPantsCheckoutPostalCodeError text is equal to Postal code is required case sensitive
And [1100-1340] User fills generalPantsCheckoutEmail with `checkoutEmailAddress`
And [1100-1340] User fills generalPantsCheckoutFirstName with `firstName`
And [1100-1340] User fills generalPantsCheckoutLastName with `lastName`
And [1100-1340] User fills generalPantsCheckoutAddress with `checkoutEmailAddress`
And [1100-1340] User fills generalPantsCheckoutCity with `checkoutCity`
And [1100-1340] User fills generalPantsCheckoutPhone with `checkoutPhoneNumber`
And [1100-1340] User fills generalPantsCheckoutPostalCode with `checkoutPostalCode`
!-- And [1101-1181] the user saves generalPantsItemsTotal text in global scope under name generalPantsItemsTotal
!-- And [1101-1181] the user saves generalPantsShipping text in global scope under name generalPantsShipping
!-- And [1101-1181] the user saves generalPantsDutiesAndTaxes text in global scope under name generalPantsDutiesAndTaxes
!-- And [1101-1181] the user saves generalPantsOrderTotal text in global scope under name generalPantsOrderTotal
!-- And [8025-0009] `generalPantsOrderTotal` price should be matched with the summation of `generalPantsItemsTotal` , `generalPantsShipping` and `generalPantsDutiesAndTaxes`
And [1100-1400] Execute `click` javascript on generalPantsDeliveryContinue
And [8029-0003] sleep after last action for 5000 Milliseconds
And [1000-6010] Focus on Frame cc-frame
And [1100-1340] User fills generalPantsCheckoutCardNumber with `paymentCardNumber`
And [1100-1340] User fills generalPantsCheckoutExpirationDate with `paymentExpirationDate`
And [1100-1340] User fills generalPantsCheckoutSecurityCode with `paymentSecurityCode`
And [1000-6020] Focus on parent Frame
And [1100-1400] Execute `click` javascript on generalPantsPlaceOrder
Then [1111-1080] generalPantsCheckoutSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser