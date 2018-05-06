Meta:
@ReportName Last Call

Scenario:  TC02_Lastcall_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on lastcall page
When [1200-1302] For any element from lastcallTopNav
And [1100-0360] User move mouse to it
And [1100-0300] User click on it
And [1211-1080] lastcallSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from lastcallSales
And [1100-0400] Execute `click` javascript on the element
And [8014-0001] user search for lastcallPlpPage
And [1211-1080] lastcallProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from lastcallProducts
And [1101-1181] the user saves lastcallProductName text in global scope under name lastcallProductName
And [1101-1181] the user saves lastcallProductPrice text in global scope under name lastcallProductPrice
And [1100-1581] the user saves lastcallProductImage attribute of src in global scope under name lastcallProductImage
And [1100-0371] User move mouse to it and click on lastcallProductQuickView
And [1111-1080] lastcallQuickViewDialog should be displayed, Within 120 seconds
Then [1101-1140] lastcallQuickViewProductName text should contain `lastcallProductName`
And [1101-1140] lastcallQuickViewProductPrice text should contain `lastcallProductPrice`
And [1100-1581] the user saves lastcallQuickViewProductImage attribute of src in global scope under name lastcallQuickViewProductImage