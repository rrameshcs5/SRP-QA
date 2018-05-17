package soa; 

//import org.openqa.selenium.By.ById;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SOA_TEST {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver 3");
		WebDriver driver = new ChromeDriver();	
		//driver.manage().window().maximize();
		driver.get("https://scrabble-apply-now.cs23.force.com/?acctid=0016000000YlgUM");
		/*driver.findElement(By.id("Registration:j_id118:firstname")).sendKeys("Testuserfn11");
		driver.findElement(By.id("Registration:j_id118:lastname")).sendKeys("Testuserln11");
		Select sc =new Select(driver.findElement(By.id("Registration:j_id118:countrycode")));
		sc.selectByValue("+1");
		driver.findElement(By.id("Registration:j_id118:phonenumber")).sendKeys("1234567894");
		driver.findElement(By.id("Registration:j_id118:email")).sendKeys("testuser11_01@nomail.com");
		driver.findElement(By.id("Registration:j_id118:confirmemail")).sendKeys("testuser11_01@nomail.com");
		driver.findElement(By.id("Registration:j_id118:password")).sendKeys("ABCabc123$");
		driver.findElement(By.id("Registration:j_id118:secondPassword")).sendKeys("ABCabc123$");
		driver.findElement(By.id("Registration:j_id118:submit")).click();
		*/
			

	}

}