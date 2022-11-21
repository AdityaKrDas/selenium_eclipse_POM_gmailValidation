package testcasePackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pagesPackage.GmailLogin;
import pagesPackage.GmailHomePageOperations;


public class VerifyHomePage extends BrowserConfig
{
	@Test(priority=0)
	public void LoginPage() throws InterruptedException, IOException
	{	
		//Creating Page Object Using Page Factory
		 GmailLogin loginpageverify=PageFactory.initElements(driver, GmailLogin.class);
		 Thread.sleep(3000);
		 
		//Calling Login Method
		  loginpageverify.Login();		 
	}
	@Test(priority=1)	 
	public void GmailValidation()
	{
		//Creating Page Object for Home Page Using Page Factory
		GmailHomePageOperations home_page=PageFactory.initElements(driver, GmailHomePageOperations.class);	
		
		//Calling Home Page Method
		home_page.Subject_Body_Validation();
				
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}
	
