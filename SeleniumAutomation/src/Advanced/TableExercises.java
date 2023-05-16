package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/66446/gt-vs-srh-62nd-match-indian-premier-league-2023");
	    
		WebElement Table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	    int RowCount = Table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
	    int count = Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	    
	    for(int i =0; i<count; i++)
	    {
	    	System.out.println(Table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-chilld(3)")).get(i).getText());
	    }
	    
	  }
}
