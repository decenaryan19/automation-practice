package youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testyoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Testing youtube");
		
		
//		locate path location of chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
//		create var webdriver
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		launch website
		driver.get("https://www.youtube.com/");

//		find element using Xpath
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("walang imposible sa ating diyos");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.findElement(By.xpath("//body/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-search[1]/div[1]/ytd-two-column-search-results-renderer[1]/div[1]/ytd-section-list-renderer[1]/div[2]/ytd-item-section-renderer[1]/div[3]/ytd-video-renderer[1]/div[1]")).click();
		
		 
		
		
		
	}
}
