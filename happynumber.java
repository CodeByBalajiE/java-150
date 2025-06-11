import java.util.Scanner;
public class happynumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check if it is a happy number");
        int num=sc.nextInt();
        if(ishappy(num)==1)
            System.out.println("yes it is a number");
        else System.out.println("no it not a happy number");
    }
    public static int ishappy(int num) {
        if(num==1)return 1;
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        if(sum>9){
            sum=ishappy(sum);
        }
        return sum;
    }
}
