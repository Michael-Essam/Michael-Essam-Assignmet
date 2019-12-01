package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
		
		 
		public static void main(String[] args) {
			// Add chrome Driver executable file in the system property 
			System.setProperty
			("webdriver.chrome.driver", "C:\\Users\\SafwatM2\\Downloads\\New folder\\chromedriver.exe");
			
			// Add new object 
			WebDriver driver = new ChromeDriver();
			
			//open google URL from Chrome
			driver.navigate().to("http://www.facebook.com");
			driver.manage().window().maximize();
			
			
			//inspect elements
			driver.findElement(By.id("email")).sendKeys("michaelsafwat002@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("testing1");
			driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
			
	}

}
