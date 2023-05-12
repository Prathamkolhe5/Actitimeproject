package com.actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LoginPage 
{
	//decleration
	@FindBy(id = "username")
	private WebElement untbx;
	@FindBy(name = "pwd")
	private WebElement pwtbx;
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lgbtn;
	
	
	//Initialization
	public POM_LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getUntbx() {
		return untbx;
	}


	public WebElement getPwtbx() {
		return pwtbx;
	}


	public WebElement getLgbtn() {
		return lgbtn;
	}
		
	

}
