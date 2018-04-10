Meta:
@ReportName Gilt

Scenario: TC04_Gilt_Verify_Cart_PorductName_And_Price

Given [1101-1080] giltPdpPage should be displayed
When [8000-0007] user randomly select an available giltSku
And [1100-1300] User clicks on the giltAddToCartButton
And [1111-1080] giltCartDialog should be displayed, Within 120 seconds
Then [1101-1140] giltCartProductPrice text should contain `giltProductPrice`
And [1100-1581] the user saves giltCartImage attribute of srcset in global scope under name giltCartImage
And [8000-0006] user compare between `giltPlpImage` , `giltQuickViewProductImage` , `giltPdpImage` and `giltCartImage`