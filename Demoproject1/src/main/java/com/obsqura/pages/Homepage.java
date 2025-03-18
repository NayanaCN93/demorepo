package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@class='dropdown-toggle']")WebElement usericon;
	@FindBy(xpath="//a[@class='logout-btn']") WebElement logoutbutton;
	@FindBy(xpath="//h1[text()='Login']") WebElement logintitle;
	
	public void clickOnUsericon() {
		usericon.click();
		
	}
	public void clickOnLogout() {
		
		logoutbutton.click();
		
	}
	/*public boolean isloginisdisplayed()
	{
		return logintitle.isDisplayed();
	}*/
		

}
