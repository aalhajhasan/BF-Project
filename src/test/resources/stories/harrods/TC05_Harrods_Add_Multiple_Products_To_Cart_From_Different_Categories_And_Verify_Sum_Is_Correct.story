Meta:
@ReportName Harrods

Scenario:  TC05_Harrods_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] harrodsBagQTY should be displayed
When [1200-1302] For any element from harrodsTopNavStore
And [1100-0300] User click on it
And [1200-1302] For any element from harrodsSales
And [1100-0300] User click on it
And [8001-0005] user search for harrodsProducts
And [1211-1080] harrodsProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from harrodsProducts
And [1100-0320] User scroll to it
And [1100-0360] User move mouse to it
And [1100-1300] User clicks on the harrodsQuickView
And [8001-0008] sleep after last action for 5000 Milliseconds
And [1111-0080] It should be displayed, Within 120 seconds
And [1111-1000] harrodsFullDetails should be clickable, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] harrodsProductPage should be displayed, Within 120 seconds
And [8001-0005] user search for harrodsMoreThanOneQTY
And [1100-1300] User clicks on the harrodsQuickAddToBagButton
And [1111-1080] harrodsViewYourBag should be displayed, Within 120 seconds
And [1100-1371] User moves mouse to harrodsBagIcon and click on harrodsBagViewYourBag
And [1111-1080] harrodsBagPage should be displayed, Within 120 seconds
And [1101-1184] the user saves harrodsBagProductOnePrice text in scenario scope under name harrodsProductOnePrice
And [1101-1184] the user saves harrodsBagProductTwoPrice text in scenario scope under name harrodsProductTwoPrice
And [1101-1184] the user saves harrodsBagSubTotalPrice text in scenario scope under name harrodsProductTotalPrice
Then [8001-0003] the user check the sum of `harrodsProductOnePrice` and `harrodsProductTwoPrice` with `harrodsProductTotalPrice`
