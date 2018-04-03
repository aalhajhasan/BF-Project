Meta:
@ReportName Gilt

Scenario: TC08_Gilt_Submit_Order_Then_Remove_Items_And_SignOut

Given [1100-1300] User clicks on the submitYourOrderButton
When [1111-1080] submitError should be displayed, Within 120 seconds
Then [1101-1102] submitError text is equal to `submitErrorMessage` case sensitive
And [1100-1300] User clicks on the continueShoppingLink
And [1100-1300] User clicks on the cartIcon
And [1200-1302-S] For any element from cartRemoveProduct
And [1100-0300-S] User click on it
And [1100-1300] User clicks on the cartRemoveProduct
And [1101-1080] cartContinueShoppingButton should be displayed
And [1100-0300] User click on it
And [1100-1300] User clicks on the accountIcon
And [1100-1300] User clicks on the signOutLink
Then [1111-1080] registerLink should be displayed, Within 120 seconds