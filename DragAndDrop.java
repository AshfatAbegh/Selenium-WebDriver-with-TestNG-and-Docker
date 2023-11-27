package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		   
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://jqueryui.com/droppable/");
		   
		   driver.findElement(By.tagName("iframe"));
	          driver.switchTo().frame(0);
	          Thread.sleep(1000);
	          
	          
	          WebElement src = driver.findElement(By.id("draggable"));
	          
	          WebElement tgt = driver.findElement(By.id("droppable"));
	          
	          Actions action = new Actions(driver);
	          Thread.sleep(3000);
	          action.dragAndDrop(src, tgt).build().perform();
              Thread.sleep(3000);
              driver.quit();
	}          
}
