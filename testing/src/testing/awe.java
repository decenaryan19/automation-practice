package testing;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class awe {

	public static void main(String[] args) {

        System.out.println("TESTING...");
        
        // locate the chromedriver
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\chromedriver.exe");
        
        
            // Instantiate a ChromeDriver class.
            WebDriver driver = new ChromeDriver();
        
            // Maximize the browser
            driver.manage().window().maximize();
        
            // Launch Website
            driver.get("https://www.geeksforgeeks.org/");

	}

}
