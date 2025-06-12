import java.util.Arrays;

public class rotatearray {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int n=2;
        n=n%arr.length;
        int rota[]=new int[n];
        for(int i=0;i<n;i++){
            rota[i]=arr[i];
        }
        for(int j=n;j<arr.length;j++){
            arr[j-n]=arr[j];
        }
        int ind=arr.length-n;
        for(int i=ind;i<arr.length;i++){
            arr[i]=rota[i-ind];
        }
        System.out.println(Arrays.toString(arr));
    }
}
