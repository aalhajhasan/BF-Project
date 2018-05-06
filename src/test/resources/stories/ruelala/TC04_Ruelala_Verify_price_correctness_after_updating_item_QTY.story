Meta:
@ReportName Rue La La

Scenario:  TC04_Ruelala_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] ruelalaBagPage should be displayed
When [8007-0003] User hits `ruelalaBagPrice` with 2
And [1100-1601-S] Select ruelalaBagQty By Value 2
Then [8007-0004] User compare between ruelalaBagProductPrice and ruelalaBagProductTotalPrice
And [1100-1601] Select ruelalaBagQty By Value 1