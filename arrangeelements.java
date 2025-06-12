import java.util.Arrays;

public class arrangeelements {
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 2, 8, 7, 4};
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        int res[]=new int[arr.length];
        boolean small=false;
        for(int k=0;k<res.length;k++){
            if(!small){
                res[k]=arr[i];
                i++;
                small=!small;
            }
            else{
                res[k]=arr[j];
                j--;
                small=!small;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
