Meta:
@ReportName Pacsun

Scenario:  TC04_Pacsun_Verify_Cart_PorductName_And_Price

Given [1101-1080] pacsunPdp should be displayed
When [1100-1300] User clicks on the pacsunSizeIcon
And [8029-0002] user randomly select an available pacsunSize
And [1100-1400] Execute `click` javascript on pacsunAddToCart
And [1111-1080] pacsunCartDialog should be displayed, Within 120 seconds
And [1101-1181] the user saves pacsunCartName text in global scope under name pacsunCartName
And [5100-2106] convert text `pacsunCartName` to lower and tag it as pacsunCartNameL
And [5100-2106] convert text `pacsunProductName` to lower and tag it as pacsunProductNameL
Then [5101-1100] verify that text `pacsunCartNameL` and text `pacsunProductNameL` are equals
And [1101-1140] pacsunCartPrice text should contain `pacsunProductPrice`