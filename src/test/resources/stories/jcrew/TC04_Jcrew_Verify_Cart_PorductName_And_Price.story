Meta:
@ReportName Jcrew

Scenario:  TC04_Jcrew_Verify_Cart_PorductName_And_Price

Given [1101-1080] itemDetailsPage should be displayed
When [1200-1302-S] For any element from itemColors
And [1100-0400] Execute `click` javascript on the element
And [1200-1302-S] For any element from itemSizes
And [1100-0400] Execute `click` javascript on the element
And [1100-1300] User clicks on the itemAddToBag
And [1111-1080] bagDialog should be displayed, Within 120 seconds
And [1101-1102] bagItemName text is equal to `plpItemName` case sensitive
And [1101-1181] the user saves bagItemPrice text in global scope under name bagItemPrice
Then [8010-0002] User compare between `plpItemPrice` and `bagItemPrice`