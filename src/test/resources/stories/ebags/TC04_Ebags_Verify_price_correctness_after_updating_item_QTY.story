Meta:
@ReportName eBags

Scenario:  TC04_Ebags_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] ebagsQuickView should be displayed
When [1100-1300] User clicks on the ebagsQvClose
And [8006-0005] User hits `ebagsPdpPrice` with 2
And [1100-1300] User clicks on the ebagsAddToCartButton
And [1111-1080] ebagsQuickView should be displayed, Within 120 seconds
And [1101-1181] the user saves ebagsQVTotlatPrice text in global scope under name ebagsQVTotlatPrice
Then [8006-0006] User compare between `ebagsPdpPrice` and `ebagsQVTotlatPrice`
And [1100-1300] User clicks on the ebagsViewCartLink
And [1111-1080] ebagsCartPage should be displayed, Within 120 seconds
And [1100-1310] Clear ebagsCartQuantity field
And [1100-1340] User fills ebagsCartQuantity with 1
And [1100-1300] User clicks on the ebagsUpdateQuantity
