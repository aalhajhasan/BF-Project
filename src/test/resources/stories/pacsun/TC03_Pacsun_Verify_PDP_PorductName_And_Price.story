Meta:
@ReportName Pacsun

Scenario: TC03_Pacsun_Verify_PDP_PorductName_And_Price

Given [1101-1080] pacsunQuickViewDialog should be displayed
When [1100-1400] Execute `click` javascript on pacsunViewFullDetails
And [1111-1080] pacsunPdp should be displayed, Within 120 seconds
And [1101-1140] pacsunPdpName text should contain `pacsunProductName`
And [1101-1140] pacsunPdpPrice text should contain `pacsunProductPrice`
And [1100-1581] the user saves pacsunPdpImage attribute of src in global scope under name pacsunPdpImage
Then [8029-0001] user compare between `pacsunProductImage` , `pacsunQuickViewProductImage` and `pacsunPdpImage`