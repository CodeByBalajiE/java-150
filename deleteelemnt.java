import java.util.Arrays;

public class deleteelemnt {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int pos = 2;
        int res[] = new int[arr.length - 1];
        int i=0;
        int ind=0;
        while(i<arr.length){
            if(i==pos-1){
                i++;
                continue;
            }
            res[ind]=arr[i];
            i++;
            ind++;
        }
        System.out.println(Arrays.toString(res));
    }
}
