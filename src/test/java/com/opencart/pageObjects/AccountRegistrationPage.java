package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(name = "firstname")
	WebElement txtFirstname;

	@FindBy(name = "lastname")
	WebElement txtLasttname;

	@FindBy(name = "email")
	WebElement txtEmail;

	@FindBy(name = "telephone")
	WebElement txtTelephone;

	@FindBy(name = "password")
	WebElement txtPassword;

	@FindBy(name = "confirm")
	WebElement txtConfirmPassword;

	@FindBy(name = "agree")
	WebElement chkdPolicy;

	@FindBy(xpath = "//*[text()='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	@FindBy(xpath = "//*[@id='error-firstname']")
	WebElement errorfName;

	@FindBy(xpath = "//*[@id='error-lastname']")
	WebElement errorlName;

	@FindBy(xpath = "//*[@id='error-email']")
	WebElement errorEmail;

	@FindBy(xpath = "//*[@id='error-password']")
	WebElement errorPassword;

	@FindBy(xpath = "//*[@id='input-newsletter']")
	WebElement newsLetterRBtn;

	@FindBy(xpath = "//*[text()='Newsletter']")
	WebElement newsLetterLink;

	@FindBy(xpath = "//div[@id='alert']")
	WebElement warningAlertforDuplicateEmail;

	@FindBy(xpath = "//div[@id='error-email']")
	WebElement invalidMailAlert;

	// Action Methods
	public String getInvalidMailAlert() {

		return invalidMailAlert.getText();
	}

	public void clickNewsLetterLink() {
		newsLetterLink.click();
	}

	public void clickRBtnNewsLetter() {
		newsLetterRBtn.click();
	}

	public String geterrorMsgFirstName() {
		return errorfName.getText();
	}

	public String geterrorMsgLastName() {
		return errorlName.getText();
	}

	public String geterrorEmail() {
		return errorEmail.getText();
	}

	public String geterrorPassword() {
		return errorPassword.getText();
	}

	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);

	}

	public void setLastName(String lname) {
		txtLasttname.sendKeys(lname);

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);

	}

	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
}
