package concepts;

public class Check1 {
	
	int i;
	int j;
	
	public void test(int k) {
		System.out.println("I am a method");
	}
	
	public static void main(String[] args) {
		
		Check1 ch = new Check1(); 
		
		ch.test(5);
		System.out.println(ch.i);
	
	}

}
