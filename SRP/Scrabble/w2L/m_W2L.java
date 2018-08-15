package w2L;

import java.util.Random;
import java.util.UUID;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class m_W2L 
{
	
	public static String email_temp;
	
	public void studentInfo(String url) throws InterruptedException 
	{
		String arr[]=UUID.randomUUID().toString().split("-");
		String fn = "W2L_fn_"+new Random().nextInt(85);
		String ln = "ln_"+new Random().nextInt(85);
		Random rand = new Random();
		long drand = (long)(rand.nextDouble()*10000000000L);
		String mobile = Long.toString(drand);
		String email = "srp_help_"+arr[3]+"@nomail.com";
		email_temp = email;
		
		WebDriver driver = w2L.GetChromeDriver.getDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.id("first_name")).click();
		driver.findElement(By.id("first_name")).sendKeys(fn);
		Thread.sleep(100);

		driver.findElement(By.id("last_name")).click();
		driver.findElement(By.id("last_name")).sendKeys(ln);
		// driver.findElement(By.id("last_name")).click();
		//Thread.sleep(100);

		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys(email);
		// driver.findElement(By.id("email")).click();
		//Thread.sleep(100);
		
		driver.findElement(By.id("city")).click();
		driver.findElement(By.id("city")).sendKeys("Selnium_OAKBROOK");
		//driver.findElement(By.id("city")).click();
		//Thread.sleep(100);

		driver.findElement(By.id("state")).click();
		driver.findElement(By.id("state")).sendKeys("IL");
//		driver.findElement(By.id("state")).click();
		//Thread.sleep(100);

		driver.findElement(By.id("country")).click();
		driver.findElement(By.id("country")).sendKeys("USA");
		driver.findElement(By.id("country")).click();
		Thread.sleep(100);

//		driver.findElement(By.id("zip")).click();
//		driver.findElement(By.id("zip")).sendKeys("10471");
//		driver.findElement(By.id("zip")).click();
//		//Thread.sleep(100);

		Select dropdownview = new Select(driver.findElement(By.name("00N60000002aLTY")));
		dropdownview.selectByIndex(3);
		
	
		Select dropdownview2 = new Select(driver.findElement(By.name("00N60000002aLTZ")));
		//dropdownview2.selectByIndex("PRD | MSEd");
		dropdownview2.selectByIndex(2);

		Select dropdownview3 = new Select(driver.findElement(By.name("00N60000002aLTf")));
		dropdownview3.selectByIndex(2);
		Thread.sleep(500);
		
		driver.findElement(By.id("00N60000002aRvB")).click();
		driver.findElement(By.id("00N60000002aRvB")).sendKeys("Yahoo");
		
		driver.findElement(By.id("mobile")).click();
		driver.findElement(By.id("mobile")).sendKeys(mobile);
		//Thread.sleep(100);
		
		driver.findElement(By.id("00N60000002aLUg")).click();
		driver.findElement(By.id("00N60000002aLUg")).sendKeys(mobile);
		
		Thread.sleep(5001);
		driver.findElement(By.name("submit")).submit();
		driver.close();

	}
}
