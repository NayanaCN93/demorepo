package com.obsqura.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.Loginpage;

public class LoginpageTest extends Base {
  @Test
  public void ValidUsernameAndPassword() {
	
	  Loginpage loginpage=new Loginpage(driver);
	  loginpage.enterusernameandpassword("carol","1q2w3e4r");
	  loginpage.clicklogin();
	  String expected="Payroll Application";
	  String actual=driver.getTitle();
	  System.out.println(actual);
	  Assert.assertEquals(expected, actual,"login failed ");
  }
  @Test
  public void invalidUsernameAndPassword() {
	  Loginpage loginpage1=new Loginpage(driver);
	  loginpage1.enterusernameandpassword("car","1q");
	  loginpage1.clicklogin();
	  
	  boolean isloginpage=loginpage1.isloginisdisplayed();
	  
	  Assert.assertTrue(isloginpage,"is login page is failed");
	  
  }
  @Test
  public void validUsernameAndInvalidPassword() {
	  Loginpage loginpage=new Loginpage(driver);
	  loginpage.enterusernameandpassword("carol","1q");
	  loginpage.clicklogin();
  }
  @Test
 
  public void invalidUsernameAndValidPassword() {
	  Loginpage loginpage=new Loginpage(driver);
	  loginpage.enterusernameandpassword("c","1q2W3e4r");
	  loginpage.clicklogin();
  }
  
  
}
