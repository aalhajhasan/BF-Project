Meta:
@reports
Scenario: TC-Publytics-003 - Verify export button is working fine at Impressions tab.

Given I am On Reports_Page
When I click on Publytics_Button
And I click on Impressions_Tab 
Then Verify Impressions_Export_Button working fine if there is Impressions_Data to be export in Reports Page
And Verify Property_ExportButton working fine if there is Property_Data to be export in Reports Page
And Verify By_Creative_Type_ExportButton working fine if there is By_Creative_Type_Data to be export in Reports Page
And Verify For_Creative_Type_ExportButton working fine if there is For_Creative_Type_Data to be export in Reports Page
And Verify Platform_ExportButton working fine if there is Platform_Data to be export in Reports Page
And Verify Brand_ExportButton working fine if there is Brand_Data to be export in Reports Page
And Verify AdvertiserVertical_ExportButton working fine if there is AdvertiserVertical_Data to be export in Reports Page
And Verify Publisher_ExportButton working fine if there is Publisher_Data to be export in Reports Page
And Verify Publisher_OR_CreativeType_ExportButton working fine if there is Publisher_OR_CreativeType_Data to be export in Reports Page
And Verify Agency_ExportButton working fine if there is Agency_Data to be export in Reports Page
And Verify Region_ExportButton working fine if there is Region_Data to be export in Reports Page
And Verify Sales_Person_ExportButton working fine if there is Sales_Person_Data to be export in Reports Page
And Verify Campaign_Manager_ExportButton working fine if there is Campaign_Manager_Data to be export in Reports Page
And Verify Account_Manager_ExportButton working fine if there is Account_Manager_Data to be export in Reports Page