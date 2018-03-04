Meta:
@reports
Scenario: TC-Pulse-006 - Verify user ability to navigate to eCPM tab and verify tab elements.

Given I am On Reports_Page
When I click on Pulse_Button
And I click on eCPM_Tab
Then I verify eCPM_Metric displays
And I verify Monthly_Section displays
And I verify Brand_Section displays
And I verify Advertiser_Section displays
And I verify Agency_Section displays
And I verify Sales_Person_Section displays
And I verify Account_Manager_Section displays
And I verify Campaign_Manager_Section displays
And I verify Monthly_Export_Button displays
And I verify Brand_ExportButton displays
And I verify Agency_ExportButton displays
And I verify Sales_Person_ExportButton displays
And I verify Account_Manager_ExportButton displays
And I verify Campaign_Manager_ExportButton displays