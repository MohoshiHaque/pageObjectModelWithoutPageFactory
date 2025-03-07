package pommodelpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageWithoutPFM {
	
	WebDriver driver;

	// Constructor to initialize the WebDriver
	public LandingPageWithoutPFM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
    // Locators defined using By

	By username = By.id("user-name");
	By password = By.id("password");
	By loginbutton = By.id("login-button");
	
	
	 // Methods to interact with elements
	
	public void enterusername(String uname) {
		driver.findElement(username).sendKeys(uname);		
	}
	
	public void enterpassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);		
	}
	
	public void loginbuttonclick() {
		driver.findElement(loginbutton).click();	
	}
	
	
	
	

}
