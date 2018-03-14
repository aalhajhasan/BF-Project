
Scenario:  Another scenario exploring different combination of events

Given [1000-9001] User on carters page
When [1200-1302] For any element from topNav
And [1111-0000] It should be clickable, Within 120 seconds
And [1100-0300] User click on it
And [1200-1302] For any element from categories
And [1100-0400] Execute `click` javascript on the element
And [8001-0005] user search for product
And [1211-1080] product should be all displayed, Within 120 seconds
And [1200-1302] For any element from product
And [1100-0360] User move mouse to it
