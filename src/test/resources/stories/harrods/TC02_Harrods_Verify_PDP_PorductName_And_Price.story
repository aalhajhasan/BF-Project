
Scenario:  TC02_Harrods_Verify_PDP_PorductName_And_Price

Given [1100-1300] User clicks on the fullDetails
When [1111-1080] productPage should be displayed, Within 120 seconds
And [1100-1581] the user saves pdpImage attribute of src in global scope under name pdpImage
Then [1101-1100] pdpProductPrice text should equal to `productPrice`
And [1101-1100] pdpProductName text should equal to `productName`
And [8001-0006] user compare between `quickViewImage` and `pdpImage`
And [8001-0005] user search for moreThanOneQTY