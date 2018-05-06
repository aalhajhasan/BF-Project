Meta:
@ReportName Barneys New York

Scenario:  TC01_Barneys_Verify_PDP_ProductName_And_Price

Given [1000-9130] Clear cache and cookies
When [1000-3000] User maximize browser window
And [1000-9000] User opens barneys page
And [1200-1302] For any element from barneysTopNavStore
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] barneysSalesPage should be displayed, Within 120 seconds
And [1200-1302] For any element from barneysSales
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] barneysPlp should be displayed, Within 120 seconds
And [1200-1302] For any element from barneysPlpProduct
And [1100-1581] the user saves barneysProductImage attribute of src in global scope under name barneysProductImage
And [1101-1181] the user saves barneysProductPrice text in global scope under name barneysProductPrice
And [1101-1181] the user saves barneysProductName text in global scope under name barneysProductName
And [1100-0300] User click on it
And [1111-1080] barneysPdp should be displayed, Within 120 seconds
And [1101-1140] barneysPdpName text should contain `barneysProductName`
And [1101-1181] the user saves barneysPdpPrice text in global scope under name barneysPdpPrice
And [1100-1581] the user saves barneysPdpImage attribute of src in global scope under name barneysPdpImage
Then [8008-0001] User compare between `barneysPdpPrice` and `barneysProductPrice`
And [8008-0002] user compare between `barneysProductImage` and `barneysPdpImage`