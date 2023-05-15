
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
  
public class App {  
  
    public static void main(String[] args) {  
      
        // System Property for Chrome Driver   
        System.setProperty("web.chrome.driver", "C:\\chromedriver.exe");
        
             // Instantiate a ChromeDriver class.     
        WebDriver driver = new ChromeDriver();  
          
           // Launch Website  
        driver.get("https://www.google.com/");
          
   
  
    }  
  
}  