package test;


import java.io.File;
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

//import jxl.read.biff.BiffException;

//import jxl.read.biff.BiffException;

public class TempWork {


		public static void main(String[] args) throws InterruptedIOException, InterruptedException
		
	{
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			driver.get("https://cs23.salesforce.com");	    
			driver.findElement(By.id("username")).sendKeys("automation@scrabble.com");
			driver.findElement(By.id("password")).sendKeys("Auto1234");
			driver.findElement(By.name("Login")).submit();
						   System.out.println("automation@scrabble.com login Completed");
						   Thread.sleep(2000);
						  //loginFlag=true;
						  Thread.sleep(9000);
						// exec123();
						  WebElement element = driver.findElement(By.id("phSearchInput"));
								  element.sendKeys("Aaron Yurkiewicz");
								  element.submit();
								   Thread.sleep(2000);
						  
								  driver.findElement(By.linkText("Aaron Yurkiewicz")).click();
						 /* driver.findElement(By.id("phSearchInput")).click();
						  
						  driver.findElement(By.id("User")).click();
						  driver.findElement(By.("a[@href ='/00560000001Vidh?srPos=0&srKp=005']")).click();
						  */
								  Thread.sleep(2000);
								  
								  driver.findElement(By.id("chatterTab")).click();
								  Thread.sleep(2000);
						
								  driver.findElement(By.id("moderatorMutton")).click();
								  Thread.sleep(2000);
								  driver.findElement(By.id("USER_DETAIL")).click();
								  
								  
								  System.out.println("***Aaron login Completed");
								  Thread.sleep(2000);
						     
		
		driver.findElement(By.name("login")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.id("01r60000000UJl4_Tab")).click();
		Thread.sleep(2000);
		
		//driver.findElement(("00B60000005kiXl_topNav")).click();
		//Thread.sleep(6000);
		
		
		driver.findElement(By.name("go")).click(); 
		Thread.sleep(2000);
		
		driver.findElement(By.id("00B60000005kiXl_listButtons")).click(); 
		Thread.sleep(2000);
		
		//driver.findElement(By.id("new")).click();
		//Thread.sleep(4000);
		
		driver.findElement(By.id("ep")).click();
		Thread.sleep(2000);
		System.out.println("***lya");
		/* Giving Mass Upload Name */
		
		driver.findElement(By.id("Name")).sendKeys("Mass_Upload_Automation_03");
		Thread.sleep(2000);

		driver.findElement(By.name("save")).click();
		Thread.sleep(2000);
		
	 driver.findElement(By.name("attachFile")).click();
	 Thread.sleep(2000);
	 
	 WebElement uploadElement = driver.findElement(By.id("file"));
	 uploadElement.sendKeys("file:///Users/ramesh.raja/eclipse-workspace/SRPQA/File/Mass_Upload_Auto_01.xls");
	    Thread.sleep(2000);
	 
	    driver.findElement(By.id("Attach")).click();
		System.out.println("Attach");         
		Thread.sleep(2000);
	 
		
		driver.findElement(By.name("cancel")).click();
		Thread.sleep(5000);

		
		//driver.findElement(By.name("srp_upload_attachment")).click();
		
		Thread.sleep(4000);
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
		 Thread.sleep(4000);
		driver.navigate().refresh();
		 Thread.sleep(4000);
		 driver.navigate().refresh();
		 Thread.sleep(4000);

		driver.findElement(By.id("Opportunity_Tab")).click();
		
		
	}
}
