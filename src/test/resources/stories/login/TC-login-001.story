
Meta:
@login
@name login

 
Scenario: TC-login-001 - test select
Given [1000-9000] User opens Login page
Then [1000-9100] User navigate to https://html.com/tags/select/ URL
Given [1000-9000] User opens Login page
Then [1100-0050] For blazeselect element
Then [1100-0602] Select By Visible Text Chilean flamingo


Scenario: TC-login-002 - Verify User is able to login with valid credentials  
Given [1000-9000] User opens Login page
When [1100-1340] User fills User Name with `Valid User Name`
And [1100-1340] User fills Password with `Valid Password`
And [1111-1000] Login Button should be clickable, Within 10 seconds
And [1111-0010] It should be visible, During a period of 10 seconds
And [1100-0300] User click on it
Then [1011-0000] Page Url should contain dashboard, Within 20 seconds
And [1000-5040] Keep the User logged in


Scenario: TC-Users-002 - Verify export button functionality at kargo tab
Given [1000-9000] User opens Kargo User page
When [8001-0004] calculate number of files at downloads directory
And [1100-1300] User clicks on the Export Button
Then [8001-0005] I the verify number of files at downloads directory is incremented, within 20


Scenario: TC-Data Lists-001 - Verify user ability to navigate to Data Lists page.
Meta:
@skip     
@ignored true
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Roles Option
And [1111-0430] First Column css attribute should contain cx, Within 10 seconds

Scenario: TC-advertiserTab-001 - Verify advertiser tab elements
Meta:
@skip     
@ignored true
Given [1000-9120] User navigate to Kargo User page
And [1000-9001] User on Advertiser User page
Then [1100-1300] User clicks on the Advertiser Tab
And [1111-1080] Export Button should be displayed, Within 20 seconds
And [1111-1080] Pagination Module should be displayed, Within 20 seconds
And [1111-1080] Add User Button should be displayed, Within 20 seconds
And [1111-1530] The Advertiser Tab should have class attribute contain active, Within 20 seconds
And [1111-1430] Advertiser Tab should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1101-1100] <ColumnName> text should equal to <ColumnValue>


Examples:
|ColumnName|ColumnValue|
|First Column|NAME|
|Second Column|AVATAR|
|Third Column|Company|
|Forth Column|Email|
|Fifth Column|Last Login|
|sixth Column|Actions|

