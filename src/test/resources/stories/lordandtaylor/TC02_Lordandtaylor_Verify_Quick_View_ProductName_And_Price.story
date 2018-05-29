Meta:
@ReportName Lord And Taylor

Scenario:  TC02_Lordandtaylor_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on lordandtaylor page
When [1211-1000] lordandtaylorTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [1211-1080] lordandtaylorProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from lordandtaylorProducts
And [1100-1581] the user saves lordandtaylorProductImage attribute of src in global scope under name lordandtaylorProductImage
And [1101-1181] the user saves lordandtaylorProductName text in global scope under name lordandtaylorProductName
And [1101-1181] the user saves lordandtaylorProductPrice text in global scope under name lordandtaylorProductPrice
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on lordandtaylorPreviewThisProductIcon
And [1111-1080] lordandtaylorQuickViewDialog should be displayed, Within 120 seconds
And [1101-1181] the user saves lordandtaylorQuickViewProductPrice text in global scope under name lordandtaylorQuickViewPrice
Then [8009-0001] User compare between `lordandtaylorProductPrice` and `lordandtaylorQuickViewPrice`
And [1100-1581] the user saves lordandtaylorQuickViewImage attribute of data-default-image-set in global scope under name lordandtaylorQuickViewImage