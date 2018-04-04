Meta:
@ReportName Jcrew

Scenario:  TC05_Jcrew_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] itemDetailsPage should be displayed
When [1200-1302] For any element from jcrewTopNav
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from jcrewSales
And [1100-0400] Execute `click` javascript on the element
And [8010-0001] user search for jcrewProducts
And [1200-1302] For any element from jcrewProducts
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on quickShop
And [1111-1080] quickShopDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the quickShopViewFullDetails
And [1111-1080] itemDetailsPage should be displayed, Within 120 seconds
And [8010-0007] user randomly select an available itemColors
And [8010-0007] user randomly select an available itemSizes
And [1100-1300] User clicks on the itemAddToBag
And [1111-1080] bagDialog should be displayed, Within 120 seconds
Then [1100-1300] User clicks on the bagChceckout
And [1111-1080] itemsBagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves bagItemOnePrice text in global scope under name ItemOnePrice
And [1101-1181] the user saves bagItemTwoPrice text in global scope under name ItemTwoPrice
And [1101-1181] the user saves bagItemsTotalPrice text in global scope under name ItemsTotalPrice
Then [8010-0006] the user check the sum of `ItemOnePrice` and `ItemTwoPrice` with `ItemsTotalPrice`