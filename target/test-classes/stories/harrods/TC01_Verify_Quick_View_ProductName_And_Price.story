@namedItAs plp


Scenario:  TC01_Verify_Quick_View_ProductName_And_Price

Given [1000-9000] User opens harrods page
When [1211-1000] topNavStore should be all clickable, Within 120 seconds
And [1200-1302] For any element from topNavStore
And [1100-0300] User click on it
And [1211-1080] sales should be all displayed, Within 120 seconds
And [1200-0302] For any of the elements
And [1100-0300] User click on it
And [1111-1080] plpPage should be displayed, Within 120 seconds
And [1200-1302] For any element from products
And [1101-1181] the user saves productName text in global scope under name productName
And [1101-1181] the user saves productPrice text in global scope under name productPrice
And [1100-0360] User move mouse to it
And [1100-1300] User clicks on the quickView
And [1111-1080] quickViewDialog should be displayed, Within 120 seconds
Then [1101-1100] quickViewProductName text should equal to `productName`
And [1101-1100] quickViewProductPrice text should equal to `Product Price`