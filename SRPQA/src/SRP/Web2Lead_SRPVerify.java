package SRP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web2Lead_SRPVerify 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//update the Test Data before run
		PRD_W2L PRD = new PRD_W2L();
     PRD.studentInfo("file:///Users/ramesh.raja/Documents/00_Work/Selenium/WebtoLead_Code/Scrabble_WebtoLead_Purdue.html");
		//PRD.studentInfo("file:///Users/ramesh.raja/Documents/00_Work/Selenium/WebtoLead_Code/Prod_WebtoLead_Purdue Univ.html");

//		LoginW2L slogin = new LoginW2L();
//		slogin.salesForceLogin("https://cs23.salesforce.com");
		
		
	}
}