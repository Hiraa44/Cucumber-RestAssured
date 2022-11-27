#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Title of your feature
  I want to use this template for my feature file

  @Smoke
  Scenario Outline: User is able to login 1
    Given I want to login using username and passowrd
    When  I call the login API and Porvide body
    Then  I validate the response code and response
   @Smoke
   Scenario Outline: Verify user is able to login 2
   Given I want to login using "<Username>" "<Password>"
   
   When  I want to extract X-auth
   Then  I want to validate response
   
Examples:
    | Username | Password |
    | master   | 123456 |
   
  
 
   
   
   

 
