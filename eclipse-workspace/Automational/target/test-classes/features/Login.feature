Feature: Applicaltion Login

Scenario: Home page default login
Given user is on NetBanking landing page
When user login into application with username "arun" and password "1234"
Then Home page is populated
And cards displayed are "true"

Scenario: Home page default login
Given user is on NetBanking landing page
When user login into application with username "aditya" and password "5678"
Then Home page is populated
And cards displayed are "false"