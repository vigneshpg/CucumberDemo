#Author: your.email@your.domain.com
@tag
Feature: Telecom
  I want to use this template for my feature file

  @tag1
  Scenario: AddCustomer
   # Given user launches the demo telecom application
    And user click the Add customer button
    When user enter the value credential in the boxes
    Then user click submit button
    
   Scenario Outline: Add customer by using scenario outline
    # Given user launches the demo telecom application
    And user click the Add customer button
    When user enter the value credential in the boxes "<firstname>","<lastname>","<email>","<address>","<phno>"
    Then user click submit button
    
    Examples: 
    |firstname|lastname|email                   |address  |mobileno   |
    |vignesh  |bg      |bnvg.vignesh16@gmail.com|cuddalore|44994949797|
    |vignesh 1|bg      |bnvg.vignesh16@gmail.com|cuddalore|44994949797|

 