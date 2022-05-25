package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {
	public browser() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main/");
		driver.manage().window().maximize();
		//find username and type value in textbox
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String text = driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	driver.findElement(By.linkText("CRM/SFA")).click();
	String title = driver.getTitle();
	System.out.println(title);
	String link = driver.getTitle();
	System.out.println(link);
	
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MARY");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("MARY");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms.");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SOFTWARE TESTER");
	driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("500000");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("AKSHAYA");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("AKSHAYA");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2000");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	driver.findElement(By.name("submitButton")).click();
	//driver.close();
	}
	

}
