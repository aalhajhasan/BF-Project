Meta:
@ReportName Saks

Scenario:  TC04_Saks_Verify_Cart_PorductName_And_Price

Given [1101-1080] saksPdpProductPage should be displayed
When [8002-0001] user search for saksProductSKUSelection
And [8002-0001] user search for saksValidPdp
And [8002-0009] user randomly select an available saksColor
And [8002-0009] user randomly select an available saksSku
And [1101-1181] the user saves saksPdpProductPrice text in global scope under name saksPdpPrice
And [1101-1181] the user saves saksPdpProductName text in global scope under name saksPdpProductName
And [1100-1300] User clicks on the saksAddToBagButton
And [1111-1080] saksShoppingBag should be displayed, Within 120 seconds
And [1101-1181] the user saves saksBagProductPrice text in global scope under name saksBagPrice
Then [8002-0002] User compare between `saksBagPrice` and `saksPdpPrice`