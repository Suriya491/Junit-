package exp12;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class exp12 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suriy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String eText = "Welcome"; 		//Expected Text
		String aText_1="";			//Actual Text (Test 1)
		String aText_2="";			//Actual Text (Test 2)
		//***Using Implicit Wait***
		driver.get("file:///R:\\\\ST Lab\\sample.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//***Test 1 - Will Pass as element exists***
		try{
			aText_1 = driver.findElement(By.id("welcome")).getText();
			if (aText_1.equals(eText))
				System.out.println("Test 1 Passed using Implicit Wait");
		}
		catch (NoSuchElementException e){
			System.out.println("Test 1 Failed using Implicit Wait");
		}
		
		//***Test 2 - Will Fail after waiting for 10s as element doesn't exist****
		try{
			aText_2 = driver.findElement(By.id("abcd")).getText();
			if (aText_2.equals(eText))
				System.out.println("Test 2 Passed using Implicit Wait");
		}
		catch (NoSuchElementException e){
			System.out.println("Test 2 Failed using Implicit Wait");
		}
	}
}

