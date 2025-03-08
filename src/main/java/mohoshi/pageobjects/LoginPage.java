package mohoshi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// Constructor initializes PageFactory elements

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Locators using @FindBy annotation

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginbtn;

	// Methods to interact with elements

	public void enterusername(String uname) {
		username.sendKeys(uname);
	}

	public void enterpassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void loginbuttonclick() {
		loginbtn.click();
	}

}

