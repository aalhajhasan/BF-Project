Meta:
@ReportName Saks Fifth Avenue

Scenario:  TC03_Saksoff_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the viewProductDetail
When [1111-1080] pdpProductPage should be displayed, Within 120 seconds
And [1100-1581] the user saves pdpImage attribute of data-image in global scope under name pdpImage
And [1101-1181] the user saves pdpProductPrice text in global scope under name pdpPrice
Then [8003-0001] User compare between `productPrice` and `pdpPrice`
And [1101-1100] pdpProductName text should equal to `productName`
And [8003-0002] user compare between `quickViewImage` and `pdpImage`