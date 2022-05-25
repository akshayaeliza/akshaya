package week2.day3;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;;


public class BrowserCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("http://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().forward();

	}
}

