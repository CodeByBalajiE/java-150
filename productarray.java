import java.util.Arrays;

public class productarray {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int mul=1;
        for(int num:arr){
            mul*=num;
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=mul/arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
