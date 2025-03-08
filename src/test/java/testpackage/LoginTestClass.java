package testpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import mohoshi.pageobjects.LoginPage;

public class LoginTestClass extends BaseTestClass {
	

	@Test

	public void testlogin() {

		loginpg.enterusername("standard_user");
		loginpg.enterpassword("secret_sauce");
		loginpg.loginbuttonclick();

	}

}
