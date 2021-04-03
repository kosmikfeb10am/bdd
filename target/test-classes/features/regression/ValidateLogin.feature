#Author reyaz 
Feature: To validate login functionality

Scenario: To validate loginusing valid credentials

Given I open browser using url "http://adactinhotelapp.com/"
When I enter text "reyaz009" in textbox using xpath "//input[@name='username']"
When I enter text "reyaz123" in textbox using xpath "//input[@name='password']"
Then I click button using xpath "//input[@name='login']"
Then I validate the title to be "Adactin.com - Search Hotel"
