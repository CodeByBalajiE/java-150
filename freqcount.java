import java.util.HashMap;
import java.util.LinkedHashMap;

public class freqcount {
    public static void main(String[] args) {
        int arr[]={40,20,10,50,20,10,30,40};
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
}
