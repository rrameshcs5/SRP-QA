package ztest;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {
	
public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	
	{

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://accounts.google.com/signin");	    
	driver.findElement(By.id("identifierId")).sendKeys("trip.photo.request@gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2248754382");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ENTER);
	
	
	

}

}
