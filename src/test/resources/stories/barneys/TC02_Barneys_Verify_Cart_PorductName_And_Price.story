Meta:
@ReportName Barneys

Scenario:  TC02_Barneys_Verify_Cart_PorductName_And_Price

Given [1101-1080] barneysPdp should be displayed
When [8008-0006] user randomly select an available size
And [1111-1080] barneysAddToBagButton should be displayed, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] barneysMyBagDialog should be displayed, Within 120 seconds
And [1101-1102] barneysBagName text is equal to `barneysProductName` case sensitive
And [1101-1181] the user saves barneysBagPrice text in global scope under name barneysBagPrice
And [1100-1581] the user saves barneysBagImage attribute of src in global scope under name barneysBagImage
Then [8008-0001] User compare between `barneysPdpPrice` and `barneysBagPrice`
And [8008-0002] user compare between `barneysBagImage` and `barneysPdpImage`
And [1100-1300] User clicks on the barneysMyBagCloseButton