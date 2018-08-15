
//import SOA.Select;

//import java.io.File;
//import java.io.FileInputStream;

package ztest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SeleniumBasics  
{
	public static void main(String[] args) throws InterruptedException  
	{
	
	String FN = "BDT_FN_01";
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");	
	WebDriver driver = new ChromeDriver();	
	//driver.manage().window().maximize();
	driver.get("https://scrabble-apply-now.cs23.force.com/?acctid=0016000000YlgUM");
	driver.navigate().refresh(); 
	driver.findElement(By.id("Registration:j_id118:firstname")).sendKeys(FN);
	//driver.findElement(By.id("Registration:j_id118:firstname")).sendKeys("BDT_F_101");
	Thread.sleep(5001);
	driver.close();
	}
}
	
	
	/* 
	driver.findElement(By.id("Registration:j_id118:lastname")).sendKeys("BDT_S_101");
	Select sc =new Select(driver.findElement(By.id("Registration:j_id118:countrycode")));
	sc.selectByValue("+1");
	driver.findElement(By.id("Registration:j_id118:phonenumber")).sendKeys("8768768701");     
	driver.findElement(By.id("Registration:j_id118:email")).sendKeys("BDT_SRP_101@nomail.com");
	driver.findElement(By.id("Registration:j_id118:confirmemail")).sendKeys("BDT_SRP_101@nomail.com");
	driver.findElement(By.id("Registration:j_id118:password")).sendKeys("Test4321");
	driver.findElement(By.id("Registration:j_id118:secondPassword")).sendKeys("Test4321");
	driver.findElement(By.id("Registration:j_id118:submit")).click(); 
	
	/* 
	
	
//public static void main (String[] args) throws InterruptedException
	/* driver.get("http://www.google.com");
	//Thread.sleep(20001);
	driver.navigate().back(); 
	Thread.sleep(20001);

	
	driver.navigate().forward();  
	Thread.sleep(20001);
	
	driver.navigate().refresh(); */

