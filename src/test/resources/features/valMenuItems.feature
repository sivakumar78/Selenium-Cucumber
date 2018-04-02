@Test
Feature: Validate the Dresses menu items display

Background: User access YourLogo site
	Given the user navigates to the YourLogo site
	Then the page title displays as My Store
	
	@SmokeTest
	Scenario: Validate the Dresses menu items display
		When the user selects the Dresses menu item
		Then the available menu items displays
	
	@Regression
	Scenario: Access the Sign in link
		When the user selects the Sign In link
		Then the Authentication page displays 