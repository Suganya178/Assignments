package week5.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {
public static void main(String[] args) throws InterruptedException, IOException {
	
	ChromeOptions option =new ChromeOptions();
	option.addArguments("--disable-notification");
	ChromeDriver driver= new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.get("https://dev124621.service-now.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
	
	//Login with valid credentials username as admin and password 
	driver.findElement(By.id("user_name")).sendKeys("admin");
	driver.findElement(By.id("user_password")).sendKeys("Ak^x88vhDMV=");
	driver.findElement(By.id("sysverb_login")).click();
	Thread.sleep(8000);
	
	//Click-All Enter Service catalog in filter navigator and press enter or Click the ServiceCatalog
	Shadow dom = new Shadow(driver);
	dom.setImplicitWait(7);
	dom.findElementByXPath("//div[@aria-label='All']").click();
	dom.setImplicitWait(7);
	dom.findElementByXPath("//a[@aria-label='Service Catalog']").click();
	//Click on  mobiles
	//handle frame
	WebElement frameMobile = dom.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frameMobile);
	dom.findElementByXPath("//h2[contains(text(),'Mobiles')]/ancestor::a").click();
	
	//Select Apple iPhone 13 Pro
	driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']/ancestor::a")).click();//linktext
	
	//Choose yes in lost or broken iphone. And enter original phNo as 99
	driver.findElement(By.xpath("//span[contains(text(),'Is this a replacement')]/following::label[1]")).click();
	driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
	
	//Choose monthly data allowance as unlimited
	WebElement drop = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
	Select dropDown = new Select(drop);
	dropDown.selectByValue("unlimited");
	
	//Update color field to Sierra Blue and storage field to 512GB
	driver.findElement(By.xpath("//input[@value='sierra_blue']/following-sibling::label")).click();
	driver.findElement(By.xpath("//input[@value='512']/following-sibling::label")).click();
	
	//Click on Order now option
	driver.findElement(By.id("oi_order_now_button")).click();
	
	//Verify order is placed and copy the request number"
	WebElement success = driver.findElement(By.xpath("//div[@class='notification notification-success']/span"));
	System.out.println(success.getText());
	System.out.println("Request Number:");
	WebElement reqNo = driver.findElement(By.xpath("//a[@id='requesturl']/b"));
	System.out.println(reqNo.getText());
	
	//Take a Snapshot of order placed page.
	File source = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./snap/servicenow.png");
	FileUtils.copyFile(source, dest);
	
	driver.close();
}
}
