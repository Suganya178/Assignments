package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonGetAllPrice {
public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.get("https://amazon.in");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
	
	//locate multiple elements
	List<WebElement> price = driver.findElements(By.className("a-price-whole"));
	System.out.println("Count of Phones:"+price.size());
	//store the string of element
	List<Integer> sortPrice = new ArrayList<Integer>();
	
	for (int i = 0; i < price.size(); i++) {
		String text = price.get(i).getText();//"10,999" as string
		String replaceAll = text.replaceAll("[^0-9]", "");//10999 - replace comma
		int parseInt = Integer.parseInt(replaceAll);//convert string to integer
		sortPrice.add(parseInt);
		
	}
	Collections.sort(sortPrice);
	System.out.println(sortPrice);
	System.out.println(sortPrice.get(1));
	System.out.println(sortPrice.contains(1234));
	
	//remove duplicate
	Set<Integer> pricesort = new TreeSet<Integer>(sortPrice);
	System.out.println("After removing duplicates: "+pricesort);
	
	
	driver.close();
}
}
