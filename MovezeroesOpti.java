public class MovezeroesOpti {
    public static void main(String[] args){
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int n =arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int x:arr){
            System.out.print(x +" ");
        }
    }
}
