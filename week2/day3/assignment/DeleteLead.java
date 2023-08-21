package week2.day3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException {
	
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
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("9345454596");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	WebElement id= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
	String leadid=id.getText();
	System.out.println(leadid);
	id.click();
	Thread.sleep(3000);
	
	driver.findElement(By.className("subMenuButtonDangerous")).click();//click delete
	driver.findElement(By.linkText("Find Leads")).click();
	
	driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(leadid);//passing first lead id to search
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();//click on find leads button
	Thread.sleep(3000);
	WebElement element = driver.findElement(By.id("ext-gen437"));
	System.out.println(element.getText());
	
	driver.close();
	
	
	
}
}
