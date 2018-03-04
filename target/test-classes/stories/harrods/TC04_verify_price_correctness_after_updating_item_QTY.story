
@DependOn |pdp1|0|

@namedItAs bag


Scenario:  TC04_verify_price_correctness_after_updating_item_QTY


Given [1101-1080] bagPage should be displayed
When [1101-1184] the user saves bagProductPrice text in scenario scope under name bagProductPriceBefore
And [1100-1601] Select bagQTY By Value 2
And [8000-0005] User hits 2 with `bagProductPriceBefore
And [1111-1080] bagQTY should be displayed, Within 120 seconds
And [1101-1184] the user saves bagProductPrice text in scenario scope under name bagProductPriceAfter`
Then [8000-0006] User compare between `bagProductPriceBefore` and `bagProductPriceAfter`
And [1100-1601] Select bagQTY By Value 1
