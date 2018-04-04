Meta:
@ReportName Underarmour

Scenario:  TC03_Underarmour_Verify_Cart_PorductName_And_Price

Given [1101-1080] pdpItemPage should be displayed
When [8011-0006] user randomly select an available itemColors
And [8011-0006] user randomly select an available itemSizes
And [1100-1300] User clicks on the addToBag
And [1111-1080] bagDialog should be displayed, Within 120 seconds
And [1101-1140] bagItemName text should contain `plpItemName`
And [1101-1181] the user saves bagItemPrice text in global scope under name bagItemPrice
Then [8011-0001] User compare between `bagItemPrice` and `pdpItemPrice`