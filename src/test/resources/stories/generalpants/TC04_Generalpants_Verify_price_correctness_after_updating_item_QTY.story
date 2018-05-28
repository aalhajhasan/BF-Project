Meta:
@ReportName General Pants

Scenario:  TC04_Generalpants_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] generalPantsCartPage should be displayed
When [1100-1601] Select generalPantsQuantity By Value number:2
And [1101-1181] the user saves generalPantsCartPrice text in global scope under name generalPantsCartPriceAfter
And [8025-0005] User hits `generalPantsCartPrice` with 2
Then [8025-0006] User compare between `generalPantsCartPrice` and `generalPantsCartPriceAfter`
And [1100-1601] Select generalPantsQuantity By Value number:1