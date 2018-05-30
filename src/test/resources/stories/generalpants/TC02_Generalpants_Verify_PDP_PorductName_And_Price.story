Meta:
@ReportName General Pants

Scenario:  TC02_Generalpants_Verify_PDP_PorductName_And_Price

Given [1000-9001] User on generalPants page
When [1200-1302] For any element from generalPantsTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] generalPantsSales should be all displayed, Within 120 seconds
And [8025-0001] sleep after last action for 5000 Milliseconds
And [1200-1302] For any element from generalPantsSales
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] generalPantsProducts should be all displayed, Within 120 seconds
And [8025-0001] sleep after last action for 8000 Milliseconds
And [1200-1302] For any element from generalPantsProducts
And [1101-1181] the user saves generalPantsProductName text in global scope under name generalPantsProductName
And [1101-1181] the user saves generalPantsProductPrice text in global scope under name generalPantsProductPrice
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] generalPantsPdp should be displayed, Within 120 seconds
And [1101-1181] the user saves generalPantsPdpName text in global scope under name generalPantsPdpName
And [1101-1181] the user saves generalPantsPdpPrice text in global scope under name generalPantsPdpPrice
Then [5101-1100] verify that text `generalPantsProductName` and text `generalPantsPdpName` are equals
And [8025-0003] verify that number `generalPantsProductPrice` and number `generalPantsPdpPrice` are equals