import java.util.HashSet;
import java.util.LinkedHashSet;

public class distinctelemnt {
    public static void main(String[] args) {
        int arr[]={12, 10, 9, 45, 2, 10, 10, 45};
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }
        System.out.println(set);
    }
}
