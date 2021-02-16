Feature: Leaftaps Login Steps

Background:

Given Open the Chrome Browser
And Maximise the Browser
And Set the TimeOuts
And Load the URL

Scenario Outline: TC001 Passing Multiple data to same Test Case one


And Enter the UserName as <username>
And Enter the PassWord as <password>
When Click on the Login Button
And Click CRMSFA Link
And Click on CreateLead
And Enter the CompnayName as <companyname>
And Enter the FirstName as <firstname>
And Enter the LastName as <lastname>
Then Click on SubmitButton

Examples:

|username|password|companyname|firstname|lastname|
|Demosalesmanger|crmsfa|Wipro|Veronica|Jojede|
|DemoCSR|crmsfa|Aon|Vega|Rupunzel|

Scenario Outline: TC002 Passing Multiple data to same Test Case two


And Enter the UserName as <username>
And Enter the PassWord as <password>
When Click on the Login Button
And Click CRMSFA Link
And Click on CreateLead
And Enter the CompnayName as <companyname>
And Enter the FirstName as <firstname>
And Enter the LastName as <lastname>
Then Click on SubmitButton

Examples:

|username|password|companyname|firstname|lastname|
|Demosalesmanger|crmsfa|Zoho|Ellen|Show|
|DemoCSR|crmsfa|Amazon|Mary|Desouza|
