package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class PvrCinemas {
public static void main(String[] args) throws InterruptedException {
	

	/*ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);*/
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notification");
	ChromeDriver driver= new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.get("https://www.pvrcinemas.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	//Click  on Movie Library
	driver.findElement(By.xpath("//div[@class='city-thumbnail']//span[text()='Chennai']")).click();
	driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
	driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
	//Select the City -->chennai
	WebElement cityName = driver.findElement(By.name("city"));
	Select city= new Select(cityName);
	city.selectByVisibleText("Chennai");
	Thread.sleep(3000);
	//Select the Genre-->Animation
	WebElement genreName = driver.findElement(By.name("genre"));
	Select genre= new Select(genreName);
	genre.selectByVisibleText("ANIMATION");
	//Select the Language-->English
	WebElement langName = driver.findElement(By.name("lang"));
	Select lang= new Select(langName);
	lang.selectByVisibleText("ENGLISH");
	//Click on Apply button
	driver.findElement(By.xpath("//button[text()='Apply']")).click();
	Thread.sleep(5000);
	//Click on first resulting animation movie
	driver.findElement(By.xpath("(//div[contains(@class,'movie-wrapper')])[1]")).click();
	//Click proceed to book
	driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
	
	//Enter  all  the fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
	WebElement cinemaName = driver.findElement(By.id("cinemaName"));
	Select cinema=new Select(cinemaName);
	cinema.selectByVisibleText("PVR Velachery Chennai");//name
	
	driver.findElement(By.xpath("//div[@class='pvr-datepicker']//input")).click();//date
	driver.findElement(By.xpath("(//span[text()='31'])[2]")).click();//date
	//select timing
	WebElement timing = driver.findElement(By.name("timings"));
	Select time=new Select(timing);
	time.selectByValue("03:00 PM - 06:00 PM");
	
	driver.findElement(By.name("noOfTickets")).sendKeys("2");//no of seats
	driver.findElement(By.name("name")).sendKeys("Suganya");//name
	driver.findElement(By.name("email")).sendKeys("suganyasugi17@gmail.com");
	driver.findElement(By.name("mobile")).sendKeys("8973681909");
	//select food - yes or no
	WebElement foodReq = driver.findElement(By.name("food"));
	Select food = new Select(foodReq);
	food.selectByValue("Yes");
	
	driver.findElement(By.name("comment")).sendKeys("NIL");
	driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
	driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
	driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
	driver.findElement(By.className("swal2-close")).click();//Close the OTP dialog

	//Get title of the page
	String title = driver.getTitle();
	System.out.println("Title of page is :"+title);
	driver.close();
			
}
}
