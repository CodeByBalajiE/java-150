import java.util.Arrays;

public class groupreverse {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40, 50, 25, 35, 45};
        int d=2;
        reverse(arr,0,d);
        reverse(arr,d+1,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int arr[],int a,int b){
        while(a<=b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
}
