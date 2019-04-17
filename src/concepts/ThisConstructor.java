package concepts;

public class ThisConstructor {
	
	ThisConstructor() {
		System.out.println("I am from default constructor");
		
	}
	
	ThisConstructor(int i){
		this();
		System.out.println("Value of i is: "+ ++i);
	}
	
	ThisConstructor(int i,  int j){
		this(i);
		System.out.println("Value of i is: "+i +" and Value of j is: "+j);
	}
	
	public static void main(String[] args) {
		
		ThisConstructor obj = new ThisConstructor(5,6);
	}

}
