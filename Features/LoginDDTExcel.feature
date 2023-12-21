Feature: Login Data Driven with Excel

  Scenario Outline: Login Data Driven Excel
    Given User Launch Browser
		And opens URL "http://localhost/opencart/upload/"
		When User navigates to MyAccount menu
		And click on Login
    Then the user should be redirected to the MyAccount Page by passing email and password with excel row "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
      |         5 |