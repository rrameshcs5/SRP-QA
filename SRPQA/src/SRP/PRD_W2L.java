package SRP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PRD_W2L 
{
	
	public static String email_temp;
	
	public void studentInfo(String url) throws InterruptedException 
	{
		WebDriver driver = SRP.GetChromeDriver.getDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		Thread.sleep(500);

//		String fn = "Shyam_FN_05";
//	    String ln = "Shyam_LN_05";
//	    String email = "Shyam_Test_05@nomail.com";
//	    String mobile = "+16543201235";
	    
	    String fn = "Selenium_FN_013";
	    String ln = "Selenium_LN_013";
	    String email = "Selenium_email_013@nomail.com";
	    String mobile = "9879871013";
	    email_temp = email;
		
		driver.findElement(By.id("first_name")).click();
		driver.findElement(By.id("first_name")).sendKeys(fn);
		 driver.findElement(By.id("first_name")).click();
		Thread.sleep(100);

		driver.findElement(By.id("last_name")).click();
		driver.findElement(By.id("last_name")).sendKeys(ln);
		// driver.findElement(By.id("last_name")).click();
		//Thread.sleep(100);

		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		// driver.findElement(By.id("email")).click();
		//Thread.sleep(100);

		driver.findElement(By.id("company")).click();
		driver.findElement(By.id("company")).sendKeys("Selenium_com");
		// driver.findElement(By.id("company")).click();
		//Thread.sleep(100);
		
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).sendKeys("Selnium_OAKBROOK");
		//driver.findElement(By.id("city")).click();
		//Thread.sleep(100);

		driver.findElement(By.id("state")).click();
		driver.findElement(By.id("state")).sendKeys("IL");
//		driver.findElement(By.id("state")).click();
		//Thread.sleep(100);

//		driver.findElement(By.id("country")).click();
//		driver.findElement(By.id("country")).sendKeys("USA");
//		driver.findElement(By.id("country")).click();
		//Thread.sleep(100);

		driver.findElement(By.id("zip")).click();
		driver.findElement(By.id("zip")).sendKeys("10471");
		driver.findElement(By.id("zip")).click();
		//Thread.sleep(100);

		driver.findElement(By.id("phone")).click();
		driver.findElement(By.id("phone")).sendKeys(mobile);
		driver.findElement(By.id("phone")).click();
		//Thread.sleep(100);

		Select dropdownview = new Select(driver.findElement(By.name("00N60000002aLTY")));
		dropdownview.selectByValue("Purdue University");

		Select dropdownview2 = new Select(driver.findElement(By.name("00N60000002aLTZ")));
		dropdownview2.selectByValue("PRD | MSEd");

		Select dropdownview3 = new Select(driver.findElement(By.name("00N60000002aLTf")));
		dropdownview3.selectByValue("PRD | MSEd-LDT");
		Thread.sleep(500);

		driver.findElement(By.id("00N60000002aRvB")).click();
		driver.findElement(By.id("00N60000002aRvB")).sendKeys("Yahoo");
		driver.findElement(By.id("00N60000002aRvB")).click();

		Thread.sleep(5001);
		driver.findElement(By.name("submit")).submit();

		driver.close();

	}
}
