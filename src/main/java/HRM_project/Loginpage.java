package HRM_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

public WebDriver driver;

public Loginpage(WebDriver driver)
{
	this.driver = driver;
}
By name = By.id("txtUsername");
By pwd = By.id("txtPassword");
By Login = By.xpath("//input[@id='btnLogin']");

public WebElement getusername() 
{
return	driver.findElement(name);	
}

public WebElement getpassword()
{
	return driver.findElement(pwd);
}

public WebElement getlogin()
{
	return driver.findElement(Login);
}
}
