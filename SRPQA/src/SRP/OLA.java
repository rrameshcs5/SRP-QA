package SRP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OLA 
{

	public static void main(String[] args) throws InterruptedException 
		
{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
			WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    driver.manage().window().fullscreen();
			driver.get("https://scrabble-apply-now.cs23.force.com/?acctid=0016000000YlgUM");
			
			//Register OLA with user name and pwd
			driver.findElement(By.id("Registration:j_id104:usernameLogin")).sendKeys("testuser76@nomail.com");
			driver.findElement(By.id("Registration:j_id104:passwordLogin")).sendKeys("ABCabc123$");
			driver.findElement(By.name("Registration:j_id104:j_id109")).click();
			driver.findElement(By.xpath("//*[@id=\"j_id0:j_id2:theForm:j_id168\"]/input")).click();
			
			//copy and paste the hyperlink here below
	       // driver.findElement(By.linkText("SOA-015407")).click(); 
	       
	        driver.findElement(By.xpath("//*[@id=\"j_id0:j_id2:theForm:j_id168\"]/input")).click();
            
            Thread.sleep(500);
           
            // Select the academic program from drop-down list
            driver.findElement(By.id("j_id0:j_id2:theForm:academicProgram")).click();
            Select selectprog= new Select (driver.findElement(By.id("j_id0:j_id2:theForm:academicProgram")));
            selectprog.selectByIndex(1);
           
            Thread.sleep(500);
          
            //select the term from drop-down list
            driver.findElement(By.id("j_id0:j_id2:theForm:startDate")).click();
            Select selectterm= new Select(driver.findElement(By.name("j_id0:j_id2:theForm:startDate")));
            selectterm.selectByIndex(1);
           
            Thread.sleep(500);
         
          //Select the available specialization 
            driver.findElement(By.id("j_id0:j_id2:theForm:spec")).click();
            Select selectspl = new Select(driver.findElement(By.id("j_id0:j_id2:theForm:spec")));
            selectspl.selectByIndex(1);
           
                         
            driver.findElement(By.id("j_id0:j_id2:theForm:newApp")).click();

	        /*Personal Information Tab */
	        
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:0:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:0:appFieldReq")).sendKeys("Testuserfn72");
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:2:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:2:appFieldReq")).sendKeys("Testuserln72");
	        driver.findElement(By.linkText("3/29/2018")).click();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:6:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:6:appFieldReq")).sendKeys("154214789");
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:8:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:8:appFieldReq")).sendKeys("5585474669");
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:10:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:10:appFieldReq")).sendKeys("testuser73@nomail.com");
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:18:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:18:appFieldReq")).sendKeys("2224 Lautrec Drive");
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:20:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:20:appFieldReq")).sendKeys("San Jose");
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:22:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:22:appFieldReq")).sendKeys("CA");
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:23:appFieldReq")).clear();
	        driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:23:appFieldReq")).sendKeys("95135");
	        Thread.sleep(3000);
	        
	        Select sc1 =new Select(driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:26:appFieldReq")));
			sc1.selectByValue("U.S. Citizen");
			driver.findElement(By.name("j_id0:j_id1:theForm:j_id143:j_id144:j_id145")).click();
			
			driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:1:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:1:appFieldRequired")).sendKeys("California State University");
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:2:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:2:appFieldRequired")).sendKeys("Long Beach CA");
	        
	        driver.findElement(By.linkText("3/29/2018")).click();
	        
	        driver.findElement(By.linkText("3/29/2018")).click();
	        
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:5:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:5:appFieldRequired")).sendKeys("Computer Science");
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:6:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:6:appFieldRequired")).sendKeys("Masters");
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:7:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:7:appFieldRequired")).sendKeys("3.6");

	        driver.findElement(By.name("j_id0:j_id2:theForm:j_id188")).click();
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:1:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:1:appFieldRequired")).sendKeys("Computer Sciences Corporation");

	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:2:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:2:appFieldRequired")).sendKeys("Sanarome");
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:3:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:3:appFieldRequired")).sendKeys("San Francisco");
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:4:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:4:appFieldRequired")).sendKeys("CA");
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:5:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:5:appFieldRequired")).sendKeys("95135");
	        
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:6:appFieldRequired")).clear();
	        driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:6:appFieldRequired")).sendKeys("Software test engineer");
	        Thread.sleep(1000);
	        
	        driver.findElement(By.linkText("3/29/2018")).click();
	        
	        driver.findElement(By.linkText("3/29/2018")).click();
	        
	        driver.findElement(By.name("j_id0:j_id2:theForm:j_id188")).click();
	    	        
		}

	}
	
