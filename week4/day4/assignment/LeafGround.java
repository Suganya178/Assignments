package week4.day4.assignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//locate and click show button
		//**simple alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//handle the alert
		Alert alert = driver.switchTo().alert();
		//print the message from alert box
		//String text = alert.getText();
		System.out.println(alert.getText());	
		//Action going to perform
		alert.accept();		
		//verification
		String text = driver.findElement(By.id("simple_result")).getText();
	    System.out.println(text);
	    
	    //**confirmation alert
	    driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	    //handle the alert
	    Alert alert2 = driver.switchTo().alert();
	    //print the message from alert box
	    System.out.println(alert2.getText());
	    ////Action going to perform
	    alert2.dismiss();
	    //verification
	  	String text1 = driver.findElement(By.id("result")).getText();
	    System.out.println(text1);
	      
	    //**Prompt Alert - locate and click show button
	  	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	  		
	  	Alert alert3 = driver.switchTo().alert();
	  		
	  	System.out.println(alert3.getText());
	  	Thread.sleep(3000);
	  	alert.sendKeys("TestLeaf");
	  	Thread.sleep(3000);
	  	alert.accept();
	  	Thread.sleep(5000);
	  	//verification
	  	String text2 = driver.findElement(By.id("confirm_result")).getText();
	  	System.out.println(text2);
      
	    
	  	//**Sweet Alert
	  	driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	  	WebElement sweetal = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt96_content']"));
	  	System.out.println("Sweet Alert:\n"+sweetal.getText());
	  	driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	  	
	  	//**Sweet Alert
	  	driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
	  	WebElement sweetal2 = driver.findElement(By.xpath("//div[@id='j_idt88:j_idt101_content']"));
	  	System.out.println("Sweet Modal Alert:\n"+sweetal2.getText());
	    driver.findElement(By.xpath("(//a[@role='button']//span)[2]")).click();
	    
	    //**Sweet Alert (Confirmation)
	    driver.findElement(By.xpath("//span[text()='Delete']")).click();
	    WebElement sweetconf = driver.findElement(By.className("ui-confirm-dialog-message"));
	    System.out.println("Sweet Alert confirm: \n"+sweetconf.getText()); 
	    driver.findElement(By.xpath("//span[text()='Yes']")).click();
	    
	    //**Minimize and Maximize
	    driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
	    WebElement minMax = driver.findElement(By.xpath("(//p[@class='m-0'])[2]"));
	    System.out.println("Minimize and Maximize:\n"+minMax.getText());  
	    driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']//a[2]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@id='j_idt88:j_idt112']//a[1]")).click();
	    
	   //driver.close();
	    
	    
	}
}
