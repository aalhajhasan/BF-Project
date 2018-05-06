Meta:
@ReportName Last Call

Scenario:  TC04_Lastcall_Verify_Cart_PorductName_And_Price

Given [1101-1080] lastcallPdp should be displayed
When [8014-0003] user randomly select an available lastcallSize
And [8014-0003] user randomly select an available lastcallColor
And [1100-1300] User clicks on the lastcallAddToBag
And [1111-1080] lastcallBagDialog should be displayed, Within 120 seconds
Then [1101-1140] lastcallBagName text should contain `lastcallProductName`
And [1101-1140] lastcallBagPrice text should contain `lastcallProductPrice`