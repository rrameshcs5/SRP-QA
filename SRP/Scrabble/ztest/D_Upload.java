package ztest;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class D_Upload {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	
	{
		//Robot robot = new Robot();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");	
		WebDriver driver = new ChromeDriver();	
		driver.get("file:///Users/ramesh.raja/Documents/00_Work/Selenium/WebtoLead_Code/Scrabble_WebtoLead_Purdue.html");	
		
		driver.manage().window().maximize();
	    Thread.sleep(1000);
	    
		/*Test URL*/
	    driver.get("http://demo.automationtesting.in/Register.html");
	    driver.findElement(By.id("imagesrc")).click();
	    Thread.sleep(2000);
	   // Runtime.getRuntime().exec("osascript "+"/Users/ramesh.raja/Documents/00_Work/Selenium/AppleScript/UploadSample.scpt");
	    Runtime.getRuntime().exec("osascript "+"/Users/ramesh.raja/Documents/00_Work/Selenium/AppleScript/MassUpload1.scpt");
	    Thread.sleep(2000);
//	    
//	   // robot.keyPress(KeyEvent.VK_CONTROL);
//	   // robot.keyPress(KeyEvent.VK_command+shift+g);
//	    
//	    
////		This code is not working 
//	    File file = new File("file:\\\\ramesh.raja\\\\Mass_Upload_Auto_01.xls");
//	    String str = file.getAbsolutePath();
//	    System.out.println(str);
//	    WebElement uploadElement = driver.findElement(By.id("imagesrc"));
//	    uploadElement.sendKeys(str);
//	    //uploadElement.sendKeys("file:///Users/ramesh.raja/eclipse-workspace/SRPQA/File/Mass_Upload_Auto_01.xls");
//	    
//	    
	    
	
		
		/*StringSelection stringselection = new StringSelection("file:///Users/ramesh.raja/Desktop/Prod Results_OLA_Zoom.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);	
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);	
		
		robot.setAutoDelay(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);*/
	   
	
		
}
}

