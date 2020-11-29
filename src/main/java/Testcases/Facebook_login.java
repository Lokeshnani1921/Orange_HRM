package Testcases;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_login {
	
@Test
public void fb_login()
{
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.partialLinkText("Create")).click();
	driver.findElement(By.name("firstname")).sendKeys("hello");
	driver.findElement(By.name("lastname")).sendKeys("world");
	String email= Randomnumeric() +"@gmail.com";
	driver.findElement(By.id("u_1_g")).sendKeys(email);
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
