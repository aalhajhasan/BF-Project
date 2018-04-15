Meta:
@ReportName Gilt

Scenario: TC05_Gilt_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] giltCartDialog should be displayed
When [1101-1140] giltCartProductName text should contain `giltProductName`
And [1101-1184] the user saves giltCartProductPrice text in scenario scope under name giltCartProductPriceBefore
And [1100-1601-S] Select giltCartQTY By Value 2
And [8000-0001] User hits `giltCartProductPriceBefore` with 2
And [1101-1184] the user saves giltCartProductPrice text in scenario scope under name giltCartProductPriceAfter
Then [8000-0002] User compare between `giltCartProductPriceBefore` and `giltCartProductPriceAfter`
And [1100-1601] Select giltCartQTY By Value 1