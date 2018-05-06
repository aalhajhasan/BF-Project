Meta:
@ReportName Last Call

Scenario:  TC03_Lastcall_Verify_PDP_PorductName_And_Price

Given [1101-1080] lastcallQuickViewDialog should be displayed
When [1100-1400] Execute `click` javascript on lastcallViewFullDetails
And [1111-1080] lastcallPdp should be displayed, Within 120 seconds
And [8014-0001] user search for lastcallValidPdp
And [1101-1140] lastcallPdpName text should contain `lastcallProductName`
And [1101-1140] lastcallPdpPrice text should contain `lastcallProductPrice`
Then [8014-0002] user compare between `lastcallProductImage` and `lastcallPdpImage`