Meta:
@ReportName Saks

Scenario:  TC06_Saks_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] saksBagPage should be displayed
When [1200-1302] For any element from saksTopNav
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from saksSales
And [1100-0300] User click on it
And [8002-0001] user search for saksProducts
And [1211-1080] saksProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from saksProducts
And [1100-0300] User click on it
And [8002-0001] user search for saksProductSKUSelection
And [8002-0001] user search for saksValidPdp
And [8002-0009] user randomly select an available saksColor
And [8002-0009] user randomly select an available saksSku
And [1100-1300] User clicks on the saksAddToBagButton
And [1111-1080] saksShoppingBag should be displayed, Within 120 seconds
And [1100-1300] User clicks on the saksBagCheckoutButton
And [1111-1080] saksBagPage should be displayed, Within 120 seconds
And [1101-1184] the user saves saksBagProductOnePrice text in scenario scope under name saksProductOnePrice
And [1101-1184] the user saves saksBagProductTwoPrice text in scenario scope under name saksProductTwoPrice
And [1101-1184] the user saves saksBagSubTotalPrice text in scenario scope under name saksProductTotalPrice
Then [8002-0007] the user check the sum of `saksProductOnePrice` and `saksProductTwoPrice` with `saksProductTotalPrice`
