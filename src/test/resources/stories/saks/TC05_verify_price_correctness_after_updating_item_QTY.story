
@namedItAs cart1

@DependOn |cart|0|

Scenario:  TC05_verify_price_correctness_after_updating_item_QTY

Given [1101-1080] pdpProductPage should be displayed
When [1101-1100] bagProductName text should equal to `pdpProductName`
And [1100-1300] User clicks on the bagCloseButton
!-- And [1100-1300] User clicks on the quantityIncrementButton
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] shoppingBag should be displayed, Within 120 seconds
!-- And [8002-0004] user check bagQTY with 2
And [1101-1181] the user saves bagProductPrice text in global scope under name bagPrice
And [1100-1300] User clicks on the bagCheckoutButton
And [1111-1080] saksBagPage should be displayed, Within 120 seconds
And [8002-0005] User hits 2 with `bagPrice`
And [1101-1181] the user saves bagProductPriceAfter text in global scope under name bagPriceAfter
Then [8002-0006] User compare between `bagPrice` and `bagPriceAfter`
And [1100-1310] Clear quantity field
And [1100-1340] User fills quantity with 1