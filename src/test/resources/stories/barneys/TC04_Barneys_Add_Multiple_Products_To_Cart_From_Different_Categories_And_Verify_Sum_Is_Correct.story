Meta:
@ReportName Barneys New York

Scenario:  TC04_Barneys_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] barneysPdp should be displayed
When [1200-1302] For any element from barneysTopNavStore
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] barneysSalesPage should be displayed, Within 120 seconds
And [1200-1302] For any element from barneysSales
And [1100-0400] Execute `click` javascript on the element
And [1111-1080] barneysPlp should be displayed, Within 120 seconds
And [1200-1302] For any element from barneysPlpProduct
And [1100-0300] User click on it
And [1111-1080] barneysPdp should be displayed, Within 120 seconds
And [8008-0006] user randomly select an available size
And [1111-1080] barneysAddToBagButton should be displayed, Within 120 seconds
And [1100-0300] User click on it
Then [1111-1080] barneysMyBagDialog should be displayed, Within 120 seconds