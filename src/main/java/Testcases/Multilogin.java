package Testcases;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import HRM_project.Baseclass;
import HRM_project.Loginpage;
import Utilityclasses.XLutils;

public class Multilogin extends Baseclass {
	
	@Test(dataProvider = "Logindata")
	public void mlogin(String uname, String upwd)
	{
		Loginpage lp = new Loginpage(driver);
		lp.getusername().sendKeys(uname);
		lp.getpassword().sendKeys(upwd);
		lp.getlogin().click();
		
		if(text()==true)
		{
			driver.findElement(By.partialLinkText("Welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
			Assert.assertTrue(true);
			driver.switchTo().defaultContent();
		}
		else
		{
			Assert.assertTrue(false);
			driver.switchTo().defaultContent();
		}
		
	}
	
	public boolean text()
	{
		driver.findElement(By.partialLinkText("Welcome")).isDisplayed();
		
		return true;
		
	}

	@DataProvider(name = "Logindata")
	public String[][] multidata() throws IOException
	{
		XLutils xldata = new XLutils();
		int RC = xldata.getrowcount("F:\\Study\\Multilogin.xlsx", "Sheet1");
		System.out.println("Row Count:" +RC);
		int CC = xldata.getCellCount("F:\\Study\\Multilogin.xlsx", "Sheet1", 0);
		System.out.println("Cell Count:" +CC);
		int i,j;
		String[][] obj = new String[RC][CC];
		for (i=1; i<=RC; i++)
		{
			for (j=0; j<CC; j++)
			{
				obj[i-1][j] = XLutils.getCellData("F:\\Study\\Multilogin.xlsx", "Sheet1", i, j);
				
			}
		}
		return obj;
		
	}
	
}
