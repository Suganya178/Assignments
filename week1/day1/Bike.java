package week1.day1;

class Car {

	public void applyBreak() {
		System.out.println("Applied Break");
	}
	public void soundHorn() {
		System.out.println("Sound Horn");
	}
	
	
}

public class Bike
{
	public static void main(String[] args) {
		
		Car obj = new Car();
		obj.applyBreak();
		obj.soundHorn();

	}
	
}