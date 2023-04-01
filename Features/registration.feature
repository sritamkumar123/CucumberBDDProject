Feature: Registraion

@sanity 
Scenario: Register new  users account with mandarory fields
 Given User lunch browser
  When User opens URL "http://tutorialsninja.com/demo/index.php?route=account/register"
 #When User opens URL "https://admin-demo.nopcommerce.com/"
 And Enters firstname as "sritam" and lastname as "rout"
 And Enters valid email
 And Enters telephone as "6754321890"
 And Enters password as "12345" and confirm password as "12345"
 And Click on policy checkbox
 And Click on Continue button
 Then Page title should be "Your Account Has Been Created!" 
 And Close the browser
 
 #https://admin-demo.nopcommerce.com/login
 #http://tutorialsninja.com/demo/index.php?route=account/register