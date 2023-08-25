package week3.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BookBusTicket {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com");
		//Click on Bus
		driver.findElement(By.id("pills-home-tab")).click();
		
		//type "Chennai" in the FROM text box
		driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();//to click Chennai from suggestion 
		
		//Type "Bangalore" in the FROM text box
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();//to click Bangalore from suggestion 
		
		//Select date in the Date field
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("(//a[text()='26'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'border-right-radius')]")).click();//click on search button
		
		//Print the name of the first resulting bus
		String text = driver.findElement(By.xpath("(//div[@class='col2 column-middle']//h2)[1]")).getText();
		System.out.println("Bus Name:"+text);
		
		//Choose SLEEPER in the left menu from Bus Type
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
		
		//Print the first resulting bus seat count
		String text1 = driver.findElement(By.xpath("(//div[@class='col2 column-middle']//p)[2]")).getText();
		System.out.println("Seat count:"+text1);
		
		//Click SelectSeat
		driver.findElement(By.xpath("(//a[@class='btn-seatselect book1']/span)[1]")).click();
		
		//Choose any one Available seat
		driver.findElement(By.id("UO4-5ZZ")).click();
		
		//Print Seats Selected ,Total Fare
		String text2 = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
		System.out.println("Seat No:"+text2);
		String text3 = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
		System.out.println("Bus Fare:"+text3);
		
		//Select Boarding Point 
		WebElement boardingPoint = driver.findElement(By.id("boardingpoint_id"));
		Select board = new Select(boardingPoint);
		board.selectByIndex(9);
		
		//Select Dropping Point  
		WebElement dropingPoint = driver.findElement(By.id("droppingpoint_id"));
		Select drop = new Select(dropingPoint);
		drop.selectByIndex(5);
		
		//Get title of the page
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
	}
	
}
