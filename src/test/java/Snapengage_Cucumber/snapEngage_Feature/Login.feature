Feature: Login into account
         Exisiting user should be able to login 

Scenario: Login into account with correct credentials
Given User navigates to snapengage sigin Page
And User enters the username and password 
When User clicks on the sigin Button 
Then User will see the Agent portal succcessfully
 