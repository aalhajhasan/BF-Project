@DependOn |start|0|

@namedItAs plp


Scenario:  TC02_Verify_Quick_View_ProductName&Price

Given [1000-9001] User on macys page
When [1211-1080] navStores should be all displayed, Within 30 seconds
And [1200-1302] For any element from navStores
And [1111-0000] It should be clickable, Within 30 seconds
And [1100-0300] User click on it