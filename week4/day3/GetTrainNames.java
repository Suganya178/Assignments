package week4.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTrainNames {
public static void main(String[] args)  {
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	
	driver.findElement(By.id("txtStationFrom")).clear();
	driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.ENTER);
	driver.findElement(By.id("txtStationTo")).clear();
	driver.findElement(By.id("txtStationTo")).sendKeys("CBE",Keys.ENTER);
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	WebElement table = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table)[1]"));
	//Row count
	List<WebElement> rowCount = table.findElements(By.tagName("tr"));
	//column count
	List<WebElement> columnCount = table.findElements(By.tagName("th"));
	System.out.println("Row Size :"+rowCount.size());	
	System.out.println("column Count :"+columnCount.size());
	System.out.println("Train Names:");
	
	//print all values in a row
	for (int i = 2; i <= rowCount.size(); i++) 
	{	
	WebElement text = driver.findElement(By.xpath("(//div[@id='divTrainsList']/table)[1]//tr["+i+"]/td[2]"));
	System.out.println(text.getText());
	//String text2 = text.getText();
	//ArrayList<String> sortedList = new ArrayList<String>(text2); 
	//Collections.sort(sortedList);
	
	}
	
	
	
	driver.close();
}
}
