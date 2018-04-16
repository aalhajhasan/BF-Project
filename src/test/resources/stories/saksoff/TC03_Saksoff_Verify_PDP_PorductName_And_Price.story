Meta:
@ReportName Saks Fifth Avenue OFF 5TH

Scenario:  TC03_Saksoff_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the saksoffViewProductDetail
When [1111-1080] saksoffPdpProductPage should be displayed, Within 120 seconds
And [1100-1581] the user saves saksoffPdpImage attribute of data-image in global scope under name saksoffPdpImage
And [1101-1181] the user saves saksoffPdpProductPrice text in global scope under name saksoffPdpPrice
Then [8003-0001] User compare between `saksoffProductPrice` and `saksoffPdpPrice`
And [1101-1140] saksoffPdpProductName text should contain `saksoffProductName`
And [8003-0002] user compare between `saksoffQuickViewImage` and `saksoffPdpImage`