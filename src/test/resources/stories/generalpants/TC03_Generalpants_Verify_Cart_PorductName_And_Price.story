Meta:
@ReportName General Pants

Scenario:  TC03_Generalpants_Verify_Cart_PorductName_And_Price

Given [1101-1080] generalPantsPdp should be displayed
When [8025-0002] user search for generalPantsValidPdp
And [8025-0004] user randomly select an available generalPantsSizes
And [1100-1400] Execute `click` javascript on generalPantsAddToBag
And [1111-1000] generalPantsCartCheckout should be clickable, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] generalPantsCartPage should be displayed, Within 120 seconds
And [1101-1181] the user saves generalPantsCartName text in global scope under name generalPantsCartName
And [1101-1181] the user saves generalPantsCartPrice text in global scope under name generalPantsCartPrice
Then [5101-1100] verify that text `generalPantsCartName` and text `generalPantsPdpName` are equals
And [8025-0003] verify that number `generalPantsCartPrice` and number `generalPantsPdpPrice` are equals