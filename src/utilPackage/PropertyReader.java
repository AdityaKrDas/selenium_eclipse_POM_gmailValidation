package utilPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader 
{
	public static Properties prop;
	public static FileInputStream inputStream;
	
	public static String ReadProperty(String PropertyName) throws IOException, FileNotFoundException {
		
		prop = new Properties();  //reading properties from properties file
		String projectPath = System.getProperty("user.dir");   //project path
		System.out.println("Project path : " + projectPath);
		//to open the file in read mode
		inputStream = new FileInputStream(projectPath +"\\src\\utilPackage\\config");
		//loading property file
		prop.load(inputStream);
		String PropertyValue = prop.getProperty(PropertyName);
		return PropertyValue;
			
	}
	
	//public static void main(String args[]) throws IOException {
		//System.out.println(PropertyReader.ReadProperty("browser"));
		//System.out.println(PropertyReader.ReadProperty("appURL"));
	//}
}
