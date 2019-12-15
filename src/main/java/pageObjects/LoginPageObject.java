package pageObjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObject extends Base {
	
	//create constructor of class
	public LoginPageObject () {
		PageFactory.initElements(driver, this);
	}
	//storing webElements 
    //a[text()='Test Environment']
	//@FindBy this annotation part of pageFactory class which helps us to initialize the element

	@FindBy(how = How.XPATH, using = "//a[text()='Test Environment']")
	private WebElement testEnvironmentLink;

	@FindBy(how = How.XPATH, using = "//a[text()='Login to Class']")
	private WebElement loginToClassLink;

	@FindBy(how = How.ID, using = "mc4wp_email")
	private WebElement subsEmailField;
/*
 * This method will click on testEnvironment link on TekSchool page
 */
	public void clickOnTestEnvironmentLink () {
		testEnvironmentLink.sendKeys(Keys.ENTER);
	}
	/*
	 * This method click on login to class link on tekSchool page
	 */
	public void clickOnLoginToClassLink() {
		loginToClassLink.sendKeys(Keys.ENTER);
	}
	/*
	 * This method will enter email value in sub email field in page
	 * @param emailValue
	 */

	public void sendValueToSubsEmailField (String emailValue) {
		subsEmailField.sendKeys(emailValue);
	}
	/*
	 * This method will return page title
	 * @return
	 */
	public String pageTitle() {
		String TekSchoolPageTitle = driver.getTitle();
		return TekSchoolPageTitle;
	}
}
