package git5paisa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FivePaisa {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();  
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.navigate().to("https://login.5paisa.com/");
	Thread.sleep(5000);
	driver.close();
}
}
