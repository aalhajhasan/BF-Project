
Scenario:  TC03_Ruelala_Verify_Cart_PorductName_And_Price

Given [1101-1080] ruelalaPDP should be displayed
When [8007-0002] user search for validPDP
And [1200-1302-S] For any element from sizes
And [1100-0300-S] User click on it
And [1101-1181] the user saves pdpPrice text in global scope under name pdpPrice
And [1101-1181] the user saves pdpName text in global scope under name pdpName
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] bagPage should be displayed, Within 120 seconds
And [1101-1102] bagProductName text is equal to `pdpName` case sensitive
And [1101-1181] the user saves bagProductPrice text in global scope under name bagPrice
Then [8007-0001] User compare between `bagPrice` and `pdpPrice`