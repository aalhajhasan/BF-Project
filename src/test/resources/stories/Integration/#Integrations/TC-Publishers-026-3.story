
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-026.3 - verify number of result per page is working at AdSlots tab (100 row).

Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Ad Slots Tap
And [1100-1300] User clicks on the Row 100
Then [1211-1542] adSlotData  should have at least 100 elements that have attribute name class and it's value contain button, Within 10 seconds
And [1211-1544] adSlotData  should have at most 100 element have attribute name class and it's value contain button, Within 10 seconds








