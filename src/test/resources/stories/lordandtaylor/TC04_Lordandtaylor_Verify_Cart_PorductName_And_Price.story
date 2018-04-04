Meta:
@ReportName LordandTaylor

Scenario:  TC04_Lordandtaylor_Verify_Cart_PorductName_And_Price

Given [1101-1080] pdpProductPage should be displayed
When [8009-0006] user randomly select an available color
And [8009-0006] user randomly select an available sku
And [1100-0300-S] User click on it
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] shoppingBag should be displayed, Within 120 seconds
And [1100-1300] User clicks on the viewMyBag
And [1111-1080] bagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves bagProductPrice text in global scope under name bagPrice
Then [8009-0001] User compare between `bagPrice` and `pdpPrice`