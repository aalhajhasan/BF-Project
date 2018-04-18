Meta:
@ReportName Gilt

Scenario: TC01_Gilt_Login

!-- Given [1000-9130] Clear cache and cookies
!-- When [1000-9000] User opens gilt page
!-- And [1111-1000] giltSignInLink should be clickable, Within 120 seconds
!-- And [1100-0300] User click on it
!-- And [1111-1080] giltLoginDialog should be displayed, Within 120 seconds
!-- And [1100-1340] User fills giltLoginEmailSection with `validEmail`
!-- And [1100-1340] User fills giltLoginPasswordSection with `validPassword`
!-- And [1100-1300] User clicks on the giltLoginSubmitButton
!-- Then [1111-1080] giltAccountIcon should be displayed, Within 120 seconds