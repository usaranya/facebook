Feature: Launches facebook url

Scenario Outline:

Given user launches facebook url
When user enter "<username>" in user text field
Then user enter password in password text field
And user click login button in login page

Examples:
|username|password|
|saranya|sara230|