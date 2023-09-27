package week6.day1;

import org.testng.annotations.Test;

public class LearnPriority {//ascii order - cde
	@Test(priority = 1)// 0 0 1
	public void creteLead() {
		System.out.println("Create Lead");
	}
	@Test(priority = -1)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	@Test
	public void dupicateLead() {
		System.out.println("Duplicate Lead");
	}
}
