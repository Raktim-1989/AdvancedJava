Feature: Application login

Scenario: HomePage default login
Given User is on NdetBanking landing page
When User login into application with "rak" and "1234"
Then HomePage is populated 
And Cards displayed are "true"

Scenario: HomePage default login
Given User is on NdetBanking landing page
When User login into application with "john" and "4321"
Then HomePage is populated 
And Cards displayed are "false"