import java.util.*;

public class linearsearch {
    // method that actually returns index
    public static int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;  // found
            }
        }
        return -1;  // not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to search:");
        int num = sc.nextInt();

        int result = search(arr, num); // call the method

        if (result == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index " + result);
        }
    }
}

//using public static void main (String[] args) didn't return index