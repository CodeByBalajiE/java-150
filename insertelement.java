import java.util.Arrays;

public class insertelement {
    public static void main(String[] args) {
        int arr[]={10, 20, 30, 40};
        int pos=3;
        int ele=50;
        int res[]=new int[arr.length+1];
        int ind=0;
        int i=0;
        while(i<arr.length){
            if(ind==pos-1){
                res[ind]=ele;
                ind++;
            }
            else{
                res[ind]=arr[i];
                ind++;
                i++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
