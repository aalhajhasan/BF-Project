Meta:
@ReportName L.L.Bean

Scenario:  TC02_Llbean_Verify_Quick_View_ProductName_And_Price

Given [1000-9001] User on llbean page
When [1200-1302] For any element from llbeanTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] llbeanSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from llbeanSales
And [1100-0400] Execute `click` javascript on the element
And [8013-0001] user search for llbeanPlpPage
And [1211-1080] llbeanProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from llbeanProducts
And [1101-1181] the user saves llbeanProductName text in global scope under name llbeanProductName
And [1101-1181] the user saves llbeanProductPrice text in global scope under name llbeanProductPrice
And [1100-1581] the user saves llbeanProductImage attribute of src in global scope under name llbeanProductImage
And [1100-0371] User move mouse to it and click on llbeanProductQuickView
And [1111-1080] llbeanQuickViewDialog should be displayed, Within 120 seconds
Then [1101-1140] llbeanQuickViewProductName text should contain `llbeanProductName`
And [1101-1140] llbeanQuickViewProductPrice text should contain `llbeanProductPrice`