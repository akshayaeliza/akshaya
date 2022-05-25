package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class dropdown {
	
	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://www.leafground.com/pages/Dropdown.html");
			driver.manage().window().maximize();		
	        WebElement eledropdown1=driver.findElement(By.id("dropdown1"));
	        Select dd=new Select(eledropdown1);
	        dd.selectByIndex(1);
	        dd.selectByVisibleText("Appium");
	        dd.selectByValue("3");
	        
		}

	}
	
		
		
	
	
	

	


