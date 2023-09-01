package week4.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/alert.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//locate and click show button
	
	driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();;
	//handle the alert
	Alert alert = driver.switchTo().alert();
	//print the message from alert box
	//String text = alert.getText();
	System.out.println(alert.getText());	
	//Action going to perform
	alert.accept();
	
	//verification
	String text = driver.findElement(By.id("simple_result")).getText();
    System.out.println(text);
    //confirmation
    driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
    //handle the alert
    Alert alert2 = driver.switchTo().alert();
    //print the message from alert box
    System.out.println(alert2.getText());
    ////Action going to perform
    alert2.dismiss();
  //verification
  	String text1 = driver.findElement(By.id("result")).getText();
      System.out.println(text1);
      driver.close();
}
}
