package w2L;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginW2L {

	public void salesForceLogin(String url) throws InterruptedException 
	{

		WebDriver driver = w2L.GetChromeDriver.getDriver();
		driver.get(url);
		driver.manage().window().fullscreen();
		driver.findElement(By.id("username")).sendKeys("automation@prod.com.scrabble");
		driver.findElement(By.id("password")).sendKeys("Auto1234");
		driver.findElement(By.name("Login")).submit();
		Thread.sleep(3001);
		
		driver.findElement(By.name("str")).click();
		driver.findElement(By.name("str")).sendKeys(m_W2L.email_temp);

		Thread.sleep(10001);

		driver.findElement(By.id("phSearchButton")).click();
		Thread.sleep(5001);

		driver.close();
//WebElement msg=driver.findElement(By.xpath(".//*[@id='PRD_W2L.email']"));
//String text=msg.getText();
//if (msg.isEnabled() && text.contains(PRD_W2L.email_temp))
//{ 
//    System.out.println("Your Lead created with email id ");
//}else{
//    System.out.println("Check the Webto Lead Flow");
//}
				
		

	}
}