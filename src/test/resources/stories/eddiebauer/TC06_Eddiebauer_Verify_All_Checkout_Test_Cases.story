Meta:
@ReportName Eddie Bauer

Scenario:  TC06_Eddiebauer_Verify_All_Checkout_Test_Cases

Given [1101-1080] eddiebauerBagPage should be displayed
When [1100-1400] Execute `click` javascript on eddiebauerProceedToCheckout
And [1111-1080] eddiebauerGuestCheckout should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on eddiebauerGuestCheckoutButton
And [1111-1080] eddiebauerShippingForm should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on eddiebauerShippingContinue
And [8017-0001] sleep after last action for 2000 Milliseconds
And [1101-1102] eddiebauerFirstNameError text is equal to Please enter a first name. case sensitive
And [1101-1102] eddiebauerLastNameError text is equal to Please enter a last name. case sensitive
And [1101-1102] eddiebauerAddressError text is equal to Please enter a valid address. case sensitive
And [1101-1102] eddiebauerPostalCodeError text is equal to Please enter a postal code. case sensitive
And [1101-1102] eddiebauerCityError text is equal to Please enter a valid city. case sensitive
And [1101-1102] eddiebauerStateError text is equal to Please enter a valid state. case sensitive
And [1101-1102] eddiebauerCountryError text is equal to Please select a country. case sensitive
And [1101-1102] eddiebauerEmailAddressError text is equal to Please enter a valid email address. case sensitive
And [1101-1102] eddiebauerPhoneNumberError text is equal to Please enter a telephone number where we can contact the recipient, if necessary, about the shipment. case sensitive
And [1100-1340] User fills eddiebauerFirstName with `firstName`
And [1100-1340] User fills eddiebauerLastName with `lastName`
And [1100-1340] User fills eddiebauerAddress with `checkoutAddress`
And [1100-1340] User fills eddiebauerPostalCode with `checkoutZipCode`
And [1100-1340] User fills eddiebauerCity with `checkoutCity`
And [1100-1601] Select eddiebauerState By Value `otherInternationalLocations`
And [1100-1601] Select eddiebauerCountry By Value `randomCountry`
And [1100-1340] User fills eddiebauerEmailAddress with `checkoutEmailAddress`
And [1100-1340] User fills eddiebauerPhoneNumber with `checkoutPhoneNumber`
And [1100-1400] Execute `click` javascript on eddiebauerShippingContinue
And [8017-0001] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on eddiebauerShippingContinue
And [1101-1102] eddiebauerCardNumberError text is equal to We had an issue confirming your card. Please double-check the number and try again. case sensitive
And [1101-1102] eddiebauerExpirationError text is equal to Please select the expiration date for your credit card. case sensitive
And [1100-1340] User fills eddiebauerCardNumber with `paymentCardNumber`
And [1100-1601] Select eddiebauerExpirationMonth By Value 01
And [1100-1601] Select eddiebauerExpirationYear By Value 2027
And [1100-1340] User fills eddiebauerSecurityCode with `paymentSecurityCode`
And [1100-1400] Execute `click` javascript on eddiebauerShippingContinue
And [1100-1400] Execute `click` javascript on eddiebauerSubmitOrder
Then [1111-1080] eddiebauerSubmitError should be displayed, Within 120 seconds
And [1000-9140] Close the browser






