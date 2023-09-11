package week5.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TataCliq {
public static void main(String[] args) throws IOException, InterruptedException {
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notification");
	ChromeDriver driver= new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.get("https://www.tatacliq.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
	driver.findElement(By.id("wzrk-cancel")).click();
	//MouseHover on Brands
	WebElement mouse = driver.findElement(By.xpath("//div[text()='Brands']"));
	Actions builder = new Actions(driver);
	builder.moveToElement(mouse).perform();	
	//click Watches & Accessories
	driver.findElement(By.xpath("//div[text()='Watches & Accessories']")).click();
	//Choose the first option from the Brand dispaly
	driver.findElement(By.xpath("(//div[@class='BrandImage__imageHolder']//img)[1]")).click();
	//Select sort by-New Arrivals
	driver.findElement(By.className("SelectBoxDesktop__hideSelect")).click();
	driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
	//Click Men check box
	driver.findElement(By.xpath("//div[text()='Category']/following::div[6]")).click();
	
	//Print all price of watches(take only numbers)
	List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__content']//h3"));
	System.out.println(price.size());
	Thread.sleep(8000);
	for (int i = 0; i < price.size(); i++) {
		String text = price.get(i).getText();
		System.out.println(text);

	}		
	//Print the 2nd watch price
	String watch2price = driver.findElement(By.xpath("(//div[contains(@class,'ProductDescription__discount')]/h3)[1]")).getText();
	System.out.println("2nd watch price : "+watch2price);
	//click the second loaded result
	driver.findElement(By.xpath("(//div[@class='ProductModule__base'])[2]")).click();
	//Handle the window and Print the price of the watch
	Set<String> windowHandles = driver.getWindowHandles();
	List<String> lstwindow = new ArrayList<String>(windowHandles);
	driver.switchTo().window(lstwindow.get(1));
	//Compare two price and print Both price are equal
	String text = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
	if(watch2price.equals(text))
	{
		System.out.println("Both price are same");
	}
	else {
		System.out.println("Prices are not equal");
	}
	//Click Add to Bag
	driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
	//Check the bag count
	String bagCount = driver.findElement(By.className("DesktopHeader__cartCount")).getText();
	System.out.println("Count of items in cart: "+bagCount);
	//Click the cart bag
	driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
	Thread.sleep(30000);
	//Take snapshot of result
	File source = driver.getScreenshotAs(OutputType.FILE);
	File target = new File("./snap/Tatacliq.png");
	FileUtils.copyFile(source, target);
	//Close the open window
	driver.close();
	//Close the browser
	driver.quit();
	
	
	
}
}
