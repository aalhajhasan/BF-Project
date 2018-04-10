Meta:
@ReportName Gilt

Scenario: TC08_Gilt_Submit_Order_Then_Remove_Items_And_SignOut

Given [1100-1300] User clicks on the giltSubmitYourOrderButton
When [1111-1080] giltSubmitError should be displayed, Within 120 seconds
And [1100-1300] User clicks on the giltContinueShoppingLink
And [1100-1300] User clicks on the giltCartIcon
And [1200-1302-S] For any element from giltCartRemoveProduct
And [1100-0400-S] Execute `click` javascript on the element
And [1100-1300] User clicks on the giltCartRemoveProduct
And [1101-1080] giltCartContinueShoppingButton should be displayed
And [1100-0400-S] Execute `click` javascript on the element
And [1100-1300] User clicks on the giltAccountIcon
And [1100-1300] User clicks on the giltSignOutLink
Then [1111-1080] giltRegisterLink should be displayed, Within 120 seconds