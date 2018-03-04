Meta:
@Properties
Scenario: TC-Specific Property-004- Verify user ability to edit specific property

Given I am On Integrations_Page
When I add new publisher
And I add new Property
And I search for the property
And check if the newly added item is visible on screen
And I click on Specific_Property
And locate and click On Edit_Team_Module
And clear this filed publisher_director_ipField
And clear this filed publisher_coordinator_ipField
And clear this filed publisher_manager_ipField
And clear this filed sales_engineer_ipField
And I fill publisher_director_ipField: c and select publisher_director_1Option
And I fill publisher_coordinator_ipField: c and select publisher_coordinator_1Option
And I fill publisher_manager_ipField: c and select publisher_manager_1Option
And I fill sales_engineer_ipField: e and select Sales_Engineer_1Option
And store value of publisher_director_ipField into publisher_directorValue
And store value of publisher_coordinator_ipField into publisher_coordinator
And store value of publisher_manager_ipField into publisher_manager
And store value of sales_engineer_ipField into sales_engineer
And I want to click on entry form submit button
Then I verify team members(publisher_directorValue,publisher_coordinator,publisher_manager,sales_engineer) were updated
And locate and click On Edit_property_information_button
And clear this filed Property_Name
And I Want to enter Property_Name: z_Automation update property
And I clear Language_field_value at Language using back space
And I Fill Language:Spanish
And I click on Spanish_Option
And I clear IAB_Category_Field_value at IAB_Category_Field using back space
And I Fill IAB_Category_Field:arts & entertainment
And I click on IAB_Category_1_option
And I clear Countries_Input_Field_value at Countries_Input_Field using back space
And I Fill Countries_Input_Field:UK
And I click on Country_Option
And clear this filed BlockList_URL
And I want to enter BlockList_URL : https://confluence.atlassian.com
And clear this filed Website_URL
And I want to enter Website_URL : https://confluence.atlassian.com
And clear this filed Description
And I Fill Description:Hello aspire QA Team edit this
And I clear Demographics_value at Demographics using back space
And I Fill Demographics:African american
And I click on AddProperty_TargetDemographics1option
And I click on Approved_for_Direct_check_box
And I click on APPROVED_FOR_PMP_Check_Box
And locate and click On Logo_X_button
And locate and click On BackgroundIMG_X_button
And I upload testAttachedImg.jpg at: AddProperty_Logo
And I upload testPNGImages.png at: AddProperty_BackgroundImage
And I click on AddProperty_AdTagReleaseGroup
And I scroll to AddProperty_AdTagReleaseGroup2option
And I click on AddProperty_AdTagReleaseGroup2option
And I want to click on entry form submit button
And check value of Property_informationApproved_for_PMP is yes
And check value of Property_informationApproved_for_Direct is yes
And check value of Property_information_Countries is UK
And check value of Property_information_Languages is Spanish
And check value of Property_information_Demographics is African american
And check value of Property_information_IABCategories is arts & entertainment
And check value of Property_information_AdTagReleaseGroup is Beta - MED RISK