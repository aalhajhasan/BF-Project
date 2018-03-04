Meta:
@DependOn |pdp3|0|


@namedItAs pdp4

Scenario:  TC06_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] cartDialog should be displayed
When [1100-1300] User clicks on the cartCloseButton
And [1200-1302] For any element from topNavStore
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from sales
And [1100-0300] User click on it
And [1211-1080] products should be all displayed, Within 120 seconds
And [1200-1302] For any element from products
And [1100-0300] User click on it
And [1111-1080] pdpPage should be displayed, Within 120 seconds
And [1200-1302-S] For any element from availableSKU
And [1100-0300-S] User click on it
And [1100-1321] User scroll to the addToCartButton then click it
And [1111-1080] cartDialog should be displayed, Within 120 seconds
And [1101-1184] the user saves cartProductOnePrice text in scenario scope under name ProductOnePrice
And [1101-1184] the user saves cartProductTwoPrice text in scenario scope under name ProductTwoPrice
And [1101-1184] the user saves cartSubTotalPrice text in scenario scope under name ProductTotalPrice
Then [8000-0003] the user check the sum of `ProductOnePrice` and `ProductTwoPrice` with `ProductTotalPrice`