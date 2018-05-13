Meta:
@ReportName His Room

Scenario:  TC04_Hisroom_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] hisroomCartPage should be displayed
When [1100-1601] Select hisroomCartQuantity By Value 2
And [1101-1181] the user saves hisroomCartPrice text in global scope under name hisroomCartPriceAfter
And [8024-0004] User hits `hisroomCartPrice` with 2
Then [8024-0005] User compare between `hisroomCartPrice` and `hisroomCartPriceAfter`
And [1100-1601] Select hisroomCartQuantity By Value 1