package week6.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class DuplicateLead extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setUp() {
		fileName = "DuplicateLead";
	}
	
@Test(dataProvider = "fetchData")
	public void runDuplicateLead(String phnum) throws InterruptedException {
		

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
		WebElement text = driver.findElement(By.id("viewLead_companyName_sp"));
		System.out.println(text.getText());
		
	
}
}






