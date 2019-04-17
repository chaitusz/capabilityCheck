package concepts;

public class ThisCheck {
	
	int i; 
	int j; 
	
	int k; 
	
	ThisCheck(int i, int j){
		this.i=i;
		this.j=j;
	}
	
	ThisCheck(int i)
	{
		k=i;
	}
	
	public static void main(String[] args) {
		
		ThisCheck obj = new ThisCheck(5,6);
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		ThisCheck obj1 = new ThisCheck(100);
		System.out.println(obj1.k);
	}

}
