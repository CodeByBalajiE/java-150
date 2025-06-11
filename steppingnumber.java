import java.util.Scanner;
public class steppingnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to check if it is a stepping number");
        int num=sc.nextInt();
        boolean stepping=check(num);
        if(stepping) System.out.println("yes it is a stepping number");
        else System.out.println("no it is not stepping number");
    }
    public static boolean check(int num){
        String a=""+num;
        int arr[]=new int[a.length()];
        boolean step=true;
        arr[0]=a.charAt(0)-'0';
        for(int i=1;i<arr.length;i++){
            int numb=a.charAt(i)-'0';
            if(arr[i-1]-numb==-1||arr[i-1]-numb==-1){
                arr[i]=numb;
                continue;
            }
            else return false;
        }
        return true;
    }
}
