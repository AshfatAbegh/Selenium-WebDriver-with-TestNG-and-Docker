package Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {

	public static void main(String[] args) throws AWTException {
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://jobs.bdjobs.com/jobsearch.asp?fcatId=5&icatId=");
          Robot r = new Robot(); 
          
          driver.findElement(By.id("input_resumeParser")).click();
          r.setAutoDelay(1000);
          
          StringSelection ss = new StringSelection("D:\\Read.txt");//equivalent to cntrl+c
	      
          Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//equivalent to cntrl+c	
          
          
          r.keyPress(KeyEvent.VK_CONTROL);//equivalent to cntrl+v
          r.keyPress(KeyEvent.VK_V);
          
          r.keyRelease(KeyEvent.VK_CONTROL);
          r.keyRelease(KeyEvent.VK_V);
          
          r.keyPress(KeyEvent.VK_ENTER);
          r.keyRelease(KeyEvent.VK_ENTER);
	}

}
