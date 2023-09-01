package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLinkCount {

	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.leafground.com/link.xhtml");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		List<WebElement> printLink = driver.findElements(By.xpath("//div[@class='col-12']/a"));
		
		for (int i = 0; i < printLink.size(); i++) {
			System.out.println(printLink.get(i).getText());
		}
		
		driver.close();
		
	}

}
