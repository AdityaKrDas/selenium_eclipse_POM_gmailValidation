package pagesPackage;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailHomePageOperations
{
	//Find the List of Email
			@FindBy(how=How.XPATH,using="//span[@class='bog']")
			List<WebElement> mail_subject;        
			
			//Find the List Email Body
			@FindBy(how=How.XPATH,using="//span[@class='y2']")
			List<WebElement> mail_body; 
	  
	public void Subject_Body_Validation() 
	{	
		for(int i=0; i< mail_subject.size() && i < mail_body.size(); i++)
		{  
			String emailSub = mail_subject.get(i).getText();
			String emailBody = mail_body.get(i).getText();
			System.out.println("Subject of Email : " + emailSub + "\n" + "Content of Email : " + emailBody);
			
			//Verify Subject is Present in Email or not
			if(mail_subject.get(i).getText().equals("(no subject)"))
			{
				//Verify that Email has Subject or not
				System.out.println("Email does not have Subject");
			}
			else
			{
				System.out.println("Email have Subject");
			}
			
			
			//Verify content is Present or not			
			if(mail_body.get(i).getText().length()==1)
			{		
				System.out.println("No Body of the Mail");
			}
			else
			{
				System.out.println("Mail has Body");
			}
			
			System.out.println("********************************************");
			
		}
	}
}
