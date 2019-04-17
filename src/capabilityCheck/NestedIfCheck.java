package capabilityCheck;

public class NestedIfCheck {
	
	
	public static void main(String[] args) {
		
		// to find out if a number is between 12 and 14 i.e, the number should be 13
		
		double i = 12.5; 
		
		if(i<14)
		{
			if(i==12)
			{
				System.out.println("i is in between 12 and 14");
			}
			else {
				System.out.println(" I am here for nothing ");
			}
		}
		else {
			System.out.println("value of i is not set to 13");
		}
	}

}
