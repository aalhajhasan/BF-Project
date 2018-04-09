Meta:
@ReportName Jcrew

Scenario:  TC05_Jcrew_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] jcrewItemDetailsPage should be displayed
When [1200-1302] For any element from jcrewTopNav
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] jcrewSales should be displayed, Within 120 seconds
And [1200-1302] For any element from jcrewSales
And [1100-0400] Execute `click` javascript on the element
And [8010-0001] user search for jcrewProducts
And [1200-1302] For any element from jcrewProducts
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on jcrewQuickShop
And [1111-1080] jcrewQuickShopDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the jcrewQuickShopViewFullDetails
And [1111-1080] jcrewItemDetailsPage should be displayed, Within 120 seconds
And [8010-0007] user randomly select an available jcrewItemColors
And [8010-0007] user randomly select an available jcrewItemSizes
And [1100-1300] User clicks on the jcrewItemAddToBag
And [1111-1080] jcrewBagDialog should be displayed, Within 120 seconds
Then [1100-1300] User clicks on the jcrewBagChceckout
And [1111-1080] jcrewItemsBagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves jcrewBagItemOnePrice text in global scope under name jcrewItemOnePrice
And [1101-1181] the user saves jcrewBagItemTwoPrice text in global scope under name jcrewItemTwoPrice
And [1101-1181] the user saves jcrewBagItemsTotalPrice text in global scope under name jcrewItemsTotalPrice
Then [8010-0006] the user check the sum of `jcrewItemOnePrice` and `jcrewItemTwoPrice` with `jcrewItemsTotalPrice`