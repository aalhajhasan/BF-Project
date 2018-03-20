
Scenario:  TC02_landsend_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on landsend page
When [1200-1302] For any element from landsendTopNav
And [1100-0360] User move mouse to it
And [1100-0300] User click on it
And [1211-1080] landsendSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from landsendSales
And [1100-0300] User click on it
And [1012-1000] page is loaded, within 120 seconds
And [1211-1080] landsendProducts should be all displayed, Within 120 seconds
And [8004-0001] user search for landsendProducts
And [1012-1000] page is loaded, within 120 seconds
And [1200-1302] For any element from landsendProducts
And [1101-1181] the user saves landsendProductName text in global scope under name productName
And [1101-1181] the user saves landsendProductPrice text in global scope under name productPrice
And [8004-0002] User compare between `productPrice` and `quickViewPrice`
And [1100-1300] User clicks on the previewThisProductIcon
And [1111-1080] quickViewDialog should be displayed, Within 120 seconds
Then [1101-1100] quickViewProductName text should equal to `productName`
And [1101-1181] the user saves quickViewProductPrice text in global scope under name quickViewPrice
And [8004-0002] User compare between `productPrice` and `quickViewPrice`
And [1100-1581] the user saves quickViewImage attribute of data-default-image-set in global scope under name quickViewImage