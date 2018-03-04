
Meta:
@DependOn |login|0|
					 
Scenario: TC-Publishers-004 - Verify user ability to add new publisher.
Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Integration Link and click on Publishers Option
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
And [1100-1300] User clicks on the Commitment
And [1100-1320] User scroll to the Contract Type
And [1100-1300] User clicks on the Contract Type
And [1100-1300] User clicks on the Contract Option
And [1100-1300] User clicks on the Primary Country
And [1100-1300] User clicks on the First Primary Country
And [1100-1320] User scroll to the Publisher Director Ip Field
And [1100-1300] User clicks on the Publisher Director Ip Field
And [1100-1300] User clicks on the First Publisher Director
And [1100-1300] User clicks on the Publisher Manager Ip Field
And [1100-1320] User scroll to the First Publisher Manager
And [1100-1300] User clicks on the First Publisher Manager
And [1100-1300] User clicks on the Publisher Coordinator Ip Field
And [1100-1300] User clicks on the First Publisher Coordinator
And [1100-1300] User clicks on the Submit Button
And [1101-1100] Business Terms Alert1 text should equal to Update Business Terms | Error (Business Term)
And [1101-1100] Business Terms Alert2 text should equal to Business term do not exist for this publisher, please add business term for this publisher in marketplace.
And [1100-1300] User clicks on the BreadCrumb Back Publisher
And [1100-1340] User fills Search Box with `last Created Publisher`
Then [8001-0002] verify the Returned Rows contains this `last Created Publisher
And [8001-0011] verify image User Avatar(AspireInfotech.jpg) were uploaded successfully
And [1101-1100] Forth Row text should equal to 1
And [1101-1100] Fifth Row text should equal to Commitment
And [1101-1100] sixth Row text should equal to Contract







