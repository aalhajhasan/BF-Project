Meta:
@ReportName Rue La La

Scenario:  TC03_Ruelala_Verify_Cart_PorductName_And_Price

Given [1101-1080] ruelalaPdp should be displayed
When [8007-0002] user search for ruelalaValidPdp
And [8007-0006] user randomly select an available ruelalaSizes
And [1101-1181] the user saves ruelalaPdpPrice text in global scope under name ruelalaPdpPrice
And [1101-1181] the user saves ruelalaPdpName text in global scope under name ruelalaPdpName
And [1100-1300] User clicks on the ruelalaAddToBagButton
And [1111-1080] ruelalaBagPage should be displayed, Within 120 seconds
And [1101-1140] ruelalaBagProductName text should contain `ruelalaPdpName`
And [1101-1181] the user saves ruelalaBagProductPrice text in global scope under name ruelalaBagPrice
Then [8007-0001] User compare between `ruelalaBagPrice` and `ruelalaPdpPrice`