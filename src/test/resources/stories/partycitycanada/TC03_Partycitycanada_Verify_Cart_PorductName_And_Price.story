Meta:
@ReportName Party City Canada

Scenario:  TC03_Partycitycanada_Verify_Cart_PorductName_And_Price

Given [1101-1080] partycityPdp should be displayed
When [8019-0004] user randomly select an available partycityColors
And [1100-1400] Execute `click` javascript on partycityAddToBasket
And [1111-1080] partycityCartDialog should be displayed, Within 120 seconds
And [1101-1181] the user saves partycityCartName text in global scope under name partycityCartName
And [1101-1181] the user saves partycityCartPrice text in global scope under name partycityCartPrice
Then [5101-1100] verify that text `partycityProductName` and text `partycityCartName` are equals
And [8019-0003] verify that number `partycityProductPrice` and number `partycityCartPrice` are equals