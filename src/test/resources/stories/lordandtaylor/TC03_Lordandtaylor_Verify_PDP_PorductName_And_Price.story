Meta:
@ReportName Lord And Taylor

Scenario:  TC03_Lordandtaylor_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the lordandtaylorViewProductDetail
When [1111-1080] lordandtaylorPdpProductPage should be displayed, Within 120 seconds
And [1101-1140] lordandtaylorPdpProductName text should contain `lordandtaylorProductName`
And [8009-0009] user search for lordandtaylorValidPdp
And [1100-1581] the user saves lordandtaylorPdpImage attribute of data-image in global scope under name lordandtaylorPdpImage
And [1101-1181] the user saves lordandtaylorPdpProductPrice text in global scope under name lordandtaylorPdpProductPrice
And [1101-1181] the user saves lordandtaylorPdpProductName text in global scope under name lordandtaylorPdpProductName
Then [8009-0002] user compare between `lordandtaylorProductImage` , `lordandtaylorQuickViewImage` and `lordandtaylorPdpImage`