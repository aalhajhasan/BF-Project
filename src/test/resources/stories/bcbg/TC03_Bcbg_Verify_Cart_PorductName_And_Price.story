Meta:
@ReportName Bcbg

Scenario:  TC03_Bcbg_Verify_Cart_PorductName_And_Price

Given [1101-1080] bcbgPdp should be displayed
When [8028-0004] user randomly select an available bcbgSizes
And [1100-1400] Execute `click` javascript on bcbgAddToBag
And [1111-1080] bcbgCartDialog should be displayed, Within 120 seconds
And [1101-1181] the user saves bcbgCartName text in global scope under name bcbgCartName
And [1101-1181] the user saves bcbgCartPrice text in global scope under name bcbgCartPrice
Then [5101-1100] verify that text `bcbgProductName` and text `bcbgCartName` are equals
And [8028-0003] User compare between `bcbgProductPrice` and `bcbgCartPrice`
And [1100-1400] Execute `click` javascript on bcbgCartClose