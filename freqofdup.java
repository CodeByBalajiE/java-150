import java.util.HashMap;

public class freqofdup {
    public static void main(String[] args) {
        int arr[]={10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>1){
                System.out.println(key+"->"+map.get(key));
            }
        }
    }
}
