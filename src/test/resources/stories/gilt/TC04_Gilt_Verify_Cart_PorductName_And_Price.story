
Scenario: TC04_Gilt_Verify_Cart_PorductName_And_Price

Given [1101-1080] pdpPage should be displayed
When [1200-1302-S] For any element from availableSKU
And [1100-0300-S] User click on it
And [1100-1300] User clicks on the addToCartButton
And [1111-1080] cartDialog should be displayed, Within 120 seconds
Then [1101-1100] cartProductPrice text should equal to `productPrice`