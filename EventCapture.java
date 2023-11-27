package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventCapture {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		   
		   WebDriver driver = new ChromeDriver();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);//Registering With EventFiring WebDriver
		   EventCapture eCapture = new EventCapture();
		   eventHandler.register((WebDriverEventListener) eCapture);//Register method allows us to register our implementation of WebDriverListener to listen 
		   eventHandler.navigate().to("https://www.edureka.co/");
		   js.executeScript("window.scrollBy(0, 900)");
		   Thread.sleep(3000);
		   eventHandler.findElement(By.xpath("//a[contains(text(),'Software Testing')]"));
		   eventHandler.navigate().to("https://www.edureka.co/masters-program/devops-engineer-training");
		   eventHandler.navigate().back();
		   eventHandler.quit();
		   
		   //Unregister allows us to detach
		   eventHandler.unregister((WebDriverEventListener) eCapture);
		   System.out.println("End of Listeners Class");
		   
	}

}
