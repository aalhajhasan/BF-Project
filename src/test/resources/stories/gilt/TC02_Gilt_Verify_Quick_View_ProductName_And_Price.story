Meta:
@ReportName Gilt

Scenario: TC02_Gilt_Verify_Quick_View_ProductName&_And_Price

Given [1000-9001] User on gilt page
When [1200-1302] For any element from giltTopNavStore
And [1111-0000] It should be clickable, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from giltSales
And [1100-0400] Execute `click` javascript on the element
And [8000-0005] user search for giltAvailableSize
And [1211-1080] giltProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from giltProducts
And [1101-1181] the user saves giltProductName text in global scope under name giltProductName
And [1101-1181] the user saves giltProductPrice text in global scope under name giltProductPrice
And [1100-1581] the user saves giltPlpImage attribute of src in global scope under name giltPlpImage
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on giltQuickView
And [1111-1080] giltQuickViewDialog should be displayed, Within 120 seconds
Then [1101-1140] giltQuickViewProductName text should contain `giltProductName`
And [1101-1140] giltQuickViewProductPrice text should contain `giltProductPrice`
And [1100-1581] the user saves giltQuickViewProductImage attribute of data-zoom-src in global scope under name giltQuickViewProductImage