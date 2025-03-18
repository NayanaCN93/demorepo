package com.obsqura.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	
	public WebDriver driver;
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='loginform-username']") WebElement username;
	@FindBy(xpath="//input[@id='loginform-password']") WebElement password;
	@FindBy(xpath="//button[@name='login-button']") WebElement loginbutton;
	@FindBy(xpath="//h1[text()='Login']") WebElement login;
public void enterusernameandpassword(String usernamefeild,String passwordfeild) {
	
	username.sendKeys(usernamefeild);
	password.sendKeys(passwordfeild);
}
public boolean isloginisdisplayed()
{
	return login.isDisplayed();
}
	

public void clicklogin() {

	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(login));
	loginbutton.click();}
	

}
