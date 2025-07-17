package TestScripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
	// Configure ChromeOptions
    ChromeOptions options = new ChromeOptions();
    options.setBinary("C:\\Users\\ASUS\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe"); // <-- your path
    options.addArguments("--headless");       // Headless mode for Jenkins
    options.addArguments("--disable-gpu");
    options.addArguments("--window-size=1920,1080");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://www.facebook.com");
	driver.close();
	logger.log("WebPage is Launched and Closed");
}
}
