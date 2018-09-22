Feature: Login into Leaftap Application 
Scenario Outline: Negative flow for login 
	And enter the user name as <username>
	And enter the password as <password>
	When clicks on the login button
	Then verify login is success
	Examples: 
		|username|password|
		|DemoSalesManager|crmsfa|
		|DemoCSR|crmsfa|
		
		
		
		
