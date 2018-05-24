Meta:
@ReportName Pacsun

Scenario:  TC04_Pacsun_Verify_Cart_PorductName_And_Price

Given [1101-1080] pacsunPdp should be displayed
When [1100-1300] User clicks on the pacsunSizeIcon
And [8029-0002] user randomly select an available pacsunSize
And [1100-1300] User clicks on the pacsunAddToCart
And [1111-1080] pacsunCartDialog should be displayed, Within 120 seconds
Then [1101-1140] pacsunCartName text should contain `pacsunProductName`
And [1101-1140] pacsunCartPrice text should contain `pacsunProductPrice`