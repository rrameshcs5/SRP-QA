package sOA;

import java.awt.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Doc_Upload {
	
WebDriver driver;
	
	public Doc_Upload (WebDriver driverFromMain) {
		driver = driverFromMain;
	}
    
	public void Upload() throws InterruptedException, AWTException {
	
		driver.findElement(By.id("j_id0:j_id2:theForm:j_id122")).click();
	
	Robot robot = new Robot();
	
	StringSelection stringselection = new StringSelection("file:///Users/ramesh.raja/Documents/00_Work/Selenium/Doc_Upload_Test/Supplemental_Application.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection,null);
	
	robot.setAutoDelay(2000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);	
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);	
	
	robot.setAutoDelay(2000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
    Thread.sleep(2000);
	driver.findElement(By.name("j_id0:j_id2:theForm:j_id128")).click();

    Thread.sleep(2000);
	}
}

