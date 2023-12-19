package com.opencart.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='Edit Account']")
	WebElement editAccountLink;

	@FindBy(xpath = "//a[text()='Address Book']")
	WebElement addressBookLink;

	public boolean isEditAccountTxtDisplayed() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(editAccountLink));

		if (editAccountLink.isDisplayed()) {
			return true;

		} else
			return false;
	}

}
