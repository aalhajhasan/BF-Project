Meta:
@ReportName Harrods

Scenario:  TC05_Harrods_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] bagQTY should be displayed
When [1200-1302] For any element from topNavStore
And [1100-0300] User click on it
And [1200-1302] For any element from sales
And [1100-0300] User click on it
And [8001-0005] user search for products
And [1211-1080] products should be all displayed, Within 120 seconds
And [1200-1302] For any element from products
And [1100-0320] User scroll to it
And [1100-0360] User move mouse to it
And [1100-1300] User clicks on the quickView
And [1111-0080] It should be displayed, Within 120 seconds
And [1111-1000] fullDetails should be clickable, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] productPage should be displayed, Within 120 seconds
And [8001-0005] user search for moreThanOneQTY
And [1100-1300] User clicks on the quickAddToBagButton
And [1111-1080] addedButton should be displayed, Within 120 seconds
And [1100-1371] User moves mouse to bagIcon and click on bagViewYourBag
And [1111-1080] bagPage should be displayed, Within 120 seconds
And [1101-1184] the user saves bagProductOnePrice text in scenario scope under name ProductOnePrice
And [1101-1184] the user saves bagProductTwoPrice text in scenario scope under name ProductTwoPrice
And [1101-1184] the user saves bagSubTotalPrice text in scenario scope under name ProductTotalPrice
Then [8001-0003] the user check the sum of `ProductOnePrice` and `ProductTwoPrice` with `ProductTotalPrice`