Feature: JBK Offline WEBSITE
@Jbk 
Scenario Outline: Login Page

Given user should be on login page
When user enter "<Uname>" and "<Pass>"
Then user should be on homepage

Examples: 
|Uname|Pass|
|kiran@gmail.com|123456|
|preeti@gmail.com|12321|


@Abc
Scenario: Login Dashboard Page

Given user should be on login page
When user enter valid credentials
Then user should be on homepage
And user should verify header

@Addition Calculator
Scenario: Add two numbers

Given two numbers
When add two numbers 5 and 4
Then result should be 9







