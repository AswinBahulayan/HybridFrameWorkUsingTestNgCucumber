package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DataInputProvider;
import utils.HtmlReporter;
import wdMethods.SeMethods;

public class ProjectMethodPage extends DataInputProvider {

	@FindBy(how = How.ID, using = "username")
	static WebElement Username;
	@FindBy(how = How.ID, using = "password")
	static WebElement Password;
	@FindBy(how = How.CLASS_NAME, using = "decorativeSubmit")
	static WebElement loginButton;
	@FindBy(how = How.LINK_TEXT, using = "CRM/SFA")
	static WebElement ClickLinkCRMsfa;

	
	public ProjectMethodPage Startchrome(String URL) {
		startApp("Chrome", URL);
		return this;
	}

	@And("enters the username as (.*)")
	public ProjectMethodPage Username(String Name) {
		PageFactory.initElements(driver, this);
		Username.sendKeys(Name);
		return this;
	}

	@And("enter the  password as (.*)")
	public ProjectMethodPage password(String pass) {
		PageFactory.initElements(driver, this);
		Password.sendKeys(pass);
		return this;
	}

	@When("click submit")
	public ProjectMethodPage clickSubmit() {
		PageFactory.initElements(driver, this);
		loginButton.click();
		return this;
	}

	@Then("click crmsfa")
	public ProjectMethodPage clickCRFsfa() {
		PageFactory.initElements(driver, this);
		ClickLinkCRMsfa.click();
		return this;

	}

}
