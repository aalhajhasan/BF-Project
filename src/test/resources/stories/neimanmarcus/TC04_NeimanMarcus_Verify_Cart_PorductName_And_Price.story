Meta:
@ReportName Neiman Marcus

Scenario:  TC04_NeimanMarcus_Verify_Cart_PorductName_And_Price

Given [1101-1080] neimanmarcusPdp should be displayed
When [8015-0002] user randomly select an available neimanmarcusSize
And [8015-0002] user randomly select an available neimanmarcusColor
And [1100-1300] User clicks on the neimanmarcusAddToBag
And [1111-1080] neimanmarcusBagDialog should be displayed, Within 120 seconds
Then [1101-1140] neimanmarcusBagName text should contain `neimanmarcusProductName`
And [1101-1140] neimanmarcusBagPrice text should contain `neimanmarcusProductPrice`