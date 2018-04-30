Meta:
@ReportName Neiman Marcus

Scenario:  TC03_NeimanMarcus_Verify_PDP_PorductName_And_Price

Given [1101-1080] neimanmarcusQuickViewDialog should be displayed
When [1100-1400] Execute `click` javascript on neimanmarcusViewFullDetails
And [1111-1080] neimanmarcusPdp should be displayed, Within 120 seconds
And [8015-0003] sleep after last action for 5000 Milliseconds
And [8015-0001] user search for neimanmarcusValidPdp
And [1101-1140] neimanmarcusPdpName text should contain `neimanmarcusProductName`
And [1101-1181] the user saves neimanmarcusPdpPrice text in global scope under name neimanmarcusPdpPrice
Then [8015-0006] `neimanmarcusProductPrice` and `neimanmarcusPdpPrice` should be equal