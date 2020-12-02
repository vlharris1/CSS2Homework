import java.util.Random;

public class BubbleSort {
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[10];
		int i;
		
		for (i = 0; i < arr.length; i++)
			arr[i] = 1 + r.nextInt(100);
		
		System.out.print("before: ");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		
		bubble_sort(arr);
		System.out.print("after : ");
		for(i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void bubble_sort(int[] a) {
		boolean swapped = true;
		int j = 0;
		int temp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < a.length-j; i++) {
				if (a[i] > a[i + 1]) {
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
			}
		}
	}
}
