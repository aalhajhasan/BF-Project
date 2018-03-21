
Scenario:  TC04_Ebags_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] ebagsQuickView should be displayed
When [1100-1300] User clicks on the ebagsQvClose
And [8006-0005] User hits 2 with `pdpPrice`
And [1100-1300] User clicks on the addToCartButton
And [1101-1181] the user saves ebagsQVTotlatPrice text in global scope under name qvTotalPrice
Then [8006-0006] User compare between `pdpPrice` and `qvTotalPrice`
And [1100-1300] User clicks on the viewCartLink
And [1111-1080] ebagsCartPage should be displayed, Within 120 seconds
And [1100-1310] Clear cartQuantity field
And [1100-1340] User fills cartQuantity with 1
And [1100-1300] User clicks on the updateQuantity
