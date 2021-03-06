package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods {
	
	@BeforeClass(groups="common")
	public void setData() {
		testCaseName = "TC001_CreateLead";
		testCaseDescription ="Create a lead";
		category = "Smoke";
		author= "Babu";
		dataSheetName="TC001";
	}
	@Test(dataProvider="fetchData")
	public  void createLead(String cname, String fname, String lname, String email)   {
		
		/*click(locateElement("linktext", "Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"), cname);
		type(locateElement("id", "createLeadForm_firstName"), fname);
		type(locateElement("id", "createLeadForm_lastName"), lname);
		type(locateElement("id", "createLeadForm_primaryEmail"), email); 
		click(locateElement("name", "submitButton"));*/
		
		CreateLeadPage cp=new CreateLeadPage();
		cp.click();
		cp.typeCompanyName(cname);
		cp.typeFirstName(fname);
		cp.typeLastName(lname);
		cp.email(email);
		cp.clickCreateLeadp();
	}
	

}
