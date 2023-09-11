package week4.day4.assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schools {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	driver.manage().window().maximize();
	
	//get inside frame
	driver.switchTo().frame("iframeResult");
	//click on try me button
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	//handle the alert
	Alert alert = driver.switchTo().alert();
	System.out.println(alert.getText());
	//accept the alert
	alert.accept();
	//verification
	String text = driver.findElement(By.id("demo")).getText();
	System.out.println(text);
	//switch back to the main window
	driver.switchTo().defaultContent();
}
}
