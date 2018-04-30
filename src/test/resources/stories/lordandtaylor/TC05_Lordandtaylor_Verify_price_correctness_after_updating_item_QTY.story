Meta:
@ReportName Lord And Taylor

Scenario:  TC05_Lordandtaylor_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] lordandtaylorBagPage should be displayed
When [8009-0003] User hits `lordandtaylorPdpPrice` with 2
And [1100-1400] Execute `click` javascript on lordandtaylorEditLink
And [1111-1080] lordandtaylorEditDialog should be displayed, Within 120 seconds
And [8009-0007] sleep after last action for 5000 Milliseconds
And [1100-1340] User fills lordandtaylorQuantity with 2
And [1100-1300] User clicks on the lordandtaylorApplyButton
And [1111-1080] lordandtaylorBagPage should be displayed, Within 120 seconds
Then [8009-0004] User compare between `lordandtaylorPdpPrice` and `lordandtaylorBagPrice`
And [8009-0007] sleep after last action for 5000 Milliseconds
And [1100-1400] Execute `click` javascript on lordandtaylorEditLink
And [1111-1080] lordandtaylorEditDialog should be displayed, Within 120 seconds
And [8009-0007] sleep after last action for 5000 Milliseconds
And [1100-1340] User fills lordandtaylorQuantity with 1
And [1100-1300] User clicks on the lordandtaylorApplyButton