Meta:
@DependOn |login|0|
Scenario:TC-Specific Publisher-004-Verify user ability to add a new property and search for it
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
And [1100-1300] User clicks on the Add Property Button
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1340] User fills Property Name with `New Property`
And [1101-0281] Save value in global scope under name last Created Property
And [1100-1340] User fills languageTextBox with English
And [1100-0330] User enter ENTER as Keyboard input
And [1100-1340] User fills IAB Category Field with Sport
And [1100-0330] User enter ENTER as Keyboard input
And [1100-1340] User fills Web site URL with https://www.google.jo/
And [1100-1340] User fills Description with Hello this aspire QA Team
And [1100-1340] User fills Block List URL with https://www.google.jo/
And [1100-1300] User clicks on the APPROVED FOR PMP CheckBox
And [1100-1340] User fills Demographics with Hispanic
And [1100-0330] User enter ENTER as Keyboard input
And [1100-1300] User clicks on the Approved For Direct CheckBox
And [8001-0003] I upload AspireInfotech.jpg at addPropertyLogo
And [8001-0003] I upload AspireInfotech.jpg at addPropertyBackgroundImage
And [1100-1300] User clicks on the Add Property Ad Tag Release Group
And [1100-1300] User clicks on the Delta Very High
And [1100-1300] User clicks on the Submit Button
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1340] User fills Search Box with `last Created Property`
And [1111-1020] Progress Dialog should not be visible, Within 30 seconds
Then [1111-1130] First Cell text should contain `last Created Property`, Within 5 seconds
And [1100-1300] User clicks on the Specific Property
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1101-1100] Approved For PMP Text text should equal to Yes
And [1101-1100] Property Information Approved For Direct text should equal to Yes
And [1101-1100] propertyInformationCountries text should equal to US
And [1101-1100] propertyInformationLanguages text should equal to English
And [1101-1100] propertyInformationDemographics text should equal to Hispanic
And [1101-1100] propertyInformationIABCategories text should equal to Sports
And [1101-1100] propertyInformationAdTagReleaseGroup text should equal to Delta - Very High



