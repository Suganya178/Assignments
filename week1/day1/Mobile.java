package week1.day1;

public class Mobile {

	public  void makeCall()
	{
		String mobileModel = "Redmi";
		float mobileWeight = 12.8f;
		System.out.println("My mobile model is:"+mobileModel);	
		System.out.println("My mobile weight is:"+mobileWeight);	
		
	}
	
	public  void sendMsg()
	{
		Boolean isFullCharged = true;
		int mobileCost = 12000;
		System.out.println("Is Battery Full?:"+isFullCharged);
		System.out.println("My mobile cost is:"+mobileCost);
	}


public static void main (String[] args)
{
	Mobile obj = new Mobile();
	System.out.println("This is my mobile");
	obj.makeCall();
	obj.sendMsg();
	
}

}
