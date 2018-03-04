Meta:
@DependOn |login|0|
Scenario: TC-Specific Publisher-003-Verify adding a new publisher and editing it from specific publisher details page

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Add Publisher Button
And [1100-1340] User fills Name Field with `Publisher Name`
And [1101-0281] Save value in global scope under name last Created Publisher
And [1100-1300] User clicks on the Approved For Direct CheckBox
And [8001-0003] I upload AspireInfotech.jpg at Logo Img
And [1100-1300] User clicks on the publisher Tier
And [1100-1300] User clicks on the publisher Tier1
And [1100-1320] User scroll to the publisher Tier
And [1100-1320] User scroll to the Goal Type
And [1100-1300] User clicks on the Goal Type
And [1100-1320] User scroll to the Commitment
And [1100-1300] User clicks on the Commitment
And [1100-1320] User scroll to the Primary Country
And [1100-1300] User clicks on the Contract Type
And [1100-1300] User clicks on the Contract Option
And [1100-1320] User scroll to the Primary Country
And [1100-1300] User clicks on the Primary Country
And [1100-1300] User clicks on the First Primary Country
And [1100-1320] User scroll to the Publisher Director Ip Field
And [1100-1300] User clicks on the Publisher Director Ip Field
And [1100-1300] User clicks on the First Publisher Director
And [1100-1320] User scroll to the Publisher Manager Ip Field
And [1100-1300] User clicks on the Publisher Manager Ip Field
And [1100-1300] User clicks on the First Publisher Manager
And [1100-1320] User scroll to the Publisher Coordinator Ip Field
And [1100-1300] User clicks on the Publisher Coordinator Ip Field
And [1100-1300] User clicks on the First Publisher Coordinator
And [1100-1300] User clicks on the Submit Button
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1012-1000] page is loaded, within 10 seconds
And [1100-1300] User clicks on the Bookmark Icon
And [1100-1371] User moves mouse to Team Dialog and click on Edit Team Module
And [1200-1310] Clear all of allEditTextBoxes fields
And [1100-1300] User clicks on the Publisher Director Ip Field
When [1101-1182] save Second Publisher Director text in web browser type scope under name Second Publisher Director
And [1100-1300] User clicks on the Second Publisher Director
And [1100-1300] User clicks on the Publisher Manager Ip Field
When [1101-1182] save Second Publisher Manager text in web browser type scope under name Second Publisher Manager
And [1100-1300] User clicks on the Second Publisher Manager
And [1100-1300] User clicks on the Publisher Coordinator Ip Field
When [1101-1182] save Second Publisher Coordinator text in web browser type scope under name Second Publisher Coordinator
And [1100-1300] User clicks on the Second Publisher Coordinator
And [1100-1300] User clicks on the Submit Button
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1320] User scroll to the First Team
Then [8001-0002] verify the First Team contains this `Second Publisher Director`
And [1101-1100] First Team text should equal to `Second Publisher Director`
And [1101-1100] Second Team text should equal to `Second Publisher Manager`
And [1101-1100] Third Team text should equal to `Second Publisher Coordinator`
And [1100-1371] User moves mouse to Publisher Information and click on Edit Information
And [1100-1310] Clear Name Field field
And [1100-1340] User fills Name Field with `Publisher Name`
And [1101-0281] Save value in global scope under name last Edited Publisher
And [1111-1090] APPROVEDFOR PMP CheckBox should be disabled, Within 10 seconds
And [1100-1300] User clicks on the Approved For Direct CheckBox
And [1100-1371] User moves mouse to Logo Div and click on Remove Logo
When [8001-0003] I upload AspireInfotech.jpg at Logo Img
And [1100-1300] User clicks on the publisher Tier
And [1100-1300] User clicks on the publisher Tier2
And [1100-1320] User scroll to the publisher Tier
And [1100-1320] User scroll to the Goal Type
And [1100-1300] User clicks on the Goal Type
And [1100-1300] User clicks on the Internal Goal
And [1100-1320] User scroll to the Primary Country
And [1100-1310] Clear Primary Country field
And [1100-1300] User clicks on the Primary Country
And [1100-1300] User clicks on the Second Primary Country
And [1100-1300] User clicks on the Contract Type
And [1100-1300] User clicks on the Io Option
And [1100-1300] User clicks on the Submit Button
Then [8001-0002] verify the Name Header Name contains this `last Edited Publisher`
And [8001-0011] verify image User Avatar(AspireInfotech.jpg) were uploaded successfully
And [1101-1100] Approved For PMP Text text should equal to NO
And [1101-1100] Tier Text text should equal to 2
And [1101-1100] Goal Type Text text should equal to Internal Goal
And [1101-1100] Contract Type Text text should equal to IO
And [1101-1100] countryText text should equal to Australia



