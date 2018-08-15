package srpNewInq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import w2L.LoginW2L;


public class AffiliationUpd 
{
	WebDriver driver;
	
	public AffiliationUpd(WebDriver driverFromMain) 
	{
		driver = driverFromMain;
	}
	
	public void Affiliation () throws InterruptedException 
	{
		
	Thread.sleep(1000);
	
	driver.findElement(By.id("CF00N60000002aLWE_ileinner")).click();
	Thread.sleep(1000);
	
	Select gender= new Select (driver.findElement(By.id("00N60000002aLOl_ileinner")));
	gender.selectByIndex(2);
	
	driver.findElement(By.id("00N60000002aLOf_ileinner")).click();
	Select employ= new Select (driver.findElement(By.id("00N60000002aLOf_ileinner")));
	gender.selectByIndex(3);
	
	driver.findElement(By.id("00N60000002aLOe_ileinner")).click();
	driver.findElement(By.id("00N60000002aLOe_ileinner")).sendKeys("WES");	
	
	driver.findElement(By.id("00N60000002aLOu_ileinner")).click();
	driver.findElement(By.id("00N60000002aLOu_ileinner")).sendKeys("Automation");	
}
}

