package ztest;


import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;

//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;

//import jxl.read.biff.BiffException;

//import jxl.read.biff.BiffException;

public class FwdEmailLead {


		public static void main(String[] args) throws InterruptedException, IOException
		
	{
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			driver.get("https://na62.salesforce.com");	    
			driver.findElement(By.id("username")).sendKeys("ramesh.raja@deltak-innovation.com	");
			driver.findElement(By.id("password")).sendKeys("July5432");
			driver.findElement(By.name("Login")).submit();
			Thread.sleep(9000);
			
			
			driver.findElement(By.xpath("//*[@id=\"j_id0:j_id2:theForm:j_id168\"]/input")).click();
			
			//Enter the Support Case URL
			driver.get("https://na62.salesforce.com/02s0e000018LIlr");	    					     
		
		driver.findElement(By.name("forward")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.id("p24")).click();
		driver.findElement(By.id("p24")).sendKeys("lead_converter@6-2tzhxu586b666s1v5ljn03p4707q82cjqg0ma654ccixqgnp58.6-jelkea4.na62.apex.salesforce.com");
		Thread.sleep(2000);

		driver.findElement(By.name("send")).click();
		Thread.sleep(1000);
		
	 	
	}
}
