Meta:
@ReportName General Pants

Scenario:  TC05_Generalpants_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] generalPantsCartPage should be displayed
When [1200-1302] For any element from generalPantsTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] generalPantsSales should be all displayed, Within 120 seconds
And [8025-0001] sleep after last action for 2000 Milliseconds
And [1200-1302] For any element from generalPantsSales
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] generalPantsProducts should be all displayed, Within 120 seconds
And [8025-0001] sleep after last action for 8000 Milliseconds
And [1200-1302] For any element from generalPantsProducts
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] generalPantsPdp should be displayed, Within 120 seconds
And [8025-0002] user search for generalPantsValidPdp
And [8025-0004] user randomly select an available generalPantsSizes
And [8025-0009] user click on generalPantsAddToBag
!-- And [1111-1080] generalPantsCartCheckout should be displayed, Within 120 seconds
And [8025-0009] user click on generalPantsCartCheckout
And [1211-1080] generalPantsCartsPage should be all displayed, Within 120 seconds
And [1101-1181] the user saves generalPantsCartPriceOne text in global scope under name generalPantsCartPriceOne
And [1101-1181] the user saves generalPantsCartPriceTwo text in global scope under name generalPantsCartPriceTwo
And [1101-1181] the user saves generalPantsCartTotalPrice text in global scope under name generalPantsCartTotalPrice
Then [8025-0007] the user check the sum of `generalPantsCartPriceOne` and `generalPantsCartPriceTwo` with `generalPantsCartTotalPrice`