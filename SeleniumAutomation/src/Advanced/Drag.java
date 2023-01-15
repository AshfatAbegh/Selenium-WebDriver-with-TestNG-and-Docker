package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://jqueryui.com/droppable/");
		  
		  Actions act = new Actions(driver);
		  
		  driver.findElement(By.tagName("iframe"));
          driver.switchTo().frame(0);
          Thread.sleep(1000);
          
         WebElement src = driver.findElement(By.id("draggable"));
         
         WebElement tgt = driver.findElement(By.id("droppable"));
	
	     act.dragAndDrop(src, tgt).perform();
	     
	     //==========================
	     if(tgt.getText().matches("Dropped!"))
	     {
	    	System.out.println("Successfully Dropped");
	     }
	     else
	     {
	    	System.out.println("Failed");
	     }
	}

}
