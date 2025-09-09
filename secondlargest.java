import java.util.*;
public class secondlargest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the elemnets of array");
        for(int i =0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int largest=arr[n-1];
        int second=-1;
        for(int i=n-2;i>0;i--) {
            if(arr[i]!=largest) {
                second = arr[i];
                break;
            }

        }
        System.out.println(second);
    }
}
