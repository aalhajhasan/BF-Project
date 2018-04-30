Meta:
@ReportName Under Armour

Scenario:  TC04_Underarmour_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] underarmourBagDialog should be displayed
When [1100-1300] User clicks on the underarmourBagAndCheckout
And [1111-1080] underarmourBagPage should be displayed, Within 120 seconds
And [8011-0003] User hits `underarmourBagItemPrice` with 2
And [1100-1601] Select underarmourQuantity By Value 2
And [8011-0007] sleep after last action for 10000 Milliseconds
And [1101-1181] the user saves underarmourBagItemPriceAfter text in global scope under name underarmourBagItemPriceAfter
Then [8011-0004] User compare between `underarmourBagItemPrice` and `underarmourBagItemPriceAfter`
And [1100-1601] Select underarmourQuantity By Value 1