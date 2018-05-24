Meta:
@ReportName Bergdorf Goodman

Scenario:  TC04_Bergdorf_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] bergdorfBagPage should be displayed
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
And [1100-1300] User clicks on the bergdorfAddToshoppingBag
And [1100-1300] User clicks on the bergdorfBagCheckout
Then [1111-1080] bergdorfBagPage should be displayed, Within 120 seconds