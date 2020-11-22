package com.redbus;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pages.LoginPage;

@Listeners(ListnerTestng.class)
public class LoginTest extends BaseClass {
	    
	    
	XSSFWorkbook Workbook;
    XSSFSheet sheet1;
    
    @BeforeTest
    public void fetchdata() throws IOException {
        
        System.out.println("WORKS");
    	FileInputStream fis = new FileInputStream("exceldata.xlsx");
    	System.out.println("WORKS READ");
        Workbook = new XSSFWorkbook(fis);
        System.out.println("WORKS OPEN");
        sheet1 = Workbook.getSheetAt(0);  
        System.out.println("WORKS GOT");
        
        
    }       
	        
	@Test
	public void login() {
	       
		System.out.println("WORKS METHOD");
	   LoginPage loginpage = new LoginPage(driver);
	   String MobileNo =  sheet1.getRow(0).getCell(0).getStringCellValue();
	   loginpage.LogintoApp(MobileNo);
	        
	        
	    }

	    
	    
	}


