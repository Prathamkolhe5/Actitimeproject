package com.actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.actitime.ObjectRepository.Homepage;
import com.actitime.ObjectRepository.POM_LoginPage;

public class Baseclass 
{
	public static WebDriver driver;
	FileLibrary f = new FileLibrary();
	
	@BeforeSuite
	public void Databaseconnection()
	{
		Reporter.log("Database Connected",true);
	}
	@BeforeClass
	public void Launchthebrowser() throws IOException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String ur = f.readDataFromPropertyfile("url");
		driver.get(ur);
		Reporter.log("browser launched",true);
	}
	@BeforeMethod
	public void Login() throws IOException
	{
		POM_LoginPage pg = new POM_LoginPage(driver);
		String us = f.readDataFromPropertyfile("username");
//		driver.findElement(By.id("username")).sendKeys(us);
		String pw = f.readDataFromPropertyfile("password");
//		driver.findElement(By.id("pwd")).sendKeys(pw);
//		driver.findElement(By.xpath("//div[.='Login ']")).click();
		pg.getUntbx().sendKeys(us);
		pg.getPwtbx().sendKeys(pw);
		pg.getLgbtn().click();
		Reporter.log("Login Successfully",true);
	}
	@AfterMethod
	public void Logout()
	{
//		driver.findElement(By.id("logoutLink")).click();
		Homepage hp = new Homepage(driver);
		hp.getIdtab().click();
		Reporter.log("Logout Successfully",true);
	}
	@AfterClass
	public void Closebrowser()
	{
		driver.close();
		Reporter.log("browser closed",true);
	}
	@AfterSuite
	public void Databasedconnection()
	{
		Reporter.log("Database disconnected",true);
	}

}
