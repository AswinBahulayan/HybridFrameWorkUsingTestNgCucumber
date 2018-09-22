Feature: CL into Leaftap Application 
Background: 
	Given launch the browser 
	And maximize the browser 
	And set the timeouts 
	And enter the URL 
#	
#Scenario: Positive flow for login 
#	And enter the user name as DemoSalesManager 
#	And enter the password as crmsfa 
#	When clicks on the login button 
#	Then verify login is success 
	
Scenario Outline: Negative flow for CL 
	And enter the user name as <username>
	And enter the password as <password>
	When clicks on the login button 
	But verify login is failure 
	Examples: 
		|username|password|
		|Demo1|crm|
		|Demo2|sfa|
		
		
		
		

		
		