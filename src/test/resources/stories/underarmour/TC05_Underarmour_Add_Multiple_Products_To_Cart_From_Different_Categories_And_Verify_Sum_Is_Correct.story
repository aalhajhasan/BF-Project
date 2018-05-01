Meta:
@ReportName Under Armour

Scenario:  TC05_Underarmour_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] underarmourBagPage should be displayed
When [1000-9000] User opens underarmour page
And [1100-1320] User scroll to the underarmourNewArrivalsSection
And [1200-1302] For any element from underarmourNewArrivalsCategory
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] underarmourPlp should be displayed, Within 120 seconds
And [1200-1302] For any element from underarmourPlpItems
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] underarmourPdpItemPage should be displayed, Within 120 seconds
And [8011-0006] user randomly select an available underarmourItemColors
And [8011-0006] user randomly select an available underarmourItemSizes
And [1100-1400] Execute `click` javascript on underarmourAddToBag
And [1111-1080] underarmourBagDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the underarmourBagAndCheckout
And [1111-1080] underarmourBagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves underarmourBagItemOnePrice text in global scope under name underarmourBagItemOnePrice
And [1101-1181] the user saves underarmourBagItemTwoPrice text in global scope under name underarmourBagItemTwoPrice
And [1101-1181] the user saves underarmourBagItemsTotalPrice text in global scope under name underarmourBagItemsTotalPrice
Then [8011-0005] the user check the sum of `underarmourBagItemOnePrice` and `underarmourBagItemTwoPrice` with `underarmourBagItemsTotalPrice`

