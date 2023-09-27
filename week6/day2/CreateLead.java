package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod{
@Test(dataProvider = "fetchData")//dataprovider attribute
	public void runcreateLead(String cname,String fname,String lname) {

	
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
}	
@DataProvider(name="fetchData")//annotation
	public String[][] getData() {
		String[][] data = new String[2][3];
		//1st set of data
		data[0][0]="TestLeaf";
		data[0][1]="Suganya";
		data[0][2]="Prabhu";
		//2nd set of data
		data[1][0]="TCS";
		data[1][1]="Ridhanya";
		data[1][2]="Prabhu";
		return data;
		
	}
		

}






