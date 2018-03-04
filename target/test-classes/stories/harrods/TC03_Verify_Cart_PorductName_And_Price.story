
@DependOn |pdp|0|

@namedItAs pdp1


Scenario:  TC03_Verify_Cart_PorductName_And_Price


Given [1100-1300] User clicks on the addToBagButton
When [1111-1080] viewYourBagButton should be displayed, Within 120 seconds
And [1100-0300] User click on it
And [1111-1080] bagPage should be displayed, Within 120 seconds
Then [1101-1100] bagProductPrice text should equal to `productPrice`
And [1101-1100] bagProductName text should equal to `productName`