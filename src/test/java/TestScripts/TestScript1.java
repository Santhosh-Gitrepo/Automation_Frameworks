package TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.TestLogger;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScript1 
{
@Test
public void test() throws IOException, InterruptedException
{
	TestLogger logger = new TestLogger();
	WebDriverManager.chromedriver().setup();;
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.close();
	logger.log("WebPage is Launched and Closed");
}
}
