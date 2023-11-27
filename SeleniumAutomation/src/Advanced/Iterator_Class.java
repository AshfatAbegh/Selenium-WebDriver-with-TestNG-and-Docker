package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iterator_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/ashfatrashid/Downloads/Selenium Chrome Driver/chromedriver");
		   
		   WebDriver driver = new ChromeDriver();
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   driver.get("https://www.edureka.co/");
		   String mainweb = driver.getWindowHandle();
	       driver.findElement(By.xpath("//header/nav[1]/div[2]/a[1]/img[1]")).sendKeys(Keys.SHIFT,Keys.ENTER);
	       Thread.sleep(2000);
	       js.executeScript("window.scrollBy(0,400)");
	       Thread.sleep(2000);
	       Set<String> set = driver.getWindowHandles();
	       System.out.println(set);
	       Iterator<String> itr = set.iterator();
	       while(itr.hasNext()) {
	    	   js.executeScript("window.scrollBy(0,400)");
	    	   String child = itr.next();
	    	   if(!mainweb.equals(child)) {
	    		   driver.switchTo().window(child);
	    		   System.out.println(driver.switchTo().window(child).getTitle());
	    		   driver.close();
	    	   }
	       }
	       driver.switchTo().window(mainweb);
	}

}
