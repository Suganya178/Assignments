package week4.day3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnMouseHover {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//find the element
	WebElement fashion = driver.findElement(By.linkText("Men's Fashion"));
	//Create obj for actions
	Actions builder =new Actions(driver);
	//method
	builder.moveToElement(fashion).perform();
	driver.findElement(By.xpath("(//span[text()='Shirts'])[1]")).click();;
	
	//driver.close();
	
}
}
