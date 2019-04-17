package concepts;

public class StaticAndNonStaticCheck {
	
	public int i = 90; 
	
	public static int j= 100; 
	
	public void test1() {
		
		System.out.println(i);
		System.out.println(j);
		
	}
	
	public static void test2() {
		
		StaticAndNonStaticCheck t2 = new StaticAndNonStaticCheck();
		System.out.println(t2.i);
		System.out.println(j);
		test3();
		
	}
	
	public static void test3() {
		System.out.println("I am static method");
	}
	
	public static void main(String[] args) {
		
		StaticAndNonStaticCheck obj = new StaticAndNonStaticCheck();
		obj.test1();
		
		test2();
		test3();
		
	}

}
