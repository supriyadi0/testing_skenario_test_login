@login
Feature: login

@login001
Scenario: User and Password Login Valid
Given open Browser
Then navigate_url
Given user input username valid "standard_user"
Then user input password valid "secret_sauce"
When user click button login
Then user click button logout

@login002
Scenario: User Valid and Password Login Invalid
Given user input username valid "standard_user"
When user input password invalid "132382922"
Then user click button login
When showing error message

@login003
Scenario: User and Password Empty
Given user no input username 
Then user no input password
When user click button login
Then user close browser
