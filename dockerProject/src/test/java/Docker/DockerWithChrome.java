package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DockerWithChrome {

	public static void main(String[] args) throws MalformedURLException {
     
	  DesiredCapabilities dc = new DesiredCapabilities();
	  
	  //dc.setCapability("browsername","chrome");
	  
	  dc.setCapability("browserName","firefox");
	  
	  URL url = new URL("http://localhost:4444");
	  
	  RemoteWebDriver driver = new RemoteWebDriver(url,dc);
	  
	 driver.get("https://hub.docker.com/r/selenium/standalone-chrome");
         System.out.println("Title of the page: " + driver.getTitle());
      
         driver.quit();
	
	}
}
