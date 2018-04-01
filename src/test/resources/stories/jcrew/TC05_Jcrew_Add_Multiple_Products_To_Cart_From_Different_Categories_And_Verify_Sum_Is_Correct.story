
Scenario:  TC05_Jcrew_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] itemDetailsPage should be displayed
When [1200-1302] For any element from jcrewTopNav
And [1100-0300] User click on it
And [1200-1302] For any element from jcrewSales
And [1100-0300] User click on it
And [8010-0001] user search for jcrewProducts
And [1200-1302] For any element from jcrewProducts
And [1100-0300] User click on it
And [1111-1080] itemDetailsPage should be displayed, Within 120 seconds
And [1200-1302-S] For any element from itemColors
And [1100-0300-S] User click on it
And [1200-1302-S] For any element from itemSizes
And [1100-0300-S] User click on it
And [1100-1300] User clicks on the itemAddToBag
And [1111-1080] bagDialog should be displayed, Within 120 seconds
Then [1100-1300] User clicks on the bagChceckout
And [1111-1080] itemsBagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves bagItemOnePrice text in global scope under name ItemOnePrice
And [1101-1181] the user saves bagItemTwoPrice text in global scope under name ItemTwoPrice
And [1101-1181] the user saves bagItemsTotalPrice text in global scope under name ItemsTotalPrice
Then [8010-0006] the user check the sum of `ItemOnePrice` and `ItemTwoPrice` with `ItemsTotalPrice`