package week3.day2;

public class Bmw extends Car
{
	
	public void applyBrake()
	{
		System.out.println("BMW ABS");
	}
	
	public void modelDetail()
	{
		System.out.println("BMW design");
	}
	
public static void main(String[] args) {
	
	Bmw obj = new Bmw();
	obj.applyBrake();
	obj.soundHorn();
	obj.modelDetail();
	
}
}
