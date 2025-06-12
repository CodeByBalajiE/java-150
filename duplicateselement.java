import java.util.HashMap;

public class duplicateselement {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,4,2,5,6,1};
        HashMap<Integer,Integer> map=new HashMap<>();
        int distance=-1;
        int res=-1;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int currentdistance=i-map.get(arr[i])+1;
                if(currentdistance>distance){
                    distance=currentdistance;
                    res=arr[i];
                }
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.println("the longest distance duplicate is :"+res);
    }
}
