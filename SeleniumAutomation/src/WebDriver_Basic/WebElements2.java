package WebDriver_Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		  WebDriver driver = new FirefoxDriver();
		  
		  driver.get("https://ema-john-react-website-project.netlify.app/");
		 
		  //=============Add To Cart Button Testing============== 
		  WebElement Cart1 = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='shop-container']/div[@class='product-container']/div[1]/div[2]/button[1]"));
		  Cart1.click();
		  Thread.sleep(3000);
		  
		  WebElement Cart2 = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='shop-container']/div[@class='product-container']/div[2]/div[2]/button[1]"));
		  Cart2.click();
		  Thread.sleep(3000);
		  
		  //=============Confirm Order Button Testing=============
		  WebElement ConfirmOrder = driver.findElement(By.xpath("//button[@class='orderClass main-btn']"));
		  ConfirmOrder.click();
		  Thread.sleep(3000);
		  
		  //=============Remove Order Button Testing===============
		  WebElement RemoveOrder = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='shop-container']/div[@class='product-container']/div[1]/button[1]"));
		  RemoveOrder.click();
		  Thread.sleep(3000);
		  
		  //===========Proceed Checkout Button Testing=============
		  WebElement Checkout = driver.findElement(By.xpath("//button[contains(text(),'Proceed CheckOut')]"));
		  Checkout.click();
		  Thread.sleep(3000);
	}

}
