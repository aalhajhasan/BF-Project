
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-010.1 and 010.2- Verify property name expanded with Ad Slots table and collapsed.

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Properties Tab
And [1100-1300] User clicks on the First Item From Property
Then [1111-1080] ad Slots Table should be displayed, Within 100 seconds
And [1101-1100] first Coulmn From ad Slots Table text should equal to Ad Slot
And [1101-1100] second Coulmn From ad Slots Table text should equal to Platform
And [1101-1100] third Coulmn From ad Slots Table text should equal to Ad Units
And [1101-1100] forth Coulmn Fromad Slots Table text should equal to Integration Type
And [1101-1100] fifth Coulmn Fromad Slots Table text should equal to PassBack
And [1101-1100] sixth Coulmn From ad Slots Table text should equal to Kargo ID
And [1101-1100] sevnth Coulmn From ad Slots Table text should equal to Actions
And [1100-1300] User clicks on the X Button At Ad Slots Table
Then [1111-1060] ad Slots Table should not be present, Within 20 seconds







