package week3.day2;

public class SmartPhone extends AndroidPhone
{
	public void takeVideo()
	{
		System.out.println("SMart Pnone  - Take video");
	}
	
	public static void main(String[] args) {
		SmartPhone obj = new SmartPhone();
		obj.takeVideo();
	}
	
}
