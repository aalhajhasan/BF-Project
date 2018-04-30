Meta:
@ReportName Gilt

Scenario: TC06_Gilt_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] giltCartDialog should be displayed
When [1100-1300] User clicks on the giltCartCloseButton
And [1200-1302] For any element from giltTopNavStore
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from giltSales
And [1100-0400] Execute `click` javascript on the element
And [8000-0005] user search for giltAvailableSize
And [1211-1080] giltProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from giltProducts
And [1100-0300] User click on it
And [1111-1080] giltPdpPage should be displayed, Within 120 seconds
And [8000-0007] user randomly select an available giltSku
And [1100-1400] Execute `click` javascript on giltAddToCartButton
And [1111-1080] giltCartDialog should be displayed, Within 120 seconds
And [1101-1184] the user saves giltCartProductOnePrice text in scenario scope under name giltProductOnePrice
And [1101-1184] the user saves giltCartProductTwoPrice text in scenario scope under name giltProductTwoPrice
And [1101-1184] the user saves giltCartSubTotalPrice text in scenario scope under name giltProductTotalPrice
Then [8000-0003] the user check the sum of `giltProductOnePrice` and `giltProductTwoPrice` with `giltProductTotalPrice`