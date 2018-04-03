Meta:
@ReportName LordandTaylor

Scenario:  TC07_Lordandtaylor_Verify_All_Checkout_Test_Cases

Given [1101-1080] bagPage should be displayed
When [1101-1181] the user saves productOnePrice text in global scope under name productOnePrice
And [1101-1181] the user saves productTwoPrice text in global scope under name productTwoPrice
And [1101-1181] the user saves productTotalPrice text in global scope under name productTotalPrice
And [8009-0005] the user check the sum of `productOnePrice` and `productTwoPrice` with `productTotalPrice`
And [1100-1300] User clicks on the checkoutButton
And [1111-1080] checkoutDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the checkoutAsGuest















































