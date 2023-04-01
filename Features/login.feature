Feature: login

Background: common steps for all scenarios
 Given User lunch browser
 When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
 And Enters email as "abc123@gamil.com" and password as "abc123"
 And Click on login button
 Then Page title should be "My Account"
 
 @smoke
Scenario: Successfully login with valid credentails

 When User click on logout button
 Then Page title should be "Account Logout"
 And Close the browser
 
 @regression
 Scenario Outline: Successfully login with valid credentails DDT
 
 When User click on logout button
 Then Page title should be "Account Logout"
 And Close the browser
Examples:
|email|password|
|abc123@gamil.com|abc123|
|ab2321          |12345|




