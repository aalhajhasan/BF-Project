
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-012 - Verify data in Properties tab loaded successfly  and  Properties tab highlighted in green.
Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the First Item From Property
Then [1111-1080] Properties Table should be displayed, Within 100 seconds
And [1101-1100] first Coulmn From Property Table text should equal to Property
And [1101-1100] second Coulmn From Property Table text should equal to ArtWork
And [1101-1100] third Coulmn From Property Table text should equal to Approved For Direct
And [1101-1100] forth Coulmn From Property Table text should equal to Platforms
And [1101-1100] fifth Coulmn From Property Table text should equal to Categories
And [1101-1100] sixth Coulmn From Property Table text should equal to Demographics
And [1101-1100] sevnth Coulmn From Property Table text should equal to Actions
And [1100-1300] User clicks on the X Button At Ad Slots Table
Then [1111-1060] Properties Table should not be present, Within 20 seconds







