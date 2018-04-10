Feature: Create a new account in YourLogo site

Background: User access YourLogo site
	Given the user navigates to the YourLogo site
	Then the page title displays as My Store

	Scenario Outline: Access Create An Account page and verify
		When the user click on Create an Account button
		Then the <error message> message display
		|error message|
		|Invalid email address|