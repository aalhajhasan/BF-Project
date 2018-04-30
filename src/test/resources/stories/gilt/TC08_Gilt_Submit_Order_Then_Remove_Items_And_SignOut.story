Meta:
@ReportName Gilt

Scenario: TC08_Gilt_Submit_Order_Then_Remove_Items_And_SignOut

Given [1100-1300] User clicks on the giltSubmitYourOrderButton
When [1111-1080] giltSubmitError should be displayed, Within 120 seconds
And [1100-1300] User clicks on the giltContinueShoppingLink
And [1100-1300] User clicks on the giltCartIcon
And [1111-1080] giltCartIcon should be displayed, Within 120 seconds
And [1100-1300] User clicks on the giltCartItemOneRemove
And [8000-0008] sleep after last action for 5000 Milliseconds
And [1100-1300] User clicks on the giltCartItemTwoRemove
And [1111-1080] giltCartContinueShoppingButton should be displayed, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1100-1300] User clicks on the giltAccountIcon
And [1100-1300] User clicks on the giltSignOutLink
Then [1111-1080] giltRegisterLink should be displayed, Within 120 seconds
And [1000-9140] Close the browser