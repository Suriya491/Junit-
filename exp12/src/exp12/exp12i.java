package exp12;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class exp12i {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suriy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String eText = "Welcome";	 	//Expected Text
		String aText_1="";			//Actual Text (Test 1)
		String aText_2="";			//Actual Text (Test 2)
		
		//***Using Explicit Wait***
		driver.get("C:\\Users\\suriy\\Downloads\\pg12.html");
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120,1));
		//***Test 1 - Will Pass as element exists***
		try{
			WebElement text_1 =
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome")));
			aText_1 = text_1.getText();
			if (aText_1.equals(eText))
				System.out.println("Test 1 Passed using Explicit Wait");
		}
		catch (TimeoutException e){
			System.out.println("Test 1 Failed using Explicit Wait");
		}
		
		//***Test 2 - Will Fail after waiting for 10s as element doesn't exist****
		try{
			WebElement text_2 = 
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("abcd")));
			aText_2 = text_2.getText();
			if (aText_2.equals(eText))
				System.out.println("Test 2 Passed using Explicit Wait");
		}
		catch (TimeoutException e){
			System.out.println("Test 2 Failed using Explicit Wait");
		}
	}
}
