package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.JavascriptExecutor;

//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registeration {


	public static void main(String[] args) throws InterruptedException {
		// Add chrome Driver executable file in the system property 
		System.setProperty
		("webdriver.chrome.driver", "C:\\Users\\SafwatM2\\Downloads\\New folder\\chromedriver.exe");
		
		// Add new object 
		WebDriver driver = new ChromeDriver();
		
		//open Facebook URL from Chrome
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("u_0_m")).sendKeys("Michael");
				driver.findElement(By.id("u_0_o")).sendKeys("safwat");
				driver.findElement(By.id("u_0_r")).sendKeys("michaelsafwat002@gmail.com");
				driver.findElement(By.id("u_0_u")).sendKeys("michaelsafwat002@gmail.com");
				driver.findElement(By.id("u_0_w")).sendKeys("testing1"); 
		
			

		    //static drop down
		    Select s = new Select(driver.findElement(By.id("day")));
		   Thread.sleep(1000);
		    s.selectByVisibleText("20");

		    Select s1 = new Select(driver.findElement(By.id("month")));
		  Thread.sleep(1000);
		    s1.selectByValue("8");

		    Select s2 = new Select(driver.findElement(By.id("year")));
		  //  Thread.sleep(1000);
		    s2.selectByValue("1991");
		    
		  
		    ((JavascriptExecutor)driver).executeScript("scroll(0, 250)");
		    //radio button
		      driver.findElement(By.xpath("//*[@id=\"u_0_7\"]")).click();
		        
		        
		   //for sign up

		   driver.findElement(By.name("websubmit")).click();
		        
		        
			
		}
}