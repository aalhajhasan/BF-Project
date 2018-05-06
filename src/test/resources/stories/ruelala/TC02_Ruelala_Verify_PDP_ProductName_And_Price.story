Meta:
@ReportName Rue La La

Scenario:  TC02_Ruelala_Verify_PDP_ProductName_And_Price

Given [1000-9001] User on ruelala page
When [1200-1302] For any element from ruelalaTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] ruelalaSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from ruelalaSales
And [1100-0300] User click on it
And [8007-0002] user search for ruelalaPLP
And [1211-1080] ruelalaPLP should be all displayed, Within 120 seconds
And [1200-1302] For any element from ruelalaPLP
And [1101-1181] the user saves ruelalaProductPrice text in global scope under name ruelalaProductPrice
And [1101-1181] the user saves ruelalaProductName text in global scope under name ruelalaProductName
And [1100-0300] User click on it
And [1111-1080] ruelalaPdp should be displayed, Within 120 seconds
And [1101-1140] ruelalaPdpName text should contain `ruelalaProductName`
And [1101-1181] the user saves ruelalaPdpPrice text in global scope under name ruelalaPdpPrice
Then [8007-0001] User compare between `ruelalaProductPrice` and `ruelalaPdpPrice`