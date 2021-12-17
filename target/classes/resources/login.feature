Feature: Test Product

Background: Do login to application
Given user id on login page
When User will enter usrname and pass
And click on login
Then user is navigated to home page

Scenario: check my account page
Given user is on specials page
And click on price drop down to get select in Stock option


Scenario Outline: Test customer page
Given user is on customer page
And user enters fills deatils using <sheetname> and <rowno>

Examples:
|sheetname|rowno|
|contactus|0|

