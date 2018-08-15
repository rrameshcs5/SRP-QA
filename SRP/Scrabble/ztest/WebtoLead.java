package ztest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebtoLead
	{
	public static void main(String[] args) throws InterruptedException
	{		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");	
		WebDriver driver = new ChromeDriver();	
		driver.get("file:///Users/ramesh.raja/Documents/00_Work/Selenium/WebtoLead_Code/Scrabble_WebtoLead_Purdue.html");	
		
		driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
	    String fn = "Selenium_FN_02";
	    String ln = "Selenium_FN_02";
	    String email = "Selenium_email_02@nomail.com";
	    String mobile = "9879871001";
	    
		driver.findElement(By.id("first_name")).click();
        driver.findElement(By.id("first_name")).sendKeys(fn);
        driver.findElement(By.id("first_name")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("last_name")).click();
        driver.findElement(By.id("last_name")).sendKeys(ln);
        driver.findElement(By.id("last_name")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("email")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("company")).click();
        driver.findElement(By.id("company")).sendKeys("Selenium_com");
        driver.findElement(By.id("company")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("city")).click();
        driver.findElement(By.id("city")).sendKeys("Selnium_OAKBROOK");
        driver.findElement(By.id("city")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("state")).click();
        driver.findElement(By.id("state")).sendKeys("IL");
        driver.findElement(By.id("state")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("country")).click();
        driver.findElement(By.id("country")).sendKeys("USA");
        driver.findElement(By.id("country")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("zip")).click();
        driver.findElement(By.id("zip")).sendKeys("60173");
        driver.findElement(By.id("zip")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.id("phone")).click();
        driver.findElement(By.id("phone")).sendKeys(mobile);
        driver.findElement(By.id("phone")).click();
        Thread.sleep(1000);
        
        Select dropdownview= new Select( driver.findElement(By.name("00N60000002aLTY")));
        dropdownview.selectByValue("Purdue University");
        
        Select dropdownview2= new Select( driver.findElement(By.name("00N60000002aLTZ")));
        dropdownview2.selectByValue("PRD | MSEd");
        
        Select dropdownview3= new Select( driver.findElement(By.name("00N60000002aLTf")));
        dropdownview3.selectByValue("PRD | MSEd-LDT");
        Thread.sleep(1000);
        
        driver.findElement(By.id("00N60000002aRvB")).click();
        driver.findElement(By.id("00N60000002aRvB")).sendKeys("Yahoo");
        driver.findElement(By.id("00N60000002aRvB")).click();
        
        Thread.sleep(5001);
        //driver.findElement(By.name("submit")).submit();
        
		//driver.close();
}
}