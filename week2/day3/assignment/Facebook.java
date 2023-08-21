package week2.day3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://en-gb.facebook.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[contains(@class,'4jy2 selected _51sy')]")).click();
	driver.findElement(By.name("firstname")).sendKeys("Suganya");
	driver.findElement(By.name("lastname")).sendKeys("Prabhu");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]/following-sibling::input")).sendKeys("suganyasugi17@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.id("password_step_input")).sendKeys("Welcome@123");
	
	
	WebElement day = driver.findElement(By.name("birthday_day"));
	Select days = new Select (day);
	days.selectByValue("17");
	
	WebElement mon = driver.findElement(By.name("birthday_month"));
	Select month = new Select (mon);
	month.selectByVisibleText("Aug");
	
	WebElement ye = driver.findElement(By.name("birthday_year"));
	Select year = new Select (ye);
	year.selectByVisibleText("1992");
	
	driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/input)[1]")).click();
	
	
}
}
