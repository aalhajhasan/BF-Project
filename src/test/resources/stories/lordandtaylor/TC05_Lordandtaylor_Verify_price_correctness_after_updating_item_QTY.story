
Scenario:  TC05_Lordandtaylor_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] bagPage should be displayed
When [8009-0003] User hits `pdpPrice` with 2
And [1100-1300] User clicks on the editLink
And [1111-1080] editDialog should be displayed, Within 120 seconds
And [1100-1310] Clear quantity field
And [1100-1340] User fills quantity with 2
And [1100-1300] User clicks on the applyButton
And [1111-1080] bagPage should be displayed, Within 120 seconds
Then [8009-0004] User compare between `pdpPrice` and `bagPrice`
And [1100-1300] User clicks on the editLink
And [1111-1080] editDialog should be displayed, Within 120 seconds
And [1100-1310] Clear quantity field
And [1100-1340] User fills quantity with 1
And [1100-1300] User clicks on the applyButton