package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {
	public static void main(String[] args)  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));
		
		//List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		List<WebElement> columnCount = table.findElements(By.tagName("th"));
		//System.out.println("Row Size :"+rowCount.size());	
		System.out.println("column Count :"+columnCount.size());
		
		
		List<WebElement> stockName = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[1]"));
		System.out.println("Total no of Rows: "+stockName.size());
		
		List<String> sortName = new ArrayList<String>();
				
		for (int i = 0; i < stockName.size(); i++) {
			String text = stockName.get(i).getText();
			sortName.add(text);
		}
		
		//remove duplicate
		Set<String> nameesort = new TreeSet<String>(sortName);
		System.out.println("After removing duplicates: ");
		Object[] array = nameesort.toArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		driver.close();
		
			
	}
}
