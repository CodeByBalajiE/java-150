import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int st=1;
            for(int j=1;j<=i;j++){
                System.out.print(st);
                st=1-st;
            }
            System.out.println();
        }
    }
}
