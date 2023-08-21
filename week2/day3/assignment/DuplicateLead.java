package week2.day3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Prabhu");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("IT");	
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("Welcome to Testleaf");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suganyasugi17@gmail.com");
				
				
		driver.findElement(By.name("submitButton")).click();
				
		//Verify the text
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ridhanya");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
	}
	
}
