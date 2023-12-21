package com.opencart.stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencart.pageObjects.AccountPage;
import com.opencart.pageObjects.HomePage;
import com.opencart.pageObjects.LoginPage;
import com.opencart.utilities.DataReader;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class Steps {

	WebDriver driver;
	HomePage hp;
	LoginPage lp;
	AccountPage ap;

	Logger logger; // for logging
	ResourceBundle rb; // for reading properties file
	String br;
	List<HashMap<String, String>> datamap;

	@Given("User Launch Browser")
	public void user_launch_browser() {
		logger = (Logger) LogManager.getLogger(this.getClass());
		driver = new ChromeDriver();
		logger.info("Launched browser");
		driver.manage().window().maximize();

	}

	@After
	public void closeBrowser() {
		driver.quit();
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

	@Then("the user should be redirected to the MyAccount Page by passing email and password with excel row {string}")
	public void the_user_should_be_redirected_to_the_my_account_page_by_passing_email_and_password_with_excel_row(
			String rows) {
		datamap = DataReader.data(System.getProperty("user.dir") + "\\testData\\Opencart_LoginData.xlsx", "Sheet1");

		int index = Integer.parseInt(rows) - 1;
		String email = datamap.get(index).get("username");
		String pwd = datamap.get(index).get("password");
		String exp_res = datamap.get(index).get("res");

		lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);

		lp.clickLogin();
		ap = new AccountPage(driver);
		try {
			boolean targetpage = ap.isEditAccountTxtDisplayed();
			 
			if (targetpage == true && exp_res.equalsIgnoreCase("valid")) {
				Assert.assertTrue(true);
				
			} else if (targetpage == false && exp_res.equalsIgnoreCase("Invalid")) {
				Assert.assertTrue(true);
				
			} else {
				Assert.assertTrue(false);
				
			}

		} catch (

		Exception e) {
			System.err.println(e);
			Assert.assertTrue(false);
		}
	}

}
