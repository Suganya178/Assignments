package week5.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MakemyTrip {
public static void main(String[] args) throws InterruptedException, IOException {
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notification");
	ChromeDriver driver= new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
	//Close the Sweet Alert inside frame
	WebElement frameName = driver.findElement(By.xpath("//iframe[@title='notification-frame-b8a69227']"));
	driver.switchTo().frame(frameName);
	driver.findElement(By.xpath("//a[@class='close']")).click();
	driver.switchTo().defaultContent();
	//Click on the website logo.
	driver.findElement(By.xpath("//div[@class='landingContainer eng']")).click();
	
	//Navigate to the "Holiday Packages" section.
	driver.findElement(By.xpath("//li[@class='menu_Holidays removeItemMargin']")).click();
	//Input "Chennai" as the departure city.
	driver.findElement(By.id("fromCity")).click();
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
	//Specify "Goa" as the destination city.Choose the first city suggestion.
	driver.findElement(By.id("toCity")).click();
	driver.findElement(By.xpath("//div[text()='Goa']")).click();
	Thread.sleep(2000);
	//Pick a date from the calendar.
	driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[3]")).click();
	Thread.sleep(2000);
	
	//Adjust the number of adults to the maximum allowed.
	driver.findElement(By.xpath("//div[@data-testid='adult-increment-counter']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-testid='child-increment-counter']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//li[@class='children-age-wrapper']//li[7]")).click();
	Thread.sleep(2000);
	
	//Click on the apply button.
	driver.findElement(By.className("applyBtn")).click();
	Thread.sleep(2000);
	
	//Set the trip duration to 3-5 nights.
	WebElement drag = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-1']"));
	//System.out.println(drag.getLocation());
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(drag, 50, 0).perform();
	Thread.sleep(2000);
	WebElement drag2 = driver.findElement(By.xpath("//div[@class='rc-slider-handle rc-slider-handle-2']"));
	builder.dragAndDropBy(drag2, -200, 0).perform();
	Thread.sleep(2000);	
	//Click on the apply button
	driver.findElement(By.xpath("//button[text()='APPLY']")).click();
	
	//Click on the search button.
	driver.findElement(By.id("search_button")).click();
	Thread.sleep(2000);
	
	//Skip an automated assistance prompt.
	driver.findElement(By.xpath("//button[@class='skipBtn']")).click();
	Thread.sleep(7000);
	
	//Capture a screenshot of the first vacation package.
	WebElement picture1 = driver.findElement(By.xpath("(//div[@class='slick-slide slick-active slick-current'])[1]"));
	File source = picture1.getScreenshotAs(OutputType.FILE);
	File dest = new File("./snap/makemytrip.png");
	FileUtils.copyFile(source, dest);
	
	//Print the current page title.
	System.out.println(driver.getTitle());
	//Close the web browser.
	driver.close();
	
}
}
