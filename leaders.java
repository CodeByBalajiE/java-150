import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Stack;

public class leaders {
    public static void main(String[] args) {
        int arr[]={16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list=new ArrayList<>();
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>min){
                list.add(arr[i]);
            }
            min=Math.min(min,arr[i]);
        }
        list.add(arr[arr.length-1]);
        System.out.println(list);
    }
}
