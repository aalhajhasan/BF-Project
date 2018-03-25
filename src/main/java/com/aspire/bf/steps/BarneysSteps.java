package com.aspire.bf.steps;

import org.springframework.stereotype.Component;
import com.aspire.automation.annotation.Steps;
import com.aspire.automation.web.util.AspireBrowser;
import com.aspire.automation.web.util.annotation.Browser;
import com.aspire.bf.pages.BarneysPage;


@Steps
@Component

public class BarneysSteps {

	
	@Browser("barneys")
	AspireBrowser<BarneysPage> barneysPage;
}
