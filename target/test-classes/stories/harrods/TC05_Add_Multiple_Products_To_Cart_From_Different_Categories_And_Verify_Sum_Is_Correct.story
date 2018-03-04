
@DependOn |bag|0|

@namedItAs itemTwo

Scenario:  TC05_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct


Given [1101-1080] bagPage should be displayed
When [1200-1302] For any element from topNavStore
And [1100-0300] User click on it
And [1211-1080] sales should be all displayed, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [1111-1080] plpPage should be displayed, Within 120 seconds
And [1200-1302] For any element from products
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on quickView
And [1111-1080] quickViewDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the fullDetails
And [1111-1080] pdpPage should be displayed, Within 120 seconds
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] viewYourBagButton should be displayed, Within 120 seconds
And [1100-0300] User click on it
And [1111-1080] bagPage should be displayed, Within 120 seconds
And [1101-1184] the user saves bagProductOnePrice text in scenario scope under name ProductOnePrice
And [1101-1184] the user saves bagProductTwoPrice text in scenario scope under name ProductTwoPrice
And [1100-1320] User scroll to the bagSubTotalPrice
And [1101-1184] the user saves bagSubTotalPrice text in scenario scope under name ProductTotalPrice
Then [8000-0007] the user check the sum of `ProductOnePrice` and `ProductTwoPrice` with `ProductTotalPrice`





