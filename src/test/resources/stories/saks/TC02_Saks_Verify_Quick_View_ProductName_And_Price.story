


Scenario:  TC02_Saks_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on saks page
When [1211-1000] saksTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [1200-1302] For any element from saksSales
And [1100-0300] User click on it
And [8002-0001] user search for saksProducts
And [1211-1080] saksProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from saksProducts
And [1101-1181] the user saves saksProductName text in global scope under name productName
And [1101-1181] the user saves saksProductPrice text in global scope under name productPrice
And [1100-1300] User clicks on the previewThisProductIcon
And [1111-1080] quickViewDialog should be displayed, Within 120 seconds
Then [1101-1100] quickViewProductName text should equal to `productName`
And [1101-1181] the user saves quickViewProductPrice text in global scope under name quickViewPrice
And [8002-0002] User compare between `productPrice` and `quickViewPrice`
And [1100-1581] the user saves quickViewImage attribute of data-default-image-set in global scope under name quickViewImage
