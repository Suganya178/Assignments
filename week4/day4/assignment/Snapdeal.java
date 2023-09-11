package week4.day4.assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
public static void main(String[] args) throws IOException, InterruptedException {
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notification");
	ChromeDriver driver= new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	//Go to Mens Fashion - click on Sports Shoes
	WebElement fashion = driver.findElement(By.linkText("Men's Fashion"));
	//Create obj for actions
	Actions builder =new Actions(driver);
	//method
	builder.moveToElement(fashion).perform();
	driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
	
	String text = driver.findElement(By.xpath("(//div[@class='lfloat marR10']/span[2])[1]")).getText();
	System.out.println("Price of 1st Product: "+text);
	
	//Get the count of the sports shoes
	List<WebElement> shoeCount = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	System.out.println("Count of the sports shoes: "+shoeCount.size());
	//Click Training shoes
	driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	
	//Sort by Low to High
	driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
	driver.findElement(By.xpath("//ul[@class='sort-value']/li[2]")).click();
	
	//Check if the items displayed are sorted correctly
	File source = driver.getScreenshotAs(OutputType.FILE);
	File target = new File("./snap/snapdealshoes.png");
	FileUtils.copyFile(source, target);
	
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	List<String> sortPrice = new ArrayList<String>();
	for (int i = 0; i < price.size(); i++) {
		String text2 = price.get(i).getText();
		sortPrice.add(text2);
	}
	System.out.println("Sorted Price:\n"+sortPrice);
	//Select the price range (500-1200)
	driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
	driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@name='toVal']")).clear();
	driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1200");
	driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
	
	//Filter with color yellow 
	driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
	
	//verify the all applied filters 
	// Mouse Hover on first resulting Training shoes
	//click QuickView button
	// Print the cost and the discount percentage
	//Take the snapshot of the shoes.
	//s of the bags and print it
}
}
