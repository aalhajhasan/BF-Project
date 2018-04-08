Meta:
@ReportName LordandTaylor

Scenario:  TC07_Lordandtaylor_Verify_All_Checkout_Test_Cases

Given [1101-1080] lordandtaylorBagPage should be displayed
When [1101-1181] the user saves lordandtaylorProductOnePrice text in global scope under name lordandtaylorProductOnePrice
And [1101-1181] the user saves lordandtaylorProductTwoPrice text in global scope under name lordandtaylorProductTwoPrice
And [1101-1181] the user saves lordandtaylorProductTotalPrice text in global scope under name lordandtaylorProductTotalPrice
And [8009-0005] the user check the sum of `lordandtaylorProductOnePrice` and `lordandtaylorProductTwoPrice` with `lordandtaylorProductTotalPrice`
And [1100-1300] User clicks on the lordandtaylorCheckoutButton
And [1111-1080] lordandtaylorCheckoutDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the lordandtaylorCheckoutAsGuest















































