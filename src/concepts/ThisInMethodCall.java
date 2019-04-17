package concepts;

public class ThisInMethodCall {
	
	
	public void test1(ThisInMethodCall obj) {
		System.out.println("I am from test1() method");
		System.out.println(obj);
	}
	
	public void test2() {
		System.out.println("I am from test2() method");
		test1(this);
	}
	
	public static void main(String[] args) {
		ThisInMethodCall obj = new ThisInMethodCall();
		obj.test2();
	}

}
