package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods {

	@FindBy(how = How.LINK_TEXT, using = "Create Lead")
	static WebElement CreateLeadLink;
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	static WebElement CompanyName;
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	static WebElement firstName;
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	static WebElement lastName;
	@FindBy(how = How.ID, using = "createLeadForm_primaryEmail")
	static WebElement email;
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	static WebElement Submit;
	
	@Given("click the create lead button")
	public CreateLeadPage click()
	{
		PageFactory.initElements(driver, this);
		CreateLeadLink.click();
		return this;
	}
	@And("enter the company name as (.*)")
	public CreateLeadPage typeCompanyName(String data) {
		PageFactory.initElements(driver, this);
		type(CompanyName, data);
		return this;
	}
	@And("enter the first name as (.*)")
	public CreateLeadPage typeFirstName(String data) {
		PageFactory.initElements(driver, this);
		type(firstName, data);
		return this;
	}
	@And("enter the last name as (.*)")
	public CreateLeadPage typeLastName(String data) {
		PageFactory.initElements(driver, this);
		type(lastName, data);
		return this;
	}
	@And("enter the email address as (.*)")
	public CreateLeadPage email(String data)
	{
		PageFactory.initElements(driver, this);
		type(email, data);
		return this;
	}
	@Then("click the submit button")
	public CreateLeadPage clickCreateLeadp() {
		PageFactory.initElements(driver, this);
		click(Submit);
		return this;
	}

	/*
	 * public static void createlead() {
	 * 
	 * firstName.sendKeys("Aswin"); lastName.sendKeys("");
	 * CompanyName.sendKeys("CTS");
	 * 
	 * }
	 */

}
