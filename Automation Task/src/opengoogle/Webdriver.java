package opengoogle;

import org.openqa.selenium.WebDriver ;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

   
	public static void main(String[] args) {
		// Add chrome Driver executable file in the system property 
		System.setProperty
		("webdriver.chrome.driver", "C:\\Users\\SafwatM2\\Downloads\\New folder\\chromedriver.exe");
		
		// Add new object 
		WebDriver driver = new ChromeDriver();
		
		//open google URL from Chrome
		driver.navigate().to("http://www.google.com");
		
	// close driver
		driver.quit();
	}

}
