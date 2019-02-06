Feature: Login and logout functionality 

Scenario: As a admin I should login with all previlages 

Given the browser is launched and we navigate to orangehrm
When we enter the username and password
And click on the login button
Then it should display the msg welcome admin

Scenario: As a admin to logout completly
When we click on welcome admin link
And also click on logout link
Then it should display the home page




