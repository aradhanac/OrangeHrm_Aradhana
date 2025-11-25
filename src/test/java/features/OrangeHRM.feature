Feature: Test OranageHRM Application
 
 Scenario: Test LoginPage functionality
 
 Given User is on login page
 When User enter Username and Password 
 And User click on login button
 
 Scenario: Test PimPage 
 
 Given User click on Pim Page Link
 When User click on Add Employee Button
 When user enter "Poonam" as firstname and "P" as midname and "Hendre" as lastname
 When  user click on save button

 
 