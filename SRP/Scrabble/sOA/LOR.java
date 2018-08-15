package sOA;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LOR {
	
	String arr[]=UUID.randomUUID().toString().split("-");
	String refname = "Refname_"+new Random().nextInt(85);
	String ln = "ln_"+new Random().nextInt(85);
	String email = "srp_help_"+arr[3]+"@nomail.com";
	String zip = "60174";
	Random rand = new Random();
	long drand = (long)(rand.nextDouble()*10000000000L);
	String mobile = Long.toString(drand);
	
	WebDriver driver;
	
	public LOR(WebDriver driverFromMain) 
	{
		driver = driverFromMain;
	}
    
	
	public void LorUpd() throws InterruptedException, AWTException, IOException
	
	{
		
	
	driver.get("https://scrabble-apply-now.cs47.force.com/apex/deltaksrp__srpreferenceform?rId=a2B2a0000009xoE&acctid=0016000000YlgUM");
	Thread.sleep(1000);
	 
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:0:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:0:appField")).sendKeys(refname);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:1:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:1:appField")).sendKeys("2224 Lautrec Drive");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:2:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:2:appField")).sendKeys("San Jose");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:3:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:3:appField")).sendKeys("CA");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:4:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:4:appField")).sendKeys("95135");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:5:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:5:appField")).sendKeys(mobile);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:6:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:6:appField")).sendKeys("Title LOR");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:7:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:7:appField")).sendKeys("Wiley EDU");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:8:appField")).click();
    Select  applicant= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:8:appField")));
    applicant.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:9:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:9:appField")).sendKeys("Ex Collegue");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:10:appField")).click();
    Select Potential= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:10:appField")));
    Potential.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:11:appField")).click();
    Select independentaly= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:11:appField")));
    independentaly.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:12:appField")).click();
    Select others= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:12:appField")));
    others.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:13:appField")).click();
    Select Leadership= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:13:appField")));
    Leadership.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:14:appField")).click();
    Select Maturity= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:14:appField")));
    Maturity.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:15:appField")).click();
    Select oral= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:15:appField")));
    oral.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:16:appField")).click();
    Select written= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:16:appField")));
    written.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:17:appField")).click();
    Select formulate= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:17:appField")));
    formulate.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:18:appField")).click();
    Select Social= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:18:appField")));
    Social.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:19:appField")).click();
    Select Motivation= new Select(driver.findElement(By.name("j_id0:j_id1:theForm:j_id126:19:appField")));
    Motivation.selectByIndex(2);
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:20:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:20:appField")).sendKeys("characteristics - Good - SRP Help");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:21:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:21:appField")).sendKeys("Weakness - SRP Help");
    
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:22:appField")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id126:22:appField")).sendKeys("Additional comments - SRP Help");
    
    Thread.sleep(1000);
    
    driver.findElement(By.name("j_id0:j_id1:theForm:j_id142")).click();
	Thread.sleep(1000);    
}
}