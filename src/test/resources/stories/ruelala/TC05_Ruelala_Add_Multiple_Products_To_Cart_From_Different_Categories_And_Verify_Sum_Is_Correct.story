Meta:
@ReportName Rue La La

Scenario:  TC05_Ruelala_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] ruelalaBagPage should be displayed
When [1200-1302] For any element from ruelalaTopNav
And [1100-0300] User click on it
And [1211-1080] ruelalaSales should be all displayed, Within 120 seconds
And [8007-0007] sleep after last action for 5000 Milliseconds
And [1200-1302] For any element from ruelalaSales
And [1100-0300] User click on it
And [8007-0002] user search for ruelalaPLP
And [1211-1080] ruelalaPLP should be all displayed, Within 120 seconds
And [8007-0007] sleep after last action for 5000 Milliseconds
And [1200-1302] For any element from ruelalaPLP
And [1100-0400] Execute `click` javascript on the element
And [8007-0002] user search for ruelalaValidPdp
And [8007-0006] user randomly select an available ruelalaSizes
And [1100-1300] User clicks on the ruelalaAddToBagButton
And [1111-1080] ruelalaBagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves ruelalaBagProductOnePrice text in global scope under name ruelalaFirstPrice
And [1101-1181] the user saves ruelalaBagProductTwoPrice text in global scope under name ruelalaDecondPrice
And [1101-1181] the user saves ruelalaBagProductTotalPrice text in global scope under name ruelalaTotalPrice
Then [8007-0005] the user check the sum of `ruelalaFirstPrice` and `ruelalaDecondPrice` with `ruelalaTotalPrice`