package ztest;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lor_draft {
	
	String arr[]=UUID.randomUUID().toString().split("-");
	static String refname = "Refname_"+new Random().nextInt(85);
	String ln = "ln_"+new Random().nextInt(85);
	String email = "srp_help_"+arr[3]+"@nomail.com";
	String zip = "60174";
	static Random rand = new Random();
	static long drand = (long)(rand.nextDouble()*10000000000L);
	static String mobile = Long.toString(drand);

	public static void main(String[] args) throws InterruptedException 
		
{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    driver.manage().window().fullscreen();
			//driver.get("https://scrabble-apply-now.cs23.force.com/?acctid=0016000000YlgUM");
			
			/*
			//Register OLA with user name and pwd
			driver.findElement(By.id("Registration:j_id104:usernameLogin")).sendKeys("testuser76@nomail.com");
			driver.findElement(By.id("Registration:j_id104:passwordLogin")).sendKeys("ABCabc123$");
			driver.findElement(By.name("Registration:j_id104:j_id109")).click();
			driver.findElement(By.xpath("//*[@id=\"j_id0:j_id2:theForm:j_id168\"]/input")).click();
			driver.findElement(By.linkText("SOA-015407")).click(); 
			 Thread.sleep(3000);  
			
			By.xpath("span[text()=='Document Uploads']");
			 driver.findElement(By.linkText("Document Uploads")).click();
			//The above step not able to click the tab 
			 
			 
			// "//*[@id = 'quicktabs-tab-tabs-1']" ;
			 
			 
			 
			 
//			 WebElement uploadElement = driver.findElement(By.id("j_id0:j_id2:theForm:j_id122"));
//			 uploadElement.sendKeys("file:///Users/ramesh.raja/eclipse-workspace/SRPQA/File/sample resume.doc");
//			    Thread.sleep(2000);
//			//This above code is not uploading sample file which is available in my eclipse. 
			
			*/
	
		    driver.get("https://apply-now.force.com/apex/deltaksrp__srpreferenceform?rId=a2B0e0000008EVq&acctid=0016000000YlgUM");
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
