package ztest;

import java.util.Random;
import java.util.UUID;

public class Draft
{
	private static final String RandomStringUtils = null;
	private static double cellNumber;
	
	public static void main(String a[])
	{
	//Random Name Printing	
	String randName = "SRP_FN_"+new Random().nextInt(85);
	System.out.println("First Name0 is : " + randName);
	System.out.println("First Name00 is : " + randName);
	System.out.println("First Name000 is : " + randName);
	
	String randName1 = "SRP_FN_"+new Random().nextInt(85);
	System.out.println("First Name1 is : " + randName1);
	
	//Random Mobile Number printing
	Random rand = new Random();
	long drand = (long)(rand.nextDouble()*10000000000L);
	String numberAsString = Long.toString(drand); // convert long to string
	System.out.println("Mobile number is : " + drand);
	System.out.println("Mobile number is : " + numberAsString);
	
	String arr[]=UUID.randomUUID().toString().split("-");
	System.out.println(" ");
	System.out.println("Name1 : " + arr[0]);
	System.out.println("Name2 : " + arr[1]);
	System.out.println("Name3 : " + arr[2]);
	System.out.println("SRP_Help_"+arr[3]+"@nomail.com");
	
	double num=Math.ceil(Math.random()*1000000000);
	cellNumber=num;
	System.out.println("Number is : " + num);
	
	
	
	//String fn = RandomStringUtils.randomAlphabetic(5);
//    String ln = RandomStringUtils.randomAlphabetic(4);
//    String email = "abbasi.wileytest@gmail.com";
//    String mobile = RandomStringUtils.randomNumeric(10);      
//    String HomePhone = RandomStringUtils.randomNumeric(10);
	
	
	
//	WebElement element = driver.findElement(By.id("phSearchInput"));
//	element.sendKeys("Aaron Yurkiewicz");
//	element.submit();
//	Thread.sleep(2000);			  
//	
//	driver.findElement(By.linkText("Aaron Yurkiewicz")).click();			 
//	Thread.sleep(2000);
	
	
//	Select sc3 =new Select(driver.findElement(By.id("j_id0:theentireform:j_id27:j_id39:j_id55:timeframe")));
//	sc3.selectByValue("0-3 months");	
	
}
	
}

