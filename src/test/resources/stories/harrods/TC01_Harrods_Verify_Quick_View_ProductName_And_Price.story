Meta:
@ReportName Harrods

Scenario:  TC01_Harrods_Verify_Quick_View_ProductName_And_Price

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens harrods page
And [1200-1302] For any element from harrodsTopNavStore
And [1111-0000] It should be clickable, Within 120 seconds
And [1100-0300] User click on it
And [1200-1302] For any element from harrodsSales
And [1100-0400] Execute `click` javascript on the element
And [8001-0005] user search for harrodsProducts
And [1211-1080] harrodsProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from harrodsProducts
And [1100-0360] User move mouse to it
And [1101-1181] the user saves harrodsProductName text in global scope under name harrodsProductName
And [1101-1181] the user saves harrodsProductPrice text in global scope under name harrodsProductPrice
And [1100-0320] User scroll to it
And [1100-0360] User move mouse to it
And [1100-1300] User clicks on the harrodsQuickView
And [8001-0008] sleep after last action for 5000 Milliseconds
And [1111-1080] harrodsQuickViewDialog should be displayed, Within 120 seconds
Then [1101-1140] harrodsQuickViewProductName text should contain `harrodsProductName`
And [1101-1140] harrodsQuickViewProductPrice text should contain `harrodsProductPrice`
And [1100-1581] the user saves harrodsQuickViewImage attribute of src in global scope under name harrodsQuickViewImage