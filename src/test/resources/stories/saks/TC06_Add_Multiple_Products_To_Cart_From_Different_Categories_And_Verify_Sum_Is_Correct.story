
@namedItAs seconditem

@DependOn |cart1|0|

Scenario:  TC06_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] saksBagPage should be displayed
When [1200-1302] For any element from saksTopNav
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from saksSales
And [1100-0300] User click on it
And [8002-0001] user search for saksProducts
And [1211-1080] saksProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from saksProducts
And [1100-0300] User click on it
And [8002-0001] user search for productSKUSelection
And [8002-0001] user search for validPdp
And [1200-1302-S] For any element from availableColor
And [1100-0300-S] User click on it
And [1200-1302-S] For any element from availableSKU
And [1100-0300-S] User click on it
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] shoppingBag should be displayed, Within 120 seconds
And [1100-1300] User clicks on the bagCheckoutButton
And [1111-1080] saksBagPage should be displayed, Within 120 seconds
And [1101-1184] the user saves bagProductOnePrice text in scenario scope under name ProductOnePrice
And [1101-1184] the user saves bagProductTwoPrice text in scenario scope under name ProductTwoPrice
And [1101-1184] the user saves bagSubTotalPrice text in scenario scope under name ProductTotalPrice
Then [8002-0007] the user check the sum of `ProductOnePrice` and `ProductTwoPrice` with `ProductTotalPrice`
