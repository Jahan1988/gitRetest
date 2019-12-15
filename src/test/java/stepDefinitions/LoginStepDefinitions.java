package stepDefinitions;

import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pageObjects.LoginPageObject;

public class LoginStepDefinitions extends Base {
	
	//declare loginPageObject obj
	
	LoginPageObject loginPage;
	/*
	 * This method will open Tek school page
	 * and verify title
	 */
	@Given("^User is on TekSchool page$")
	public void user_is_on_TekSchool_page() throws Throwable {
	 Base.initializeDriver();//bring me the website up
	 //i need to get a title
	 //check for the title (verify right page)
	 loginPage = new LoginPageObject();
	 
     //this is hard assertion, if expected doesn't meet actual result 
	 //it will fail the execution
	 String expectedTitle = "TEK School – Knowledge is power";
	   
	 Assert.assertEquals(loginPage.pageTitle(), expectedTitle);
	
	}
/*
 * This method will click on Test Environment link
 * @throws Throwable
 */
	@When("^User Click on Test Environment link$")
	public void user_Click_on_Test_Environment_link() throws Throwable {
		loginPage = new LoginPageObject();
		loginPage.clickOnTestEnvironmentLink();
	}
	/*
	 * This method will verify test environment title
	 */
	
//i don't have page object for test environment page, we need to verify title
	@Then("^User should see Test Environment page$")
	public void user_should_see_Test_Environment_page() throws Throwable {
	   Assert.assertEquals(driver.getTitle(), "TEK SCHOOL");
	}

}
