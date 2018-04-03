Meta:
@ReportName Harrods

Scenario:  TC04_Harrods_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] bagPage should be displayed
When [1101-1100] bagProductName text should equal to `productName`
And [1101-1184] the user saves bagProductPrice text in scenario scope under name cartProductPriceBefore
And [1100-1601] Select bagQTY By Value 2
And [8001-0001] User hits 2 with `cartProductPriceBefore`
And [1101-1184] the user saves bagProductPrice text in scenario scope under name cartProductPriceAfter
Then [8001-0002] User compare between `cartProductPriceBefore` and `cartProductPriceAfter`
And [1100-1601] Select bagQTY By Value 1
