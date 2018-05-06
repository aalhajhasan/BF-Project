Meta:
@ReportName Last Call

Scenario: TC06_Lastcall_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] lastcallBagPage should be displayed
When [1211-1000] lastcallTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0370] User move mouse to it and click it
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] lastcallSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from lastcallSales
And [1100-0400] Execute `click` javascript on the element
And [8014-0001] user search for lastcallPlpPage
And [1211-1080] lastcallProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from lastcallProducts
And [1100-0300] User click on it
And [1111-1080] lastcallPdp should be displayed, Within 120 seconds
And [8014-0001] user search for lastcallValidPdp
And [8014-0003] user randomly select an available lastcallSize
And [8014-0003] user randomly select an available lastcallColor
And [1100-1300] User clicks on the lastcallAddToBag
And [1111-1080] lastcallBagDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the lastcallBagCheckout
Then [1111-1080] lastcallBagPage should be displayed, Within 120 seconds