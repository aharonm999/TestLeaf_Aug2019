Feature: Edit Lead Test Cases for Leaftaps
Scenario: TC002 Edit Lead Positive test case flow

Given Open the Chrome Browser
And Maximise the Browser
And Set the TimeOuts
And Load the URL
And Enter the UserName
And Enter the PassWord
When Click on the Login Button
And Click CRMSFA Link
And Click on Leads Tab
And Click on Find Leads button
And Enter the FirstName
And Click on Findleads button
And Click on first resulting lead
And Verify title of the page
And Clcik on edit button
And Clear compnay name
And Enter compnay name
And Click on update button
Then Confirm the changed name 
