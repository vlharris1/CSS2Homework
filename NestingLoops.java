
//public class NestingLoops {
//	
//	public static void main (String[] args) {
//		
//		for (char c = 'A'; c <= 'E'; c++) 
//		{
//			for (int n = 1; n<= 3; n++) 
//			{
//				System.out.println (c + " " + n);
//			}
//		}
//		
//		System.out.println("\n");
//		
//		for (int a = 1; a <= 3; a++)
//		{
//			for (int b = 1; b <=3; b++)
//			{
//				System.out.print((a + "-" + b + " "));
//			}
//		}
//		
//		System.out.println("\n");
//		
//	}
//	
//
//}

public class NestingLoops {
	
	public static void main (String[] args) {
		
		for (int n = 1; n<= 3; n++) 
		{
			for (char c = 'A'; c <= 'E'; c++)
			{
				System.out.println (c + " " + n);
			}
		}
		
		System.out.println("\n");
		
		for (int a = 1; a <= 3; a++)
		{
			for (int b = 1; b <=3; b++)
			{
				System.out.print((a + "-" + b + " "));
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
	}
	

}

//1. The variable controlled by the inner loop (n) changes faster.
//2. After changing the order of the loop so that loop (c) is on the inside and loop (n) is on the outside, the variable on outside (n) changes slower.
//3. After changing it to println(), the output is one long list.
//4. After adding System.out.println() after the close brace of the inner (b) loop and still inside of the outer loop, the output becomes a grid.

