Meta:
@ReportName Bergdorf Goodman

Scenario:  TC02_Bergdorf_Verify_Cart_PorductName_And_Price

Given [1000-9001] User on bergdorf page
When [1211-1000] bergdorfTopNav should be all clickable, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0370] User move mouse to it and click it
And [1100-0400] Execute `click` javascript on the element
And [1201-1080] bergdorfSales should be all displayed
And [1200-0302] For any of the elements
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] bergdorfProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from bergdorfProducts
And [1100-0300] User click on it
And [1111-1080] bergdorfProductPage should be displayed, Within 120 seconds
And [8012-0001] user search for bergdorfValidPdp
And [8012-0002] user randomly select an available bergdorfSku
And [8012-0002] user randomly select an available bergdorfColor
And [1101-1181] the user saves bergdorfProductName text in global scope under name bergdorfProductName
And [1101-1181] the user saves bergdorfProductPrice text in global scope under name bergdorfProductPrice
And [1100-1300] User clicks on the bergdorfAddToshoppingBag
And [1111-1080] bergdorfBagDialog should be displayed, Within 120 seconds
And [1101-1140] bergdorfBagProductName text should contain `bergdorfProductName`
And [1101-1181] the user saves bergdorfBagProductPrice text in global scope under name bergdorfBagProductPrice
Then [8012-0003] User compare between `bergdorfProductPrice` and `bergdorfBagProductPrice`