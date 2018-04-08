Meta:
@ReportName Jcrew

Scenario:  TC04_Jcrew_Verify_Cart_PorductName_And_Price

Given [1101-1080] jcrewItemDetailsPage should be displayed
When [8010-0007] user randomly select an available jcrewItemColors
And [8010-0007] user randomly select an available jcrewItemSizes
And [1100-1300] User clicks on the jcrewItemAddToBag
And [1111-1080] jcrewBagDialog should be displayed, Within 120 seconds
And [1101-1140] jcrewBagItemName text should contain `jcrewPlpItemName`
And [1101-1181] the user saves jcrewBagItemPrice text in global scope under name jcrewBagItemPrice
Then [8010-0002] User compare between `jcrewPlpItemPrice` and `jcrewBagItemPrice`