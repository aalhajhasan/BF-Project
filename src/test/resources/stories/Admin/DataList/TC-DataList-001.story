Meta:
@DependOn |login|0|

Scenario: TC-Roles-001-Verfiy roles page elements.

Given [1000-9001] User on dashboard page
When [1100-1371] User moves mouse to Admin Option and click on Data Lists Option
Then [1101-1100] First Column text should equal to NAME
And [1101-1100] First Row text should equal to Ad Demographics
And [1101-1100] Second Row text should equal to Ad Networks
And [1101-1100] Second Row text should equal to Ad Slot Types
And [1101-1100] Forth Row text should equal to Ad Tag Release Groups
And [1101-1100] Fifth Row text should equal to Targeting Positions
And [1101-1100] sixth Row text should equal to Tracking Vendors



