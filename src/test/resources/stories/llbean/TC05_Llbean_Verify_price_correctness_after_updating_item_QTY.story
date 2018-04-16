Meta:
@ReportName L.L.Bean

Scenario: TC05_Llbean_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] llbeanPdp should be displayed
When [1100-1300] User clicks on the llbeanAddToBag
And [1100-1300] User clicks on the llbeanBagCheckout
And [1111-1080] llbeanBagPage should be displayed, Within 120 seconds
And [8013-0004] User hits `llbeanPdpPrice` with 2
And [1101-1181] the user saves llbeanBagTotalPrice text in global scope under name llbeanBagTotalPrice
Then [8013-0005] User compare between `llbeanPdpPrice` and `llbeanBagTotalPrice`
And [8013-0006] sleep after last action for 5000 seconds
And [1100-1340] User fills llbeanBagQuantity with 1
And [1100-1300] User clicks on the llbeanBagUpdate