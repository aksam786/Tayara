package Tayara.TayaraAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestRunner {
		 public WebDriver driver;
		 
@BeforeClass
	public void Setup() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless", "--window-size=1920,1200", "--disable-dev-shm-usage");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.tayara.tn/");
		
			}

@AfterClass
	public void broweserClosure() {
	driver.close();
	}


}
