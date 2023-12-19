package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountEditPage extends BasePage {

	public AccountEditPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement editFirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement editLastName;

	@FindBy(xpath = "//button[text()='Continue']")
	WebElement continueBtn;

	@FindBy(xpath = "//i[@class='fa-solid fa-circle-check']")
	WebElement validation;

}
