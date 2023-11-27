package Test;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			Thread.sleep(2000);
			try {
			driver.switchTo().alert().accept();
			}
			catch(NoAlertPresentException E) {
				E.printStackTrace();
   		    }  
	}

}
