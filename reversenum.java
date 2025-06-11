import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to reverse ");
        int num=sc.nextInt();
        int reversed=reverse(num);
        System.out.println("the reversed number is: "+reversed);
    }
    public static int reverse(int num){
        String a=""+num;
        char arr[]=a.toCharArray();
        String res="";
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            char temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            j--;
        }
        for(char b:arr){
            res+=b;
        }
        return Integer.parseInt(res);
    }
}
