Meta:
@ReportName Saks

Scenario:  TC03_Saks_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the saksViewProductDetail
When [1111-1080] saksPdpProductPage should be displayed, Within 120 seconds
And [1100-1581] the user saves saksPdpImage attribute of data-image in global scope under name saksPdpImage
And [1101-1181] the user saves saksPdpProductPrice text in global scope under name saksPdpPrice
Then [8002-0002] User compare between `saksProductPrice` and `saksPdpPrice`
And [1101-1140] saksPdpProductName text should contain `saksProductName`
And [8002-0003] user compare between `saksQuickViewImage` and `saksPdpImage`