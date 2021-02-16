Feature: Finding user in Find Leads Page
Scenario: Find user in Leads

Given Open the chrome browser
And Maximise the browser
And Set the Timeouts
And Load the url
And Enter the UserName
And Enter the Password
When Click on the login button
And Click crm/sfa link
And Click on Leads Tab
And Click on Find Leads submenu from Shorcuts menu 
And Enter First Name
Then Click on Find Leads button
