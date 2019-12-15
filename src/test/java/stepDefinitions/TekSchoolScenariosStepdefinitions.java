package stepDefinitions;

import java.sql.SQLException;
import java.util.List;

import org.testng.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolScenariosPageObject;
import utilities.DBUtilities;
import utilities.Utility;

public class TekSchoolScenariosStepdefinitions extends Base {

	TekSchoolScenariosPageObject tekSchoolScenariosPageObject = new TekSchoolScenariosPageObject();
	@When("^User click on myAccount menu on top of the page$")
	public void user_click_on_myAccount_menu_on_top_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnMyAccount();
		//tekSchoolScenariosPageObject.clickOnLogin();
	}
//replace 'userName' 'password' with (.+)
	//teststudent@gmail.com
	//Tek@Test.com
	@And("^User enter username '(.+)' and password '(.+)' in returning menu$")
	public void user_enter_username_username_and_password_password_in_returning_menu(String userName ,String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.emailAddress(userName);
		tekSchoolScenariosPageObject.enterPassword(password);
	}

	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnLoginButton();
	}

	@Then("^User should be logined in$")
	public void user_should_be_logined_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	Assert.assertEquals(true, tekSchoolScenariosPageObject.verifyLoginToMyAccount() );
	Utility.screenshot(driver);
	}

	@And("^User click on login on myAccount menu$")
	public void user_click_on_login_on_myAccount_menu() {
		tekSchoolScenariosPageObject.clickOnLogin();
	}
	@When("^User click on register on myAccount menu$")
	public void user_click_on_register_on_myAccount_menu() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   tekSchoolScenariosPageObject.clickOnRegister(); 
	}

	@And("^User fill register form with below information$")
	public void user_fill_register_form_with_below_information(DataTable personalInfo) throws Throwable {
	 List <List<String>> dataValues = personalInfo.raw();
	 tekSchoolScenariosPageObject.fillFirstName(dataValues.get(0).get(0)); 
	 tekSchoolScenariosPageObject.fillLastName(dataValues.get(0).get(1));
	 tekSchoolScenariosPageObject.fillEmail(dataValues.get(0).get(2));
	 tekSchoolScenariosPageObject.fillPhone(dataValues.get(0).get(3));
	 tekSchoolScenariosPageObject.fillPassword(dataValues.get(0).get(4));
	 tekSchoolScenariosPageObject.fillPasswordConfirmation(dataValues.get(0).get(4));
	 
	}

	@When("^User click on '(.+)' radio button for Subscribe$")
	public void user_click_on_radio_button_for_Subscribe(String radioButtonValue) throws Throwable {
		tekSchoolScenariosPageObject.subscribeRadioButton(radioButtonValue);
	   	Utility.screenshot(driver);
	   	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		tekSchoolScenariosPageObject.clickOnContinueButton();
	 
	}

	@Then("^User should see 'Your Account Has been Created!'$")
	public void user_should_see_Your_Account_Has_been_Created() throws Throwable {
	    Assert.assertEquals(tekSchoolScenariosPageObject.confirmationMessage(), true);
	   Utility.screenshot(driver);
	}
	//************************************************************************//
//we are connecting to database through selenium
	//split action of each method
	@When("^User connects to DataBase$")
	public void user_connects_to_DataBase() throws Throwable {
	   DBUtilities.setupConnection();
	}
//send the query to Database
	@Then("^User sends query '(.+)'$")
	public void user_sends_query(String query) throws Throwable {
		DBUtilities.runQuery(query);
	}
//compare, do assertion//we need to verify, what we get//email validation
	@Then("^User verify email account is created with email '(.+)'$")
	public void user_verify_email_account_is_created_with_email(String emailValidation) throws Throwable {
	   String staticquery = "select * from public.customer where email=";
	  try {
		  while (DBUtilities.runQuery(staticquery + emailValidation).next());
	  
	   DBUtilities.runQuery(staticquery + emailValidation).getString("email");
	  }catch (SQLException e) {
		  e.printStackTrace();
	  }
	}

	
}
