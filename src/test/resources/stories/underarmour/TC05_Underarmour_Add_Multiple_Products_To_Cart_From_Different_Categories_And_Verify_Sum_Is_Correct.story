Meta:
@ReportName Underarmour

Scenario:  TC05_Underarmour_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] bagPage should be displayed
When [1000-9000] User opens underarmour page
And [1100-1320] User scroll to the newArrivalsSection
And [1200-1302] For any element from newArrivalsCategory
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] underarmourPlp should be displayed, Within 120 seconds
And [1200-1302] For any element from plpItems
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] pdpItemPage should be displayed, Within 120 seconds
And [1200-1302-S] For any element from itemColors
And [1100-0300-S] User click on it
And [1200-1302-S] For any element from itemSizes
And [1100-0300-S] User click on it
And [1100-1300] User clicks on the addToBag
And [1111-1080] bagDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the bagAndCheckout
And [1111-1080] bagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves bagItemOnePrice text in global scope under name bagItemOnePrice
And [1101-1181] the user saves bagItemTwoPrice text in global scope under name bagItemTwoPrice
And [1101-1181] the user saves bagItemsTotalPrice text in global scope under name bagItemsTotalPrice
Then [8011-0005] the user check the sum of `bagItemOnePrice` and `bagItemTwoPrice` with `bagItemsTotalPrice`

