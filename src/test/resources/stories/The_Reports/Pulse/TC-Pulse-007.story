Meta:
@reports
Scenario: TC-Pulse-007 - Verify export button is working fine at eCPM tab.

Given I am On Reports_Page
When I click on Pulse_Button
And I click on eCPM_Tab
Then Verify Monthly_Export_Button working fine if there is Monthly_Data to be export in Reports Page
And Verify Brand_ExportButton working fine if there is Advertiser_Data to be export in Reports Page
And Verify Advertiser_ExportButton working fine if there is Brand_Data to be export in Reports Page
And Verify Agency_ExportButton working fine if there is Agency_Data to be export in Reports Page
And Verify Sales_Person_ExportButton working fine if there is Sales_Person_Data to be export in Reports Page
And Verify Campaign_Manager_ExportButton working fine if there is Campaign_Manager_Data to be export in Reports Page
And Verify Account_Manager_ExportButton working fine if there is Account_Manager_Data to be export in Reports Page