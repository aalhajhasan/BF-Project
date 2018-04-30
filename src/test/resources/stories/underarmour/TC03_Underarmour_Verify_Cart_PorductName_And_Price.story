Meta:
@ReportName Under Armour

Scenario:  TC03_Underarmour_Verify_Cart_PorductName_And_Price

Given [1101-1080] underarmourPdpItemPage should be displayed
When [8011-0006] user randomly select an available underarmourItemColors
And [8011-0006] user randomly select an available underarmourItemSizes
And [1100-1400] Execute `click` javascript on underarmourAddToBag
And [1111-1080] underarmourBagDialog should be displayed, Within 120 seconds
And [1101-1181] the user saves underarmourBagItemPrice text in global scope under name underarmourBagItemPrice
Then [8011-0001] User compare between `underarmourBagItemPrice` and `underarmourPdpItemPrice`