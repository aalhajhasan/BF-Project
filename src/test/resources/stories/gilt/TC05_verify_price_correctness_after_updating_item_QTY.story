Meta:
@DependOn |pdp2|0|

@namedItAs pdp3

Scenario: TC05_verify_price_correctness_after_updating_item_QTY

Given [1101-1080] cartDialog should be displayed
When [1101-1100] cartProductName text should equal to `productName`
And [1101-1184] the user saves cartProductPrice text in scenario scope under name cartProductPriceBefore
And [1100-1601] Select cartQTY By Value 2
And [8000-0001] User hits 2 with `cartProductPriceBefore`
And [1101-1184] the user saves cartProductPrice text in scenario scope under name cartProductPriceAfter
Then [8000-0002] User compare between `cartProductPriceBefore` and `cartProductPriceAfter`
And [1100-1601] Select cartQTY By Value 1