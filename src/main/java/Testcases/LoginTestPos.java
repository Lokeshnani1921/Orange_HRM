package Testcases;

import org.testng.annotations.Test;

import HRM_project.Baseclass;
import HRM_project.Loginpage;

public class LoginTestPos extends Baseclass {
	
	@Test
	public void HRM_Login() {
		
		log.info("Test case started");
	
		Loginpage pg = new Loginpage(driver);
		
		log.info("Entering Username..");
		pg.getusername().sendKeys(config.userid());
		
		log.info("Entering Password........");
		pg.getpassword().sendKeys(config.pwd());
		
		pg.getlogin().click();
		log.info("Registration page opened.......");		
	}
	

}
