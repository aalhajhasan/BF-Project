Meta:
@ReportName L.L.Bean

Scenario: TC03_Llbean_Verify_PDP_PorductName_And_Price

Given [1101-1080] llbeanQuickViewDialog should be displayed
When [1100-1300] User clicks on the llbeanViewFullDetails
And [1111-1080] llbeanPdp should be displayed, Within 120 seconds
And [1101-1140] llbeanPdpName text should contain `llbeanProductName`
And [1101-1140] llbeanPdpPrice text should contain `llbeanProductPrice`
And [1100-1581] the user saves llbeanPdpImage attribute of src in global scope under name llbeanPdpImage
Then [8013-0002] user compare between `llbeanProductImage` and `llbeanPdpImage`