
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-012 - Verify data in Properties tab loaded successfly  and  Properties tab highlighted in green.
Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Properties Tab
Then [1111-1430] Properties Tab should have color css attribute contain rgba(0, 199, 177, 1), Within 20 seconds
And [1111-1080] Search Box should be displayed, Within 100 seconds
And [1111-1080] exportButton should be displayed, Within 20 seconds
And [1111-1080] Approved For Direct Filter should be displayed, Within 20 seconds
And [1111-1080] Pagination Module should be displayed, Within 20 seconds
And [1101-1100] first Column text should equal to Property
And [1101-1100] secondColumn text should equal to ArtWork
And [1101-1100] thirdColumn text should equal to Approved For Direct
And [1101-1100] forthColumn text should equal to Platforms
And [1101-1100] fifthColumn text should equal to Categories
And [1101-1100] sixthColumn text should equal to Demographics
And [1101-1100] seventhColumn text should equal to Actions








