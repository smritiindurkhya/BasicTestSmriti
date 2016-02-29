package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClassTest {
	public static WebDriver driver = new FirefoxDriver();

	@BeforeSuite
	public void setup(){
		driver.get("http://only-testing-blog.blogspot.in/2013/11/new-test.html#sthash.3b7awM2L.dpuf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void tearDown(){
		driver.quit();
	}

}
