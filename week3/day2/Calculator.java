package week3.day2;

public class Calculator {

	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	public void multiple(double a,double b)
	{
		System.out.println(a*b);
	}
	public void multiple(float a,float b)
	{
		System.out.println(a*b);
	}
	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		cal.add(12, 12);
		cal.add(5, 10, 20);
		cal.multiple(10, 5);
		cal.multiple(1.2f, 0.5f);
	}

}
