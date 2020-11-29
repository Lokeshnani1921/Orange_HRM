package HRM_project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utilityclasses.Readconfig;

public class Baseclass {
	private static final String TakesScreenshot = null;
	public WebDriver driver;
	public Readconfig config = new Readconfig();
	public static Logger log;

	@BeforeClass
	public WebDriver setup() throws IOException
	{
		 log = Logger.getLogger("Orange_HRM");
		PropertyConfigurator.configure("Log4j.properties");
		
	String browsername=config.getbrowser();
	if (browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(config.geturl());
	return driver;
	
}
	@AfterClass
	public void teardown() {
		driver.close();
	} 
	
	public void Capturescreenshot(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File SCR = ts.getScreenshotAs(OutputType.FILE);
		File DSTN = new File(System.getProperty("user.dir")+ "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(SCR, DSTN);
	}
	
	public String RandomString()
	{
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
	}
	
	public String Randomnumeric()
	{
	String generatednumeric = RandomStringUtils.randomNumeric(5);
	return generatednumeric;
	}
}