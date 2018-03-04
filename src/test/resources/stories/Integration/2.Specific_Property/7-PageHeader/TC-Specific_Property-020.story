Meta:
@Properties
Scenario: TC- Specific Property-020- Verify user ability to add a new discussion under a specific property.

Given I am On Integrations_Page_Properties_Tab
When I Click on Specific_Property
And I wait for page title
And I Click on Discussions_Icon
And I click on ADD_Discussion_Button
And I Want to enter subject_Text_Box: z_Automation add new discussion
And I click on Save_button
And I search At drawer for the recently added discussion
Then I verify the new discussion added
And I click on Specific_Discussion
And check value of Sort_by_filter is newest
And I click on AddCommentsButton
And I Fill Comments_TextEditor:z_Automation add Comment here!
And I Upload AspireInfotech.jpg at: SpecificDiscussions_AttachmentInputField2
And I click on SaveCommentButton
And check value of Comment_value is z_Automation add Comment here!
And verify image Comment_Section_Attachment_file_name(AspireInfotech.jpg) were uploaded successfully
And I click on Edit_Comment_Button
And I Fill Comments_TextEditor:empty
And I scroll to SaveCommentChangesButton
And locate and click On delete_attachment
And I Fill Comments_TextEditor:edit comment at text editor
And I Upload aspireBackground.png at: Comment_Section_Attachment
And I click on SaveCommentChangesButton
And check value of Comment_value is edit comment at text editor
And verify image Comment_Section_Attachment_file_name(aspireBackground.png) were uploaded successfully
And I click on Delete_Comment_Button
And I wait progress dialog to disappear
And check value of comments_count is 0 Comments