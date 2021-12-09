package  week2.day2.Assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
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
	driver.findElement(By.linkText("Email")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("s");
	driver.findElement(By.linkText("Find Leads")).click();
	
	Thread.sleep(2000);
	
	String  lead= driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).getText();
	System.out.println("Lead Name of first resulting lead: "+lead);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	
	String title = driver.getTitle();
	if(title.contains("Duplicate Lead"))
		System.out.println("Title verified");
	
	driver.findElement(By.name("submitButton")).click();
	
	WebElement firstElement = driver.findElement(By.id("viewLead_firstName_sp"));
	String firstName = firstElement.getText();
	System.out.println(firstName);
	
	if(lead.equalsIgnoreCase(firstName))
		System.out.println("Duplicate Name");
	
	
	driver.close();
	
	
	
	
	
	
}
}

		/*http://leaftaps.com/opentaps/control/main
 
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Email
		9	Enter Email
		10	Click find leads button
		11	Capture name of First Resulting lead
		12	Click First Resulting lead
		13	Click Duplicate Lead
		14	Verify the title as 'Duplicate Lead'
		15	Click Create Lead
		16	Confirm the duplicated lead name is same as captured name
		17	Close the browser (Do not log out)
		
		*/
	}
}
