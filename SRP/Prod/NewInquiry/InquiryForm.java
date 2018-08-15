package Production;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import SRP.LoginW2L;


public class InquiryForm 
{
	public static String email_inq;
	 
	public void Srpinquiryform () throws InterruptedException
	{
		String fn = "Selenium_FN_13";
	    String ln = "Selenium_FN_1743";
	    String email = "Selenium_email_17@nomail.com";
	    String mobile = "9879871345";
	    String HomePhone = mobile;
	    String zip = "86515";
	    email_inq = email;
		
	    WebDriver driver = SRP.GetChromeDriver.getDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("username")).sendKeys("automation@prod.com");
		driver.findElement(By.id("password")).sendKeys("Auto1234");
		driver.findElement(By.name("Login")).submit();
		Thread.sleep(3001);
	    
		driver.findElement(By.id("01r60000000UNpS_Tab")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id35:j_id36:opp__retrainowner")).click();
		Thread.sleep(500);
		
	    driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id40:opp__firstname")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id40:opp__firstname")).sendKeys(fn);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id42:opp__lastname")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id42:opp__lastname")).sendKeys(ln);	
		Thread.sleep(500);
		
		/*To change the partner change the Account id here */
		Select sc1 =new Select(driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id44:campusPicklist")));
		sc1.selectByValue("0011800000Ty4WfAAJ");	
		Thread.sleep(1500);
		
		/*Program should match with the above account id selected */
		Select sc2 =new Select(driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id48:programPicklist")));
		sc2.selectByValue("a1C18000000V7TnEAK");	
		
		/*Term should match with the above program selected */
		Select sc3 =new Select(driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id55:timeframe")));
		sc3.selectByValue("0-3 months");	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id62:emailAdd")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id62:emailAdd")).sendKeys(email);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id64:Home_Phone")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id64:Home_Phone")).sendKeys(mobile);	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id66:Mobile_Phone")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id61:j_id66:Mobile_Phone")).sendKeys(mobile);	
		
		/*Country should be one of the 6 combinations */
		Select sc4 =new Select(driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id77:Country")));
		sc4.selectByValue("USA");	
		
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id81:Zip")).click();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id70:j_id81:Zip")).sendKeys(zip);	
		
		Select sc5 =new Select(driver.findElement(By.id("j_id0:theentireform:j_id27:j_id83:j_id86:campaignList")));
		sc5.selectByValue("ACAWinter");	
		Thread.sleep(1500);
		//driver.findElement(By.name("j_id0:theentireform:j_id27:j_id28:subBtn")).submit();
		driver.findElement(By.id("j_id0:theentireform:j_id27:j_id28:subBtn")).click();
		Thread.sleep(5000);
		//driver.close();
		
	}
}