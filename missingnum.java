import java.util.Arrays;

public class missingnum {
    public static void main(String[] args) {
        int arr[]={3, 7, 1, 2, 8, 4, 5};
        Arrays.sort(arr);
        int missing =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                missing=i+1;
                break;
            }
        }
        System.out.println("the missing number is:"+missing);
    }
}
