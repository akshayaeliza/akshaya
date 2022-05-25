package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//create a new account
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
	    driver.findElement(By.name("firstname")).sendKeys("Akshaya");
	    driver.findElement(By.name("lastname")).sendKeys("Edward");
	    driver.findElement(By.name("reg_email__")).sendKeys("akshayaedward97@gmail.com");
	    driver.findElement(By.id("password_step_input")).sendKeys("akshaya@1212");
	    //for selecting the date
	    WebElement DateDropdown = driver.findElement(By.id("birthday_day"));
	    Select obj1=new Select(DateDropdown);
        obj1.selectByValue("12");
	    //for selecting the month
	    WebElement MonthDropdown = driver.findElement(By.name("birthday_month"));
	    Select obj2=new Select(MonthDropdown);
		obj2.selectByValue("12");
	    //for selecting the year
	    WebElement YearDropdown = driver.findElement(By.id("birthday_year"));
	    Select obj3=new Select(YearDropdown);
		obj3.selectByValue("1997");
	    //for selecting the gender
	    driver.findElement(By.name("sex")).click();
	    driver.findElement(By.name("websubmit")).click();

		//driver.close();
	
	 
	    
	    

	    
	    
	    
	    
	    
	    
	    

	    

	    
	 
	    
		
		
	}

	}


