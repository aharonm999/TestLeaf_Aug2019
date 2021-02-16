Feature: Leaftaps Login Steps
Scenario: TC001 Passing data dynamically in Cucumber using DataProvider

Given Open the Chrome Browser
And Maximise the Browser
And Set the TimeOuts
And Load the URL
And Enter the UserName as demosalesmanager
And Enter the PassWord as crmsfa
When Click on the Login Button
And Click CRMSFA Link
And Click on CreateLead
And Enter the CompnayName as Zoho
And Enter the FirstName as Vini
And Enter the LastName as V
Then Click on SubmitButton

Scenario: TC002 Passing data dynamically in Cucumber using DataProvider

Given Open the Chrome Browser
And Maximise the Browser
And Set the TimeOuts
And Load the URL
And Enter the UserName as democsr
And Enter the PassWord as crmsfa
When Click on the Login Button
And Click CRMSFA Link
And Click on CreateLead
And Enter the CompnayName as ZeeTv
And Enter the FirstName as Boy
And Enter the LastName as M
Then Click on SubmitButton