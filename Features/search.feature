Feature: Search 
Background: common steps for all scenarios
 Given User lunch browser
 When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/login"
 And Enters email as "abc123@gamil.com" and password as "abc123"
 And Click on login button
 Then Page title should be "My Account"
 
 @smoke
Scenario: Verify search functionality with valid product
 When User enters search product as "iphone" into the search field 
 And Clicks on search button
 Then Product "iphone" should display in the search results 
 And Close the browser
 