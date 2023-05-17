package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.out.println("Testing ebay");
				
				
//				locate path location of chromedriver
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				
//				create var webdriver
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
//				launch website
				driver.get("https://www.ebay.com/");

//		 
				driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("mobile");
				
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

				
				String at = driver.getTitle();
				String et = "mobile for sale | eBay";
				
				driver.close();
				
				if (at.equalsIgnoreCase(et)) {
					System.out.println("TESTING success");
				}else {
					System.out.println("TESTING failed");
				}
				
				
				
				
	}

}
