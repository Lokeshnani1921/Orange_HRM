package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import HRM_project.Baseclass;
import HRM_project.Loginpage;

public class LogintestNeg extends Baseclass{
	
	@Test
	public void HRM_Login2() throws IOException
	{
		Loginpage lp = new Loginpage(driver);
		lp.getlogin().click();
		
	String usernamealert = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		
	if(usernamealert.equals("Username cannot be empty"))
	{
		System.out.println(usernamealert);
		System.out.println("Test Pass");
		lp.getusername().sendKeys(config.userid());
		lp.getlogin().click();
	}
	else
	{
		System.out.println("Test Fail");
	}
	
	
	String passwordalert = driver.findElement(By.xpath("//span[@id='spanMessage'][1]")).getText();
	
	if (passwordalert.contentEquals("Password cannot be empty"))
	{
		System.out.println(passwordalert);
		System.out.println("password Test is pass");
		lp.getpassword().sendKeys(config.pwd());
	}
	else
	{
		Capturescreenshot(driver, "passwordalert");
		System.out.println("password Test is Fail");
		
	}
	lp.getlogin().click();
	boolean text = driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
	
	if (text == true)
	{
		System.out.println("pass.........");
	}
	
	if (text == false)
	{
		System.out.println("Fail");
	}

	}
}
