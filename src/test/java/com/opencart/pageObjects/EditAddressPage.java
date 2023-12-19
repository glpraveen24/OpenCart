package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditAddressPage extends BasePage {

	public EditAddressPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[text()='New Address']")
	WebElement addNewAddress;

	@FindBy(xpath = "//*[@id='input-firstname']")
	WebElement firstName;

	@FindBy(xpath = "//*[@id='input-lastname']")
	WebElement lastName;

	@FindBy(xpath = "//*[@id='input-company']")
	WebElement company;

	@FindBy(xpath = "//*[@id='input-address-1']")
	WebElement address1;

	@FindBy(xpath = "//*[@id='input-address-2']")
	WebElement address2;

	@FindBy(xpath = "//*[@id='input-city']")
	WebElement cityName;

	@FindBy(xpath = "//*[@id='input-postcode']")
	WebElement postCode;

	@FindBy(xpath = "//*[@id='input-country']")
	WebElement countries;

	@FindBy(xpath = "//*[@id='input-zone']")
	WebElement states;

	@FindBy(xpath = "//*[@id='input-default-yes']")
	WebElement defaultAddressYorN;

	@FindBy(xpath = "//*[text()='Continue']")
	WebElement continueBtn;

	@FindBy(xpath = "//i[@class='fa-solid fa-circle-check']")
	WebElement validation;

}
