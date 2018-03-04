Meta:
@DependOn |login|0|
@name AddNetwork

Scenario: TC-Data Lists-016-1- Verify Add Ad Networks page layout and user ability to add Ad Networks.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
And [1100-1300] User clicks on the Ad Networks Link
And [1100-1300] User clicks on the Add Ad Network Button
And [1100-1340] User fills Name Field with `Network Name`
And [1101-0281] Save value in global scope under name last Created Network
And [1100-1300] User clicks on the Submit Button
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
And [1100-1340] User fills Search Box with `Network Name`
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1130] First Cell text should contain `Network Name`, Within 5 seconds



