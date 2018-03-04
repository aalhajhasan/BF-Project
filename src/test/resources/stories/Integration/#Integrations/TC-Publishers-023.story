
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-023 - Verify user ability to navigate to AdSlot tab

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Ad Slots Tap
Then [1111-1080] ad Slots Table should be displayed, Within 10 seconds
And [1111-1080] exportButton should be displayed, Within 20 seconds
And [1111-1080] archivedFilter should be displayed, Within 10 seconds
And [1111-1080] platformFilter should be displayed, Within 10 seconds
And [1111-1080] FormatFilter should be displayed, Within 10 seconds
And [1101-1100] firstC text should equal to Ad Slot
And [1101-1100] secondC text should equal to Publisher
And [1101-1100] thirdC text should equal to Property
And [1101-1100] forthC text should equal to Platform
And [1101-1100] fifthC text should equal to Ad Units
And [1101-1100] sixthC text should equal to Integration Type
And [1101-1100] seventhC text should equal to PassBack
And [1101-1100] egighthC text should equal to Kargo Id
And [1101-1100] ninthC text should equal to Actions











