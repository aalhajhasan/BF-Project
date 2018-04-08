Meta:
@ReportName LordandTaylor

Scenario:  TC03_Lordandtaylor_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the viewProductDetail
When [1111-1080] lordandtaylorPdpProductPage should be displayed, Within 120 seconds
And [1100-1581] the user saves lordandtaylorPdpImage attribute of data-image in global scope under name lordandtaylorPdpImage
And [1101-1181] the user saves lordandtaylorPdpProductPrice text in global scope under name lordandtaylorPdpProductPrice
Then [8009-0001] User compare between `lordandtaylorProductPrice` and `lordandtaylorPdpProductPrice`
And [1101-1100] lordandtaylorPdpProductName text should equal to `lordandtaylorProductName`
And [8009-0002] user compare between `lordandtaylorProductImage` , `lordandtaylorQuickViewImage` and `lordandtaylorPdpImage`
And [1101-1181] the user saves lordandtaylorPdpPrice text in global scope under name lordandtaylorPdpPrice