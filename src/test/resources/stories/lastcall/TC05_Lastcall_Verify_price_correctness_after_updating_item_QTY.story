Meta:
@ReportName Last Call

Scenario:  TC05_Lastcall_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] lastcallPdp should be displayed
When [1100-1370] User move mouse to lastcallBagIcon and click it
And [1100-1300] User clicks on the lastcallBagCheckout
And [1111-1080] lastcallBagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves lastcallBagProductPrice text in global scope under name lastcallBagProductPrice
And [1100-1300] User clicks on the lastcallBagEditItem
And [1111-1080] lastcallBagEditContainer should be displayed, Within 120 seconds
And [1100-1340] User fills lastcallBagQuantity with 2
And [1100-1300] User clicks on the lastcallBagUpdate
And [8014-0005] User hits `lastcallBagProductPrice` with 2
And [1101-1181] the user saves lastcallBagTotalPrice text in global scope under name lastcallBagTotalPrice
Then [8014-0006] User compare between `lastcallBagProductPrice` and `lastcallBagTotalPrice`
And [8014-0004] sleep after last action for 10000 Milliseconds
And [1100-1300] User clicks on the lastcallBagEditItem
And [1111-1080] lastcallBagQuantity should be displayed, Within 120 seconds
And [1100-1340] User fills lastcallBagQuantity with 1
And [1100-1300] User clicks on the lastcallBagUpdate