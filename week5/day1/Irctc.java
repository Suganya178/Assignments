package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {
public static void main(String[] args) {

	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notification");
	ChromeDriver driver= new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.get("https://www.irctc.co.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
	driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
	System.out.println(driver.getTitle());
	//current open window address
	String windowHandle = driver.getWindowHandle();
	System.out.println(windowHandle);
	
	Set<String> windowHandles = driver.getWindowHandles();
	
	List<String> lstwindow = new ArrayList<String>(windowHandles);
	
	driver.switchTo().window(lstwindow.get(1));
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(windowHandle);
	driver.close();
	
	
}
}
