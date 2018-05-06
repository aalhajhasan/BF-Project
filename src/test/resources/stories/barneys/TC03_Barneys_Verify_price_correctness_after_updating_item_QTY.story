Meta:
@ReportName Barneys New York

Scenario:  TC03_Barneys_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] barneysPdp should be displayed
When [1111-1080] barneysAddToBagButton should be displayed, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] barneysMyBagDialog should be displayed, Within 120 seconds
And [1101-1181] the user saves barneysBagTotalPrice text in global scope under name barneysBagTotalPrice
And [8008-0003] User hits barneysBagPrice with 2
Then [8008-0004] User compare between `barneysBagPrice` and `barneysBagTotalPrice`
And [1100-1300] User clicks on the barneysMyBagCloseButton