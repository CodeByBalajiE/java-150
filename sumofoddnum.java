import java.util.Scanner;

public class sumofoddnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to add the odd digits in number");
        int num=sc.nextInt();
        int oddsum=0;
        while(num>0){
            int mod=num%10;
            oddsum+=mod%2!=0?mod:0;
            num/=10;
        }
        System.out.println(oddsum);
    }
}
