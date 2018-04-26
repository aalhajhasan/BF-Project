Meta:
@ReportName L.L.Bean

Scenario:  TC06_Llbean_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] llbeanBagPage should be displayed
When [1200-1302] For any element from llbeanTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] llbeanSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from llbeanSales
And [1100-0400] Execute `click` javascript on the element
And [8013-0001] user search for llbeanPlpPage
And [1211-1080] llbeanProducts should be all displayed, Within 120 seconds
And [1200-1302] For any element from llbeanProducts
And [1100-0300] User click on it
And [1111-1080] llbeanPdp should be displayed, Within 120 seconds
And [8013-0003] user randomly select an available llbeanSizeGroup
And [8013-0003] user randomly select an available llbeanSize
And [8013-0003] user randomly select an available llbeanColor
And [1100-1400] Execute `click` javascript on llbeanAddToBag
And [1111-1080] llbeanBagDialog should be displayed, Within 120 seconds
And [1100-1300] User clicks on the llbeanBagCheckout
Then [1111-1080] llbeanBagPage should be displayed, Within 120 seconds