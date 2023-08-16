package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	
	//find element and enter username
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	//find element and enter password
	driver.findElement(By.id("password")).sendKeys("crmsfa");
			
	//find element and click submit
	driver.findElement(By.className("decorativeSubmit")).click();
	
	//get title of page
	String title = driver.getTitle();
	//print the title
	System.out.println(title);
	//click crmsfa
	driver.findElement(By.linkText("CRM/SFA")).click();
	//Click Lead
	driver.findElement(By.linkText("Leads")).click();
	//click createlead
	driver.findElement(By.linkText("Create Lead")).click();


	//Enter Company name
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	//Enter first name
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
	//Enterlastname
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhu");
	
	//click CreateLead
	driver.findElement(By.name("submitButton")).click();
	
	//Verify the text
	String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	//print the text
	System.out.println(text);
	
	
	//Click Edit
	driver.findElement(By.linkText("Edit")).click();
	
	//Clear existing Company name
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
	
	//Update Company name
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
		
	//Click Update
	driver.findElement(By.name("submitButton")).click();
	
	//Verify the text
	String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
	//print the text
	System.out.println(text1);	
}
}
