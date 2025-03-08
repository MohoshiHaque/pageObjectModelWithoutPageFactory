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

public class LoginTestClass {

	WebDriver driver;
	LoginPage loginpg;

	@BeforeTest

	public void setup() throws InterruptedException, IOException {

		// propertiesclass
		Properties prop = new Properties();
		FileInputStream fps = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\mohoshi\\resources\\GlobalData.properties");
		prop.load(fps);
		String browsername = prop.getProperty("browser");

		if (browsername.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			// Initialize LandingPage object
			loginpg = new LoginPage(driver);
			driver.get("https://www.saucedemo.com/");

		}

		else if (browsername.equalsIgnoreCase("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			// Initialize LandingPage object
			loginpg = new LoginPage(driver);
			driver.get("https://www.saucedemo.com/");
		}

		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@Test

	public void testlogin() {

		loginpg.enterusername("standard_user");
		loginpg.enterpassword("secret_sauce");
		loginpg.loginbuttonclick();

	}

}
