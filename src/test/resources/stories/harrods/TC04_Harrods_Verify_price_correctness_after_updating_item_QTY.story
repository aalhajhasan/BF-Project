Meta:
@ReportName Harrods

Scenario:  TC04_Harrods_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] harrodsBagPage should be displayed
When [1101-1140] harrodsBagProductName text should contain `harrodsProductName`
And [1101-1184] the user saves harrodsBagProductPrice text in scenario scope under name harrodsCartProductPriceBefore
And [1100-1601] Select harrodsBagQTY By Value 2
And [8001-0001] User hits `harrodsCartProductPriceBefore` with 2
And [1101-1184] the user saves harrodsBagProductPrice text in scenario scope under name harrodsCartProductPriceAfter
Then [8001-0002] User compare between `harrodsCartProductPriceBefore` and `harrodsCartProductPriceAfter`
And [1100-1601] Select harrodsBagQTY By Value 1
