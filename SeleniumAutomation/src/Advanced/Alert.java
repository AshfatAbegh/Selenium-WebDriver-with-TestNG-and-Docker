package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  driver.get("https://ksrtc.in/oprs-web/");

		  driver.findElement(By.xpath("//button[contains(text(),'Search for Bus')]")).click();
	      Thread.sleep(2000);
	      
	      String txt = driver.switchTo().alert().getText();
	      System.out.println(txt);
	      
	      
	      if(txt.contentEquals("Please select start place.")) 
	      {
	    	  driver.switchTo().alert().accept();
	    	  System.out.println("Correct Alert Appeared...");
	      }
	      else
	      {
	    	  System.out.println("Invalid Alert"); 
	    	  driver.close();
	      }
	}
}
