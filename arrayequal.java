import java.util.Arrays;

public class arrayequal {
    public static void main(String[] args) {
        int arr1[]={1, 2, 5, 4, 0};
        int arr2[]={2, 4, 5, 0, 1};
        boolean equal=check(arr1,arr2);
        if(equal)System.out.println(true);
        else System.out.println(false);
    }
    public static boolean check(int arr[],int arr2[]){
        if(arr.length!=arr2.length){
            return false;
        }
        boolean flag=true;
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}
