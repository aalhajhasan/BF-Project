Meta:
@ReportName Her Room

Scenario:  TC04_herroom_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] herroomCartPage should be displayed
When [1100-1601] Select herroomCartQuantity By Value 2
And [1101-1181] the user saves herroomCartPrice text in global scope under name herroomCartPriceAfter
And [8033-0004] User hits `herroomCartPrice` with 2
Then [8033-0005] User compare between `herroomCartPrice` and `herroomCartPriceAfter`
And [1100-1601] Select herroomCartQuantity By Value 1