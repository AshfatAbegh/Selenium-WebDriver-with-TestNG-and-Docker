package Advanced;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		 System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://www.google.com.bd/?hl=bn");

		  driver.findElement(By.name("q")).sendKeys("java download");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//a[contains(text(),'Download Java for Windows')]")).click();
		  Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("//h3[contains(text(),'Java Downloads - Oracle')]")).click();
		  Thread.sleep(2000);
		  
		  Robot r = new Robot();
		  
		  r.keyPress(KeyEvent.VK_TAB);//keypress and keyevent(static) are method for robot class 
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyPress(KeyEvent.VK_ENTER);
	}

}
