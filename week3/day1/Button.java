package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Button {
	public static void main(String[] args) {
		

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	System.out.println("Click and Confirm title.");
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	driver.navigate().back();
	
	System.out.println("Confirm if the button is disabled.");
	boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
	if (!enabled) {
		System.out.println("Not Enabled:");
	}
	else
	{
		System.out.println("Enabled");
	}
	
	System.out.println("Find the position of the Submit button");
	Point location = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
	System.out.println(location);
	
	System.out.println("Find the Save button color");
	String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
	System.out.println(cssValue);
	
	System.out.println("Find the height and width of this button");
	Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
	System.out.println(size);
	
	
	System.out.println("Mouse over and confirm the color changed");
	WebElement mouse = driver.findElement(By.xpath("(//span[text()='Success'])[1]"));
	//check color before
	String color = mouse.getCssValue("background-color");
	System.out.println("Before color:"+color);
	Actions builder = new Actions(driver);
	builder.moveToElement(mouse).perform();
	String color2 = mouse.getCssValue("background-color");
	System.out.println("After color:"+color2);//check color after mouse hover
		
	System.out.println("Click Image Button and Click on any hidden button");
	driver.findElement(By.xpath("//span[text()='Image']")).click();//click on element first
	
	
	
	
	System.out.println("How many rounded buttons are there?");
	List<WebElement> button = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
	System.out.println(button.size());
	
	
}
}
