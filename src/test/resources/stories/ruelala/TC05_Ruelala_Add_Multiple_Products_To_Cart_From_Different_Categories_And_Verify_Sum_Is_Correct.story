
Scenario:  TC05_Ruelala_Add_Multiple_Products_To_Cart_From_Different_Categories_And_Verify_Sum_Is_Correct

Given [1101-1080] bagPage should be displayed
When [1200-1302] For any element from ruelalaTopNav
And [1100-0400] Execute `click` javascript on the element
And [1211-1080] ruelalaSales should be all displayed, Within 120 seconds
And [1200-1302] For any element from ruelalaSales
And [1100-0300] User click on it
And [8007-0002] user search for ruelalaPLP
And [1211-1080] ruelalaPLP should be all displayed, Within 120 seconds
And [1200-1302] For any element from ruelalaPLP
And [1100-0300] User click on it
And [8007-0002] user search for validPDP
And [1200-1302-S] For any element from sizes
And [1100-0300-S] User click on it
And [1100-1300] User clicks on the addToBagButton
And [1111-1080] bagPage should be displayed, Within 120 seconds
And [1101-1181] the user saves bagProductOnePrice text in global scope under name firstPrice
And [1101-1181] the user saves bagProductTwoPrice text in global scope under name secondPrice
And [1101-1181] the user saves bagProductTotalPrice text in global scope under name totalPrice
Then [8007-0005] the user check the sum of `firstPrice` and `secondPrice` with `totalPrice`