Meta:
@ReportName Neiman Marcus

Scenario:  TC03_NeimanMarcus_Verify_PDP_PorductName_And_Price

Given [1101-1080] neimanmarcusQuickViewDialog should be displayed
When [1100-1400] Execute `click` javascript on neimanmarcusViewFullDetails
And [1111-1080] neimanmarcusPdp should be displayed, Within 120 seconds
And [8014-0001] user search for neimanmarcusValidPdp
And [1101-1140] neimanmarcusPdpName text should contain `neimanmarcusProductName`
And [1101-1140] neimanmarcusPdpPrice text should contain `neimanmarcusProductPrice`
Then [8014-0002] user compare between `neimanmarcusProductImage` and `neimanmarcusPdpImage`
