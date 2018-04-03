Meta:
@ReportName LordandTaylor

Scenario:  TC02_Lordandtaylor_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on lordandtaylor page
When [1211-1000] lordandtaylorTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [1211-1080] lordandtaylorProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from lordandtaylorProducts
And [1100-1581] the user saves productImage attribute of src in global scope under name productImage
And [1101-1181] the user saves lordandtaylorProductName text in global scope under name productName
And [1101-1181] the user saves lordandtaylorProductPrice text in global scope under name productPrice
And [1100-1300] User clicks on the previewThisProductIcon
And [1111-1080] quickViewDialog should be displayed, Within 120 seconds
Then [1101-1100] quickViewProductName text should equal to `productName`
And [1101-1181] the user saves quickViewProductPrice text in global scope under name quickViewPrice
And [8009-0001] User compare between `productPrice` and `quickViewPrice`
And [1100-1581] the user saves quickViewImage attribute of data-default-image-set in global scope under name quickViewImage