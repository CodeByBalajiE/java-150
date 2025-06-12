import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int pos=64+n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(char k=(char)pos;k>=65-i+1;k--){
                if(k>=65) {
                    System.out.print(k);
                }
            }
            pos--;
            System.out.println();
        }
    }
}
