Meta:
@ReportName Neiman Marcus

Scenario:  TC06_NeimanMarcus_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] neimanmarcusBagPage should be displayed
When [1000-9120] User navigate to neimanmarcus page
And [8015-0002] user randomly select an available neimanmarcusTopNav
And [1211-1080] neimanmarcusSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from neimanmarcusSales
And [1100-0300] User click on it
And [8015-0001] user search for neimanmarcusPlpPage
And [1211-1080] neimanmarcusProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from neimanmarcusProducts
And [1100-0300] User click on it
And [1111-1080] neimanmarcusPdp should be displayed, Within 120 seconds
And [8015-0001] user search for neimanmarcusValidPdp
And [8015-0002] user randomly select an available neimanmarcusSize
And [8015-0002] user randomly select an available neimanmarcusColor
And [1100-1300] User clicks on the neimanmarcusAddToBag
And [1111-1080] neimanmarcusBagDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the neimanmarcusBagCheckout
Then [1111-1080] neimanmarcusBagPage should be displayed, Within 120 seconds