package concepts;

public class StaticAndNonStaticMethods {
	
	public void test1() {
		System.out.println("I am a non static method");
	}
	
	static public void test2() {
		System.out.println("I am a static method");
	}
	
	public static void main(String[] args) {
		
		StaticAndNonStaticMethods obj = new StaticAndNonStaticMethods();
		
		obj.test1();
		
		StaticAndNonStaticMethods.test2();
	}

}
