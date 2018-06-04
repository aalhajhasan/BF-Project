Meta:
@ReportName Party City Canada

Scenario:  TC03_Partycitycanada_Verify_Cart_PorductName_And_Price

Given [1101-1080] partycityPdp should be displayed
When [8019-0004] user randomly select an available partycityColors
And [1100-1400] Execute `click` javascript on partycityAddToBasket
And [1111-1080] partycityCart should be displayed, Within 120 seconds
And [1111-1080] partycityCartDialog should be displayed, Within 120 seconds
And 