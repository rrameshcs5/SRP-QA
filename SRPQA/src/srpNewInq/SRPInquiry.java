package srpNewInq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import SRP.LoginW2L;
import SRP.PRD_W2L;

public class SRPInquiry 
{ 
	public static void main(String[] args) throws InterruptedException 
	{
		/*Use InquiryForm.Java to give the inputs for SRP New Inquiry.*/
		
		InquiryForm inqfm = new InquiryForm();
		inqfm.Srpinquiryform();
		
		/*Opportunity Update Code has to be included here once the Lead got created.*/
	}
}
