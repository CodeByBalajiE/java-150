import java.util.ArrayList;
import java.util.HashMap;

public class freq_descending {
    public static void main(String[] args) {
        int arr[]={50, 20, 150, 20, 50, 10, 30, 10, 10};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer, ArrayList<Integer>> rmap=new HashMap<>();
        for(int key: map.keySet()){
            int freq=map.get(key);
            rmap.put(freq,rmap.getOrDefault(freq,new ArrayList<>()));
            rmap.get(freq).add(key);
        }
        for(int i=arr.length;i>=1;i--){
            if(rmap.containsKey(i)){
                for(int n:rmap.get(i)){
                    System.out.println(n+"->"+map.get(n));
                }
            }
        }
    }
}
