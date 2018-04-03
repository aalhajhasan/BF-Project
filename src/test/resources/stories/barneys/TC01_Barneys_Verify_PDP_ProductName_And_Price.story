Meta:
@ReportName Barneys

Scenario:  TC01_Barneys_Verify_PDP_ProductName_And_Price

Given [1000-9130] Clear cache and cookies
When [1000-9000] User opens barneys page
And [1200-1302] For any element from barneysTopNavStore
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] salesPage should be displayed, Within 120 seconds
And [1200-1302] For any element from barneysSales
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] barneysPlp should be displayed, Within 120 seconds
And [1200-1302] For any element from barneysPlpProduct
And [1100-1581] the user saves productImage attribute of src in global scope under name productImage
And [1101-1181] the user saves productPrice text in global scope under name productPrice
And [1101-1181] the user saves productName text in global scope under name productName
And [1100-0300] User click on it
And [1111-1080] barneysPdp should be displayed, Within 120 seconds
And [1101-1102] pdpName text is equal to `productName` case sensitive
And [1101-1181] the user saves pdpPrice text in global scope under name pdpPrice
And [1100-1581] the user saves pdpImage attribute of src in global scope under name pdpImage
Then [8008-0001] User compare between `pdpPrice` and `productPrice`
And [8008-0002] user compare between `productImage` and `pdpImage`