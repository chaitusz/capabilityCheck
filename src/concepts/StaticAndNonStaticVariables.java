package concepts;

public class StaticAndNonStaticVariables {
	
	int i = 90; 
	static int j = 100; 
	
	public static void main(String[] args) {
		
		StaticAndNonStaticVariables obj = new StaticAndNonStaticVariables();
		System.out.println(obj.i);
		System.out.println(StaticAndNonStaticVariables.j);
		//j =110;
		
		//System.out.println(obj.j);
	}

}
