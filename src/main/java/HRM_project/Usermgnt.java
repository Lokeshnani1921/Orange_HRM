
package HRM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Usermgnt {
	
	public WebDriver driver;
	public WebElement admlink = null;
	public WebElement adduser = null;
	public WebElement usrsel = null;
	public WebElement empn = null;
	public WebElement usnm = null;
	public WebElement ussts = null;
	public WebElement pswd = null;
	public WebElement cpwd = null;
	

	
	public Usermgnt(WebDriver driver)
	{
		this.driver = driver;
	}
	By Adminlink = By.id("menu_admin_viewAdminModule");
	By Add=By.name("btnAdd");
	By UserRole = By.className("formSelect valid");
	By Empname = By.id("systemUser_employeeName_empName");
	By username = By.id("systemUser_userName");
	By userstatus = By.id("systemUser_status");
	By password = By.xpath("//input[@id='systemUser_password']");
	By cnfmpwd = By.id("systemUser_confirmPassword");

	public WebElement Admin_Link()
	{
		 admlink = driver.findElement(Adminlink);
		 return admlink;
	}
	public WebElement Adding_user() 
	{
		 adduser = driver.findElement(Add);
		 return adduser;
	}
	
	public WebElement UserRole_Selection()
	{
			usrsel = driver.findElement(UserRole);
			return usrsel;
	}
	
	public WebElement Emp_name()
	{
		 empn = driver.findElement(Empname);
		 return empn;
	}
	
	public WebElement User_Name()
	{
		 usnm = driver.findElement(username);
		 return usnm;
	}
	
	public WebElement user_status()
	{
		 ussts = driver.findElement(userstatus);
		 return ussts;
	}
	public WebElement pwd()
	{
		 pswd = driver.findElement(password);
		 return pswd;
	}
	public WebElement Confirm_Pwd()
	{
		 cpwd = driver.findElement(cnfmpwd);
		 return cpwd;
	}
	
	}

