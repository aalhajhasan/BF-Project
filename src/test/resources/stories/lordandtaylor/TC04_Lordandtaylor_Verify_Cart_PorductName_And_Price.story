Meta:
@ReportName Lord And Taylor

Scenario:  TC04_Lordandtaylor_Verify_Cart_PorductName_And_Price

Given [1101-1080] lordandtaylorPdpProductPage should be displayed
When [8009-0009] user search for lordandtaylorValidPdp
And [8009-0006] user randomly select an available lordandtaylorColor
And [8009-0006] user randomly select an available lordandtaylorSku
And [1101-1181] the user saves lordandtaylorPdpProductPrice text in global scope under name lordandtaylorPdpProductPrice
And [1100-1300] User clicks on the lordandtaylorAddToBagButton
And [1111-1080] lordandtaylorShoppingBag should be displayed, Within 120 seconds
And [1100-1300] User clicks on the lordandtaylorViewMyBag
And [1111-1080] lordandtaylorBagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves lordandtaylorBagProductPrice text in global scope under name lordandtaylorBagPrice
Then [8009-0001] User compare between `lordandtaylorBagPrice` and `lordandtaylorPdpProductPrice`