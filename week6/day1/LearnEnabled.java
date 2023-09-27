package week6.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnEnabled {
	@Ignore
	@Test
	public void creteLead() {
		System.out.println("Create Lead");
	}
	@Test(enabled = false)
	public void editLead() {
		System.out.println("Edit Lead");
	}
	@Test
	public void dupicateLead() {
		System.out.println("Duplicate Lead");
	}
}
