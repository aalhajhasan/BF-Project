Meta:
@ReportName Sephora

Scenario:  TC02_Sephora_Verify_Pdp_ProductName_And_Price

Given [1101-1080] sephoraQickLook should be displayed
When [1100-1400] Execute `click` javascript on sephoraProductDetails
And [1111-1080] sephoraPdp should be displayed, Within 120 seconds
Then [1101-1140] sephoraPdpName text should contain `sephoraProductName`
And [1101-1181] the user saves sephoraPdpPrice text in global scope under name sephoraPdpPrice
And [1100-1581] the user saves sephoraPdpImage attribute of src in global scope under name sephoraPdpImage
And [8022-0002] User compare between `sephoraProductPrice` and `sephoraPdpPrice`
And [8022-0003] user compare between `sephoraProductImage` , `sephoraQickLookImage` and `sephoraPdpImage`