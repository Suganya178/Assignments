package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//Type "Bags" in the Search box
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
	//Choose the item in the result (bags for boys)
	driver.findElement(By.xpath("//span[contains(text(),'for boys')]/parent::div")).click(); 
	
	//Print the total number of results 
	String text = driver.findElement(By.xpath("//div[contains(@class,'a-spacing-top-small')]/span")).getText();
	String text1 = driver.findElement(By.xpath("//div[contains(@class,'a-spacing-top-small')]/span[3]")).getText();
	System.out.println("Total no. of Results:"+text +text1);
	
	//Select the first 2 brands in the left menu
	driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[1]")).click();	
	driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i)[2]")).click();
	
	//Choose New Arrivals (Sort)
	driver.findElement(By.className("a-dropdown-container")).click();
	driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	
	//Print the first resulting bag info (name, discounted price)
	String text2 = driver.findElement(By.xpath("(//div[contains(@class,'puis-padding-right-micro')]//span)[1]")).getText();
	System.out.println("First resulting bag name: "+text2);
	
	String text3 = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')]/following::span[@class='a-price-whole'])[1]")).getText();
	System.out.println("First resulting bag discouinted price: "+text3);

	//Get the page title and close the browser
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	
}
}
