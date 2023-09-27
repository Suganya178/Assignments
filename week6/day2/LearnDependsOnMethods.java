package week6.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethods {
	//diff pkg 
	//@Test(dependsOnMethods ="week6.day1.CreateLead.runCreateLead")
	@Test(dependsOnMethods = "dupicateLead",alwaysRun = true)
	public void createLead() {
		System.out.println("Create Lead");
	}
	@Test
	public void editLead() {
		System.out.println("Edit Lead");
	}
	@Test
	public void dupicateLead() {
		System.out.println("Duplicate Lead");
		throw new RuntimeException();
	}
}
