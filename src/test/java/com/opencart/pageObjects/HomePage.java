package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement linkMyaccount;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement linkLogin;

	@FindBy(xpath = "//a[text()='Register']")
	WebElement linkRegister;

	@FindBy(xpath = "//h1[text()='Register Account']")
	WebElement registerAccountTxt;

	@FindBy(xpath = "//*[text()='Continue']")
	WebElement continuebtn;

	public String getRegisterAccountText() {

		return registerAccountTxt.getText();
	}

	public void clickOnContinue() {

		continuebtn.click();
	}

	public void clickMyAccount() {

		linkMyaccount.click();
	}

	public void clickRegister() {

		linkRegister.click();
	}

	public void clickLogin() // added in step6
	{

		linkLogin.click();
	}

}
