package concepts;

public class StaticAndNonStatic1 {
	
	public static int counter = 0 ; 
	
	public int i = 0 ; 
	
	StaticAndNonStatic1() {
	counter++;
	i++;
	System.out.println("I am in Constructor");
	
	System.out.println("value of instance variable 'i' is: "+i +" and value of static variable 'counter' is: "+counter);
		
	}
	
	public static void main(String[] args) {
		
		StaticAndNonStatic1 obj1 = new StaticAndNonStatic1();
		StaticAndNonStatic1 obj2 = new StaticAndNonStatic1();
		StaticAndNonStatic1 obj3 = new StaticAndNonStatic1();
	}
	

}
