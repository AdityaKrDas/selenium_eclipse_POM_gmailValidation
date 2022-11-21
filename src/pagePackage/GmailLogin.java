package pagesPackage;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import au.com.bytecode.opencsv.CSVReader;


public class GmailLogin 
{
	static String CSV_file="./Test Data/Data_Repository.csv";
	WebDriver driver;
	
	public GmailLogin(WebDriver driver)
	{
		this.driver=driver;
	}
		
	//mail id/username text box
	@FindBy(how=How.XPATH,using="//*[@id='identifierId']")
	@CacheLookup
	WebElement username;
	
	//Next Button in Username Page
	@FindBy(how=How.XPATH,using ="//*[@id=\"identifierNext\"]/span/span")
	@CacheLookup
	WebElement usernameNextButton;
	
	//Password Text Box
	@FindBy(how=How.XPATH,using="//*[@id=\'password\']/div[1]/div/div[1]/input")
	@CacheLookup	
	WebElement password;	
	
	//Next Button in Password Page
	@FindBy(how=How.XPATH,using ="//*[@id=\'passwordNext\']/span/span")
	@CacheLookup
	WebElement passwordnextbutton;
	
	//Verify LoginPage
	@FindBy(how=How.XPATH, using="//a[@class='gb_z gb_Fa gb_g']")
	WebElement loginPagetitle;
	
	//List of Email
	@FindBy(how=How.XPATH,using="//span[@class='bog']")
	List<WebElement> mails;
	
	
	public void Login() throws InterruptedException, IOException
	{
		@SuppressWarnings("resource")
		CSVReader reader = new CSVReader(new FileReader(CSV_file));
  	  	String[] cell;
  	  
  	  while((cell=reader.readNext())!=null)
  	  {
  		  for(int i=0; i<1;i++)
  		  {
  			  String mailid =cell[i];
  			  String pwd = cell[i+1];  			 
  			  
  			  username.sendKeys(mailid);		
  			  usernameNextButton.click();			
  			  password.sendKeys(pwd);
  			  Thread.sleep(3000);
  			  passwordnextbutton.click();

		//Verification of mail
		if(mails.size()>0)
			{
				System.out.println("Email is Present:" + mails.size());
			}
		else
			{
				System.out.println("Email is not present:" + mails.size());
			
		    }
		
		System.out.println("***********************************************");		
	}
	
  }
	
		
	
	}
}

