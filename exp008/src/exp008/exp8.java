package exp008;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class exp8 {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suriy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/suriy/Downloads/sample1.html");
		
		driver.findElement(By.name("username")).sendKeys("rahulmd");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
	}	
}