package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.amazon.com/");
		  
		  Actions act = new Actions(driver);
		  
		  WebElement signin = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
          
		  //act.moveToElement(signin).doubleClick().build().perform();
	      // act.doubleClick(signin).build().perform();
		  
		  ///act.moveToElement(signin).contextClick().build().perform();	
		  act.contextClick(signin).perform();
		  
	}

}
