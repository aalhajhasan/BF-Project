
Scenario:  TC02_Barneys_Verify_Cart_PorductName_And_Price

Given [1101-1080] barneysPdp should be displayed
When [1200-1302-S] For any element from availableSize
And [1100-0300-S] User click on it
And [1111-1080] addToBagButton should be displayed, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] myBagDialog should be displayed, Within 120 seconds
And [1101-1102] bagName text is equal to `pdpName` case sensitive
And [1101-1181] the user saves bagPrice text in global scope under name bagPrice
And [1100-1581] the user saves bagImage attribute of src in global scope under name bagImage
Then [8008-0001] User compare between `pdpPrice` and `bagPrice`
And [8008-0002] user compare between `bagImage` and `pdpImage`
And [1100-1300] User clicks on the myBagCloseButton