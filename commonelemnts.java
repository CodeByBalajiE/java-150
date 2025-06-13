import java.util.ArrayList;
import java.util.HashMap;

public class commonelemnts {
    public static void main(String[] args) {
        int arr1[]={1, 2, 1, 3, 1};
        int arr2[]={3, 1, 3, 4, 1};
        HashMap<Integer,Integer> map=new HashMap<>();
        HashMap<Integer,Integer> map1=new HashMap<>();

        for(int num:arr2){
            map1.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr1){
            if(map1.containsKey(num)){
                list.add(num);
                map1.put(num,map1.get(num)-1);
                if(map1.get(num)==0){
                    map1.remove(num);
                }
            }
        }
        System.out.println(list);
    }
}
