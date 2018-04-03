Meta:
@ReportName Ebags

Scenario:  TC02_Ebags_Verify_PDP_ProductName_And_Price

Given [1000-9001] User on ebags page
When [1211-1000] ebagsTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [8006-0001] user search for ebagsProducts
And [1211-1080] ebagsProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from ebagsProducts
And [1100-1581] the user saves plpImage attribute of src in global scope under name plpImage
And [1101-1181] the user saves ebagsProductPrice text in global scope under name productPrice
And [1101-1181] the user saves ebagsProductName text in global scope under name productName
And [1100-0300] User click on it
And [1111-1080] pdpProductPage should be displayed, Within 120 seconds
And [1101-1181] the user saves pdpProductPrice text in global scope under name pdpPrice
Then [1101-1100] pdpProductName text should equal to `productName`
And [8006-0002] User compare between `productPrice` and `pdpPrice`
And [1100-1581] the user saves pdpImage attribute of src in global scope under name pdpImage
And [8006-0003] user compare between `plpImage` and `pdpImage`