package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate and click show button
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert.sendKeys("TestLeaf");
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(5000);
		//verification
		String text = driver.findElement(By.id("confirm_result")).getText();
	    System.out.println(text);
	    driver.close();
	    
	}

}
