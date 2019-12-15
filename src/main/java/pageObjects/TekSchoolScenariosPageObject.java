package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class TekSchoolScenariosPageObject extends Base {

	public TekSchoolScenariosPageObject () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccountWebElement;
	
	@FindBy (how = How.XPATH, using = "//a[text()='Register']")
	private WebElement registerWebElement;
	
	@FindBy (how = How.XPATH, using = "//a[text()='Login']")
	private WebElement loginWebElement;
	
	@FindBy (how = How.ID, using = "input-email")
	private WebElement emailFieldWebElement; 
	
	@FindBy (how = How.ID, using = "input-password")
	private WebElement PasswordFieldWebElement;
	
	@FindBy (how = How.XPATH, using = "//input[@type='submit']")
	private WebElement loginButtonWebElement;
	
	@FindBy (how = How.XPATH, using = "//h2[text()='My Account']")
	private WebElement myAccountTextWebElement;

	//////////////////////////////////////////////////
	@FindBy (how = How.ID, using = "input-firstname")
	private WebElement firstNameFieldValue;
	
	@FindBy (how = How.ID, using = "input-lastname")
	private WebElement lastNameFieldValue;
	
	@FindBy (how = How.ID, using = "input-email")
	private WebElement emailRegisterFieldValue;
	
	@FindBy (how = How.ID, using = "input-telephone")
	private WebElement phoneFieldValue;
	
	@FindBy (how = How.XPATH, using = "//input[@id='input-password']")
	private WebElement passwordRegisterFieldValue;
	
	@FindBy (how = How.ID, using = "input-confirm")
	private WebElement passwordConfirmFieldValue;
	
	@FindBy (how = How.XPATH, using = "//input[@value='1' and @name='newsletter']")
	private WebElement subscribeYesButton;
	
	@FindBy (how = How.XPATH, using = "//input[@value='0' and @name='newsletter']")
	private WebElement subscribeNoButton;
	
	@FindBy (how = How.XPATH, using = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy (how = How.XPATH, using = "//h1[text()='Your Account Has Been Created!']")
	private WebElement accountCreatedConfirmationText;
	
	
	
	//writing action methods for WebElements we store in this class obj repository class
	
	public void clickOnMyAccount() {
		try {
			myAccountWebElement.click();
	}catch (ElementNotInteractableException e){
		myAccountWebElement.sendKeys(Keys.ENTER);
		}
		}
	
	public void clickOnRegister () {
		try {
		registerWebElement.click();
	}catch (ElementNotInteractableException e) {
		registerWebElement.sendKeys(Keys.ENTER);}
	}
	public void clickOnLogin () {
		try {
			loginWebElement.click();}
		catch (ElementNotInteractableException e) {
			loginWebElement.sendKeys(Keys.ENTER);	
		}
		}

	public void emailAddress (String emailValue) {
		emailFieldWebElement.sendKeys(emailValue.trim());
		
	}
	public void enterPassword (String passwordValue) {
		PasswordFieldWebElement.sendKeys(passwordValue.trim());
		}
	public void clickOnLoginButton () {
		loginButtonWebElement.click();
	}
	public boolean verifyLoginToMyAccount () {
		boolean verificationPoint = myAccountTextWebElement.isDisplayed();
		return verificationPoint;
	}
	
	public void fillFirstName (String firstName) {
		firstNameFieldValue.sendKeys(firstName);
	}
	
	public void fillLastName (String lastName) {
		lastNameFieldValue.sendKeys(lastName);
	}
	public void fillEmail (String emailValue) {
		emailRegisterFieldValue.sendKeys(emailValue);
	}
	public void fillPhone (String phoneValue) {
		phoneFieldValue.sendKeys(phoneValue);
	}
	public void fillPassword (String password) {
		passwordRegisterFieldValue.sendKeys(password);
	}
	public void fillPasswordConfirmation (String passwordConfirmation) {
		passwordConfirmFieldValue.sendKeys(passwordConfirmation);
	}
	public void subscribeRadioButton (String yesOrNo) {
		if (yesOrNo.equalsIgnoreCase("yes")) {
			subscribeYesButton.click();	
	}else {subscribeNoButton.click();
	}
	}
	
	public void clickOnContinueButton () {
		continueButton.click();
	}
	
	public boolean confirmationMessage () {
		boolean confirmationtext = accountCreatedConfirmationText.isDisplayed();
	    return confirmationtext;
	}
	
		
	
}
