Meta:
@ReportName Harrods

Scenario:  TC02_Harrods_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the harrodsFullDetails
When [1111-1080] harrodsProductPage should be displayed, Within 120 seconds
And [1100-1581] the user saves harrodsPdpImage attribute of src in global scope under name harrodsPdpImage
Then [1101-1140] harrodsPdpProductPrice text should contain `harrodsProductPrice`
And [1101-1140] harrodsPdpProductName text should contain `harrodsProductName`
And [8001-0006] user compare between `harrodsQuickViewImage` and `harrodsPdpImage`
And [8001-0005] user search for harrodsMoreThanOneQTY