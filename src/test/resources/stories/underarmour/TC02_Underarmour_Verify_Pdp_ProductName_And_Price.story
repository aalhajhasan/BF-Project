Meta:
@ReportName Under Armour

Scenario:  TC02_Underarmour_Verify_Pdp_ProductName_And_Price

Given [1000-9001] User on underarmour page
When [1100-1320] User scroll to the underarmourNewArrivalsSection
And [1200-1302] For any element from underarmourNewArrivalsCategory
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] underarmourPlp should be displayed, Within 120 seconds
And [1200-1302] For any element from underarmourPlpItems
And [1101-1181] the user saves underarmourPlpItemName text in global scope under name underarmourPlpItemName
And [1100-1581] the user saves underarmourPlpItemImage attribute of src in global scope under name underarmourPlpItemImage
And [1101-1181] the user saves underarmourPlpItemPrice text in global scope under name underarmourPlpItemPrice
And [1100-0360] User move mouse to it
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] underarmourPdpItemPage should be displayed, Within 120 seconds
!-- And [1101-1140] underarmourPdpItemName text should contain `underarmourPlpItemName`
And [1101-1181] the user saves underarmourPdpItemPrice text in global scope under name underarmourPdpItemPrice
And [1100-1581] the user saves underarmourPdpItemImage attribute of src in global scope under name underarmourPdpItemImage
Then [8011-0001] User compare between `underarmourPlpItemPrice` and `underarmourPdpItemPrice`
And [8011-0002] user compare between `underarmourPlpItemImage` and `underarmourPdpItemImage`