package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HomePage {
 public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","/home/ashfatrashid/Downloads/Selenium Chrome Driver/chrome-linux64/chrome");
   
   WebDriver driver = new ChromeDriver();
      
         String baseUrl = "https://www.sheba.xyz/";
         driver.get(baseUrl);
         String actualTitle = "";
         String expectedTitle = "Get Expert Professional Services at Home in Bangladesh | Sheba.xyz";
         actualTitle = driver.getTitle();
         
         
         if (actualTitle.contentEquals(expectedTitle)){
             System.out.println("Test Passed!");
         } else {
             System.out.println("Test Failed");
         }
        
     }

 }
