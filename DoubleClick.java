package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/");
		  
		  Actions act = new Actions(driver);
		  
		  WebElement signin = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
        
		  //act.moveToElement(signin).doubleClick().build().perform();
	      // act.doubleClick(signin).build().perform();
		  
		  ///act.moveToElement(signin).contextClick().build().perform();	
		  act.contextClick(signin).perform();
	}

}
