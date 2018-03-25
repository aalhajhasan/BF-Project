
Scenario:  TC04_Ruelala_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] bagPage should be displayed
When [8007-0003] User hits bagProductPrice with 2
And [1100-1601] Select bagQty By Value 2
Then [8007-0004] User compare between bagProductPrice and bagProductTotalPrice
And [1100-1601] Select bagQty By Value 1