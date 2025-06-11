import java.util.Scanner;

public class arrange_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int arrange=arrangeseq(num);
        System.out.println("the arranged number is: "+arrange);
    }
    public static int arrangeseq(int num){
        String a=""+num;
        char arr[]=a.toCharArray();
        String odd="";
        String even="";
        for(int i=0;i<arr.length;i++){
            int numb=arr[i]-'0';
            if(numb%2==0){
                even+=arr[i];
            }
            else{
                odd+=arr[i];
            }
        }

        return Integer.parseInt(odd+even);
    }
}
