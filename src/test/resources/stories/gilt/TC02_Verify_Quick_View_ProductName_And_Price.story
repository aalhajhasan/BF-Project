Meta:
@DependOn |login|0|

@namedItAs plp

Scenario: TC02_Verify_Quick_View_ProductName&_And_Price

Given [1000-9001] User on gilt page
When [1200-1302] For any element from topNavStore
And [1111-0000] It should be clickable, Within 120 seconds
And [1100-0400] Execute `click` javascript on the element
And [1200-1302] For any element from sales
And [1100-0300] User click on it
And [8000-0005] user search for availableSize
And [1211-1080] products should be all displayed, Within 120 seconds
And [1200-1302] For any element from products
And [1101-1181] the user saves productName text in global scope under name productName
And [1101-1181] the user saves productPrice text in global scope under name productPrice
And [1100-0581] the user saves its attribute of data-gilt-image-prefixes in global scope under name plpImage
And [1100-0360] User move mouse to it
And [1100-1400] Execute `click` javascript on quickView
And [1111-1080] quickViewDialog should be displayed, Within 120 seconds
Then [1101-1100] quickViewProductName text should equal to `productName`
And [1101-1100] quickViewProductPrice text should equal to `productPrice`
And [1100-1581] the user saves quickViewImage attribute of data-zoom-src in global scope under name quickViewImage