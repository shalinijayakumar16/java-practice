//optimized approach

import java.util.*;
public class Largestelement{
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

