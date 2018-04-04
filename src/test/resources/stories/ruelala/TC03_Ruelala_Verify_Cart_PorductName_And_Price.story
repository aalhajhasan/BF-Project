Meta:
@ReportName Ruelala

Scenario:  TC03_Ruelala_Verify_Cart_PorductName_And_Price

Given [1101-1080] ruelalaPDP should be displayed
When [8007-0002] user search for validPDP
And [8007-0006] user randomly select an available sizes
And [1101-1181] the user saves pdpPrice text in global scope under name pdpPrice
And [1101-1181] the user saves pdpName text in global scope under name pdpName
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] ruelalaBagPage should be displayed, Within 120 seconds
And [1101-1102] bagProductName text is equal to `pdpName` case sensitive
And [1101-1181] the user saves bagProductPrice text in global scope under name bagPrice
Then [8007-0001] User compare between `bagPrice` and `pdpPrice`