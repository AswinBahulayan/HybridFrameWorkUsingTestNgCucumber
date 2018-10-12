Feature: create lead 
 
Background: 
	And  enters the username as DemoCSR 
	And  enter the password as crmsfa 
	When click submit 
	Then click crmsfa 
#########
@smoketest 
Scenario: adding a new lead to the website 

	Given   click the create lead button 
	And   enter the company name as cts 
	And   enter the first name as Aswin 
	And   enter the last name as Bahulayan 
	And   enter the email address as aswinbahulayan@gmail.com 
	Then click the submit button 

#######
