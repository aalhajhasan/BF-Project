Meta:
@Properties
Scenario:  TC-Specific Property-027 - Verify user ability to archive Ad slot

Given I am On Integrations_Page_Properties_Tab
When I Fill Search_Box:Automation
And wait progress dialog to disappear
And click on Properties Have Ad Slots
And I click on Archived_Filter
And I click on All_option
And I wait progress dialog to disappear
And I click on Action-Button
Then check Ad slot status and archive/Unarchive moreover check popup msg
And wait progress dialog to disappear
And I click on Action-Button
And check Ad slot status and archive/Unarchive moreover check popup msg