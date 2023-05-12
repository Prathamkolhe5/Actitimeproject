package com.actitime.TestScripts4;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.GenericLibrary.Baseclass;
import com.actitime.GenericLibrary.FileLibrary;
import com.actitime.ObjectRepository.Homepage;
import com.actitime.ObjectRepository.TaskPage;

public class Task extends Baseclass
{
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException
	{
		Homepage hp = new Homepage(driver);
		hp.getTasktab().click();
		TaskPage tp = new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcusbtn().click();
		FileLibrary f = new FileLibrary();
		String createcustomer = f.readDataFromExcel("Sheet1", 1, 1);
		tp.getNametxt().sendKeys(createcustomer);
		FileLibrary fe = new FileLibrary();
		String see = fe.readDataFromExcel("Sheet1", 1, 2);
		tp.getDesptxt().sendKeys(see);
		tp.getCreatebtn().click();
		String expectedresult = createcustomer;
		String actualresult = driver.findElement(By.xpath("(//div[.='"+createcustomer+"'])[2]")).getText();
		Reporter.log(actualresult);
		SoftAssert st = new SoftAssert();
		st.assertEquals(actualresult, expectedresult);
		st.assertAll();
	}
}
