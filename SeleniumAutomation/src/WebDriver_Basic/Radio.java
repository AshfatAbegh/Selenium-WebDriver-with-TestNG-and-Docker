package WebDriver_Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Radio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://www.keynotesupport.com/internet/web-contact-form-example-radio-buttons.shtml");
	
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
