Meta:
@ReportName Jcrew

Scenario: TC03_Jcrew_Verify_PDP_PorductName_And_Price

Given [1101-1080] jcrewQuickShopDialog should be displayed
When [1100-1300] User clicks on the jcrewQuickShopViewFullDetails
And [1111-1080] jcrewItemDetailsPage should be displayed, Within 120 seconds
And [1101-1102] jcrewItemName text is equal to `jcrewPlpItemName` case sensitive
And [1101-1181] the user saves jcrewItemPrice text in global scope under name jcrewItemPrice
And [1100-1581] the user saves jcrewItemImage attribute of src in global scope under name jcrewItemImage
Then [8010-0002] User compare between `jcrewPlpItemPrice` and `jcrewItemPrice`
And [8010-0003] user compare between `jcrewPlpItemImage` , `jcrewQuickShopItemImage` and `jcrewItemImage`