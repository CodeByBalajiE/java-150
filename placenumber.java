import java.util.ArrayList;

public class placenumber {
    public static void main(String[] args) {
        int arr[]={10,20,10,30,14,40,60,10};
        int search=10;
        int increment=1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            if(num==search){
                list.add(num);
                list.add(increment);
                increment++;
            }
            else{
                list.add(num);
            }
        }
        System.out.println(list);
    }
}
