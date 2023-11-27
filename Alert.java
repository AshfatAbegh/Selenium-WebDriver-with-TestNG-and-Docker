package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://nxtgenaiacademy.com/alertandpopup/");
			driver.manage().window().maximize();
			driver.findElement(By.name("alertbox")).click();
			Thread.sleep(3000);
			
			String alertMessage = driver.switchTo().alert().getText();
			System.out.println(alertMessage);
			Thread.sleep(3000);
			
			if(alertMessage.contentEquals("I am an alert box!")) {
				driver.switchTo().alert().accept();
				System.out.println("Correct Alert Appeared..");
			}
			else {
				 System.out.println("Invalid Alert"); 
		    	 driver.close();
			}
	}

}
