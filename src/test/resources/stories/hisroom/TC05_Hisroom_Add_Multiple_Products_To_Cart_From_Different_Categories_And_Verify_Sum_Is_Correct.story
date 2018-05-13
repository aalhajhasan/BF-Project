Meta:
@ReportName His Room

Scenario: TC05_Hisroom_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] hisroomCartPage should be displayed
When [1200-1302] For any element from hisroomTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] hisroomProducts should be all displayed, Within 120 seconds
And [1200-0302] For any of the elements
And [1101-1181] the user saves hisroomProductName text in global scope under name hisroomProductName
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] hisroomPdp should be displayed, Within 120 seconds
And [8024-0002] user randomly select an available hisroomSize
And [1100-1400] Execute `click` javascript on hisroomSizeCloseDialog
And [8024-0002] user randomly select an available hisroomColor
And [1100-1400] Execute `click` javascript on hisroomAddToShoppingBag
And [8024-0003] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on hisroomCartCheckout
And [1111-1080] hisroomCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves hisroomCartItemOnePrice text in global scope under name hisroomCartItemOnePrice
And [1101-1181] the user saves hisroomCartItemTwoPrice text in global scope under name hisroomCartItemTwoPrice
And [1101-1181] the user saves hisroomCartItemsTotalPrice text in global scope under name hisroomCartItemsTotalPrice
Then [8024-0006] the user check the sum of `hisroomCartItemOnePrice` and `hisroomCartItemTwoPrice` with `hisroomCartItemsTotalPrice`