package srpNewInq;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import w2L.LoginW2L;
import w2L.m_W2L;

public class SRPInquiry 
{ 
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://cs47.salesforce.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("username")).sendKeys("automation@prod.com.scrabble");
		driver.findElement(By.id("password")).sendKeys("Auto1234");
		driver.findElement(By.name("Login")).submit();
		Thread.sleep(3001);
		
		int n;
		for( n = 0; n < 5; n = n + 1 )
		{
		
		InquiryForm inqfm = new InquiryForm(driver);
		inqfm.Srpinquiryform();
		
		
		
//		AffiliationUpd aff = new AffiliationUpd(driver);
//		aff.Affiliation();
		}
		/*Opportunity Update Code has to be included here once the Lead got created.*/
	}
}
