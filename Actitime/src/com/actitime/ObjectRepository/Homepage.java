package com.actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	//declaration
	@FindBy(xpath = "//div[text()='Tasks']")
	private WebElement tasktab;
	@FindBy(xpath = "//div[text()='Reports']")
	private WebElement reporttab;
	@FindBy(xpath = "//div[text()='Users']")
	private WebElement usertab;
	@FindBy(id = "logoutLink")
	private WebElement idlnk;
	
	//initialization
	public Homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//utilization
	public WebElement getTasktab() {
		return tasktab;
	}

	public WebElement getReporttab() {
		return reporttab;
	}

	public WebElement getUsertab() {
		return usertab;
	}

	public WebElement getIdtab() {
		return idlnk;
	}
	
	
}
