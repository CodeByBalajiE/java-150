import java.util.HashMap;

public class twosum {
    public static void main(String[] args) {
        int ind1=-1,ind2=-1;
        int arr[]={0, -1, 2, -3, 1};
        int target=-2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                ind1= map.get(comp);
                ind2=i;
                break;
            }
            else{
                map.put(arr[i],i);
            }
        }
        System.out.println(ind1+","+ind2);
    }
}
