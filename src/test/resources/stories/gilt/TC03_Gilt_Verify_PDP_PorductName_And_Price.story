Meta:
@ReportName Gilt

Scenario: TC03_Gilt_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the giltViewMoreDetails
When [1111-1080] giltPdpPage should be displayed, Within 120 seconds
And [1100-1581] the user saves giltPdpImage attribute of data-zoom-src in global scope under name giltPdpImage
Then [1101-1100] giltPdpProductPrice text should equal to `giltProductPrice`
And [1101-1100] giltPdpProductName text should equal to `giltProductName`