PRE-REQUISITES:
------------------------- 
1) Used Eclipse IDE to script and execute the project (Version: 2022-03 (4.23.0) , 20220310-1457)

2) Recommended to Unzip the project and extract file in "D" drive to access source project

3) Chrome driver path is set to "../drivers/chromedriver.exe" in "src/testcasePackage/BrowserConfig.java"
    Download driver as per chrome or any other browser version

4) Add TestNG and Referenced Libraries inside project path i.e GmailValidation.

5) Once all folders are placed at correct position, project folder structure in eclipse IDE would look like:

GmailValidation
   >JRE System Library [jre 1.8.0_131]
   >src
   >TestNg
   >Rerefenced Libraries
   >Drivers
   >Test Data
    testng.xml

******************************************************************************

APPLICATION UNDER TEST:
-------------------------
Gmail

******************************************************************************

TO EXECUTE:
-------------------
Right click testng.xml file -> Run As -> TestNG Suite

******************************************************************************

CONSOLE OUTPUT AND VALIDATIONS:
-------------------------------
Project Name - GmailVaidation
--> Used Gmail application to work with the project steps. Written Script using Selenium+Java, utilizing TESTNG Framework and with Page Factory of Page Object Model approach

Step 1 : Log into any email account and check if there is an email.
		Logged into gmail application using gmail credentials present in "./Test Data/Data_Repository.csv" and validated the number of email present(count) and printing the number of mails present in the eclipse console


Step 2 : Verify Subject and Body of the e-mail containing string text.
		Using Lists, checked for the existence of Subject and body of each mail. Printing the relevent messages in the eclipse console


Step 3 : Parameterize (data-drive) the script to handle email account.
		Created a csv file (data-driven) , Can change the mail id and password and can get above results for any vaild gmail account.

*******************************************************************************