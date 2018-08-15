package srpNewInq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;



public class InquiryForm 
{
	public static String email_inq;
	
	WebDriver driver;
	
	public InquiryForm(WebDriver driverFromMain) 
	{
		driver = driverFromMain;
	}
	 
	public void Srpinquiryform () throws InterruptedException
	{
		String arr[]=UUID.randomUUID().toString().split("-");
		Random rand = new Random();
		long drand = (long)(rand.nextDouble()*10000000000L);
		String mobile = Long.toString(drand);
		
		String fn = "Srp_fn_"+new Random().nextInt(85);
		String ln = "Ln_"+new Random().nextInt(85);
		String email = "srp_help_"+arr[3]+"@nomail.com";
		String zip = "60174";
		String stud = fn+" "+ln;
	    email_inq = email;
	   
	    
//	    WebDriver driver = w2L.GetChromeDriver.getDriver();
//		driver.get("https://cs47.salesforce.com");
//		driver.manage().window().fullscreen();
//		driver.findElement(By.id("username")).sendKeys("automation@prod.com.scrabble");
//		driver.findElement(By.id("password")).sendKeys("Auto1234");
//		driver.findElement(By.name("Login")).submit();
//		Thread.sleep(3001);
	    
		driver.findElement(By.id("01r60000000UNpS_Tab")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id35:j_id36:opp__retrainowner")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id40:opp__firstname")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id40:opp__firstname")).sendKeys(fn);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id42:opp__lastname")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id42:opp__lastname")).sendKeys(ln);	
		
		//Thread.sleep(500);
		
		/*To change the partner change the Account id here */
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id44:campusPicklist")).click();
        Select partner= new Select (driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id44:campusPicklist")));
        partner.selectByIndex(31);
        Thread.sleep(500);
		
		/*Program should match with the above account id selected */
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id48:programPicklist")).click();
        Select selectprog= new Select (driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id48:programPicklist")));
        selectprog.selectByIndex(7);
        Thread.sleep(500);
        
		/*Specialization should match with the above account id selected */
//		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id52:specPicklist")).click();
//        Select specialization= new Select (driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id52:specPicklist")));
//        specialization.selectByIndex(1);
//        Thread.sleep(500);
        
		/*Term should match with the above program selected */
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id55:timeframe")).click();
        Select term= new Select (driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id55:timeframe")));
        term.selectByIndex(1);
        Thread.sleep(500);
        
       /*Contact Information */ 
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id62:emailAdd")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id62:emailAdd")).sendKeys(email);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id64:Home_Phone")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id64:Home_Phone")).sendKeys(mobile);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id66:Mobile_Phone")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id66:Mobile_Phone")).sendKeys(mobile);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id68:Work_Phone")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id68:Work_Phone")).sendKeys(mobile);	
		
		 /* Address Information */
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id71:Address")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id71:Address")).sendKeys(fn);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id73:City")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id73:City")).sendKeys(ln);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id75:State")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id75:State")).sendKeys("NY");	
		
	
		Select sc41 =new Select(driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id77:Country")));
		sc41.selectByValue("USA");	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id81:Zip")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id81:Zip")).sendKeys(zip);	
		
		Select sc5 =new Select(driver.findElement(By.id("j_id0:theentireform:j_id27:j_id83:j_id86:campaignList")));
		sc5.selectByValue("ACAWinter");	
		Thread.sleep(1500);
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id28:subBtn")).click();
		Thread.sleep(5000);
		//driver.close();
		
//		driver.findElement(By.id("CF00N60000002aLWE_ileinner")).click();
		//driver.findElement(By.partialLinkText(stud)).click();
//		Thread.sleep(5000);
		
			
//		   driver.findElement(By.linkText(stud)).click();
//		   driver.findElement(By.linkText(stud)).click();
		   //driver.findElement(By.xpath("//*[@value^=fn]")).click();
		 // input[value^='I'];
		   
//		   WebDriverWait wait = new WebDriverWait(driver, 15);
//		   wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("18:")));
//		
		
	}
}