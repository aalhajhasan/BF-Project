
Meta:
@DependOn |login|0|
@name addBrand

Scenario: TC-SpecificKargoUsers-003 - Verify user is able to add brand
 
Given [1000-9000] User opens Kargo User page
When [1111-1010]  add User Button should be visible, Within 40 seconds
And [1100-1300] User clicks on the add User Button
And [1111-1010]  user Last Name should be visible, Within 20 seconds
And [1100-1340] User fills User Last Name with ^^
And [1100-1340] User fills User First Name with `Automated User First Name`
And [1101-0281] Save value in global scope under name last Created User2
And [1100-1340] User fills User Email with `Autmated User Email`
And [1100-1340] User fills User Phone Number with 0123456789
And [1100-1340] User fills User Company with kargo
And [1100-1300] User clicks on the User First Company
And [1100-1300] User clicks on the Submit Button
And [1111-1010] Progress Dialog should be visible, Within 30 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1340] User fills Search Box with `Automated User First Name`
And [1100-1300] User clicks on the Specific User
And [1100-1300] User clicks on the Add Brand Button
And [1100-1331] User hits keys.down from keyboard in Specific User Brand Name
And [1101-0281] Save value in global scope under name last Created User
And [1101-0283] Save value in story scope under name Brand name
And [1100-1300] User clicks on the First Brand Name
And [1100-1300] User clicks on the Submit Button
And [1111-1010] Progress Dialog should be visible, Within 20 seconds
And [1111-1020] Progress Dialog should not be visible, Within 50 seconds
Then [1111-1130] Specific User Brand Name Value text should contain `Brand name`, Within 20 seconds
