Meta:
@ReportName Party City Canada

Scenario: TC02_Partycitycanada_Verify_PDP_PorductName_And_Price

Given [1101-1080] partycityQuickShopDialog should be displayed
When [1100-1400] Execute `click` javascript on partycityViewPriductDetails
And [1111-1080] partycityPdp should be displayed, Within 120 seconds
And [1101-1181] the user saves partycityPdpName text in global scope under name partycityPdpName
And [1101-1181] the user saves partycityPdpPrice text in global scope under name partycityPdpPrice
Then [5101-1100] verify that text `partycityProductName` and text `partycityPdpName` are equals
And [8019-0003] verify that number `partycityProductPrice` and number `partycityPdpPrice` are equals
