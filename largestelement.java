//optimized approach

import java.util.*;
public class largestelement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the elements");
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int largest=arr[0];
		for(int i =0;i<n;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}
		
	}
	System.out.println(largest);
	
 }
}





//brute force approach
/*import java.util.*;
public class largestelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("Enter size of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements");
		for(int i = 0; i<n ;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[n-1]);
				
		
	}

}*/
