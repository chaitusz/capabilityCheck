package loops;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		//int[] arr = {10,11,12,13,14,15};
		
		int[] arr = new int[5];
		
		for(int i=0;i<5;i++)
		{
			
			arr[i]=i;
			System.out.print(arr[i] + " ");
		}
		
		
		
		System.out.println();
		
		for(int vals : arr)
		{
			System.out.print(vals + " ");
		}


	}
}
