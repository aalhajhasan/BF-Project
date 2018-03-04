Meta:
@reports
Scenario: TC-Pulse-001 - Verify export button is working fine at Overview tab.

Given I am On Reports_Page
When I click on Pulse_Button
Then Verify Revenue_Export_Button working fine if there is Revenue_Data to be export in Reports Page
And Verify Impressions_Export_Button working fine if there is Impressions_Data to be export in Reports Page
And Verify eCPM_Export_Button working fine if there is eCPM_Data to be export in Reports Page