Meta:
@ReportName Underarmour

Scenario:  TC02_Underarmour_Verify_Pdp_ProductName_And_Price

Given [1000-9001] User on underarmour page
When [1100-1320] User scroll to the newArrivalsSection
And [1200-1302] For any element from newArrivalsCategory
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] underarmourPlp should be displayed, Within 120 seconds
And [1200-1302] For any element from plpItems
And [1101-1181] the user saves plpItemName text in global scope under name plpItemName
And [1100-1581] the user saves plpItemImage attribute of src in global scope under name plpItemImage
And [1101-1181] the user saves plpItemPrice text in global scope under name plpItemPrice
And [1100-0360] User move mouse to it
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] pdpItemPage should be displayed, Within 120 seconds
And [1101-1102] pdpItemName text is equal to `plpItemName` case sensitive
And [1101-1181] the user saves pdpItemPrice text in global scope under name pdpItemPrice
And [1100-1581] the user saves pdpItemImage attribute of src in global scope under name pdpItemImage
Then [8011-0001] User compare between `plpItemPrice` and `pdpItemPrice`
And [8011-0002] user compare between `plpItemImage` and `pdpItemImage`