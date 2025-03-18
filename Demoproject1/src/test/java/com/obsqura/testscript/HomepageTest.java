package com.obsqura.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.Homepage;
import com.obsqura.pages.Loginpage;

public class HomepageTest extends Base {
  @Test
  public void verifyUserCanLogout() {
	  Loginpage loginpage=new Loginpage(driver);
	  loginpage.enterusernameandpassword("carol", "1q2w3e4r");
	  loginpage.clicklogin();
	 
	  Homepage homepage=new Homepage(driver);
	  homepage.clickOnUsericon();
	  homepage.clickOnLogout();
	  
	String expected="Login";
	  String actual=driver.getTitle();
	  Assert.assertEquals(actual,expected,"logout failed");
	  
	/* boolean logintext=homepage.isloginisdisplayed();
	  Assert.assertTrue(logintext,"not found");*/
  }
}
