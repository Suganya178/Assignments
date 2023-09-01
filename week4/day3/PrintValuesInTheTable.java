package week4.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintValuesInTheTable {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://html.com/tags/table/");
		
		WebElement table = driver.findElement(By.xpath("//div[@class='render']/table"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		List<WebElement> column = table.findElements(By.tagName("th"));
		System.out.println("Row count: "+row.size());
		System.out.println("Column count: "+column.size());
		    
		
		
		
		driver.close();
		
	}
}
