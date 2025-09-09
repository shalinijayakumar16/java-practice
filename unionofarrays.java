//brute force using set data structure
import java.util.*;
public class unionofarrays {
    public static void main(String[] args){
        int arr1[]={1,2,8,5,4,6,2,0,7,8,6};
        int arr2[]={1,2,8,5,4};
        Set<Integer> union= new TreeSet<>();
        for(int num:arr1){
            union.add(num);
        }
        for(int num :arr2){
            union.add(num);
        }
        System.out.println(union);
    }
}
