package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	public WebDriver driver;
	public ClientPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Clients']") WebElement clients;
	@FindBy(xpath="//input[@id='clientsearch-client_name']") WebElement clientnameField;
	@FindBy(xpath="//input[@id='clientsearch-id']") WebElement clientIDField;
	@FindBy(xpath="//button[@class='btn btn-primary']") WebElement serachbutton;
	@FindBy(xpath="//table[@class='table table-striped table-bordered']/tbody/tr/td[2]")WebElement value;
	
	public boolean istableElementisdisplayed() {
		//clients.click();
		return value.isDisplayed();
	}
	

	public void serachByClientNameAndID(String clientname,String ID) {
		clients.click();
		clientnameField.sendKeys(clientname);
		clientIDField.sendKeys(ID);
		
		
	}
	public void clickserach() {
		serachbutton.click();
	}
	
}



