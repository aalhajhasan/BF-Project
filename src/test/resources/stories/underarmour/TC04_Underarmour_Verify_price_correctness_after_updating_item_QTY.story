Meta:
@ReportName Underarmour

Scenario:  TC04_Underarmour_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] bagDialog should be displayed
When [1100-1300] User clicks on the bagAndCheckout
And [1111-1080] bagPage should be displayed, Within 120 seconds
And [8011-0003] User hits `bagItemPrice` with 2
And [1100-1601] Select quantity	 By Value 2
And [1101-1181] the user saves bagItemPriceAfter text in global scope under name bagItemPriceAfter
Then [8011-0004] User compare between `bagItemPrice` and `bagItemPriceAfter`
And [1100-1601] Select quantity	 By Value 1