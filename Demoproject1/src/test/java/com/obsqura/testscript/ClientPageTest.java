package com.obsqura.testscript;

import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.ClientPage;
import com.obsqura.pages.Loginpage;

public class ClientPageTest extends Base{
  @Test
  public void searchWithValidNameAndID() {
	  
	
	 Loginpage loginpage=new Loginpage(driver);
	 loginpage.enterusernameandpassword("carol", "1q2w3e4r");
	 loginpage.clicklogin();

	  ClientPage clientpage=new ClientPage(driver);
	  clientpage.serachByClientNameAndID("Diya","9");
	  clientpage.clickserach();
	 
	  boolean isvalue=clientpage.istableElementisdisplayed();
	  Assert.assertTrue(isvalue,"is failed to locate");
	  }
 @Test
	  public void tabledata() {
	  Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterusernameandpassword("carol", "1q2w3e4r");
		 loginpage.clicklogin();
		
	  ClientPage clientpage=new ClientPage(driver);
	 // clientpage.serachByClientNameAndID("y","");
	 // clientpage.clickserach();
	  boolean isdatadisplayed=clientpage.istableElementisdisplayed();
	  System.out.println(isdatadisplayed);
	  Assert.assertTrue(isdatadisplayed,"is failed to identify");
  }
  @Test
  public void finddiffrentinassrt() {
	  Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterusernameandpassword("carol", "1q2w3e4r");
		 loginpage.clicklogin();
		
		  ClientPage clientpage=new ClientPage(driver);
		  clientpage.serachByClientNameAndID("Diya","9");
		  clientpage.clickserach();
		  
		  boolean isvalue=clientpage.istableElementisdisplayed();
		  System.out.println(isvalue);
		  Assert.assertTrue(isvalue,"is failed to locate");
		  
  }
  @Test
  public void searchbycolumn() {
	  Loginpage loginpage=new Loginpage(driver);
		 loginpage.enterusernameandpassword("carol", "1q2w3e4r");
		 loginpage.clicklogin();

		  ClientPage clientpage=new ClientPage(driver);
		  clientpage.serachByClientNameAndID("","");
		  clientpage.clickserach();
		  boolean isvalue=clientpage.istableElementisdisplayed();
		  Assert.assertTrue(isvalue,"is failed to locate");
  }
}
