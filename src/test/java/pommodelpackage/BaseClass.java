package pommodelpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	LandingPage landpage;

	@BeforeTest

	public void setup() throws InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		// Initialize LandingPage object
		landpage = new LandingPage(driver);
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);

	}

	@Test

	public void testlogin() {

		landpage.enterusername("standard_user");
		landpage.enterpassword("secret_sauce");
		landpage.loginbuttonclick();

	}

}
