Meta:
@DependOn |login|0|
@name editUser

Scenario: TC-SpecificKargoUsers-002 - Verify edit kargo user functionality

Given [1000-9120] User navigate to Kargo User page
When [1111-1020] Progress Dialog should not be visible, Within 20 seconds
And [1100-1340] User fills Search Box with `last Created User`
And [1111-1020] Progress Dialog should not be visible, Within 20 seconds
And [1100-1300] User clicks on the Specific User
And [1100-1371] User moves mouse to Edit User Information Section and click on Edit User Information Button
And [1111-1080] User First Name should be displayed, Within 30 seconds
And [1100-1340] User fills User First Name  with `Automated User First Name`
And [1100-1340] User fills User Last Name with Edition
And [8001-0006] User clears Data At User Group at User Group using back space
And [1100-1340] User fills User Email with `Autmated Edit User Email`
And [1100-1340] User fills User Phone Number with 1122446688
And [8001-0006] User clears Data At User Group at User Group using back space
And [1100-1340] User fills User Group with Campaign Management
And [1100-1300] User clicks on the User Group First Option
And [8001-0006] User clears Data At User Role at User Role using back space
And [1100-1340] User fills User Role with Ad Designer
And [1111-1000] User 1 Role should be clickable, Within 20 seconds
And [1100-1300] User clicks on the User 1 Role
And [1100-1320] User scroll to the Sales Team
And [1100-1300] User clicks on the Sales Team
And [1100-1320] User scroll to the Secound Option
And [1111-0000] It should be clickable, Within 20 seconds
And [1100-1300] User clicks on the Secound Option
And [1100-1300] User clicks on the Submit Button
Then [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1101-1100] User Company Value text should equal to Kargo
And [1101-1140] User Email Left Rail text should contain edit@kargo.com
And [1111-1130] Specific User Name text should contain `last Created User`, Within 50 seconds
And [1101-1140] User Email Left Rail text should contain @kargo.com
And [1101-1100] Specific User Company text should equal to Kargo
And [1101-1100] User Phone Number Value text should equal to 1122446688
And [1101-1100] Specific User Group text should equal to Campaign Management
And [1101-1100] Specific User Role text should equal to Ad Designer