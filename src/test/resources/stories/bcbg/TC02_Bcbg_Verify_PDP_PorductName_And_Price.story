Meta:
@ReportName Bcbg

Scenario:  TC02_Bcbg_Verify_PDP_PorductName_And_Price

Given [1101-1080] bcbgQuickViewDialog should be displayed
When [1100-1400] Execute `click` javascript on bcbgViewFullDetails
And [1111-1080] bcbgPdp should be displayed, Within 120 seconds
And [1101-1181] the user saves bcbgPdpName text in global scope under name bcbgPdpName
And [1101-1181] the user saves bcbgPdpPrice text in global scope under name bcbgPdpPrice
And [1100-1581] the user saves bcbgPdpImage attribute of src in global scope under name bcbgPdpImage
Then [5101-1100] verify that text `bcbgProductName` and text `bcbgPdpName` are equals
And [8028-0003] User compare between `bcbgProductPrice` and `bcbgPdpPrice`
And [8028-0002] user compare between `bcbgProductImage` , `bcbgProductImage` and `bcbgPdpImage`