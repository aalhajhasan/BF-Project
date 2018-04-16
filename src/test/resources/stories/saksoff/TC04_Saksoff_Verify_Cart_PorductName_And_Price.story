Meta:
@ReportName Saks Fifth Avenue OFF 5TH

Scenario:  TC04_Saksoff_Verify_Cart_PorductName_And_Price

Given [1101-1080] saksoffPdpProductPage should be displayed
When [8003-0003] user search for saksoffProductSKUSelection
And [8003-0003] user search for saksoffValidPdp
And [8003-0009] user randomly select an available saksoffColor
And [8003-0009] user randomly select an available saksoffSku
And [1101-1181] the user saves saksoffPdpProductPrice text in global scope under name saksoffPdpPrice
And [1101-1181] the user saves saksoffPdpProductName text in global scope under name saksoffPdpProductName
And [1100-1300] User clicks on the saksoffAddToBagButton
And [1111-1080] saksoffShoppingBag should be displayed, Within 120 seconds
And [1101-1181] the user saves saksoffBagProductPrice text in global scope under name saksoffBagPrice
Then [8003-0001] User compare between `saksoffBagPrice` and `saksoffPdpPrice`