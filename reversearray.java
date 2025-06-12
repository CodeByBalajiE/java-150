import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int arr[]={12, 10, 9, 45, 2, 10, 10, 45};
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
