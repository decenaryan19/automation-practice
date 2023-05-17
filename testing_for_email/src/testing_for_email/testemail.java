package testing_for_email;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testemail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Testing email");
		
		
//		locate path location of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
//		create var webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		launch website
		driver.get("https://www.facebook.com/");

//		insert text using id
		driver.findElement(By.id("email")).sendKeys("yangzxc019@gmail.com");
//		insert text using id
		driver.findElement(By.id("pass")).sendKeys("ewa.com");
		
		Thread.sleep(2000);
		
//		click button using class name
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		
		String at = driver.getTitle();
		String et = "facebook";
		
		driver.close();
		
		if (at.equalsIgnoreCase(et)) {
			System.out.println("TESTING success");
		}else {
			System.out.println("TESTING failed");
		}
		
		
	}

}
