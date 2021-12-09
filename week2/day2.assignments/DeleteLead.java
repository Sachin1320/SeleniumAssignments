package  week2.day2.Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class DeleteLead {
	 public static void main(String[] args) throws InterruptedException {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	Thread.sleep(2000);
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.name("phoneCountryCode")).clear();
	driver.findElement(By.name("phoneNumber")).sendKeys("1");
	driver.findElement(By.linkText("Find Leads")).click();
	
    Thread.sleep(2000);
	
	String  lead= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).getText();
	System.out.println("Lead ID of first resulting lead: "+lead);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(lead);
	driver.findElement(By.xpath("//div[contains(text(),\"Find Leads\")]/following::button")).click();
	
	WebElement ele=driver.findElement(By.className("x-paging-info"));
	boolean isVisible=ele.isDisplayed();
	
	if(isVisible=true)
		System.out.println("Deletion successful");
	
	driver.close();
	
}
}
	
		/*http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/
	}
}
