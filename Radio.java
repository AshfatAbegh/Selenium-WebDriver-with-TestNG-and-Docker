package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollBy(0, 1500)");
		  Thread.sleep(2000);
		  
	      List <WebElement> software = driver.findElements(By.name("software"));
	      int cnt = software.size();
	      System.out.println(cnt);
	      
	      //==================================
	      
	      for(int i=0; i<cnt; i++)
	      {
	    	  String txt = software.get(i).getText();
	    	  System.out.println(txt);
	    	  software.get(i).click();
	    	  Thread.sleep(2000);
	      }
	}

}
