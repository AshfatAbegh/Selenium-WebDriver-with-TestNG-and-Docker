package General;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://www.facebook.com/");
		  
		  //========Data Driven Testing - Using external data in an application
		  WebElement Unm = driver.findElement(By.id("email"));
		  WebElement Pwd = driver.findElement(By.id("pass"));
		  
		  //Reading the excel file
		
	   Workbook wb = Workbook.getWorkbook(new File("D:\\Book1.xls"));
	   
	   Sheet sh = wb.getSheet("Sheet1");
	   
	   for(int i=1; i<sh.getRows(); i++)
	   {
		  
		   //System.out.println("UName: " +sh.getCell(0, i).getContents());
		   //System.out.println("Password: " +sh.getCell(1, i).getContents());
		   
		   Unm.sendKeys(sh.getCell(0, i).getContents());
		   Pwd.sendKeys(sh.getCell(1, i).getContents());
		   
		   Thread.sleep(2000);
		   
		   Pwd.clear();
		   Unm.clear();
	   }
	}

}
