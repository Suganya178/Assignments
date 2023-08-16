package week1.day2;

public class LearnOperators {

	public static void main(String[] args) {
		//Arithmetic
		System.out.println(5+5);
		System.out.println(5-5);
		System.out.println(5*5);
		System.out.println(5/5);
		System.out.println(5%5);
		
		
		//Assignment
		int num1=1;
		int num2 = 10;
		System.out.println("Assignment Op");
		System.out.println(num1=num2);
		System.out.println(num1+=2);//num1=num1+2
		System.out.println(num1-=num2);
		System.out.println(num1*=num2);
		System.out.println(num1/=num2);
		System.out.println(num1%=num2);
		
		//comparison
		
		int a=10;
		int b=20;
		System.out.println("Comparion Op");
		System.out.println(a<b);
		//Logical
		
		System.out.println("Logical Op");
		System.out.println((a!=b) && (a==b));
		System.out.println((a!=b) || (a<=b));
		System.out.println(!(a!=b));
		
		//Unary
		System.out.println("Unary Op");
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(a);
		System.out.println(b);
		System.out.println(++a);
		System.out.println(--b);
	}
	
}
