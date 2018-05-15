
Scenario:  TC04_Bcbg_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] bcbgPdp should be displayed
When [1100-1400] Execute `click` javascript on bcbgAddToBag
And [1111-1080] bcbgCartDialog should be displayed, Within 120 seconds
And [8028-0005] User hits bcbgCartPrice with 2
And [1101-1181] the user saves bcbgCartPrice text in global scope under name bcbgCartPriceAfter
Then [8028-0006] User compare between `bcbgCartPrice` and `bcbgCartPriceAfter`
And [1100-1400] Execute `click` javascript on bcbgViewShoppingBag
And [1111-1080] bcbgCartPage should be displayed, Within 120 seconds
And [1100-1601] Select bcbgQty By Value 1