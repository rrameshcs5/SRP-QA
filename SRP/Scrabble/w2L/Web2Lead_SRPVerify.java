package w2L;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Web2Lead_SRPVerify 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		int n;
		for( n = 0; n < 3; n = n + 1 )
		{
		m_W2L PRD = new m_W2L();
		PRD.studentInfo("file:///Users/ramesh.raja/Documents/00_Work/Selenium/WebtoLead_Code/W2L_STJ_CS47.html");
		}
		//Production 
		//PRD.studentInfo("file:///Users/ramesh.raja/Documents/00_Work/Selenium/Prod_WebtoLead_ Form.html");		
	}
}