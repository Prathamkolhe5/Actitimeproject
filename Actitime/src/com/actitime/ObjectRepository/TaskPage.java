package com.actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage 
{
	//Declaration
	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewbtn;
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcusbtn;
	@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement nametxt;
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement desptxt;
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	//Initialization
	public TaskPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}

	//utilization
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcusbtn() {
		return newcusbtn;
	}

	public WebElement getNametxt() {
		return nametxt;
	}

	public WebElement getDesptxt() {
		return desptxt;
	}

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	

}
