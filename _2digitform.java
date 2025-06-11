import java.util.Scanner;

public class _2digitform {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter a number to covert into two digit form");
        int num=sc.nextInt();
        int modifed_form=num_modify(num);
        System.out.println("the modified two digit form is "+modifed_form);
    }
    public static int num_modify(int num){
        String a=""+num;
        if(a.length()==2)return Integer.parseInt(a);
        String b="";
        for(int i=0;i<a.length()-1;i++){
            b+=Math.abs((a.charAt(i)-'0')-(a.charAt(i+1)-'0'));
        }
        if(b.length()>2){
            num_modify(Integer.parseInt(b));
        }
        return num_modify(Integer.parseInt(b));
    }
}
