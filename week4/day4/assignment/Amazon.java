package week4.day4.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws IOException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	//search as oneplus 9 pro
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
	//Get the price of the first product
	String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	System.out.println("First Mobile Price: "+price);
	
	//Print the number of customer ratings for the first displayed product
	WebElement rating = driver.findElement(By.xpath("(//div[@class='a-row a-size-small']/span[2])[1]"));
	System.out.println("Number of customer ratings: "+rating.getText());
	//Click the first text link of the first image
	driver.findElement(By.xpath("(//span[contains(@class,'a-text-normal')])[1]")).click();
	
	//Transfer the driver control to new window
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> lstwindow = new ArrayList<String>(windowHandles);
	driver.switchTo().window(lstwindow.get(1));
	System.out.println(driver.getTitle());
	// Take a screen shot of the product displayed
	File source = driver.getScreenshotAs(OutputType.FILE);
	File target = new File("./snap/amazonmobile.png");
	FileUtils.copyFile(source, target);
	
	
	//Click 'Add to Cart' button
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
	//Get the cart subtotal and verify if it is correct.
	driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")).click();
	String tot = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[3]")).getText();
	System.out.println("Subtotal: "+tot);

	if (tot.contains(price)) {
		System.out.println("Subtotal Verified.");
	}
	else {
		System.out.println("Subtotal could not be verified.");
	}
	
	//close the browser
	driver.quit();
	
}
}
