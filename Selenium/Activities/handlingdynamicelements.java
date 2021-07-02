package seleniumactivities;

public class handlingdynamicelements {
	/* Example HTML */
	/* On 1st page load */
	//<button id="downshift-main-jss373"></button>
	/* On page reload */
	//<button id="downshift-main-jss981"></button>

	/* CSS */
	//[id^='downshift-main-']

	/* XPath */
	//button[starts-with(@id, 'downshift-main-')]
	
	------------------------------------------------------------------------------
	/* Example HTML */
	/* On 1st page load */
	<button id="jss903-downshift-main"></button>
	/* On page reload */
	<button id="jss981-downshift-main"></button>

	/* CSS */
	[id$='-downshift-main']

	/* XPath */
	//button[ends-with(@id, '-downshift-main')]
			
			
		--------------------------------------
		/* Example HTML */
		/* On 1st page load */
		<li role="jss21-user-option-901"></li>
		/* On page reload */
		<li role="jss53-user-option-873"></li>

		/* CSS */
		[role*='-user-option-']

		/* XPath */
		//li[contains(@role, '-user-option-')]
	------------------------------------------------------
	/* Example HTML */
	<input type="radio-22-jss-97" role="point-22" value="1">
	<input type="radio-91-jss44" role="point-21" value="2">
	<input type="radio-91-jss22" role="point-24" value="3">

	/* Example CSS & XPath locators - using two attributes combined */
	/* CSS */
	input[type^="radio-91"][role="point-24"]

	/* XPath */
	//input[starts-with(@type,'radio-91') and (@role='point-24')]
------------------------------------------------------------------
<!-- Syntax -->
//tagName[@attribute1 = 'value1' and @attribute2 = 'value2']

<!-- Example -->
//input[@id = 'username' and @class='whsOnd-zHQkBf']

<!-- Syntax -->
//tagName[@attribute1 = 'value1' or @attribute2 = 'value2']

<!-- Example -->
//input[@id='username' or @class='whsOnd-zHQkBf']
--------------------------------------------------------------

			
			
}
