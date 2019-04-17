package concepts;

public class Example1 {
	
	int i; 
	int j ; 
	public Example1(int i, int j) {
		
		this.i=i;
		this.j=j;
		
	}
	
	public static void main(String[] args) {
		Example1 obj = new Example1(3,4);
		System.out.println(obj.i);
		System.out.println(obj.j);
	}
	
}