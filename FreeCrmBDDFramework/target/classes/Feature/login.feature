Feature: Free CRM Login Feature 

@firstTest
Scenario: Free CRM Login Test Scenario

Given user is already on login page 
When title of login page is Free CRM
Then user enters username and password
Then user clicks on login button
And user is on home page

@secondTest
Scenario: Deal page action performed

Given user is on deal page
Then user perform activity on deal page