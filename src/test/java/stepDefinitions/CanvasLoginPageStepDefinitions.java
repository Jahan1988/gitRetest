package stepDefinitions;

import org.testng.Assert;

import core.Base;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;
import utilities.Utility;

public class CanvasLoginPageStepDefinitions extends Base {

	LoginPageObject loginPage;
	@When("^User click on Login button on top of the page$")
	public void user_click_on_login_button_on_top_of_the_page() throws Throwable {
	/*
	 * write code for clicking on login to class	
	 */
		Utility.screenshot(driver);
		loginPage = new LoginPageObject();
		loginPage.clickOnLoginToClassLink();
	}

	@Then("^User should see Canvas Login Page$")
	public void user_should_see_Cnavas_page() throws Throwable {
	/*
	 * verify the title of canvas page   
	 */
		Assert.assertEquals(driver.getTitle(), "Log In to Canvas");
	Utility.screenshot(driver);
	}
	  
	  

}