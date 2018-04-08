Meta:
@ReportName Saks

Scenario:  TC05_Saks_Verify_price_correctness_after_updating_item_QTY

Given [1101-1080] saksPdpProductPage should be displayed
When [1101-1100] saksBagProductName text should equal to `saksPdpProductName`
And [1100-1300] User clicks on the saksBagCloseButton
And [1101-1080] saksPdpProductPage should be displayed
And [1100-1300] User clicks on the saksAddToBagButton
And [1111-1080] saksShoppingBag should be displayed, Within 120 seconds
And [1100-1581] the user saves saksBagQTY attribute of innerText in global scope under name saksBagQTY
And [8003-0004] user check `saksBagQTY` with 2
And [1101-1181] the user saves saksBagProductPrice text in global scope under name saksBagPrice
And [1100-1300] User clicks on the saksBagCheckoutButton
And [1111-1080] saksBagPage should be displayed, Within 120 seconds
And [8002-0005] User hits 2 with `saksBagPrice`
And [1101-1181] the user saves saksBagProductPriceAfter text in global scope under name saksBagPriceAfter
Then [8002-0006] User compare between `saksBagPrice` and `saksBagPriceAfter`
And [1100-1310] Clear saksQuantity field
And [1100-1340] User fills saksQuantity with 1