
Scenario:  test


Given [1000-9100] User navigate to https://www.harrods.com/en-gb/men?icid=megamenu_men URL
When [1211-1080] sales should be all displayed, Within 120 seconds
And [1200-1302] For any element from sales
And [1100-0400] Execute `click` javascript on the element
And [8001-0005] user search for products
And [1211-1080] products should be all displayed, Within 120 seconds
And [1200-1302] For any element from products
And [1100-0581] the user saves its attribute of src in global scope under name plpImage
And [1100-0320] User scroll to it
And [1100-0360] User move mouse to it
And [1100-1300] User clicks on the quickView
And [1111-1080] quickViewDialog should be displayed, Within 120 seconds
And [1100-1581] the user saves quickViewImage attribute of src in global scope under name quickViewImage
And [1100-1300] User clicks on the fullDetails
And [1111-1080] productPage should be displayed, Within 120 seconds
And [1100-1581] the user saves pdpImage attribute of src in global scope under name pdpImage
Then [8001-0006] user compare between `plpImage` and `quickViewImage` and `pdpImage`