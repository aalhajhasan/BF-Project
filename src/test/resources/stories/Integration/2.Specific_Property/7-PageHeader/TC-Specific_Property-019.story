Meta:
@Properties
Scenario: TC-Specific property-019- Verify User ability to add/delete discussion.

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
Then I should be led to Specific_Property page
And I wait for page title
And I Click on Discussions_Icon
And I click on ADD_Discussion_Button
And I Want to enter subject_Text_Box: z_Automation add new discussion
And I click on Save_button
And I search At drawer for the recently added discussion
And I verify the new discussion added
And I click on Specific_Discussion
And I click on SpecificDiscussions_Delete_Button
And I wait progress dialog to disappear
And I search At drawer for the recently added discussion
And I verify Specific_Discussion is not displayed