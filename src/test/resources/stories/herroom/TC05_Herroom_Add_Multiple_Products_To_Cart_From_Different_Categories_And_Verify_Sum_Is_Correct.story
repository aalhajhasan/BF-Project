Meta:
@ReportName Her Room

Scenario: TC05_herroom_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] herroomCartPage should be displayed
When [1200-1302] For any element from herroomTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] herroomProducts should be all displayed, Within 120 seconds
And [1200-0302] For any of the elements
And [1101-1181] the user saves herroomProductName text in global scope under name herroomProductName
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] herroomPdp should be displayed, Within 120 seconds
And [8033-0002] user randomly select an available herroomSize
And [1100-1400] Execute `click` javascript on herroomSizeCloseDialog
And [8033-0002] user randomly select an available herroomColor
And [1100-1400] Execute `click` javascript on herroomAddToShoppingBag
And [8033-0003] sleep after last action for 2000 Milliseconds
And [1100-1400] Execute `click` javascript on herroomCartCheckout
And [1111-1080] herroomCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves herroomCartItemOnePrice text in global scope under name herroomCartItemOnePrice
And [1101-1181] the user saves herroomCartItemTwoPrice text in global scope under name herroomCartItemTwoPrice
And [1101-1181] the user saves herroomCartItemsTotalPrice text in global scope under name herroomCartItemsTotalPrice
Then [8033-0006] the user check the sum of `herroomCartItemOnePrice` and `herroomCartItemTwoPrice` with `herroomCartItemsTotalPrice`