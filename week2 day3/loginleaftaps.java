package week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginleaftaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();

				//login using xpath command
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

				//crmsfa login
				driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
				 driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
			       driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
			       driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("VIPRO");
			       driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("AKSHAYA");
			       

	}
			

		}
		
		

	


