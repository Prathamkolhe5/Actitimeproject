package com.actitime.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is the generic library class which contains all the generic methods.
 * @author Prathamesh
 *
 */
public class FileLibrary 
{
	/**
	 * This is a generic method which is use to read the data from property file.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String readDataFromPropertyfile(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./Testdata/commandata.property");
		Properties p = new Properties();
		p.load(fis);
		String val = p.getProperty(key);
		return val;
	}
	/**
	 * This method is a generic method which is used to read the data from excel sheet.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String readDataFromExcel(String sheetname, int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fi = new FileInputStream("./Testdata/TESTDATA.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		String va = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return va;
	}

}
