Meta:
@ReportName Bcbg

Scenario:  TC01_Bcbg_Verify_Quick_View_ProductName_And_Price

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens bcbg page
And [1200-1302] For any element from bcbgTopNavStore
And [1111-0000] It should be clickable, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] bcbgProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from bcbgProducts
And [1101-1181] the user saves bcbgProductName text in global scope under name bcbgProductName
And [1101-1181] the user saves bcbgProductPrice text in global scope under name bcbgProductPrice
And [1100-1581] the user saves bcbgProductImage attribute of src in global scope under name bcbgProductImage
And [1100-0371] User move mouse to it and click on bcbgQuickView
And [1111-1080] bcbgQuickViewDialog should be displayed, Within 120 seconds
And [1101-1181] the user saves bcbgQuickViewName text in global scope under name bcbgQuickViewName
And [1101-1181] the user saves bcbgQuickViewPrice text in global scope under name bcbgQuickViewPrice
And [1100-1581] the user saves bcbgQuickViewImage attribute of src in global scope under name bcbgProductImage
Then [5101-1100] verify that text `bcbgProductName` and text `bcbgQuickViewName` are equals
And [8028-0003] User compare between `bcbgProductPrice` and `bcbgQuickViewPrice`