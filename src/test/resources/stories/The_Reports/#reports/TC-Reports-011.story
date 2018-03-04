Meta:
@DependOn |login|0|
Scenario: TC-Reports-011- Verify user ability to navigate to Discrepancies under reports.

Given [1000-9000] User opens reports page
When [1100-1300] User clicks on the discrepanciesButton
When [1100-1300] User clicks on the discrepanciesPageCalendar
Then [1111-1080] discrepanciesDateRangePickerBody should be displayed, Within 100 seconds
And [1111-1080] approvedForDirectFilter should be displayed, Within 100 seconds
And [1101-1140] approvedForDirectFilter text should contain Yes
And [1111-1080] learnMoreButton should be displayed, Within 100 seconds
And [1101-1100] reportsFirstCoulmn text should equal to Publisher
And [1101-1100] reportsSecondCoulmn text should equal to Total Rate
And [1101-1100] reportsThirdCoulmn text should equal to Ad Tag
And [1101-1100] reportsForthCoulmn text should equal to Ad Tag To SSP
And [1101-1100] reportsFifthCoulmn text should equal to SSP
And [1101-1100] reportsSixthCoulmn text should equal to SSP To DFP
And [1101-1100] reportsSeventhCoulmn text should equal to DFP
And [1101-1100] reportsEighthCoulmn text should equal to DFP To PassBack



           
			
			
			
			