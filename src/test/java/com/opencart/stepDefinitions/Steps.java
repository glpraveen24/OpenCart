package com.opencart.stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencart.pageObjects.AccountPage;
import com.opencart.pageObjects.HomePage;
import com.opencart.pageObjects.LoginPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Steps {

	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	AccountPage ap;

	Logger logger; // for logging
	ResourceBundle rb; // for reading properties file
	String br;

	@Before
	public void setUp() {
		logger = (Logger) LogManager.getLogger(this.getClass());
	}

	@Given("User Launch Browser")
	public void user_launch_browser() {

		driver = new ChromeDriver();
		logger.info("Launched browser");

	}

	@Given("opens URL {string}")
	public void opens_url(String url) {
		driver.get(url);
		logger.info("Navigated to URL");

	}

	@When("User navigates to MyAccount menu")
	public void user_navigates_to_my_account_menu() throws InterruptedException {
		hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Selected MyAccount option");

	}

	@When("click on Login")
	public void click_on_login() {
		hp.clickLogin();

		logger.info("Selected Login option");

	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String string, String string2) {
		lp = new LoginPage(driver);
		lp.setEmail(string);
		logger.info("Entered email ID");

		lp.setPassword(string2);
		logger.info("Entered Password");

	}

	@When("click on Login button")
	public void click_on_login_button() {
		lp.clickLogin();
		logger.info("Clicked on Login Button");
	}

	@Then("User navigates to My account page")
	public void user_navigates_to_my_account_page() throws InterruptedException {
		ap = new AccountPage(driver);
		// Thread.sleep(2000);
		try {
			assertTrue(ap.isEditAccountTxtDisplayed());
			logger.info("Login feature passed");
		} catch (Exception e) {
			logger.info("Login feature failed");
		}

	}

}
