package week4.day1.assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notification");
		ChromeDriver driver= new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				
		//In the search box, type as "bags" and press enter
		driver.findElement(By.xpath("//input[contains(@class,'react-autosuggest__input--open')]")).sendKeys("bags",Keys.ENTER);
				
		//To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(10000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		//Print the count of the items Found. 
		List<WebElement> count = driver.findElements(By.xpath("//div[@class='item rilrtl-products-list__item item']"));
		System.out.println("Count of the Items:"+count.size());
		
		//Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println("Brands:"+brand.size());
		for (int i = 0; i < brand.size(); i++) {
			System.out.println(brand.get(i).getText());
			
		}
		//Get the list of names of the bags and print it
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='nameCls']"));

		System.out.println("Name of Bags:"+name.size());
		
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i).getText());
		}
		driver.close();
	}

}
