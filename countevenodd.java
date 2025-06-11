import java.util.Scanner;

public class countevenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int odd=0;
        int even=0;
        while(num>0){
            int rem=num%10;
            if(rem%2==0)even++;
            else odd++;
            num/=10;
        }
        System.out.println("the total even digit count:" +even);
        System.out.println("the total odd digit count:"+odd);
    }
}
