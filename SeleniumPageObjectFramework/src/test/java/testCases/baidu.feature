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
@tag
Feature: try search function in Baidu Homepage
  I want to use this feature to test baidu's search function

  @tag1
  Scenario: Search in Baidu
    Given open baidu home page
    And input "Selenium" in search box
    And I click the search button
    Then "Selenium" shows in every search result

  @tag2
  Scenario: try before
    Given open baidu home page
    Then input "test" in search box
    And I click the search button
