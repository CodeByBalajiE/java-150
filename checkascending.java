import java.util.Scanner;
public class checkascending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        boolean ascending=check(num);
        if(ascending) System.out.println("yes the digits are in ascending");
        else System.out.println("no the digits are not in ascending");
    }
    public static boolean check(int num){
        int prev=num%10;
        num/=10;
        while(num>0){
            int rem=num%10;
            if(rem>prev){
                return false;
            }
            prev=rem;
            num/=10;
        }
        return true;
    }
}
