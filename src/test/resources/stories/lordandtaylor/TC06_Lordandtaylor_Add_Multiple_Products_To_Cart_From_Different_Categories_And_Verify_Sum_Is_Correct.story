
Scenario:  TC06_Lordandtaylor_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] bagPage should be displayed
When [1211-1000] lordandtaylorTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [1211-1080] lordandtaylorProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from lordandtaylorProducts
And [1100-0300] User click on it
And [1111-1080] pdpProductPage should be displayed, Within 120 seconds
And [1200-1302-S] For any element from availableColor
And [1100-0300-S] User click on it
And [1200-1302-S] For any element from availableSKU
And [1100-0300-S] User click on it
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] shoppingBag should be displayed, Within 120 seconds
And [1100-1300] User clicks on the viewMyBag
Then [1111-1080] bagPage should be displayed, Within 120 seconds