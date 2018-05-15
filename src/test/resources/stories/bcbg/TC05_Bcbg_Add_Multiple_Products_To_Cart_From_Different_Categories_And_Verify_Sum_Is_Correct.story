Meta:
@ReportName Bcbg

Scenario:  TC05_Bcbg_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] bcbgCartPage should be displayed
When [1200-1302] For any element from bcbgTopNavStore
And [1111-0000] It should be clickable, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] bcbgProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from bcbgProducts
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] bcbgPdp should be displayed, Within 120 seconds
And [8028-0004] user randomly select an available bcbgSizes
And [1100-1400] Execute `click` javascript on bcbgAddToBag
And [1111-1080] bcbgCartDialog should be displayed, Within 120 seconds
And [1100-1400] Execute `click` javascript on bcbgViewShoppingBag
And [1111-1080] bcbgCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves bcbgCartItemOnePrice text in global scope under name bcbgCartItemOnePrice
And [1101-1181] the user saves bcbgCartItemTwoPrice text in global scope under name bcbgCartItemTwoPrice
And [1101-1181] the user saves bcbgCartItemTotalPrice text in global scope under name bcbgCartItemTotalPrice
Then [8028-0007] the user check the sum of `bcbgCartItemOnePrice` and `bcbgCartItemTwoPrice` with `bcbgCartItemTotalPrice`