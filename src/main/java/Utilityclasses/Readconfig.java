package Utilityclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Readconfig {
	
	Properties prop;
	
	public Readconfig()
	{
		try {
			FileInputStream fis = new FileInputStream("F:\\Study\\Orange_Hrm\\src\\main\\java\\HRM_project\\browser.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File not found" +e.getMessage());
		}
	}
	
	public String getbrowser()
	{
		return prop.getProperty("browser");
	}
	
	public String geturl()
	{
		return prop.getProperty("url");
	}
	
	public String userid()
	{
		return prop.getProperty("username");
	}

	public String pwd()
	{
		return prop.getProperty("password");
	}
}
