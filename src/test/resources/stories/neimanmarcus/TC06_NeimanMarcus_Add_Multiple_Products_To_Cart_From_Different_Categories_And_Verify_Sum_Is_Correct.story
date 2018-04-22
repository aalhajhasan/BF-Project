Meta:
@ReportName Neiman Marcus

Scenario:  TC06_NeimanMarcus_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] neimanmarcusBagPage should be displayed
When [1211-1000] neimanmarcusTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0370] User move mouse to it and click it
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] neimanmarcusSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from neimanmarcusSales
And [1100-0400] Execute `click` javascript on the element
And [8014-0001] user search for neimanmarcusPlpPage
And [1211-1080] neimanmarcusProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from neimanmarcusProducts
And [1100-0300] User click on it
And [1111-1080] neimanmarcusPdp should be displayed, Within 120 seconds
And [8014-0001] user search for neimanmarcusValidPdp
And [8014-0003] user randomly select an available neimanmarcusSize
And [8014-0003] user randomly select an available neimanmarcusColor
And [1100-1300] User clicks on the neimanmarcusAddToBag
And [1111-1080] neimanmarcusBagDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the neimanmarcusBagCheckout
Then [1111-1080] neimanmarcusBagPage should be displayed, Within 120 seconds