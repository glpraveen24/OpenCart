Feature: Login with Valid Credentials

@sanity
	Scenario: Successful Login with Valid Credentials
		Given User Launch Browser
		And opens URL "http://localhost/opencart/upload/"
		When User navigates to MyAccount menu
		And click on Login
		And User enters email as "admin@gmail.com" and password as "admin"
		And click on Login button
		Then User navigates to My account page