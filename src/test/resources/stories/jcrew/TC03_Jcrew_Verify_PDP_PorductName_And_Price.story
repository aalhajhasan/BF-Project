Meta:
@ReportName Jcrew

Scenario: TC03_Jcrew_Verify_PDP_PorductName_And_Price

Given [1101-1080] quickShopDialog should be displayed
When [1100-1300] User clicks on the quickShopViewFullDetails
And [1111-1080] itemDetailsPage should be displayed, Within 120 seconds
And [1101-1102] itemName text is equal to `plpItemName` case sensitive
And [1101-1181] the user saves itemPrice text in global scope under name itemPrice
And [1100-1581] the user saves itemImage attribute of src in global scope under name itemImage
Then [8010-0002] User compare between `plpItemPrice` and `itemPrice`
And [8010-0003] user compare between `plpItemImage` , `quickShopItemImage` and `itemImage`