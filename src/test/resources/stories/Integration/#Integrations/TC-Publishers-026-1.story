
Meta:
@DependOn |login|0|

					 
Scenario: TC-Publishers-026.1 - verify number of result per page is working fine at AdSlots tab (50 row).
Given [1000-9000] User opens The Integration page
When [1111-1020] Progress Dialog should not be visible, Within 50 seconds
And [1100-1300] User clicks on the Ad Slots Tap
When [1211-1542] adSlotData should have at least 50 elements that have attribute name class and it's value contain button, Within 20 seconds
Then [1211-1544] adSlotData should have at most 50 element have attribute name class and it's value contain button, Within 20 seconds








