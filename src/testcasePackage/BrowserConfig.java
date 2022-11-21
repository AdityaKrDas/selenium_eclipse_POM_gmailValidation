package testcasePackage;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utilPackage.PropertyReader;


public class BrowserConfig 
{
	public static WebDriver driver=null;
	static String driverPath = "../drivers/chromedriver.exe";
	
	@BeforeSuite
	public static void LaunchBrowser() throws FileNotFoundException, IOException
	{
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();				
		driver.manage().window().maximize();
		driver.get(PropertyReader.ReadProperty("appURL"));
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);		
	}
	
	@AfterSuite
	//Closing browser
	public void CloseBrowser()
	{
		BrowserConfig.driver.quit();
	}
}
