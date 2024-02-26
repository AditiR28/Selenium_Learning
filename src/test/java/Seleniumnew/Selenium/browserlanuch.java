package Seleniumnew.Selenium;

import org.openqa.selenium.WebDriver.Window;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class browserlanuch {
	ChromeDriver driver ;
	@Before
	public void  before(){
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op = driver.manage(); // Options reference variable
		// Options variable is used to manage 
		Window w = op.window(); // maximize window refernce variable 
		w.maximize(); //this command is used to maximize window browse
		
	}
	
	@After
	public void closure() {
		driver.close();
		
	}
	@Test
	public  void tc ()throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Aditi\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		//ChromeOptions co = new ChromeOptions();
		//co.setBinary("C:\\Users\\Aditi\\Downloads\\chrome-win32\\chrome-win32\\chrome.exe");
		
		//login method
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("xyz@abc.com");
		WebElement userpass = driver.findElement(By.xpath("//input[@name='pass']"));
		userpass.sendKeys("abc334");
		// drop down handling code
				Actions ac = new Actions(driver);
				for (int i = 0;i<5;i=i+1 );
				{
					ac.sendKeys(Keys.TAB).perform();
					Thread.sleep(2000);
				}
		
		//create new account script
		WebElement createaccount = driver.findElement(By.linkText("Create new account"));
		createaccount.click();
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Aditi");
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		lastname.sendKeys("Rajput");
		WebElement email = driver.findElement(By.xpath("//input[@*='reg_email__']"));
		email.sendKeys("aditi.singh@abc.com");
		WebElement email2 = driver.findElement(By.xpath("//input[@*='reg_email_confirmation__']"));
		email2.sendKeys("aditi.singh@abc.com");
		WebElement password = driver.findElement(By.xpath("//input[@id = 'password_step_input']"));
		password.sendKeys("Ashi@2804");
		WebElement daydrop = driver.findElement(By.id("day"));
		Select s  = new Select(daydrop);
		s.selectByVisibleText("28"); //select visible text
		WebElement monthdrop = driver.findElement(By.id("month"));
		Select m  = new Select(monthdrop);
		m.selectByIndex(3); // select index value dropdown
		WebElement yeardrop = driver.findElement(By.id("year"));
		Select n  = new Select(yeardrop);
		n.selectByValue("1999"); //select value
		WebElement gender = driver.findElement(By.xpath("//input[@name = 'sex']"));
		gender.click();
		
		//WebElement signup = driver.findElement(By.name("websubmit"));
		//signup.click();		
		
	}

}
