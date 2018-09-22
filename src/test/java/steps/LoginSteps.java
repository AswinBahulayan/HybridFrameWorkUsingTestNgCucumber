/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps{
	public static ChromeDriver driver;
	@Given("launch the browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@And("maximize the browser")
	public void maximize() {
		driver.manage().window().maximize();
	}
	@And("set the timeouts")
	public void setTimeOuts() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("enter the URL")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps");
	}
	@And("enter the user name as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username")
		.sendKeys(uName);
	}
	@And("enter the password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password")
		.sendKeys(pwd);
	}
	@When("clicks on the login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@Then("verify login is success")
	public void verifyLogin() {
		System.out.println("verified");
	}
	
	@But("verify login is failure")
	public void verifyLoginFail() {
		System.out.println("Failed");
	}
	








}


*/