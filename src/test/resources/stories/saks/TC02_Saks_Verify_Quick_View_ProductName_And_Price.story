Meta:
@ReportName Saks

Scenario:  TC02_Saks_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on saks page
When [1211-1000] saksTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from saksSales
And [1100-0400] Execute `click` javascript on the element
And [8002-0001] user search for saksProducts
And [1211-1080] saksProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from saksProducts
And [1101-1181] the user saves saksProductName text in global scope under name saksProductName
And [1101-1181] the user saves saksProductPrice text in global scope under name saksProductPrice
And [1100-1581] the user saves saksProductImage attribute of data-image in global scope under name saksProductImage
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on saksPreviewThisProductIcon
And [1111-1080] saksQuickViewDialog should be displayed, Within 120 seconds
And [8002-0010] sleep after last action for 2000 Milliseconds
Then [1101-1140] saksQuickViewProductName text should contain `saksProductName`
And [1101-1181] the user saves saksQuickViewProductPrice text in global scope under name saksQuickViewPrice
And [8002-0002] User compare between `saksProductPrice` and `saksQuickViewPrice`
And [1100-1581] the user saves saksQuickViewImage attribute of data-default-image-set in global scope under name saksQuickViewImage
