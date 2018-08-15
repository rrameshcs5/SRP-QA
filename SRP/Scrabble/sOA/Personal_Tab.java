


package sOA;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Random;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Personal_Tab {
	
	String arr[]=UUID.randomUUID().toString().split("-");
	String fn = "srp_fN_"+new Random().nextInt(85);
	String ln = "ln_"+new Random().nextInt(85);
	String email = "srp_help_"+arr[3]+"@nomail.com";
	String zip = "60174";
	Random rand = new Random();
	long drand = (long)(rand.nextDouble()*10000000000L);
	String mobile = Long.toString(drand);
	
	WebDriver driver;
	
	public Personal_Tab(WebDriver driverFromMain) 
	{
		driver = driverFromMain;
	}
    
	
	public void Personal() throws InterruptedException, AWTException, IOException
	
	{
	
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:0:appFieldReq")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:0:appFieldReq")).sendKeys(fn);
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:2:appFieldReq")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:2:appFieldReq")).sendKeys(ln);
  
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:5:appFieldReq")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:5:appFieldReq")).sendKeys("3/29/2000");
   
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:6:appFieldReq")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:6:appFieldReq")).sendKeys("154214789");
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:8:appFieldReq")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:8:appFieldReq")).sendKeys(mobile);
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:10:appFieldReq")).clear();
    driver.findElement(By.id("j_id0:j_id1:theForm:j_id113:10:appFieldReq")).sendKeys(email);
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
	
	//Save and Go to Next Step
	driver.findElement(By.name("j_id0:j_id1:theForm:j_id143:j_id144:j_id145")).click();
	Thread.sleep(3000);
	
	//Educational  Tab
	driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:1:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:1:appFieldRequired")).sendKeys("California State University");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:2:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:2:appFieldRequired")).sendKeys("Long Beach CA");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:3:appFieldRequired")).sendKeys("3/29/2004");
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:4:appFieldRequired")).sendKeys("4/29/2008");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:5:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:5:appFieldRequired")).sendKeys("Computer Science");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:6:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:6:appFieldRequired")).sendKeys("Masters");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:7:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:7:appFieldRequired")).sendKeys("3.6");

    //Save and Go
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id188")).click();
    Thread.sleep(3000);
    
    //Professional Experience Tab
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:1:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:1:appFieldRequired")).sendKeys("Wiley");

    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:2:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:2:appFieldRequired")).sendKeys("Oakbrook");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:3:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:3:appFieldRequired")).sendKeys("Oakbrook");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:4:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:4:appFieldRequired")).sendKeys("IL");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:5:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:5:appFieldRequired")).sendKeys("95135");
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:6:appFieldRequired")).clear();
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:6:appFieldRequired")).sendKeys("QA");
    Thread.sleep(1000);
    
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:7:appFieldRequired")).sendKeys("3/29/2004");
    driver.findElement(By.id("j_id0:j_id2:theForm:j_id116:0:j_id154:8:appField")).sendKeys("4/29/2008");
   
  //Save and Go to Next Step
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id188")).click();
    Thread.sleep(3000);
    
  //Reference Requirements Tab
    driver.findElement(By.name("j_id0:j_id1:theForm:j_id143:j_id144:j_id145")).click();
    Thread.sleep(3000);
    
    //Letter of Recommendation
    driver.findElement(By.name("j_id0:j_id2:theForm:refName")).click();
    driver.findElement(By.name("j_id0:j_id2:theForm:refName")).sendKeys("Referene_1");
    
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id214")).click();
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id214")).sendKeys("ramesh.qa.raja@gmail.com");
    
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id221")).click();
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id221")).sendKeys("ramesh.qa.raja@gmail.com");
    Thread.sleep(1000); 
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id222")).click();
    Thread.sleep(2000); 
    
   //Adding Second Recommender
    driver.findElement(By.name("j_id0:j_id2:theForm:refName")).click();
    driver.findElement(By.name("j_id0:j_id2:theForm:refName")).sendKeys("Referene_2");
    
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id214")).click();
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id214")).sendKeys("ramesh.cs.raja@gmail.com");
    
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id221")).click();
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id221")).sendKeys("ramesh.cs.raja@gmail.com");
    Thread.sleep(1000); 
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id222")).click();
    Thread.sleep(2000); 
    
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id202:j_id203:j_id204")).click();
    Thread.sleep(3000);
    
    //Payment Tab
    
    driver.findElement(By.id(" j_id0:j_id2:theForm:j_id148:1")).click();
    Thread.sleep(500); 
    
    driver.findElement(By.name("j_id0:j_id2:theForm:j_id212:j_id213:j_id214")).click();
    Thread.sleep(2000); 
   
    
    //Required Documents

    driver.findElement(By.name("j_id0:j_id1:theForm:j_id143:j_id144:j_id145")).click();
    Thread.sleep(3000);
    
    //Select a File to Upload on Document Uploads tab
    //driver.findElement(By.name("j_id0:j_id2:theForm:j_id119")).click();
  		Select uploadfile= new Select(driver.findElement(By.name("j_id0:j_id2:theForm:j_id119")));
  		uploadfile.selectByIndex(1);
 
  		Runtime.getRuntime().exec("osascript "+"/Users/ramesh.raja/Documents/00_Work/Selenium/AppleScript/OLADocUpload.scpt");
  		Thread.sleep(3000);
  		driver.findElement(By.name("j_id0:j_id2:theForm:j_id128")).click();
  		Thread.sleep(2000);
  		
  		driver.findElement(By.name("j_id0:j_id2:theForm:j_id157:j_id158:j_id159")).click();
  		Thread.sleep(2000);
  		
  		driver.findElement(By.name("j_id0:j_id1:theForm:j_id143:j_id144:j_id145")).click();
  		Thread.sleep(2000);
  		
  		//Print PDF
  		//driver.findElement(By.xpath("//a[@id='Print PDF']")).click();
  		driver.findElement(By.linkText("Print PDF")).click(); 
  		Thread.sleep(2000);
  		driver.close();
  		Thread.sleep(1000);
  		
  		//Review Tab - Click on Agree and Submit
  		driver.findElement(By.name("j_id0:j_id1:theForm:j_id190")).click();
  		Thread.sleep(1000);
  		
//    Doc_Upload DocUpload = new Doc_Upload(driver);
//    DocUpload.Upload();  
    /*
    //Document Uploads
    WebElement uploadElement = driver.findElement(By.id("j_id0:j_id2:theForm:j_id122"));
    uploadElement.sendKeys("file:///Users/ramesh.raja/eclipse-workspace/SRPQA/File/sample resume.doc");
	Thread.sleep(2000);
    */
    
}
}