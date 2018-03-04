Meta:
@reports
Scenario: TC-Publytics-002 - Verify user ability to navigate to Impressions tab and verify tab elements.

Given I am On Reports_Page
When I click on Publytics_Button
And I click on Impressions_Tab 
Then I verify Impressions_Overview_Metric displays
And I verify Impressions_Section displays
And I verify Property_Section displays
And I verify By_Creative_Type_Section displays
And I verify For_Creative_Type_Section displays
And I verify Platform_Section displays
And I verify Brand_Section displays
And I verify AdvertiserVertical_Section displays
And I verify Publisher_Section displays
And I verify Publisher_OR_CreativeType_Section displays
And I verify Agency_Section displays
And I verify Region_Section displays
And I verify Sales_Person_Section displays
And I verify Campaign_Manager_Section displays
And I verify Account_Manager_Section displays
And I verify Impressions_Period_Filters displays
And I verify Ad_Formats_filter_At_Impression_For_section displays
And I verify Creative_Type_Period_Filters displays
And I verify Publisher_OR_CreativeType_Creative_Filters displays
And I verify Impressions_Export_Button displays
And I verify Publisher_OR_CreativeType_ExportButton displays
And I verify Impressions_Export_Button displays
And I verify Property_ExportButton displays
And I verify By_Creative_Type_ExportButton displays
And I verify For_Creative_Type_ExportButton displays
And I verify Brand_ExportButton displays
And I verify AdvertiserVertical_ExportButton displays
And I verify Publisher_ExportButton displays
And I verify Agency_ExportButton displays
And I verify Region_ExportButton displays
And I verify Sales_Person_ExportButton displays
And I verify Campaign_Manager_ExportButton displays
And I verify Account_Manager_ExportButton displays