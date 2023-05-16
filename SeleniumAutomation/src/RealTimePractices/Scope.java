package RealTimePractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Give the count of links on the page
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		  
		driver.get("https://www.programming-hero.com/");
	    
		System.out.println("Total Links in the Page: "+ driver.findElements(By.tagName("a")).size());		
	
	    //Give the count of links present in the footer section
		WebElement footerdriver = driver.findElement(By.xpath("//footer[@class='footer-area']"));//Limiting webdriver scope
		System.out.println("Total Links in Footer: "+footerdriver.findElements(By.tagName("a")).size());
	
	    WebElement coloumndriver = footerdriver.findElement(By.xpath("//body[@data-aos-easing='ease']/footer[@class='footer-area']/div[@class='container pt-5 mt-3']/div[@class='row']/div[2]"));
	    System.out.println("Total Links in the 1st coloumn of Footer: "+coloumndriver.findElements(By.tagName("a")).size());
	
	   //Click on each link in the coloumn and check if the pages are opening
	   for(int i=1; i<coloumndriver.findElements(By.tagName("a")).size(); i++) {
		   coloumndriver.findElements(By.tagName("a")).get(i).click(); 
	   }
	}

}
